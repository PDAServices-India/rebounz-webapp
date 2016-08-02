package com.rebounz.common.exception;

public class NotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String entityName;
	
	private Integer code;
	
	private String status;
	
	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public NotFoundException() {
		super();
	}
	
	public NotFoundException(String msg) {
		super(msg);
	}
	
	public NotFoundException(String msg, Throwable ex) {
		super(msg, ex);
	}
	
	public NotFoundException(String msg, String entity, String status, Integer code) {
		super(msg);
		this.entityName = entity;
		this.status = status;
		this.code = code;
	}
	
	

}
