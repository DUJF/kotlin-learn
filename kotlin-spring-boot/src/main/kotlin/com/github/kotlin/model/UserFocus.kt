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
 * 关注用户
 * </p>
 *
 * @author dujf
 * @since 2018-07-06
 */
@TableName("user_focus")
class UserFocus : Model<UserFocus>() {

    @TableId(value = "id", type = IdType.AUTO)
    var id: Int? = null
    @TableField("user_id")
    var userId: Int? = null
    @TableField("user_id_focus")
    var userIdFocus: Int? = null
    /**
     * 关注时间
     */
    @TableField("create_time")
    var createTime: Date? = null


    override fun pkVal(): Serializable? {
        return id
    }

    override fun toString(): String {
        return "UserFocus{" +
        ", id=" + id +
        ", userId=" + userId +
        ", userIdFocus=" + userIdFocus +
        ", createTime=" + createTime +
        "}"
    }
}
