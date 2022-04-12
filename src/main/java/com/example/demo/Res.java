package com.example.demo;

public class Res {

	String msg;
	
	public Res()
	{
		
	}
	
	public Res(String msg)
	{
		this.msg=msg;	
			
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Res [msg=" + msg + "]";
	}
	
	
}
