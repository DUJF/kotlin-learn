package com.github.kotlin.po

import com.baomidou.mybatisplus.enums.IdType
import java.util.Date
import com.baomidou.mybatisplus.annotations.TableId
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
@TableName("message")
class Message : Model<Message>() {

    @TableId(value = "id", type = IdType.AUTO)
    var id: Int? = null
    var name: String? = null
    var email: String? = null
    var mobile: String? = null
    var content: String? = null
    var createtime: Date? = null
    var type: Int? = null
    var status: Int? = null


    override fun pkVal(): Serializable? {
        return id
    }

    override fun toString(): String {
        return "Message{" +
        ", id=" + id +
        ", name=" + name +
        ", email=" + email +
        ", mobile=" + mobile +
        ", content=" + content +
        ", createtime=" + createtime +
        ", type=" + type +
        ", status=" + status +
        "}"
    }
}
