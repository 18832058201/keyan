package com.hebeu.keyan.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ESealExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ESealExample() {
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

        public Criteria andSealIdIsNull() {
            addCriterion("seal_id is null");
            return (Criteria) this;
        }

        public Criteria andSealIdIsNotNull() {
            addCriterion("seal_id is not null");
            return (Criteria) this;
        }

        public Criteria andSealIdEqualTo(String value) {
            addCriterion("seal_id =", value, "sealId");
            return (Criteria) this;
        }

        public Criteria andSealIdNotEqualTo(String value) {
            addCriterion("seal_id <>", value, "sealId");
            return (Criteria) this;
        }

        public Criteria andSealIdGreaterThan(String value) {
            addCriterion("seal_id >", value, "sealId");
            return (Criteria) this;
        }

        public Criteria andSealIdGreaterThanOrEqualTo(String value) {
            addCriterion("seal_id >=", value, "sealId");
            return (Criteria) this;
        }

        public Criteria andSealIdLessThan(String value) {
            addCriterion("seal_id <", value, "sealId");
            return (Criteria) this;
        }

        public Criteria andSealIdLessThanOrEqualTo(String value) {
            addCriterion("seal_id <=", value, "sealId");
            return (Criteria) this;
        }

        public Criteria andSealIdLike(String value) {
            addCriterion("seal_id like", value, "sealId");
            return (Criteria) this;
        }

        public Criteria andSealIdNotLike(String value) {
            addCriterion("seal_id not like", value, "sealId");
            return (Criteria) this;
        }

        public Criteria andSealIdIn(List<String> values) {
            addCriterion("seal_id in", values, "sealId");
            return (Criteria) this;
        }

        public Criteria andSealIdNotIn(List<String> values) {
            addCriterion("seal_id not in", values, "sealId");
            return (Criteria) this;
        }

        public Criteria andSealIdBetween(String value1, String value2) {
            addCriterion("seal_id between", value1, value2, "sealId");
            return (Criteria) this;
        }

        public Criteria andSealIdNotBetween(String value1, String value2) {
            addCriterion("seal_id not between", value1, value2, "sealId");
            return (Criteria) this;
        }

        public Criteria andSealTypeIdIsNull() {
            addCriterion("seal_type_id is null");
            return (Criteria) this;
        }

        public Criteria andSealTypeIdIsNotNull() {
            addCriterion("seal_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andSealTypeIdEqualTo(Integer value) {
            addCriterion("seal_type_id =", value, "sealTypeId");
            return (Criteria) this;
        }

        public Criteria andSealTypeIdNotEqualTo(Integer value) {
            addCriterion("seal_type_id <>", value, "sealTypeId");
            return (Criteria) this;
        }

        public Criteria andSealTypeIdGreaterThan(Integer value) {
            addCriterion("seal_type_id >", value, "sealTypeId");
            return (Criteria) this;
        }

        public Criteria andSealTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("seal_type_id >=", value, "sealTypeId");
            return (Criteria) this;
        }

        public Criteria andSealTypeIdLessThan(Integer value) {
            addCriterion("seal_type_id <", value, "sealTypeId");
            return (Criteria) this;
        }

        public Criteria andSealTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("seal_type_id <=", value, "sealTypeId");
            return (Criteria) this;
        }

        public Criteria andSealTypeIdIn(List<Integer> values) {
            addCriterion("seal_type_id in", values, "sealTypeId");
            return (Criteria) this;
        }

        public Criteria andSealTypeIdNotIn(List<Integer> values) {
            addCriterion("seal_type_id not in", values, "sealTypeId");
            return (Criteria) this;
        }

        public Criteria andSealTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("seal_type_id between", value1, value2, "sealTypeId");
            return (Criteria) this;
        }

        public Criteria andSealTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("seal_type_id not between", value1, value2, "sealTypeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdIsNull() {
            addCriterion("college_id is null");
            return (Criteria) this;
        }

        public Criteria andCollegeIdIsNotNull() {
            addCriterion("college_id is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeIdEqualTo(Integer value) {
            addCriterion("college_id =", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotEqualTo(Integer value) {
            addCriterion("college_id <>", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdGreaterThan(Integer value) {
            addCriterion("college_id >", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("college_id >=", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdLessThan(Integer value) {
            addCriterion("college_id <", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdLessThanOrEqualTo(Integer value) {
            addCriterion("college_id <=", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdIn(List<Integer> values) {
            addCriterion("college_id in", values, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotIn(List<Integer> values) {
            addCriterion("college_id not in", values, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdBetween(Integer value1, Integer value2) {
            addCriterion("college_id between", value1, value2, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("college_id not between", value1, value2, "collegeId");
            return (Criteria) this;
        }

        public Criteria andSealReasonIsNull() {
            addCriterion("seal_reason is null");
            return (Criteria) this;
        }

        public Criteria andSealReasonIsNotNull() {
            addCriterion("seal_reason is not null");
            return (Criteria) this;
        }

        public Criteria andSealReasonEqualTo(String value) {
            addCriterion("seal_reason =", value, "sealReason");
            return (Criteria) this;
        }

        public Criteria andSealReasonNotEqualTo(String value) {
            addCriterion("seal_reason <>", value, "sealReason");
            return (Criteria) this;
        }

        public Criteria andSealReasonGreaterThan(String value) {
            addCriterion("seal_reason >", value, "sealReason");
            return (Criteria) this;
        }

        public Criteria andSealReasonGreaterThanOrEqualTo(String value) {
            addCriterion("seal_reason >=", value, "sealReason");
            return (Criteria) this;
        }

        public Criteria andSealReasonLessThan(String value) {
            addCriterion("seal_reason <", value, "sealReason");
            return (Criteria) this;
        }

        public Criteria andSealReasonLessThanOrEqualTo(String value) {
            addCriterion("seal_reason <=", value, "sealReason");
            return (Criteria) this;
        }

        public Criteria andSealReasonLike(String value) {
            addCriterion("seal_reason like", value, "sealReason");
            return (Criteria) this;
        }

        public Criteria andSealReasonNotLike(String value) {
            addCriterion("seal_reason not like", value, "sealReason");
            return (Criteria) this;
        }

        public Criteria andSealReasonIn(List<String> values) {
            addCriterion("seal_reason in", values, "sealReason");
            return (Criteria) this;
        }

        public Criteria andSealReasonNotIn(List<String> values) {
            addCriterion("seal_reason not in", values, "sealReason");
            return (Criteria) this;
        }

        public Criteria andSealReasonBetween(String value1, String value2) {
            addCriterion("seal_reason between", value1, value2, "sealReason");
            return (Criteria) this;
        }

        public Criteria andSealReasonNotBetween(String value1, String value2) {
            addCriterion("seal_reason not between", value1, value2, "sealReason");
            return (Criteria) this;
        }

        public Criteria andSealNumIsNull() {
            addCriterion("seal_num is null");
            return (Criteria) this;
        }

        public Criteria andSealNumIsNotNull() {
            addCriterion("seal_num is not null");
            return (Criteria) this;
        }

        public Criteria andSealNumEqualTo(Integer value) {
            addCriterion("seal_num =", value, "sealNum");
            return (Criteria) this;
        }

        public Criteria andSealNumNotEqualTo(Integer value) {
            addCriterion("seal_num <>", value, "sealNum");
            return (Criteria) this;
        }

        public Criteria andSealNumGreaterThan(Integer value) {
            addCriterion("seal_num >", value, "sealNum");
            return (Criteria) this;
        }

        public Criteria andSealNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("seal_num >=", value, "sealNum");
            return (Criteria) this;
        }

        public Criteria andSealNumLessThan(Integer value) {
            addCriterion("seal_num <", value, "sealNum");
            return (Criteria) this;
        }

        public Criteria andSealNumLessThanOrEqualTo(Integer value) {
            addCriterion("seal_num <=", value, "sealNum");
            return (Criteria) this;
        }

        public Criteria andSealNumIn(List<Integer> values) {
            addCriterion("seal_num in", values, "sealNum");
            return (Criteria) this;
        }

        public Criteria andSealNumNotIn(List<Integer> values) {
            addCriterion("seal_num not in", values, "sealNum");
            return (Criteria) this;
        }

        public Criteria andSealNumBetween(Integer value1, Integer value2) {
            addCriterion("seal_num between", value1, value2, "sealNum");
            return (Criteria) this;
        }

        public Criteria andSealNumNotBetween(Integer value1, Integer value2) {
            addCriterion("seal_num not between", value1, value2, "sealNum");
            return (Criteria) this;
        }

        public Criteria andApplyPersonIdIsNull() {
            addCriterion("apply_person_id is null");
            return (Criteria) this;
        }

        public Criteria andApplyPersonIdIsNotNull() {
            addCriterion("apply_person_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplyPersonIdEqualTo(String value) {
            addCriterion("apply_person_id =", value, "applyPersonId");
            return (Criteria) this;
        }

        public Criteria andApplyPersonIdNotEqualTo(String value) {
            addCriterion("apply_person_id <>", value, "applyPersonId");
            return (Criteria) this;
        }

        public Criteria andApplyPersonIdGreaterThan(String value) {
            addCriterion("apply_person_id >", value, "applyPersonId");
            return (Criteria) this;
        }

        public Criteria andApplyPersonIdGreaterThanOrEqualTo(String value) {
            addCriterion("apply_person_id >=", value, "applyPersonId");
            return (Criteria) this;
        }

        public Criteria andApplyPersonIdLessThan(String value) {
            addCriterion("apply_person_id <", value, "applyPersonId");
            return (Criteria) this;
        }

        public Criteria andApplyPersonIdLessThanOrEqualTo(String value) {
            addCriterion("apply_person_id <=", value, "applyPersonId");
            return (Criteria) this;
        }

        public Criteria andApplyPersonIdLike(String value) {
            addCriterion("apply_person_id like", value, "applyPersonId");
            return (Criteria) this;
        }

        public Criteria andApplyPersonIdNotLike(String value) {
            addCriterion("apply_person_id not like", value, "applyPersonId");
            return (Criteria) this;
        }

        public Criteria andApplyPersonIdIn(List<String> values) {
            addCriterion("apply_person_id in", values, "applyPersonId");
            return (Criteria) this;
        }

        public Criteria andApplyPersonIdNotIn(List<String> values) {
            addCriterion("apply_person_id not in", values, "applyPersonId");
            return (Criteria) this;
        }

        public Criteria andApplyPersonIdBetween(String value1, String value2) {
            addCriterion("apply_person_id between", value1, value2, "applyPersonId");
            return (Criteria) this;
        }

        public Criteria andApplyPersonIdNotBetween(String value1, String value2) {
            addCriterion("apply_person_id not between", value1, value2, "applyPersonId");
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

        public Criteria andAuditStatusIdIsNull() {
            addCriterion("audit_status_id is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIdIsNotNull() {
            addCriterion("audit_status_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIdEqualTo(Integer value) {
            addCriterion("audit_status_id =", value, "auditStatusId");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIdNotEqualTo(Integer value) {
            addCriterion("audit_status_id <>", value, "auditStatusId");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIdGreaterThan(Integer value) {
            addCriterion("audit_status_id >", value, "auditStatusId");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit_status_id >=", value, "auditStatusId");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIdLessThan(Integer value) {
            addCriterion("audit_status_id <", value, "auditStatusId");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIdLessThanOrEqualTo(Integer value) {
            addCriterion("audit_status_id <=", value, "auditStatusId");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIdIn(List<Integer> values) {
            addCriterion("audit_status_id in", values, "auditStatusId");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIdNotIn(List<Integer> values) {
            addCriterion("audit_status_id not in", values, "auditStatusId");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIdBetween(Integer value1, Integer value2) {
            addCriterion("audit_status_id between", value1, value2, "auditStatusId");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("audit_status_id not between", value1, value2, "auditStatusId");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId1IsNull() {
            addCriterion("audit_person_id1 is null");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId1IsNotNull() {
            addCriterion("audit_person_id1 is not null");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId1EqualTo(String value) {
            addCriterion("audit_person_id1 =", value, "auditPersonId1");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId1NotEqualTo(String value) {
            addCriterion("audit_person_id1 <>", value, "auditPersonId1");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId1GreaterThan(String value) {
            addCriterion("audit_person_id1 >", value, "auditPersonId1");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId1GreaterThanOrEqualTo(String value) {
            addCriterion("audit_person_id1 >=", value, "auditPersonId1");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId1LessThan(String value) {
            addCriterion("audit_person_id1 <", value, "auditPersonId1");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId1LessThanOrEqualTo(String value) {
            addCriterion("audit_person_id1 <=", value, "auditPersonId1");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId1Like(String value) {
            addCriterion("audit_person_id1 like", value, "auditPersonId1");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId1NotLike(String value) {
            addCriterion("audit_person_id1 not like", value, "auditPersonId1");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId1In(List<String> values) {
            addCriterion("audit_person_id1 in", values, "auditPersonId1");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId1NotIn(List<String> values) {
            addCriterion("audit_person_id1 not in", values, "auditPersonId1");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId1Between(String value1, String value2) {
            addCriterion("audit_person_id1 between", value1, value2, "auditPersonId1");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId1NotBetween(String value1, String value2) {
            addCriterion("audit_person_id1 not between", value1, value2, "auditPersonId1");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion1IsNull() {
            addCriterion("audit_poinion1 is null");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion1IsNotNull() {
            addCriterion("audit_poinion1 is not null");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion1EqualTo(String value) {
            addCriterion("audit_poinion1 =", value, "auditPoinion1");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion1NotEqualTo(String value) {
            addCriterion("audit_poinion1 <>", value, "auditPoinion1");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion1GreaterThan(String value) {
            addCriterion("audit_poinion1 >", value, "auditPoinion1");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion1GreaterThanOrEqualTo(String value) {
            addCriterion("audit_poinion1 >=", value, "auditPoinion1");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion1LessThan(String value) {
            addCriterion("audit_poinion1 <", value, "auditPoinion1");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion1LessThanOrEqualTo(String value) {
            addCriterion("audit_poinion1 <=", value, "auditPoinion1");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion1Like(String value) {
            addCriterion("audit_poinion1 like", value, "auditPoinion1");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion1NotLike(String value) {
            addCriterion("audit_poinion1 not like", value, "auditPoinion1");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion1In(List<String> values) {
            addCriterion("audit_poinion1 in", values, "auditPoinion1");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion1NotIn(List<String> values) {
            addCriterion("audit_poinion1 not in", values, "auditPoinion1");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion1Between(String value1, String value2) {
            addCriterion("audit_poinion1 between", value1, value2, "auditPoinion1");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion1NotBetween(String value1, String value2) {
            addCriterion("audit_poinion1 not between", value1, value2, "auditPoinion1");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId2IsNull() {
            addCriterion("audit_person_id2 is null");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId2IsNotNull() {
            addCriterion("audit_person_id2 is not null");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId2EqualTo(String value) {
            addCriterion("audit_person_id2 =", value, "auditPersonId2");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId2NotEqualTo(String value) {
            addCriterion("audit_person_id2 <>", value, "auditPersonId2");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId2GreaterThan(String value) {
            addCriterion("audit_person_id2 >", value, "auditPersonId2");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId2GreaterThanOrEqualTo(String value) {
            addCriterion("audit_person_id2 >=", value, "auditPersonId2");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId2LessThan(String value) {
            addCriterion("audit_person_id2 <", value, "auditPersonId2");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId2LessThanOrEqualTo(String value) {
            addCriterion("audit_person_id2 <=", value, "auditPersonId2");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId2Like(String value) {
            addCriterion("audit_person_id2 like", value, "auditPersonId2");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId2NotLike(String value) {
            addCriterion("audit_person_id2 not like", value, "auditPersonId2");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId2In(List<String> values) {
            addCriterion("audit_person_id2 in", values, "auditPersonId2");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId2NotIn(List<String> values) {
            addCriterion("audit_person_id2 not in", values, "auditPersonId2");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId2Between(String value1, String value2) {
            addCriterion("audit_person_id2 between", value1, value2, "auditPersonId2");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId2NotBetween(String value1, String value2) {
            addCriterion("audit_person_id2 not between", value1, value2, "auditPersonId2");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion2IsNull() {
            addCriterion("audit_poinion2 is null");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion2IsNotNull() {
            addCriterion("audit_poinion2 is not null");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion2EqualTo(String value) {
            addCriterion("audit_poinion2 =", value, "auditPoinion2");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion2NotEqualTo(String value) {
            addCriterion("audit_poinion2 <>", value, "auditPoinion2");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion2GreaterThan(String value) {
            addCriterion("audit_poinion2 >", value, "auditPoinion2");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion2GreaterThanOrEqualTo(String value) {
            addCriterion("audit_poinion2 >=", value, "auditPoinion2");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion2LessThan(String value) {
            addCriterion("audit_poinion2 <", value, "auditPoinion2");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion2LessThanOrEqualTo(String value) {
            addCriterion("audit_poinion2 <=", value, "auditPoinion2");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion2Like(String value) {
            addCriterion("audit_poinion2 like", value, "auditPoinion2");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion2NotLike(String value) {
            addCriterion("audit_poinion2 not like", value, "auditPoinion2");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion2In(List<String> values) {
            addCriterion("audit_poinion2 in", values, "auditPoinion2");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion2NotIn(List<String> values) {
            addCriterion("audit_poinion2 not in", values, "auditPoinion2");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion2Between(String value1, String value2) {
            addCriterion("audit_poinion2 between", value1, value2, "auditPoinion2");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion2NotBetween(String value1, String value2) {
            addCriterion("audit_poinion2 not between", value1, value2, "auditPoinion2");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNull() {
            addCriterion("insert_time is null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIsNotNull() {
            addCriterion("insert_time is not null");
            return (Criteria) this;
        }

        public Criteria andInsertTimeEqualTo(Date value) {
            addCriterion("insert_time =", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotEqualTo(Date value) {
            addCriterion("insert_time <>", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThan(Date value) {
            addCriterion("insert_time >", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("insert_time >=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThan(Date value) {
            addCriterion("insert_time <", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeLessThanOrEqualTo(Date value) {
            addCriterion("insert_time <=", value, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeIn(List<Date> values) {
            addCriterion("insert_time in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotIn(List<Date> values) {
            addCriterion("insert_time not in", values, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeBetween(Date value1, Date value2) {
            addCriterion("insert_time between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andInsertTimeNotBetween(Date value1, Date value2) {
            addCriterion("insert_time not between", value1, value2, "insertTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNull() {
            addCriterion("last_time is null");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNotNull() {
            addCriterion("last_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastTimeEqualTo(Date value) {
            addCriterion("last_time =", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotEqualTo(Date value) {
            addCriterion("last_time <>", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThan(Date value) {
            addCriterion("last_time >", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_time >=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThan(Date value) {
            addCriterion("last_time <", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_time <=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeIn(List<Date> values) {
            addCriterion("last_time in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotIn(List<Date> values) {
            addCriterion("last_time not in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeBetween(Date value1, Date value2) {
            addCriterion("last_time between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_time not between", value1, value2, "lastTime");
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