package com.github.kotlin.po

import com.baomidou.mybatisplus.enums.IdType
import java.util.Date
import com.baomidou.mybatisplus.annotations.TableId
import com.baomidou.mybatisplus.annotations.TableField
import com.baomidou.mybatisplus.activerecord.Model
import com.baomidou.mybatisplus.annotations.TableName
import java.io.Serializable

/**
 * <p>
 * 文章
 * </p>
 *
 * @author dujf
 * @since 2018-07-06
 */
@TableName("article")
class Article : Model<Article>() {

    @TableId(value = "id", type = IdType.AUTO)
    var id: Int? = null
    /**
     * 分类id
     */
    @TableField("categary_id")
    var categaryId: Int? = null
    /**
     * 标签id
     */
    @TableField("label_id")
    var labelId: Int? = null
    /**
     * 用户id
     */
    @TableField("user_id")
    var userId: Int? = null
    var title: String? = null
    var author: String? = null
    /**
     * 原创,转载
     */
    var type: String? = null
    /**
     * 转载地址
     */
    @TableField("load_url")
    var loadUrl: String? = null
    /**
     * 内容
     */
    var content: String? = null
    /**
     * 1待审核 2保存 3已审核
     */
    var status: Int? = null
    /**
     * 最近修改时间
     */
    @TableField("alter_time")
    var alterTime: Date? = null
    /**
     * 创建时间
     */
    @TableField("create_time")
    var createTime: Date? = null
    /**
     * 浏览量
     */
    @TableField("read_count")
    var readCount: Int? = null
    /**
     * 评论量
     */
    @TableField("comment_count")
    var commentCount: Int? = null


    override fun pkVal(): Serializable? {
        return id
    }

    override fun toString(): String {
        return "Article{" +
        ", id=" + id +
        ", categaryId=" + categaryId +
        ", labelId=" + labelId +
        ", userId=" + userId +
        ", title=" + title +
        ", author=" + author +
        ", type=" + type +
        ", loadUrl=" + loadUrl +
        ", content=" + content +
        ", status=" + status +
        ", alterTime=" + alterTime +
        ", createTime=" + createTime +
        ", readCount=" + readCount +
        ", commentCount=" + commentCount +
        "}"
    }
}
