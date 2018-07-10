package com.github.kotlin.core

import com.github.kotlin.annotation.CurrentUser
import com.github.kotlin.constant.SystemConstants
import com.github.kotlin.model.User
import org.springframework.core.MethodParameter;
import org.springframework.lang.Nullable
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.RequestAttributes;
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

