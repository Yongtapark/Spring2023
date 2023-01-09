package com.sample.mvc.jdbc;

public class DeptVO {
//부서 테이블, 부모 테이블
	private int deptno;
	private String dname;
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "DeptVO [deptno=" + deptno + ", dname=" + dname + "]";
	}
	
	
	
}
