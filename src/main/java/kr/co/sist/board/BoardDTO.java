package kr.co.sist.board;

import java.sql.Date;

public class BoardDTO {
	private int num, cnt;	
	private String title, content, ip, id;
	private Date input_date;
	
	public BoardDTO() {
		
	}
	public BoardDTO(int num, int cnt, String title, String content, String ip, String id, Date input_date) {
		this.num = num;
		this.cnt = cnt;
		this.title = title;
		this.content = content;
		this.ip = ip;
		this.id = id;
		this.input_date = input_date;
	}
	public int getNum() {
		return num;
	}
	public int getCnt() {
		return cnt;
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public String getIp() {
		return ip;
	}
	public String getId() {
		return id;
	}
	public Date getInput_date() {
		return input_date;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setInput_date(Date input_date) {
		this.input_date = input_date;
	}
	@Override
	public String toString() {
		return "BoardDTO [num=" + num + ", cnt=" + cnt + ", title=" + title + ", content=" + content + ", ip=" + ip
				+ ", id=" + id + ", input_date=" + input_date + "]";
	}
	
	
}
