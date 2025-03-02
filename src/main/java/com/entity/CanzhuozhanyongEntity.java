package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 餐桌占用
 *
 * @author 
 * @email
 */
@TableName("canzhuozhanyong")
public class CanzhuozhanyongEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public CanzhuozhanyongEntity() {

	}

	public CanzhuozhanyongEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 餐桌
     */
    @TableField(value = "canzhuo_id")

    private Integer canzhuoId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 餐桌状态
     */
    @TableField(value = "canzhuozhanyong_types")

    private Integer canzhuozhanyongTypes;


    /**
     * 备注
     */
    @TableField(value = "canzhuozhanyong_content")

    private String canzhuozhanyongContent;


    /**
     * 占用时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：餐桌
	 */
    public Integer getCanzhuoId() {
        return canzhuoId;
    }


    /**
	 * 获取：餐桌
	 */

    public void setCanzhuoId(Integer canzhuoId) {
        this.canzhuoId = canzhuoId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：餐桌状态
	 */
    public Integer getCanzhuozhanyongTypes() {
        return canzhuozhanyongTypes;
    }


    /**
	 * 获取：餐桌状态
	 */

    public void setCanzhuozhanyongTypes(Integer canzhuozhanyongTypes) {
        this.canzhuozhanyongTypes = canzhuozhanyongTypes;
    }
    /**
	 * 设置：备注
	 */
    public String getCanzhuozhanyongContent() {
        return canzhuozhanyongContent;
    }


    /**
	 * 获取：备注
	 */

    public void setCanzhuozhanyongContent(String canzhuozhanyongContent) {
        this.canzhuozhanyongContent = canzhuozhanyongContent;
    }
    /**
	 * 设置：占用时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：占用时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Canzhuozhanyong{" +
            "id=" + id +
            ", canzhuoId=" + canzhuoId +
            ", yonghuId=" + yonghuId +
            ", canzhuozhanyongTypes=" + canzhuozhanyongTypes +
            ", canzhuozhanyongContent=" + canzhuozhanyongContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
