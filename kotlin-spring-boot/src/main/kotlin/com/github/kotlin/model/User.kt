package com.github.kotlin.model

import com.baomidou.mybatisplus.enums.IdType
import java.util.Date
import com.baomidou.mybatisplus.annotations.TableId
import com.baomidou.mybatisplus.annotations.TableField
import com.baomidou.mybatisplus.activerecord.Model
import com.baomidou.mybatisplus.annotations.TableName
import java.io.Serializable

/**
 * <p>
 * 
 * </p>
 *
 * @author dujf
 * @since 2018-07-06
 */
@TableName("user")
class User : Model<User>() {

    @TableId(value = "id", type = IdType.AUTO)
    var id: Int? = null
    /**
     * 角色
     */
    var role: String? = null
    /**
     * 账号
     */
    var account: String? = null
    /**
     * 密码
     */
    var password: String? = null
    /**
     * 头像
     */
    @TableField("head_img")
    var headImg: String? = null
    /**
     * 昵称
     */
    var name: String? = null
    /**
     * 性别
     */
    var sex: String? = null
    /**
     * 生日
     */
    var bitrhday: String? = null
    /**
     * 邮箱
     */
    var email: String? = null
    /**
     * 手机号
     */
    var mobile: String? = null
    /**
     * 密保问题
     */
    var question: String? = null
    /**
     * 密保答案
     */
    var answer: String? = null
    /**
     * 类型
     */
    var type: Int? = null
    /**
     * 状态
     */
    var status: Int? = null
    /**
     * 创建时间
     */
    @TableField("create_time")
    var createTime: Date? = null
    /**
     * 最近登陆时间
     */
    @TableField("last_login_time")
    var lastLoginTime: Date? = null
    var birthday: Date? = null


    override fun pkVal(): Serializable? {
        return id
    }

    override fun toString(): String {
        return "User{" +
        ", id=" + id +
        ", role=" + role +
        ", account=" + account +
        ", password=" + password +
        ", headImg=" + headImg +
        ", name=" + name +
        ", sex=" + sex +
        ", bitrhday=" + bitrhday +
        ", email=" + email +
        ", mobile=" + mobile +
        ", question=" + question +
        ", answer=" + answer +
        ", type=" + type +
        ", status=" + status +
        ", createTime=" + createTime +
        ", lastLoginTime=" + lastLoginTime +
        ", birthday=" + birthday +
        "}"
    }
}
