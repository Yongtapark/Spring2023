package com.sample.mvc.jdbc;

public class EmpVO {
	private int empno;
	private String ename;
	private int sal;
	private DeptVO deptVo;
	
	
	
	@Override
	public String toString() {
		return "EmpVo [empno=" + empno + ", ename=" + ename + ", sal=" + sal + ", deptVo=" + deptVo + "]";
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public DeptVO getDeptVo() {
		return deptVo;
	}
	public void setDeptVO(DeptVO deptVo) {
		this.deptVo = deptVo;
	}
	
	
	
}
