package kr.co.sist.emp;

public class DeptDTO {
	private int deptno;
	private String dname, loc;
	
	public DeptDTO() {
		
	}

	public DeptDTO(int deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public int getDeptno() {
		return deptno;
	}

	public String getDname() {
		return dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "DeptDTO [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
	
	
}