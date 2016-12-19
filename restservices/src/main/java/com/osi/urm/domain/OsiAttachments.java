package com.osi.urm.domain;

// Generated Dec 1, 2016 5:20:37 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * OsiAttachments generated by hbm2java
 */
@Entity
@Table(name = "osi_attachments")
public class OsiAttachments implements java.io.Serializable {

	private Long id;
	private OsiUser osiUser;
	private byte[] attachment;
	private String attachmentType;
	private Integer createdBy;
	private Date createdDate;
	private Integer updatedBy;
	private Date updatedDate;

	public OsiAttachments() {
	}

	public OsiAttachments(Long id, OsiUser osiUser, byte[] attachment,
			String attachmentType) {
		this.id = id;
		this.osiUser = osiUser;
		this.attachment = attachment;
		this.attachmentType = attachmentType;
	}

	public OsiAttachments(Long id, OsiUser osiUser, byte[] attachment,
			String attachmentType, Integer createdBy, Date createdDate,
			Integer updatedBy, Date updatedDate) {
		this.id = id;
		this.osiUser = osiUser;
		this.attachment = attachment;
		this.attachmentType = attachmentType;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	public OsiUser getOsiUser() {
		return this.osiUser;
	}

	public void setOsiUser(OsiUser osiUser) {
		this.osiUser = osiUser;
	}

	@Column(name = "attachment", nullable = false)
	public byte[] getAttachment() {
		return this.attachment;
	}

	public void setAttachment(byte[] attachment) {
		this.attachment = attachment;
	}

	@Column(name = "attachment_type", nullable = false, length = 100)
	public String getAttachmentType() {
		return this.attachmentType;
	}

	public void setAttachmentType(String attachmentType) {
		this.attachmentType = attachmentType;
	}

	@Column(name = "created_by")
	public Integer getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", length = 0)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "updated_by")
	public Integer getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_date", length = 0)
	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

}
