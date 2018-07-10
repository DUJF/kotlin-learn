package com.github.kotlin.controller

import com.github.kotlin.core.BaseController
import com.github.kotlin.constant.RequestPath
import com.github.kotlin.constant.SystemConstants
import com.github.kotlin.core.RespBody
import com.github.kotlin.core.ResultUtils
import com.github.kotlin.service.UserService
import io.swagger.annotations.Api
import org.apache.ibatis.annotations.Delete
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletRequest

/**
 * @author <a href="http://github.com/DUJF">dujf</a>
 * @date 2018/7/9
 * @since JDK1.8
 */

@RequestMapping("${RequestPath.BASE_PATH}${RequestPath.LOGIN}")
@RestController
@Api(tags = ["用户登陆"], description = "用户登陆")
class LoginController(
    private val userService: UserService
) : BaseController() {

  @GetMapping("/in")
  fun login(request: HttpServletRequest): RespBody<*> {
    userService.selectById(1)?.let {
      request.session.setAttribute(SystemConstants.CURRENT_USER, it)
    }
    return ResultUtils.success()
  }

  @Delete("/out")
  fun loginOut(request: HttpServletRequest): RespBody<*> {
    request.session.removeAttribute(SystemConstants.CURRENT_USER)
    return ResultUtils.success()
  }
}