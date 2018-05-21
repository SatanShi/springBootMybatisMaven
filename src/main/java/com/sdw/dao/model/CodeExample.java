package com.sdw.dao.model;

import java.util.List;
import java.util.ArrayList;

public class CodeExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public CodeExample(){
		oredCriteria = new ArrayList<Criteria>();
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getOrderByClause() {
		return orderByClause;
	}

	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	public boolean isDistinct() {
		return distinct;
	}

	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andCodeIsNull() {
			addCriterion("code is null");
			return (Criteria) this;
		}

		public Criteria andCodeIsNotNull() {
			addCriterion("code is not null");
			return (Criteria) this;
		}

		public Criteria andCodeEqualTo(Integer value) {
			addCriterion("code =", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotEqualTo(Integer value) {
			addCriterion("code <>", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeGreaterThan(Integer value) {
			addCriterion("code >", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeGreaterThanOrEqualTo(Integer value) {
			addCriterion("code >=", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLessThan(Integer value) {
			addCriterion("code <", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLessThanOrEqualTo(Integer value) {
			addCriterion("code <=", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeIn(List<Integer> values) {
			addCriterion("code in", values, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotIn(List<Integer> values) {
			addCriterion("code not in", values, "code");
			return (Criteria) this;
		}

		public Criteria andCodeBetween(Integer value1, Integer value2) {
			addCriterion("code between", value1, value2, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotBetween(Integer value1, Integer value2) {
			addCriterion("code not between", value1, value2, "code");
			return (Criteria) this;
		}

		public Criteria andPhoneIsNull() {
			addCriterion("phone is null");
			return (Criteria) this;
		}

		public Criteria andPhoneIsNotNull() {
			addCriterion("phone is not null");
			return (Criteria) this;
		}

		public Criteria andPhoneEqualTo(String value) {
			addCriterion("phone =", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotEqualTo(String value) {
			addCriterion("phone <>", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneGreaterThan(String value) {
			addCriterion("phone >", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneGreaterThanOrEqualTo(String value) {
			addCriterion("phone >=", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLessThan(String value) {
			addCriterion("phone <", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLessThanOrEqualTo(String value) {
			addCriterion("phone <=", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLike(String value) {
			addCriterion("phone like", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotLike(String value) {
			addCriterion("phone not like", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneIn(List<String> values) {
			addCriterion("phone in", values, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotIn(List<String> values) {
			addCriterion("phone not in", values, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneBetween(String value1, String value2) {
			addCriterion("phone between", value1, value2, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotBetween(String value1, String value2) {
			addCriterion("phone not between", value1, value2, "phone");
			return (Criteria) this;
		}

		public Criteria andNameIsNull() {
			addCriterion("name is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("name is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("name =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("name <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("name >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("name >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("name <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("name <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("name like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("name not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("name in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("name not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("name between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("name not between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andSexIsNull() {
			addCriterion("sex is null");
			return (Criteria) this;
		}

		public Criteria andSexIsNotNull() {
			addCriterion("sex is not null");
			return (Criteria) this;
		}

		public Criteria andSexEqualTo(String value) {
			addCriterion("sex =", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotEqualTo(String value) {
			addCriterion("sex <>", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexGreaterThan(String value) {
			addCriterion("sex >", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexGreaterThanOrEqualTo(String value) {
			addCriterion("sex >=", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexLessThan(String value) {
			addCriterion("sex <", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexLessThanOrEqualTo(String value) {
			addCriterion("sex <=", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexLike(String value) {
			addCriterion("sex like", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotLike(String value) {
			addCriterion("sex not like", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexIn(List<String> values) {
			addCriterion("sex in", values, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotIn(List<String> values) {
			addCriterion("sex not in", values, "sex");
			return (Criteria) this;
		}

		public Criteria andSexBetween(String value1, String value2) {
			addCriterion("sex between", value1, value2, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotBetween(String value1, String value2) {
			addCriterion("sex not between", value1, value2, "sex");
			return (Criteria) this;
		}

		public Criteria andBirthdayIsNull() {
			addCriterion("birthday is null");
			return (Criteria) this;
		}

		public Criteria andBirthdayIsNotNull() {
			addCriterion("birthday is not null");
			return (Criteria) this;
		}

		public Criteria andBirthdayEqualTo(String value) {
			addCriterion("birthday =", value, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayNotEqualTo(String value) {
			addCriterion("birthday <>", value, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayGreaterThan(String value) {
			addCriterion("birthday >", value, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
			addCriterion("birthday >=", value, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayLessThan(String value) {
			addCriterion("birthday <", value, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayLessThanOrEqualTo(String value) {
			addCriterion("birthday <=", value, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayLike(String value) {
			addCriterion("birthday like", value, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayNotLike(String value) {
			addCriterion("birthday not like", value, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayIn(List<String> values) {
			addCriterion("birthday in", values, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayNotIn(List<String> values) {
			addCriterion("birthday not in", values, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayBetween(String value1, String value2) {
			addCriterion("birthday between", value1, value2, "birthday");
			return (Criteria) this;
		}

		public Criteria andBirthdayNotBetween(String value1, String value2) {
			addCriterion("birthday not between", value1, value2, "birthday");
			return (Criteria) this;
		}

		public Criteria andTegIsNull() {
			addCriterion("teg is null");
			return (Criteria) this;
		}

		public Criteria andTegIsNotNull() {
			addCriterion("teg is not null");
			return (Criteria) this;
		}

		public Criteria andTegEqualTo(String value) {
			addCriterion("teg =", value, "teg");
			return (Criteria) this;
		}

		public Criteria andTegNotEqualTo(String value) {
			addCriterion("teg <>", value, "teg");
			return (Criteria) this;
		}

		public Criteria andTegGreaterThan(String value) {
			addCriterion("teg >", value, "teg");
			return (Criteria) this;
		}

		public Criteria andTegGreaterThanOrEqualTo(String value) {
			addCriterion("teg >=", value, "teg");
			return (Criteria) this;
		}

		public Criteria andTegLessThan(String value) {
			addCriterion("teg <", value, "teg");
			return (Criteria) this;
		}

		public Criteria andTegLessThanOrEqualTo(String value) {
			addCriterion("teg <=", value, "teg");
			return (Criteria) this;
		}

		public Criteria andTegLike(String value) {
			addCriterion("teg like", value, "teg");
			return (Criteria) this;
		}

		public Criteria andTegNotLike(String value) {
			addCriterion("teg not like", value, "teg");
			return (Criteria) this;
		}

		public Criteria andTegIn(List<String> values) {
			addCriterion("teg in", values, "teg");
			return (Criteria) this;
		}

		public Criteria andTegNotIn(List<String> values) {
			addCriterion("teg not in", values, "teg");
			return (Criteria) this;
		}

		public Criteria andTegBetween(String value1, String value2) {
			addCriterion("teg between", value1, value2, "teg");
			return (Criteria) this;
		}

		public Criteria andTegNotBetween(String value1, String value2) {
			addCriterion("teg not between", value1, value2, "teg");
			return (Criteria) this;
		}

		public Criteria andShengIsNull() {
			addCriterion("sheng is null");
			return (Criteria) this;
		}

		public Criteria andShengIsNotNull() {
			addCriterion("sheng is not null");
			return (Criteria) this;
		}

		public Criteria andShengEqualTo(String value) {
			addCriterion("sheng =", value, "sheng");
			return (Criteria) this;
		}

		public Criteria andShengNotEqualTo(String value) {
			addCriterion("sheng <>", value, "sheng");
			return (Criteria) this;
		}

		public Criteria andShengGreaterThan(String value) {
			addCriterion("sheng >", value, "sheng");
			return (Criteria) this;
		}

		public Criteria andShengGreaterThanOrEqualTo(String value) {
			addCriterion("sheng >=", value, "sheng");
			return (Criteria) this;
		}

		public Criteria andShengLessThan(String value) {
			addCriterion("sheng <", value, "sheng");
			return (Criteria) this;
		}

		public Criteria andShengLessThanOrEqualTo(String value) {
			addCriterion("sheng <=", value, "sheng");
			return (Criteria) this;
		}

		public Criteria andShengLike(String value) {
			addCriterion("sheng like", value, "sheng");
			return (Criteria) this;
		}

		public Criteria andShengNotLike(String value) {
			addCriterion("sheng not like", value, "sheng");
			return (Criteria) this;
		}

		public Criteria andShengIn(List<String> values) {
			addCriterion("sheng in", values, "sheng");
			return (Criteria) this;
		}

		public Criteria andShengNotIn(List<String> values) {
			addCriterion("sheng not in", values, "sheng");
			return (Criteria) this;
		}

		public Criteria andShengBetween(String value1, String value2) {
			addCriterion("sheng between", value1, value2, "sheng");
			return (Criteria) this;
		}

		public Criteria andShengNotBetween(String value1, String value2) {
			addCriterion("sheng not between", value1, value2, "sheng");
			return (Criteria) this;
		}

		public Criteria andShiIsNull() {
			addCriterion("shi is null");
			return (Criteria) this;
		}

		public Criteria andShiIsNotNull() {
			addCriterion("shi is not null");
			return (Criteria) this;
		}

		public Criteria andShiEqualTo(String value) {
			addCriterion("shi =", value, "shi");
			return (Criteria) this;
		}

		public Criteria andShiNotEqualTo(String value) {
			addCriterion("shi <>", value, "shi");
			return (Criteria) this;
		}

		public Criteria andShiGreaterThan(String value) {
			addCriterion("shi >", value, "shi");
			return (Criteria) this;
		}

		public Criteria andShiGreaterThanOrEqualTo(String value) {
			addCriterion("shi >=", value, "shi");
			return (Criteria) this;
		}

		public Criteria andShiLessThan(String value) {
			addCriterion("shi <", value, "shi");
			return (Criteria) this;
		}

		public Criteria andShiLessThanOrEqualTo(String value) {
			addCriterion("shi <=", value, "shi");
			return (Criteria) this;
		}

		public Criteria andShiLike(String value) {
			addCriterion("shi like", value, "shi");
			return (Criteria) this;
		}

		public Criteria andShiNotLike(String value) {
			addCriterion("shi not like", value, "shi");
			return (Criteria) this;
		}

		public Criteria andShiIn(List<String> values) {
			addCriterion("shi in", values, "shi");
			return (Criteria) this;
		}

		public Criteria andShiNotIn(List<String> values) {
			addCriterion("shi not in", values, "shi");
			return (Criteria) this;
		}

		public Criteria andShiBetween(String value1, String value2) {
			addCriterion("shi between", value1, value2, "shi");
			return (Criteria) this;
		}

		public Criteria andShiNotBetween(String value1, String value2) {
			addCriterion("shi not between", value1, value2, "shi");
			return (Criteria) this;
		}

		public Criteria andRemarkIsNull() {
			addCriterion("remark is null");
			return (Criteria) this;
		}

		public Criteria andRemarkIsNotNull() {
			addCriterion("remark is not null");
			return (Criteria) this;
		}

		public Criteria andRemarkEqualTo(String value) {
			addCriterion("remark =", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkNotEqualTo(String value) {
			addCriterion("remark <>", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkGreaterThan(String value) {
			addCriterion("remark >", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkGreaterThanOrEqualTo(String value) {
			addCriterion("remark >=", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkLessThan(String value) {
			addCriterion("remark <", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkLessThanOrEqualTo(String value) {
			addCriterion("remark <=", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkLike(String value) {
			addCriterion("remark like", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkNotLike(String value) {
			addCriterion("remark not like", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkIn(List<String> values) {
			addCriterion("remark in", values, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkNotIn(List<String> values) {
			addCriterion("remark not in", values, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkBetween(String value1, String value2) {
			addCriterion("remark between", value1, value2, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkNotBetween(String value1, String value2) {
			addCriterion("remark not between", value1, value2, "remark");
			return (Criteria) this;
		}

		public Criteria andCompanyIsNull() {
			addCriterion("company is null");
			return (Criteria) this;
		}

		public Criteria andCompanyIsNotNull() {
			addCriterion("company is not null");
			return (Criteria) this;
		}

		public Criteria andCompanyEqualTo(String value) {
			addCriterion("company =", value, "company");
			return (Criteria) this;
		}

		public Criteria andCompanyNotEqualTo(String value) {
			addCriterion("company <>", value, "company");
			return (Criteria) this;
		}

		public Criteria andCompanyGreaterThan(String value) {
			addCriterion("company >", value, "company");
			return (Criteria) this;
		}

		public Criteria andCompanyGreaterThanOrEqualTo(String value) {
			addCriterion("company >=", value, "company");
			return (Criteria) this;
		}

		public Criteria andCompanyLessThan(String value) {
			addCriterion("company <", value, "company");
			return (Criteria) this;
		}

		public Criteria andCompanyLessThanOrEqualTo(String value) {
			addCriterion("company <=", value, "company");
			return (Criteria) this;
		}

		public Criteria andCompanyLike(String value) {
			addCriterion("company like", value, "company");
			return (Criteria) this;
		}

		public Criteria andCompanyNotLike(String value) {
			addCriterion("company not like", value, "company");
			return (Criteria) this;
		}

		public Criteria andCompanyIn(List<String> values) {
			addCriterion("company in", values, "company");
			return (Criteria) this;
		}

		public Criteria andCompanyNotIn(List<String> values) {
			addCriterion("company not in", values, "company");
			return (Criteria) this;
		}

		public Criteria andCompanyBetween(String value1, String value2) {
			addCriterion("company between", value1, value2, "company");
			return (Criteria) this;
		}

		public Criteria andCompanyNotBetween(String value1, String value2) {
			addCriterion("company not between", value1, value2, "company");
			return (Criteria) this;
		}

		public Criteria andZhiweiIsNull() {
			addCriterion("zhiwei is null");
			return (Criteria) this;
		}

		public Criteria andZhiweiIsNotNull() {
			addCriterion("zhiwei is not null");
			return (Criteria) this;
		}

		public Criteria andZhiweiEqualTo(String value) {
			addCriterion("zhiwei =", value, "zhiwei");
			return (Criteria) this;
		}

		public Criteria andZhiweiNotEqualTo(String value) {
			addCriterion("zhiwei <>", value, "zhiwei");
			return (Criteria) this;
		}

		public Criteria andZhiweiGreaterThan(String value) {
			addCriterion("zhiwei >", value, "zhiwei");
			return (Criteria) this;
		}

		public Criteria andZhiweiGreaterThanOrEqualTo(String value) {
			addCriterion("zhiwei >=", value, "zhiwei");
			return (Criteria) this;
		}

		public Criteria andZhiweiLessThan(String value) {
			addCriterion("zhiwei <", value, "zhiwei");
			return (Criteria) this;
		}

		public Criteria andZhiweiLessThanOrEqualTo(String value) {
			addCriterion("zhiwei <=", value, "zhiwei");
			return (Criteria) this;
		}

		public Criteria andZhiweiLike(String value) {
			addCriterion("zhiwei like", value, "zhiwei");
			return (Criteria) this;
		}

		public Criteria andZhiweiNotLike(String value) {
			addCriterion("zhiwei not like", value, "zhiwei");
			return (Criteria) this;
		}

		public Criteria andZhiweiIn(List<String> values) {
			addCriterion("zhiwei in", values, "zhiwei");
			return (Criteria) this;
		}

		public Criteria andZhiweiNotIn(List<String> values) {
			addCriterion("zhiwei not in", values, "zhiwei");
			return (Criteria) this;
		}

		public Criteria andZhiweiBetween(String value1, String value2) {
			addCriterion("zhiwei between", value1, value2, "zhiwei");
			return (Criteria) this;
		}

		public Criteria andZhiweiNotBetween(String value1, String value2) {
			addCriterion("zhiwei not between", value1, value2, "zhiwei");
			return (Criteria) this;
		}

}

	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	public static class Criterion {
		private String condition;

		private Object value;

		private Object secondValue;

		private boolean noValue;

		private boolean singleValue;

		private boolean betweenValue;

		private boolean listValue;

		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
		return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}
}