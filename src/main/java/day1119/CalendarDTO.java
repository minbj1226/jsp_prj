package day1119;

public class CalendarDTO {
	private String nowYear, nowMonth;
	
	public CalendarDTO() {
		
	}

	public CalendarDTO(String nowYear, String nowMonth) {
		this.nowYear = nowYear;
		this.nowMonth = nowMonth;
	}

	public String getNowYear() {
		return nowYear;
	}

	public String getNowMonth() {
		return nowMonth;
	}

	public void setNowYear(String nowYear) {
		this.nowYear = nowYear;
	}

	public void setNowMonth(String nowMonth) {
		this.nowMonth = nowMonth;
	}

	@Override
	public String toString() {
		return "CalendarDTO [nowYear=" + nowYear + ", nowMonth=" + nowMonth + "]";
	}
	
}
