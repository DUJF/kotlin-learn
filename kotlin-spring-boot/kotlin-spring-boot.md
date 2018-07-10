#kotlin 基础框架

###java
[代码生成工具MPGenerator.java]()
###kotlin

kotlin 自定义日志注解 
```kotlin
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
annotation class Log(
    val module: String = "",
    val operation: String = "select"
)

////////////
//日志切面
@Component
@Aspect
class SystemLogAop {

  @Autowired
  private val systemService: SystemService? = null

  /**
   * @param joinPoint 前置参数
   */
  @After("execution(* com.github..*.*(..)) && @annotation(log)")
  fun doAfterAdvice(joinPoint: JoinPoint, log: Log) {
    logger.info("=========================================用户操作日志-后置通知开始执行......=========================================")
    //捕获方法执行结果
    var status: Int
    try {
      (joinPoint as ProceedingJoinPoint).proceed()
      status = 1
    } catch (e: Throwable) {
      status = 0
    }
    val system = System()
    system.createtime = Date()
    system.content = log.module
    system.status = status
    system.type = 1
    system.remark = log.operation
    addSystemLog(system)
    logger.info("=========================================用户操作日志-后置通知结束执行......=========================================")
  }

  /**
   *
   * Discription:[保存操作日志]
   * @param operationContent 操作内容
   */
  fun addSystemLog(system: System) {
    // 获取此次请求的request对象
    val request = (RequestContextHolder.getRequestAttributes() as ServletRequestAttributes).request
    val user = request.session.getAttribute(SystemConstants.CURRENT_USER) as User
    system.name = "${user.role}:${user.account}"
    systemService?.insert(system)
  }

  private val logger = LoggerFactory.getLogger(SystemLogAop::class.java)

}

```

获取当前用户注解
```kotlin
@kotlin.annotation.Target(AnnotationTarget.VALUE_PARAMETER) // 可用在方法的参数上
@kotlin.annotation.Retention()
annotation class CurrentUser(
    /**
     * 当前用户在session对象中的key
     */
    val value: String = SystemConstants.CURRENT_USER
)
///////
//用户解析
import com.github.kotlin.annotation.CurrentUser
import com.github.kotlin.constant.SystemConstants
import com.github.kotlin.model.User
import org.springframework.core.MethodParameter;
import org.springframework.lang.Nullable
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.multipart.support.MissingServletRequestPartException;
import javax.servlet.http.HttpServletRequest


/**
 * @author <a href="http://github.com/DUJF">dujf</a>
 * @date 2018/7/9
 * @since JDK1.8
 */

class CurrentUserMethodArgumentResolver : HandlerMethodArgumentResolver {

  @Throws(Exception::class)
  override fun resolveArgument(p0: MethodParameter, @Nullable mavContainer: ModelAndViewContainer?, webRequest: NativeWebRequest, @Nullable binderFactory: WebDataBinderFactory?): Any? {
    val request = webRequest.nativeRequest as HttpServletRequest
    val user = request.session.getAttribute(SystemConstants.CURRENT_USER)?.let {
      it as User
    }
    if (user != null) {
      return user
    }
    throw MissingServletRequestPartException(SystemConstants.CURRENT_USER)
  }

  override fun supportsParameter(parameter: MethodParameter): Boolean {
    return parameter.parameterType.isAssignableFrom(User::class.java) && parameter.hasParameterAnnotation(CurrentUser::class.java)
  }
}

////在配置类WebMvcConfig : WebMvcConfigurerAdapter()中注册用户解析
override fun addArgumentResolvers(argumentResolvers: MutableList<HandlerMethodArgumentResolver>) {
    argumentResolvers.add(currentUserMethodArgumentResolver())
    super.addArgumentResolvers(argumentResolvers)
  }

  @Bean
  fun currentUserMethodArgumentResolver(): CurrentUserMethodArgumentResolver {
    return CurrentUserMethodArgumentResolver()
  }

```
