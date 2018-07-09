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
 * 标签
 * </p>
 *
 * @author dujf
 * @since 2018-07-06
 */
@TableName("label")
class Label : Model<Label>() {

    @TableId(value = "id", type = IdType.AUTO)
    var id: Int? = null
    var name: String? = null
    /**
     * 图片
     */
    var img: String? = null
    /**
     * 创建时间 
     */
    @TableField("create_time")
    var createTime: Date? = null


    override fun pkVal(): Serializable? {
        return id
    }

    override fun toString(): String {
        return "Label{" +
        ", id=" + id +
        ", name=" + name +
        ", img=" + img +
        ", createTime=" + createTime +
        "}"
    }
}
