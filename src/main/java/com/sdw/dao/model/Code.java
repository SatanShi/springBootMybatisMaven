package com.sdw.dao.model;

import java.io.Serializable;

/**
 *
 */
public class Code implements Serializable{
	//编号
	private Integer code;
	//值
	private String phone;
	//值
	private String name;
	//备注
	private String sex;
	//值
	private String birthday;
	//值
	private String teg;
	//值
	private String sheng;
	//值
	private String shi;
	//
	private String remark;
	//值
	private String company;
	//
	private String zhiwei;

	public void setCode(Integer code) {
		this.code=code;
	}
	public Integer getCode() {
		return code;
	}
	public void setPhone(String phone) {
		this.phone=phone == null ? phone : phone.trim();
	}

	public String getPhone() {
		return phone;
	}
	public void setName(String name) {
		this.name=name == null ? name : name.trim();
	}

	public String getName() {
		return name;
	}
	public void setSex(String sex) {
		this.sex=sex == null ? sex : sex.trim();
	}

	public String getSex() {
		return sex;
	}
	public void setBirthday(String birthday) {
		this.birthday=birthday == null ? birthday : birthday.trim();
	}

	public String getBirthday() {
		return birthday;
	}
	public void setTeg(String teg) {
		this.teg=teg == null ? teg : teg.trim();
	}

	public String getTeg() {
		return teg;
	}
	public void setSheng(String sheng) {
		this.sheng=sheng == null ? sheng : sheng.trim();
	}

	public String getSheng() {
		return sheng;
	}
	public void setShi(String shi) {
		this.shi=shi == null ? shi : shi.trim();
	}

	public String getShi() {
		return shi;
	}
	public void setRemark(String remark) {
		this.remark=remark == null ? remark : remark.trim();
	}

	public String getRemark() {
		return remark;
	}
	public void setCompany(String company) {
		this.company=company == null ? company : company.trim();
	}

	public String getCompany() {
		return company;
	}
	public void setZhiwei(String zhiwei) {
		this.zhiwei=zhiwei == null ? zhiwei : zhiwei.trim();
	}

	public String getZhiwei() {
		return zhiwei;
	}
}
