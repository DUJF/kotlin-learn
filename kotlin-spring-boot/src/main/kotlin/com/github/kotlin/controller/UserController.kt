package com.github.kotlin.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper
import com.baomidou.mybatisplus.plugins.Page
import com.github.kotlin.annotation.CurrentUser
import com.github.kotlin.annotation.Log
import com.github.kotlin.core.RespBody
import com.github.kotlin.core.RespPages
import com.github.kotlin.core.ResultUtils
import com.github.kotlin.constant.RequestPath
import com.github.kotlin.constant.SystemConstants
import com.github.kotlin.model.User
import com.github.kotlin.service.UserService
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import springfox.documentation.annotations.ApiIgnore
import javax.servlet.http.HttpServletRequest

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author dujf
 * @since 2018-07-06
 */
@RestController
@RequestMapping("${RequestPath.BASE_PATH}${RequestPath.USER}")
class UserController(
    private val userService: UserService
) {
  @ApiOperation(value = "获取全部用户")
  @GetMapping
  @Log(module = "用户", operation = "select")
  fun listUsers(@ApiIgnore @CurrentUser user: User?): RespBody<*> {
    println(user)
    val page = userService.selectPage(Page<User>(1, 2, "create_time", false), EntityWrapper<User>())
    return ResultUtils.success(RespPages<User>(page))
  }

  @ApiOperation(value = "获取当前用户")
  @GetMapping("online")
  @Log(module = "用户", operation = "online user")
  fun getOnlineUser(request: HttpServletRequest): RespBody<*> {
    val x = 1 / 0
    return ResultUtils.success(request.getSession().getAttribute(SystemConstants.CURRENT_USER))
  }
}
