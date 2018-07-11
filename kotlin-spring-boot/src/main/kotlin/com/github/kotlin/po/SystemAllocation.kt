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
 * 
 * </p>
 *
 * @author dujf
 * @since 2018-07-06
 */
@TableName("system_allocation")
class SystemAllocation : Model<SystemAllocation>() {

    @TableId(value = "id", type = IdType.AUTO)
    var id: Int? = null
    var content: String? = null
    @TableField("create_time")
    var createTime: Date? = null
    var name: String? = null
    var remark: String? = null
    var status: Int? = null
    var type: Int? = null


    override fun pkVal(): Serializable? {
        return id
    }

    override fun toString(): String {
        return "SystemAllocation{" +
        ", id=" + id +
        ", content=" + content +
        ", createTime=" + createTime +
        ", name=" + name +
        ", remark=" + remark +
        ", status=" + status +
        ", type=" + type +
        "}"
    }
}
