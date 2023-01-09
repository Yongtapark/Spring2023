package com.sample.mvc.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmpDAOImpl implements EmpDAO{
// 드라이버 로딩, 커넥션, 문장객체, sql문, 트랜잭션을 모두 관리
	private JdbcTemplate jdbcTemplate;
	
	
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<EmpVO> getEmpList() throws Exception {
		RowMapper rowMapper=new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				EmpVO empVo=new EmpVO();
				empVo.setEmpno(rs.getInt("empno"));
				empVo.setEname(rs.getString("ename"));
				empVo.setSal(rs.getInt("sal"));
				
				DeptVO deptVO= new DeptVO();
				deptVO.setDname(rs.getString("dname"));
				deptVO.setDeptno(rs.getInt("empno"));
				empVo.setDeptVO(deptVO);
				
				return empVo;
			}//rowMap
			
		};//RowMapper
		
		StringBuffer sql=new StringBuffer();
		sql.append("select a.empno, a.ename, a.sal, b.dname ");
		sql.append("from t_emp a, t_dept b where a.deptno=b.deptno ");
		sql.append("order by empno");
		//지정된 쿼리를 실행하여 RowMapper를 통해 각 행을 java 객체에 매핑한다.
		return jdbcTemplate.query(sql.toString(), rowMapper);
	}//getEmpList

	@Override
	public int getTotalSal() {
		StringBuffer sql=new StringBuffer();
		sql.append("select sum(sal) as sumsal from t_emp");
		return jdbcTemplate.queryForInt(sql.toString());
	}//getTotalSal()
	

	@Override
	public List<EmpVO> getDeptList() {
		StringBuffer sql=new StringBuffer();
		sql.append("select deptno, dname from t_dept");
		sql.append("order by deptno asc");
		
		RowMapper rowMapper=new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				DeptVO deptVO=new DeptVO();
				
				deptVO.setDeptno(rs.getInt("deptno"));
				deptVO.setDname(rs.getString("dname"));
				return deptVO;
			}
		};//rowMapper
		
		return jdbcTemplate.query(sql.toString(), rowMapper);
	}
	//삽입, 삭제 , 수정

	@Override
	public void insertEmp(EmpVO evo) throws Exception {
		StringBuffer sql=new StringBuffer();
		sql.append("insert into t_emp(empno, ename, sal, deptno)");
		sql.append("values(seq_emp.nextval,?,?,?)");
		
		Object[] args= {evo.getEname(),evo.getSal(), evo.getDeptVo().getDeptno()};
		jdbcTemplate.update(sql.toString(),args);
		
		
	}
//삭제
	@Override
	public void deleteEmp(int empno) throws Exception {
		StringBuffer sql=new StringBuffer();
		sql.append("delete from t_emp where empno=?");
		jdbcTemplate.update(sql.toString(),new Object[] {empno});
		
	}
//검색
	@Override
	public EmpVO getEmp(int empno) throws Exception {
		StringBuffer sql=new StringBuffer();
		sql.append("select empno, ename, sal, deptno from t_emp where empno=?");
		RowMapper rowMapper=new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				EmpVO empVo=new EmpVO();
				empVo.setEmpno(rs.getInt("empno"));
				empVo.setEname(rs.getString("ename"));
				empVo.setSal(rs.getInt("sal"));
				DeptVO deptVO=new DeptVO();
				deptVO.setDeptno(rs.getInt("deptno"));
				empVo.setDeptVO(deptVO);
				return empVo;
			}
			
		};
		return jdbcTemplate.queryForObject(sql.toString(), new Object[] {empno},rowMapper);
	}//getEmp
//수정
	@Override
	public void updateEmp(EmpVO evo) throws Exception {
		StringBuffer sql=new StringBuffer();
		sql.append("update t_emp a set ename = ?, sal=?, deptno=? where empno=?");
		
		Object[] args= {evo.getEname(),evo.getSal(),evo.getDeptVo().getDeptno(),evo.getEmpno()};
		jdbcTemplate.update(sql.toString(),args);
	}

}
