package com.sample.mvc.jdbc;

import java.util.List;

public interface EmpDAO {
	List<EmpVO> getEmpList() throws Exception;
	int getTotalSal();
	List<DeptVO> getDeptList();
	
	
	//삽입, 삭제, select, 수정
	
	void insertEmp(EmpVO evo) throws Exception;
	void deleteEmp(int empno) throws Exception;
	EmpVO getEmp(int empno) throws Exception;
	void updateEmp(EmpVO empno)throws Exception;
	
	//jsp 들은 --> empInsert.jsp, empUpdate.jsp, 
	//java.EmpListAction, EmpUpdate.java, EmpUpdateAction.java
	//EmpDeleteAction.java,EmpDelete.java..
}
