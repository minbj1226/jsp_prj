package kr.co.sist.emp;

import java.util.Date;

/**
 * hiredateStr: Oracle에서 to_char 함수를 사용하여 고정된 날짜 형식으로 얻기
 * hiredate: Java에서 rs.getDate() method로 얻어서 다양한 날짜 형식으로 보여줄 때 
 */
public class EmpDTO extends DeptDTO{
	private int empno,mgr,sal,comm;	
	private String ename,job,hiredatestr;	
	private Date hiredate;
	
	public EmpDTO() {
		
	}
	
	public EmpDTO(int empno, int mgr, int sal, int comm, String ename, String job, String hiredatestr, Date hiredate) {
		this.empno = empno;
		this.mgr = mgr;
		this.sal = sal;
		this.comm = comm;
		this.ename = ename;
		this.job = job;
		this.hiredatestr = hiredatestr;
		this.hiredate = hiredate;
	}
	public int getEmpno() {
		return empno;
	}
	public int getMgr() {
		return mgr;
	}
	public int getSal() {
		return sal;
	}
	public int getComm() {
		return comm;
	}
	public String getEname() {
		return ename;
	}
	public String getJob() {
		return job;
	}
	public String getHiredatestr() {
		return hiredatestr;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setHiredatestr(String hiredatestr) {
		this.hiredatestr = hiredatestr;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	@Override
	public String toString() {
		return "EmpDTO [empno=" + empno + ", mgr=" + mgr + ", sal=" + sal + ", comm=" + comm + ", ename=" + ename
				+ ", job=" + job + ", hiredatestr=" + hiredatestr + ", hiredate=" + hiredate + "]";
	}		
	
	

}
