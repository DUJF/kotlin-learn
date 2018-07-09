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
 * 评论
 * </p>
 *
 * @author dujf
 * @since 2018-07-06
 */
@TableName("comment")
class Comment : Model<Comment>() {

    @TableId(value = "id", type = IdType.AUTO)
    var id: Int? = null
    /**
     * 用户id
     */
    @TableField("user_id")
    var userId: Int? = null
    /**
     * 文章id/评论id
     */
    @TableField("article_id")
    var articleId: Int? = null
    /**
     * 内容
     */
    var content: String? = null
    /**
     * 创建时间
     */
    @TableField("create_time")
    var createTime: Date? = null
    /**
     * 1评论文章 2 回复评论文章
     */
    var type: Int? = null
    /**
     * 1未读 2已读 
     */
    var status: Int? = null


    override fun pkVal(): Serializable? {
        return id
    }

    override fun toString(): String {
        return "Comment{" +
        ", id=" + id +
        ", userId=" + userId +
        ", articleId=" + articleId +
        ", content=" + content +
        ", createTime=" + createTime +
        ", type=" + type +
        ", status=" + status +
        "}"
    }
}
