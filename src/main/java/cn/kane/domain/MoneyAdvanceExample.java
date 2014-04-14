package cn.kane.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MoneyAdvanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public MoneyAdvanceExample() {
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

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    public int getLimitEnd() {
        return limitEnd;
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

        public Criteria andContNumIsNull() {
            addCriterion("cont_num is null");
            return (Criteria) this;
        }

        public Criteria andContNumIsNotNull() {
            addCriterion("cont_num is not null");
            return (Criteria) this;
        }

        public Criteria andContNumEqualTo(String value) {
            addCriterion("cont_num =", value, "contNum");
            return (Criteria) this;
        }

        public Criteria andContNumNotEqualTo(String value) {
            addCriterion("cont_num <>", value, "contNum");
            return (Criteria) this;
        }

        public Criteria andContNumGreaterThan(String value) {
            addCriterion("cont_num >", value, "contNum");
            return (Criteria) this;
        }

        public Criteria andContNumGreaterThanOrEqualTo(String value) {
            addCriterion("cont_num >=", value, "contNum");
            return (Criteria) this;
        }

        public Criteria andContNumLessThan(String value) {
            addCriterion("cont_num <", value, "contNum");
            return (Criteria) this;
        }

        public Criteria andContNumLessThanOrEqualTo(String value) {
            addCriterion("cont_num <=", value, "contNum");
            return (Criteria) this;
        }

        public Criteria andContNumLike(String value) {
            addCriterion("cont_num like", value, "contNum");
            return (Criteria) this;
        }

        public Criteria andContNumNotLike(String value) {
            addCriterion("cont_num not like", value, "contNum");
            return (Criteria) this;
        }

        public Criteria andContNumIn(List<String> values) {
            addCriterion("cont_num in", values, "contNum");
            return (Criteria) this;
        }

        public Criteria andContNumNotIn(List<String> values) {
            addCriterion("cont_num not in", values, "contNum");
            return (Criteria) this;
        }

        public Criteria andContNumBetween(String value1, String value2) {
            addCriterion("cont_num between", value1, value2, "contNum");
            return (Criteria) this;
        }

        public Criteria andContNumNotBetween(String value1, String value2) {
            addCriterion("cont_num not between", value1, value2, "contNum");
            return (Criteria) this;
        }

        public Criteria andSpIdIsNull() {
            addCriterion("sp_id is null");
            return (Criteria) this;
        }

        public Criteria andSpIdIsNotNull() {
            addCriterion("sp_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpIdEqualTo(Long value) {
            addCriterion("sp_id =", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdNotEqualTo(Long value) {
            addCriterion("sp_id <>", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdGreaterThan(Long value) {
            addCriterion("sp_id >", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sp_id >=", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdLessThan(Long value) {
            addCriterion("sp_id <", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdLessThanOrEqualTo(Long value) {
            addCriterion("sp_id <=", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdIn(List<Long> values) {
            addCriterion("sp_id in", values, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdNotIn(List<Long> values) {
            addCriterion("sp_id not in", values, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdBetween(Long value1, Long value2) {
            addCriterion("sp_id between", value1, value2, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdNotBetween(Long value1, Long value2) {
            addCriterion("sp_id not between", value1, value2, "spId");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(String value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(String value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(String value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(String value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(String value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLike(String value) {
            addCriterion("money like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotLike(String value) {
            addCriterion("money not like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<String> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<String> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(String value1, String value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(String value1, String value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andBackMoneyIsNull() {
            addCriterion("back_money is null");
            return (Criteria) this;
        }

        public Criteria andBackMoneyIsNotNull() {
            addCriterion("back_money is not null");
            return (Criteria) this;
        }

        public Criteria andBackMoneyEqualTo(String value) {
            addCriterion("back_money =", value, "backMoney");
            return (Criteria) this;
        }

        public Criteria andBackMoneyNotEqualTo(String value) {
            addCriterion("back_money <>", value, "backMoney");
            return (Criteria) this;
        }

        public Criteria andBackMoneyGreaterThan(String value) {
            addCriterion("back_money >", value, "backMoney");
            return (Criteria) this;
        }

        public Criteria andBackMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("back_money >=", value, "backMoney");
            return (Criteria) this;
        }

        public Criteria andBackMoneyLessThan(String value) {
            addCriterion("back_money <", value, "backMoney");
            return (Criteria) this;
        }

        public Criteria andBackMoneyLessThanOrEqualTo(String value) {
            addCriterion("back_money <=", value, "backMoney");
            return (Criteria) this;
        }

        public Criteria andBackMoneyLike(String value) {
            addCriterion("back_money like", value, "backMoney");
            return (Criteria) this;
        }

        public Criteria andBackMoneyNotLike(String value) {
            addCriterion("back_money not like", value, "backMoney");
            return (Criteria) this;
        }

        public Criteria andBackMoneyIn(List<String> values) {
            addCriterion("back_money in", values, "backMoney");
            return (Criteria) this;
        }

        public Criteria andBackMoneyNotIn(List<String> values) {
            addCriterion("back_money not in", values, "backMoney");
            return (Criteria) this;
        }

        public Criteria andBackMoneyBetween(String value1, String value2) {
            addCriterion("back_money between", value1, value2, "backMoney");
            return (Criteria) this;
        }

        public Criteria andBackMoneyNotBetween(String value1, String value2) {
            addCriterion("back_money not between", value1, value2, "backMoney");
            return (Criteria) this;
        }

        public Criteria andIsBackIsNull() {
            addCriterion("is_back is null");
            return (Criteria) this;
        }

        public Criteria andIsBackIsNotNull() {
            addCriterion("is_back is not null");
            return (Criteria) this;
        }

        public Criteria andIsBackEqualTo(Boolean value) {
            addCriterion("is_back =", value, "isBack");
            return (Criteria) this;
        }

        public Criteria andIsBackNotEqualTo(Boolean value) {
            addCriterion("is_back <>", value, "isBack");
            return (Criteria) this;
        }

        public Criteria andIsBackGreaterThan(Boolean value) {
            addCriterion("is_back >", value, "isBack");
            return (Criteria) this;
        }

        public Criteria andIsBackGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_back >=", value, "isBack");
            return (Criteria) this;
        }

        public Criteria andIsBackLessThan(Boolean value) {
            addCriterion("is_back <", value, "isBack");
            return (Criteria) this;
        }

        public Criteria andIsBackLessThanOrEqualTo(Boolean value) {
            addCriterion("is_back <=", value, "isBack");
            return (Criteria) this;
        }

        public Criteria andIsBackIn(List<Boolean> values) {
            addCriterion("is_back in", values, "isBack");
            return (Criteria) this;
        }

        public Criteria andIsBackNotIn(List<Boolean> values) {
            addCriterion("is_back not in", values, "isBack");
            return (Criteria) this;
        }

        public Criteria andIsBackBetween(Boolean value1, Boolean value2) {
            addCriterion("is_back between", value1, value2, "isBack");
            return (Criteria) this;
        }

        public Criteria andIsBackNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_back not between", value1, value2, "isBack");
            return (Criteria) this;
        }

        public Criteria andOwnerUidIsNull() {
            addCriterion("owner_uid is null");
            return (Criteria) this;
        }

        public Criteria andOwnerUidIsNotNull() {
            addCriterion("owner_uid is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerUidEqualTo(Integer value) {
            addCriterion("owner_uid =", value, "ownerUid");
            return (Criteria) this;
        }

        public Criteria andOwnerUidNotEqualTo(Integer value) {
            addCriterion("owner_uid <>", value, "ownerUid");
            return (Criteria) this;
        }

        public Criteria andOwnerUidGreaterThan(Integer value) {
            addCriterion("owner_uid >", value, "ownerUid");
            return (Criteria) this;
        }

        public Criteria andOwnerUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("owner_uid >=", value, "ownerUid");
            return (Criteria) this;
        }

        public Criteria andOwnerUidLessThan(Integer value) {
            addCriterion("owner_uid <", value, "ownerUid");
            return (Criteria) this;
        }

        public Criteria andOwnerUidLessThanOrEqualTo(Integer value) {
            addCriterion("owner_uid <=", value, "ownerUid");
            return (Criteria) this;
        }

        public Criteria andOwnerUidIn(List<Integer> values) {
            addCriterion("owner_uid in", values, "ownerUid");
            return (Criteria) this;
        }

        public Criteria andOwnerUidNotIn(List<Integer> values) {
            addCriterion("owner_uid not in", values, "ownerUid");
            return (Criteria) this;
        }

        public Criteria andOwnerUidBetween(Integer value1, Integer value2) {
            addCriterion("owner_uid between", value1, value2, "ownerUid");
            return (Criteria) this;
        }

        public Criteria andOwnerUidNotBetween(Integer value1, Integer value2) {
            addCriterion("owner_uid not between", value1, value2, "ownerUid");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Date value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Date value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Date value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Date value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Date value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Date> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Date> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Date value1, Date value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Date value1, Date value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andMtimeIsNull() {
            addCriterion("mtime is null");
            return (Criteria) this;
        }

        public Criteria andMtimeIsNotNull() {
            addCriterion("mtime is not null");
            return (Criteria) this;
        }

        public Criteria andMtimeEqualTo(Date value) {
            addCriterion("mtime =", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeNotEqualTo(Date value) {
            addCriterion("mtime <>", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeGreaterThan(Date value) {
            addCriterion("mtime >", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mtime >=", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeLessThan(Date value) {
            addCriterion("mtime <", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeLessThanOrEqualTo(Date value) {
            addCriterion("mtime <=", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeIn(List<Date> values) {
            addCriterion("mtime in", values, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeNotIn(List<Date> values) {
            addCriterion("mtime not in", values, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeBetween(Date value1, Date value2) {
            addCriterion("mtime between", value1, value2, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeNotBetween(Date value1, Date value2) {
            addCriterion("mtime not between", value1, value2, "mtime");
            return (Criteria) this;
        }

        public Criteria andOldIdIsNull() {
            addCriterion("old_id is null");
            return (Criteria) this;
        }

        public Criteria andOldIdIsNotNull() {
            addCriterion("old_id is not null");
            return (Criteria) this;
        }

        public Criteria andOldIdEqualTo(Long value) {
            addCriterion("old_id =", value, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdNotEqualTo(Long value) {
            addCriterion("old_id <>", value, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdGreaterThan(Long value) {
            addCriterion("old_id >", value, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdGreaterThanOrEqualTo(Long value) {
            addCriterion("old_id >=", value, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdLessThan(Long value) {
            addCriterion("old_id <", value, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdLessThanOrEqualTo(Long value) {
            addCriterion("old_id <=", value, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdIn(List<Long> values) {
            addCriterion("old_id in", values, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdNotIn(List<Long> values) {
            addCriterion("old_id not in", values, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdBetween(Long value1, Long value2) {
            addCriterion("old_id between", value1, value2, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdNotBetween(Long value1, Long value2) {
            addCriterion("old_id not between", value1, value2, "oldId");
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