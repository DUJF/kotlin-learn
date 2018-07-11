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
@TableName("system")
class System : Model<System>() {

    @TableId(value = "id", type = IdType.AUTO)
    var id: Int? = null
    var name: String? = null
    /**
     * 内容
     */
    var content: String? = null
    /**
     * l类型
     */
    var type: Int? = null
    /**
     * 状态
     */
    var status: Int? = null
    /**
     * 备注
     */
    var remark: String? = null
    /**
     * 创建时间
     */
    var createtime: Date? = null


    override fun pkVal(): Serializable? {
        return id
    }

    override fun toString(): String {
        return "System{" +
        ", id=" + id +
        ", name=" + name +
        ", content=" + content +
        ", type=" + type +
        ", status=" + status +
        ", remark=" + remark +
        ", createtime=" + createtime +
        "}"
    }
}
