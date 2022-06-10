package jp.co.aforce.bean;

public class Member implements java.io.Serializable {
	public String member_id;
	public String last_name;
	public String first_name;
	public int sex;
	public int birth_year;
	public int birth_month;
	public int birth_day;
	public String job;
	public int phone_number;
	public String mail_address;

	public String getMember_Id() {
		return member_id;
	}
	public String getLast_Name() {
		return last_name;
	}
	public String getFirst_Name() {
		return first_name;
	}
	public int getSex() {
		return sex;
	}
	public int getBirth_Year() {
		return birth_year;
	}
	public int getBirth_Month() {
		return birth_month;
	}
	public int getBirth_Day() {
		return birth_day;
	}
	public String getJob() {
		return job;
	}
	public int getPhone_Number() {
		return phone_number;
	}
	public String getMail_Address() {
		return mail_address;
	}

	public void setMember_Id(String member_id) {
		this.member_id=member_id;
	}
	public void setLast_Name(String last_name) {
		this.last_name=last_name;
	}
	public void setFirst_Name(String first_name) {
		this.first_name=first_name;
	}
	public void setSex(int sex) {
		this.sex=sex;
	}
	public void setBirth_Year(int birth_year) {
		this.birth_year=birth_year;
	}
	public void setBirth_Month(int birth_month) {
		this.birth_month=birth_month;
	}
	public void setBirth_Day(int birth_day) {
		this.birth_day=birth_day;
	}
	public void setJob(String job) {
		this.job=job;
	}
	public void setPhone_Number(int phone_number) {
		this.phone_number=phone_number;
	}
	public void setMail_Address(String mail_address) {
		this.mail_address=mail_address;
	}
}
