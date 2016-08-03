package com.rebounz.common.exception;

public class NotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String entityName;
	
	private Integer code;
	
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

	public NotFoundException() {
		super();
	}
	
	public NotFoundException(String msg) {
		super(msg);
	}
	
	public NotFoundException(String msg, Throwable ex) {
		super(msg, ex);
	}
	
	public NotFoundException(String msg, String entity, Integer code) {
		super(msg);
		this.entityName = entity;
		this.code = code;
	}
	
	

}
