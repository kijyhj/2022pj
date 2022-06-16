package result;

import java.util.ArrayList;
import java.util.List;

public class EpCommonCodeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ep_common_code
     *
     * @mbg.generated Wed Jun 15 17:26:11 KST 2022
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ep_common_code
     *
     * @mbg.generated Wed Jun 15 17:26:11 KST 2022
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ep_common_code
     *
     * @mbg.generated Wed Jun 15 17:26:11 KST 2022
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ep_common_code
     *
     * @mbg.generated Wed Jun 15 17:26:11 KST 2022
     */
    public EpCommonCodeExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ep_common_code
     *
     * @mbg.generated Wed Jun 15 17:26:11 KST 2022
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ep_common_code
     *
     * @mbg.generated Wed Jun 15 17:26:11 KST 2022
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ep_common_code
     *
     * @mbg.generated Wed Jun 15 17:26:11 KST 2022
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ep_common_code
     *
     * @mbg.generated Wed Jun 15 17:26:11 KST 2022
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ep_common_code
     *
     * @mbg.generated Wed Jun 15 17:26:11 KST 2022
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ep_common_code
     *
     * @mbg.generated Wed Jun 15 17:26:11 KST 2022
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ep_common_code
     *
     * @mbg.generated Wed Jun 15 17:26:11 KST 2022
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ep_common_code
     *
     * @mbg.generated Wed Jun 15 17:26:11 KST 2022
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ep_common_code
     *
     * @mbg.generated Wed Jun 15 17:26:11 KST 2022
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ep_common_code
     *
     * @mbg.generated Wed Jun 15 17:26:11 KST 2022
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ep_common_code
     *
     * @mbg.generated Wed Jun 15 17:26:11 KST 2022
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andComnCdSeqIsNull() {
            addCriterion("\"comn_cd_seq\" is null");
            return (Criteria) this;
        }

        public Criteria andComnCdSeqIsNotNull() {
            addCriterion("\"comn_cd_seq\" is not null");
            return (Criteria) this;
        }

        public Criteria andComnCdSeqEqualTo(Integer value) {
            addCriterion("\"comn_cd_seq\" =", value, "comnCdSeq");
            return (Criteria) this;
        }

        public Criteria andComnCdSeqNotEqualTo(Integer value) {
            addCriterion("\"comn_cd_seq\" <>", value, "comnCdSeq");
            return (Criteria) this;
        }

        public Criteria andComnCdSeqGreaterThan(Integer value) {
            addCriterion("\"comn_cd_seq\" >", value, "comnCdSeq");
            return (Criteria) this;
        }

        public Criteria andComnCdSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"comn_cd_seq\" >=", value, "comnCdSeq");
            return (Criteria) this;
        }

        public Criteria andComnCdSeqLessThan(Integer value) {
            addCriterion("\"comn_cd_seq\" <", value, "comnCdSeq");
            return (Criteria) this;
        }

        public Criteria andComnCdSeqLessThanOrEqualTo(Integer value) {
            addCriterion("\"comn_cd_seq\" <=", value, "comnCdSeq");
            return (Criteria) this;
        }

        public Criteria andComnCdSeqIn(List<Integer> values) {
            addCriterion("\"comn_cd_seq\" in", values, "comnCdSeq");
            return (Criteria) this;
        }

        public Criteria andComnCdSeqNotIn(List<Integer> values) {
            addCriterion("\"comn_cd_seq\" not in", values, "comnCdSeq");
            return (Criteria) this;
        }

        public Criteria andComnCdSeqBetween(Integer value1, Integer value2) {
            addCriterion("\"comn_cd_seq\" between", value1, value2, "comnCdSeq");
            return (Criteria) this;
        }

        public Criteria andComnCdSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("\"comn_cd_seq\" not between", value1, value2, "comnCdSeq");
            return (Criteria) this;
        }

        public Criteria andComnCdCtgIsNull() {
            addCriterion("\"comn_cd_ctg\" is null");
            return (Criteria) this;
        }

        public Criteria andComnCdCtgIsNotNull() {
            addCriterion("\"comn_cd_ctg\" is not null");
            return (Criteria) this;
        }

        public Criteria andComnCdCtgEqualTo(String value) {
            addCriterion("\"comn_cd_ctg\" =", value, "comnCdCtg");
            return (Criteria) this;
        }

        public Criteria andComnCdCtgNotEqualTo(String value) {
            addCriterion("\"comn_cd_ctg\" <>", value, "comnCdCtg");
            return (Criteria) this;
        }

        public Criteria andComnCdCtgGreaterThan(String value) {
            addCriterion("\"comn_cd_ctg\" >", value, "comnCdCtg");
            return (Criteria) this;
        }

        public Criteria andComnCdCtgGreaterThanOrEqualTo(String value) {
            addCriterion("\"comn_cd_ctg\" >=", value, "comnCdCtg");
            return (Criteria) this;
        }

        public Criteria andComnCdCtgLessThan(String value) {
            addCriterion("\"comn_cd_ctg\" <", value, "comnCdCtg");
            return (Criteria) this;
        }

        public Criteria andComnCdCtgLessThanOrEqualTo(String value) {
            addCriterion("\"comn_cd_ctg\" <=", value, "comnCdCtg");
            return (Criteria) this;
        }

        public Criteria andComnCdCtgLike(String value) {
            addCriterion("\"comn_cd_ctg\" like", value, "comnCdCtg");
            return (Criteria) this;
        }

        public Criteria andComnCdCtgNotLike(String value) {
            addCriterion("\"comn_cd_ctg\" not like", value, "comnCdCtg");
            return (Criteria) this;
        }

        public Criteria andComnCdCtgIn(List<String> values) {
            addCriterion("\"comn_cd_ctg\" in", values, "comnCdCtg");
            return (Criteria) this;
        }

        public Criteria andComnCdCtgNotIn(List<String> values) {
            addCriterion("\"comn_cd_ctg\" not in", values, "comnCdCtg");
            return (Criteria) this;
        }

        public Criteria andComnCdCtgBetween(String value1, String value2) {
            addCriterion("\"comn_cd_ctg\" between", value1, value2, "comnCdCtg");
            return (Criteria) this;
        }

        public Criteria andComnCdCtgNotBetween(String value1, String value2) {
            addCriterion("\"comn_cd_ctg\" not between", value1, value2, "comnCdCtg");
            return (Criteria) this;
        }

        public Criteria andComnCdNmIsNull() {
            addCriterion("\"comn_cd_nm\" is null");
            return (Criteria) this;
        }

        public Criteria andComnCdNmIsNotNull() {
            addCriterion("\"comn_cd_nm\" is not null");
            return (Criteria) this;
        }

        public Criteria andComnCdNmEqualTo(String value) {
            addCriterion("\"comn_cd_nm\" =", value, "comnCdNm");
            return (Criteria) this;
        }

        public Criteria andComnCdNmNotEqualTo(String value) {
            addCriterion("\"comn_cd_nm\" <>", value, "comnCdNm");
            return (Criteria) this;
        }

        public Criteria andComnCdNmGreaterThan(String value) {
            addCriterion("\"comn_cd_nm\" >", value, "comnCdNm");
            return (Criteria) this;
        }

        public Criteria andComnCdNmGreaterThanOrEqualTo(String value) {
            addCriterion("\"comn_cd_nm\" >=", value, "comnCdNm");
            return (Criteria) this;
        }

        public Criteria andComnCdNmLessThan(String value) {
            addCriterion("\"comn_cd_nm\" <", value, "comnCdNm");
            return (Criteria) this;
        }

        public Criteria andComnCdNmLessThanOrEqualTo(String value) {
            addCriterion("\"comn_cd_nm\" <=", value, "comnCdNm");
            return (Criteria) this;
        }

        public Criteria andComnCdNmLike(String value) {
            addCriterion("\"comn_cd_nm\" like", value, "comnCdNm");
            return (Criteria) this;
        }

        public Criteria andComnCdNmNotLike(String value) {
            addCriterion("\"comn_cd_nm\" not like", value, "comnCdNm");
            return (Criteria) this;
        }

        public Criteria andComnCdNmIn(List<String> values) {
            addCriterion("\"comn_cd_nm\" in", values, "comnCdNm");
            return (Criteria) this;
        }

        public Criteria andComnCdNmNotIn(List<String> values) {
            addCriterion("\"comn_cd_nm\" not in", values, "comnCdNm");
            return (Criteria) this;
        }

        public Criteria andComnCdNmBetween(String value1, String value2) {
            addCriterion("\"comn_cd_nm\" between", value1, value2, "comnCdNm");
            return (Criteria) this;
        }

        public Criteria andComnCdNmNotBetween(String value1, String value2) {
            addCriterion("\"comn_cd_nm\" not between", value1, value2, "comnCdNm");
            return (Criteria) this;
        }

        public Criteria andComnCdValueIsNull() {
            addCriterion("\"comn_cd_value\" is null");
            return (Criteria) this;
        }

        public Criteria andComnCdValueIsNotNull() {
            addCriterion("\"comn_cd_value\" is not null");
            return (Criteria) this;
        }

        public Criteria andComnCdValueEqualTo(String value) {
            addCriterion("\"comn_cd_value\" =", value, "comnCdValue");
            return (Criteria) this;
        }

        public Criteria andComnCdValueNotEqualTo(String value) {
            addCriterion("\"comn_cd_value\" <>", value, "comnCdValue");
            return (Criteria) this;
        }

        public Criteria andComnCdValueGreaterThan(String value) {
            addCriterion("\"comn_cd_value\" >", value, "comnCdValue");
            return (Criteria) this;
        }

        public Criteria andComnCdValueGreaterThanOrEqualTo(String value) {
            addCriterion("\"comn_cd_value\" >=", value, "comnCdValue");
            return (Criteria) this;
        }

        public Criteria andComnCdValueLessThan(String value) {
            addCriterion("\"comn_cd_value\" <", value, "comnCdValue");
            return (Criteria) this;
        }

        public Criteria andComnCdValueLessThanOrEqualTo(String value) {
            addCriterion("\"comn_cd_value\" <=", value, "comnCdValue");
            return (Criteria) this;
        }

        public Criteria andComnCdValueLike(String value) {
            addCriterion("\"comn_cd_value\" like", value, "comnCdValue");
            return (Criteria) this;
        }

        public Criteria andComnCdValueNotLike(String value) {
            addCriterion("\"comn_cd_value\" not like", value, "comnCdValue");
            return (Criteria) this;
        }

        public Criteria andComnCdValueIn(List<String> values) {
            addCriterion("\"comn_cd_value\" in", values, "comnCdValue");
            return (Criteria) this;
        }

        public Criteria andComnCdValueNotIn(List<String> values) {
            addCriterion("\"comn_cd_value\" not in", values, "comnCdValue");
            return (Criteria) this;
        }

        public Criteria andComnCdValueBetween(String value1, String value2) {
            addCriterion("\"comn_cd_value\" between", value1, value2, "comnCdValue");
            return (Criteria) this;
        }

        public Criteria andComnCdValueNotBetween(String value1, String value2) {
            addCriterion("\"comn_cd_value\" not between", value1, value2, "comnCdValue");
            return (Criteria) this;
        }

        public Criteria andDelYnIsNull() {
            addCriterion("\"del_yn\" is null");
            return (Criteria) this;
        }

        public Criteria andDelYnIsNotNull() {
            addCriterion("\"del_yn\" is not null");
            return (Criteria) this;
        }

        public Criteria andDelYnEqualTo(String value) {
            addCriterion("\"del_yn\" =", value, "delYn");
            return (Criteria) this;
        }

        public Criteria andDelYnNotEqualTo(String value) {
            addCriterion("\"del_yn\" <>", value, "delYn");
            return (Criteria) this;
        }

        public Criteria andDelYnGreaterThan(String value) {
            addCriterion("\"del_yn\" >", value, "delYn");
            return (Criteria) this;
        }

        public Criteria andDelYnGreaterThanOrEqualTo(String value) {
            addCriterion("\"del_yn\" >=", value, "delYn");
            return (Criteria) this;
        }

        public Criteria andDelYnLessThan(String value) {
            addCriterion("\"del_yn\" <", value, "delYn");
            return (Criteria) this;
        }

        public Criteria andDelYnLessThanOrEqualTo(String value) {
            addCriterion("\"del_yn\" <=", value, "delYn");
            return (Criteria) this;
        }

        public Criteria andDelYnLike(String value) {
            addCriterion("\"del_yn\" like", value, "delYn");
            return (Criteria) this;
        }

        public Criteria andDelYnNotLike(String value) {
            addCriterion("\"del_yn\" not like", value, "delYn");
            return (Criteria) this;
        }

        public Criteria andDelYnIn(List<String> values) {
            addCriterion("\"del_yn\" in", values, "delYn");
            return (Criteria) this;
        }

        public Criteria andDelYnNotIn(List<String> values) {
            addCriterion("\"del_yn\" not in", values, "delYn");
            return (Criteria) this;
        }

        public Criteria andDelYnBetween(String value1, String value2) {
            addCriterion("\"del_yn\" between", value1, value2, "delYn");
            return (Criteria) this;
        }

        public Criteria andDelYnNotBetween(String value1, String value2) {
            addCriterion("\"del_yn\" not between", value1, value2, "delYn");
            return (Criteria) this;
        }

        public Criteria andComnCdOptnNmIsNull() {
            addCriterion("\"comn_cd_optn_nm\" is null");
            return (Criteria) this;
        }

        public Criteria andComnCdOptnNmIsNotNull() {
            addCriterion("\"comn_cd_optn_nm\" is not null");
            return (Criteria) this;
        }

        public Criteria andComnCdOptnNmEqualTo(String value) {
            addCriterion("\"comn_cd_optn_nm\" =", value, "comnCdOptnNm");
            return (Criteria) this;
        }

        public Criteria andComnCdOptnNmNotEqualTo(String value) {
            addCriterion("\"comn_cd_optn_nm\" <>", value, "comnCdOptnNm");
            return (Criteria) this;
        }

        public Criteria andComnCdOptnNmGreaterThan(String value) {
            addCriterion("\"comn_cd_optn_nm\" >", value, "comnCdOptnNm");
            return (Criteria) this;
        }

        public Criteria andComnCdOptnNmGreaterThanOrEqualTo(String value) {
            addCriterion("\"comn_cd_optn_nm\" >=", value, "comnCdOptnNm");
            return (Criteria) this;
        }

        public Criteria andComnCdOptnNmLessThan(String value) {
            addCriterion("\"comn_cd_optn_nm\" <", value, "comnCdOptnNm");
            return (Criteria) this;
        }

        public Criteria andComnCdOptnNmLessThanOrEqualTo(String value) {
            addCriterion("\"comn_cd_optn_nm\" <=", value, "comnCdOptnNm");
            return (Criteria) this;
        }

        public Criteria andComnCdOptnNmLike(String value) {
            addCriterion("\"comn_cd_optn_nm\" like", value, "comnCdOptnNm");
            return (Criteria) this;
        }

        public Criteria andComnCdOptnNmNotLike(String value) {
            addCriterion("\"comn_cd_optn_nm\" not like", value, "comnCdOptnNm");
            return (Criteria) this;
        }

        public Criteria andComnCdOptnNmIn(List<String> values) {
            addCriterion("\"comn_cd_optn_nm\" in", values, "comnCdOptnNm");
            return (Criteria) this;
        }

        public Criteria andComnCdOptnNmNotIn(List<String> values) {
            addCriterion("\"comn_cd_optn_nm\" not in", values, "comnCdOptnNm");
            return (Criteria) this;
        }

        public Criteria andComnCdOptnNmBetween(String value1, String value2) {
            addCriterion("\"comn_cd_optn_nm\" between", value1, value2, "comnCdOptnNm");
            return (Criteria) this;
        }

        public Criteria andComnCdOptnNmNotBetween(String value1, String value2) {
            addCriterion("\"comn_cd_optn_nm\" not between", value1, value2, "comnCdOptnNm");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ep_common_code
     *
     * @mbg.generated do_not_delete_during_merge Wed Jun 15 17:26:11 KST 2022
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ep_common_code
     *
     * @mbg.generated Wed Jun 15 17:26:11 KST 2022
     */
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