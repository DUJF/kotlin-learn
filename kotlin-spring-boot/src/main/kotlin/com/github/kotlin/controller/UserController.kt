package com.github.kotlin.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper
import com.baomidou.mybatisplus.plugins.Page
import com.github.kotlin.core.RespBody
import com.github.kotlin.core.RespPages
import com.github.kotlin.core.ResultUtils
import com.github.kotlin.model.User
import com.github.kotlin.service.UserService
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author dujf
 * @since 2018-07-06
 */
@RestController
@RequestMapping("/user")
class UserController(
    private val userService: UserService
) {
  @ApiOperation(value = "")
  @GetMapping
  fun listUsers(): RespBody<*> {
    val page = userService.selectPage(Page<User>(1, 2, "create_time", false), EntityWrapper<User>())
    return ResultUtils.success(RespPages<User>(page))
  }
}
