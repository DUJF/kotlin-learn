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
@TableName("user_log")
class UserLog : Model<UserLog>() {

    @TableId(value = "id", type = IdType.AUTO)
    var id: Int? = null
    /**
     * 用户id
     */
    @TableField("user_id")
    var userId: Int? = null
    /**
     * 文章id
     */
    @TableField("article_id")
    var articleId: Int? = null
    /**
     * 1浏览 2点赞 3
     */
    var type: Int? = null
    /**
     * 创建时间
     */
    @TableField("create_time")
    var createTime: Date? = null
    @TableField("artcle_id")
    var artcleId: Int? = null


    override fun pkVal(): Serializable? {
        return id
    }

    override fun toString(): String {
        return "UserLog{" +
        ", id=" + id +
        ", userId=" + userId +
        ", articleId=" + articleId +
        ", type=" + type +
        ", createTime=" + createTime +
        ", artcleId=" + artcleId +
        "}"
    }
}
