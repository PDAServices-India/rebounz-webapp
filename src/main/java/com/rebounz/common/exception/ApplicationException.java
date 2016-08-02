package com.rebounz.common.exception;

public class ApplicationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/** contains the same code returned by the server. */
    private String status;

    /** application specific error code. */
    private Integer code;

    /** message describing the error. */
    private String errorMsg;

    /** link point to page where the error message is documented. */
    private String link;

    /** extra information that might useful for developers. */
    private String developerMessage;

    /** The invalid value. */
    private Object invalidValue;

    /** The result. */
    private String result;
    
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getErrorMessage() {
		return errorMsg;
	}

	public void setErrorMessage(String message) {
		this.errorMsg = message;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getDeveloperMessage() {
		return developerMessage;
	}

	public void setDeveloperMessage(String developerMessage) {
		this.developerMessage = developerMessage;
	}

	public Object getInvalidValue() {
		return invalidValue;
	}

	public void setInvalidValue(Object invalidValue) {
		this.invalidValue = invalidValue;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public ApplicationException() {
		super();
	}
	
	public ApplicationException(String msg) {
		super(msg);
	}
	
	public ApplicationException(String msg, Throwable cause) {
		super(msg, cause);
	}
	
	public ApplicationException(Throwable ex) {
		super(ex);
	}

}
