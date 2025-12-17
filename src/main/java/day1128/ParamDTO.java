package day1128;

import java.sql.Date;
import java.util.Arrays;

public class ParamDTO {
	private String id, pass, birth, loc, intro, code, name, email, ip, secChUalPlatform, userAgent, profile;
	private String[] language;
	private Date input_date;
	
	public ParamDTO() {
	}

	public ParamDTO(String id, String pass, String birth, String loc, String intro, String code, String name,
			String email, String ip, String secChUalPlatform, String userAgent, String profile, String[] language,
			Date input_date) {
		this.id = id;
		this.pass = pass;
		this.birth = birth;
		this.loc = loc;
		this.intro = intro;
		this.code = code;
		this.name = name;
		this.email = email;
		this.ip = ip;
		this.secChUalPlatform = secChUalPlatform;
		this.userAgent = userAgent;
		this.profile = profile;
		this.language = language;
		this.input_date = input_date;
	}

	public String getId() {
		return id;
	}

	public String getPass() {
		return pass;
	}

	public String getBirth() {
		return birth;
	}

	public String getLoc() {
		return loc;
	}

	public String getIntro() {
		return intro;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getIp() {
		return ip;
	}

	public String getSecChUalPlatform() {
		return secChUalPlatform;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public String getProfile() {
		return profile;
	}

	public String[] getLanguage() {
		return language;
	}

	public Date getInput_date() {
		return input_date;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public void setSecChUalPlatform(String secChUalPlatform) {
		this.secChUalPlatform = secChUalPlatform;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public void setLanguage(String[] language) {
		this.language = language;
	}

	public void setInput_date(Date input_date) {
		this.input_date = input_date;
	}

	@Override
	public String toString() {
		return "ParamDTO [id=" + id + ", pass=" + pass + ", birth=" + birth + ", loc=" + loc + ", intro=" + intro
				+ ", code=" + code + ", name=" + name + ", email=" + email + ", ip=" + ip + ", secChUalPlatform="
				+ secChUalPlatform + ", userAgent=" + userAgent + ", profile=" + profile + ", language="
				+ Arrays.toString(language) + ", input_date=" + input_date + "]";
	}

}