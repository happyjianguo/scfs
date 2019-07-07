package com.scfs.domain.base.dto.req;

import java.util.Date;

import com.scfs.domain.BaseReqDto;

public class BaseDepartmentReqDto extends BaseReqDto {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1460787655597794397L;

	/** ID */
	private Integer id;

	/** 名称 */
	private String name;

	/** 编号 */
	private String number;

	/** 创建人 */
	private String creator;

	/** 创建人ID */
	private Integer creatorId;

	/** 创建时间 */
	private Date createAt;

	/** 修改时间 */
	private Date updateAt;

	/** 备注 */
	private String remark;

	/** 逻辑删除标记 */
	private Integer isDelete;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator == null ? null : creator.trim();
	}

	public Integer getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(Integer creatorId) {
		this.creatorId = creatorId;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

}