package com.example.demo.exception;

public class ResponseDto {

	private String statusCode;
	private String statusmessage;
	
	public ResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public ResponseDto(String statusmessage) {
		this.statusmessage = statusmessage;
	}


	public ResponseDto(String statusCode, String statusmessage) {
		this.statusCode = statusCode;
		this.statusmessage = statusmessage;
	}


	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusmessage() {
		return statusmessage;
	}
	public void setStatusmessage(String statusmessage) {
		this.statusmessage = statusmessage;
	}
	
	
}
