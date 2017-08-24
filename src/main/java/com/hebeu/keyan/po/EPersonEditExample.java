package com.hebeu.keyan.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EPersonEditExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EPersonEditExample() {
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

        public Criteria andPersonEditIdIsNull() {
            addCriterion("person_edit_id is null");
            return (Criteria) this;
        }

        public Criteria andPersonEditIdIsNotNull() {
            addCriterion("person_edit_id is not null");
            return (Criteria) this;
        }

        public Criteria andPersonEditIdEqualTo(String value) {
            addCriterion("person_edit_id =", value, "personEditId");
            return (Criteria) this;
        }

        public Criteria andPersonEditIdNotEqualTo(String value) {
            addCriterion("person_edit_id <>", value, "personEditId");
            return (Criteria) this;
        }

        public Criteria andPersonEditIdGreaterThan(String value) {
            addCriterion("person_edit_id >", value, "personEditId");
            return (Criteria) this;
        }

        public Criteria andPersonEditIdGreaterThanOrEqualTo(String value) {
            addCriterion("person_edit_id >=", value, "personEditId");
            return (Criteria) this;
        }

        public Criteria andPersonEditIdLessThan(String value) {
            addCriterion("person_edit_id <", value, "personEditId");
            return (Criteria) this;
        }

        public Criteria andPersonEditIdLessThanOrEqualTo(String value) {
            addCriterion("person_edit_id <=", value, "personEditId");
            return (Criteria) this;
        }

        public Criteria andPersonEditIdLike(String value) {
            addCriterion("person_edit_id like", value, "personEditId");
            return (Criteria) this;
        }

        public Criteria andPersonEditIdNotLike(String value) {
            addCriterion("person_edit_id not like", value, "personEditId");
            return (Criteria) this;
        }

        public Criteria andPersonEditIdIn(List<String> values) {
            addCriterion("person_edit_id in", values, "personEditId");
            return (Criteria) this;
        }

        public Criteria andPersonEditIdNotIn(List<String> values) {
            addCriterion("person_edit_id not in", values, "personEditId");
            return (Criteria) this;
        }

        public Criteria andPersonEditIdBetween(String value1, String value2) {
            addCriterion("person_edit_id between", value1, value2, "personEditId");
            return (Criteria) this;
        }

        public Criteria andPersonEditIdNotBetween(String value1, String value2) {
            addCriterion("person_edit_id not between", value1, value2, "personEditId");
            return (Criteria) this;
        }

        public Criteria andWorkNumIsNull() {
            addCriterion("work_num is null");
            return (Criteria) this;
        }

        public Criteria andWorkNumIsNotNull() {
            addCriterion("work_num is not null");
            return (Criteria) this;
        }

        public Criteria andWorkNumEqualTo(String value) {
            addCriterion("work_num =", value, "workNum");
            return (Criteria) this;
        }

        public Criteria andWorkNumNotEqualTo(String value) {
            addCriterion("work_num <>", value, "workNum");
            return (Criteria) this;
        }

        public Criteria andWorkNumGreaterThan(String value) {
            addCriterion("work_num >", value, "workNum");
            return (Criteria) this;
        }

        public Criteria andWorkNumGreaterThanOrEqualTo(String value) {
            addCriterion("work_num >=", value, "workNum");
            return (Criteria) this;
        }

        public Criteria andWorkNumLessThan(String value) {
            addCriterion("work_num <", value, "workNum");
            return (Criteria) this;
        }

        public Criteria andWorkNumLessThanOrEqualTo(String value) {
            addCriterion("work_num <=", value, "workNum");
            return (Criteria) this;
        }

        public Criteria andWorkNumLike(String value) {
            addCriterion("work_num like", value, "workNum");
            return (Criteria) this;
        }

        public Criteria andWorkNumNotLike(String value) {
            addCriterion("work_num not like", value, "workNum");
            return (Criteria) this;
        }

        public Criteria andWorkNumIn(List<String> values) {
            addCriterion("work_num in", values, "workNum");
            return (Criteria) this;
        }

        public Criteria andWorkNumNotIn(List<String> values) {
            addCriterion("work_num not in", values, "workNum");
            return (Criteria) this;
        }

        public Criteria andWorkNumBetween(String value1, String value2) {
            addCriterion("work_num between", value1, value2, "workNum");
            return (Criteria) this;
        }

        public Criteria andWorkNumNotBetween(String value1, String value2) {
            addCriterion("work_num not between", value1, value2, "workNum");
            return (Criteria) this;
        }

        public Criteria andWorkNameIsNull() {
            addCriterion("work_name is null");
            return (Criteria) this;
        }

        public Criteria andWorkNameIsNotNull() {
            addCriterion("work_name is not null");
            return (Criteria) this;
        }

        public Criteria andWorkNameEqualTo(String value) {
            addCriterion("work_name =", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameNotEqualTo(String value) {
            addCriterion("work_name <>", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameGreaterThan(String value) {
            addCriterion("work_name >", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameGreaterThanOrEqualTo(String value) {
            addCriterion("work_name >=", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameLessThan(String value) {
            addCriterion("work_name <", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameLessThanOrEqualTo(String value) {
            addCriterion("work_name <=", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameLike(String value) {
            addCriterion("work_name like", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameNotLike(String value) {
            addCriterion("work_name not like", value, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameIn(List<String> values) {
            addCriterion("work_name in", values, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameNotIn(List<String> values) {
            addCriterion("work_name not in", values, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameBetween(String value1, String value2) {
            addCriterion("work_name between", value1, value2, "workName");
            return (Criteria) this;
        }

        public Criteria andWorkNameNotBetween(String value1, String value2) {
            addCriterion("work_name not between", value1, value2, "workName");
            return (Criteria) this;
        }

        public Criteria andCollegeId2IsNull() {
            addCriterion("college_id2 is null");
            return (Criteria) this;
        }

        public Criteria andCollegeId2IsNotNull() {
            addCriterion("college_id2 is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeId2EqualTo(Integer value) {
            addCriterion("college_id2 =", value, "collegeId2");
            return (Criteria) this;
        }

        public Criteria andCollegeId2NotEqualTo(Integer value) {
            addCriterion("college_id2 <>", value, "collegeId2");
            return (Criteria) this;
        }

        public Criteria andCollegeId2GreaterThan(Integer value) {
            addCriterion("college_id2 >", value, "collegeId2");
            return (Criteria) this;
        }

        public Criteria andCollegeId2GreaterThanOrEqualTo(Integer value) {
            addCriterion("college_id2 >=", value, "collegeId2");
            return (Criteria) this;
        }

        public Criteria andCollegeId2LessThan(Integer value) {
            addCriterion("college_id2 <", value, "collegeId2");
            return (Criteria) this;
        }

        public Criteria andCollegeId2LessThanOrEqualTo(Integer value) {
            addCriterion("college_id2 <=", value, "collegeId2");
            return (Criteria) this;
        }

        public Criteria andCollegeId2In(List<Integer> values) {
            addCriterion("college_id2 in", values, "collegeId2");
            return (Criteria) this;
        }

        public Criteria andCollegeId2NotIn(List<Integer> values) {
            addCriterion("college_id2 not in", values, "collegeId2");
            return (Criteria) this;
        }

        public Criteria andCollegeId2Between(Integer value1, Integer value2) {
            addCriterion("college_id2 between", value1, value2, "collegeId2");
            return (Criteria) this;
        }

        public Criteria andCollegeId2NotBetween(Integer value1, Integer value2) {
            addCriterion("college_id2 not between", value1, value2, "collegeId2");
            return (Criteria) this;
        }

        public Criteria andPostTypeIdIsNull() {
            addCriterion("post_type_id is null");
            return (Criteria) this;
        }

        public Criteria andPostTypeIdIsNotNull() {
            addCriterion("post_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostTypeIdEqualTo(Integer value) {
            addCriterion("post_type_id =", value, "postTypeId");
            return (Criteria) this;
        }

        public Criteria andPostTypeIdNotEqualTo(Integer value) {
            addCriterion("post_type_id <>", value, "postTypeId");
            return (Criteria) this;
        }

        public Criteria andPostTypeIdGreaterThan(Integer value) {
            addCriterion("post_type_id >", value, "postTypeId");
            return (Criteria) this;
        }

        public Criteria andPostTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_type_id >=", value, "postTypeId");
            return (Criteria) this;
        }

        public Criteria andPostTypeIdLessThan(Integer value) {
            addCriterion("post_type_id <", value, "postTypeId");
            return (Criteria) this;
        }

        public Criteria andPostTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("post_type_id <=", value, "postTypeId");
            return (Criteria) this;
        }

        public Criteria andPostTypeIdIn(List<Integer> values) {
            addCriterion("post_type_id in", values, "postTypeId");
            return (Criteria) this;
        }

        public Criteria andPostTypeIdNotIn(List<Integer> values) {
            addCriterion("post_type_id not in", values, "postTypeId");
            return (Criteria) this;
        }

        public Criteria andPostTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("post_type_id between", value1, value2, "postTypeId");
            return (Criteria) this;
        }

        public Criteria andPostTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("post_type_id not between", value1, value2, "postTypeId");
            return (Criteria) this;
        }

        public Criteria andPostLevelIdIsNull() {
            addCriterion("post_level_id is null");
            return (Criteria) this;
        }

        public Criteria andPostLevelIdIsNotNull() {
            addCriterion("post_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostLevelIdEqualTo(Integer value) {
            addCriterion("post_level_id =", value, "postLevelId");
            return (Criteria) this;
        }

        public Criteria andPostLevelIdNotEqualTo(Integer value) {
            addCriterion("post_level_id <>", value, "postLevelId");
            return (Criteria) this;
        }

        public Criteria andPostLevelIdGreaterThan(Integer value) {
            addCriterion("post_level_id >", value, "postLevelId");
            return (Criteria) this;
        }

        public Criteria andPostLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_level_id >=", value, "postLevelId");
            return (Criteria) this;
        }

        public Criteria andPostLevelIdLessThan(Integer value) {
            addCriterion("post_level_id <", value, "postLevelId");
            return (Criteria) this;
        }

        public Criteria andPostLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("post_level_id <=", value, "postLevelId");
            return (Criteria) this;
        }

        public Criteria andPostLevelIdIn(List<Integer> values) {
            addCriterion("post_level_id in", values, "postLevelId");
            return (Criteria) this;
        }

        public Criteria andPostLevelIdNotIn(List<Integer> values) {
            addCriterion("post_level_id not in", values, "postLevelId");
            return (Criteria) this;
        }

        public Criteria andPostLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("post_level_id between", value1, value2, "postLevelId");
            return (Criteria) this;
        }

        public Criteria andPostLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("post_level_id not between", value1, value2, "postLevelId");
            return (Criteria) this;
        }

        public Criteria andTitleTypeIdIsNull() {
            addCriterion("title_type_id is null");
            return (Criteria) this;
        }

        public Criteria andTitleTypeIdIsNotNull() {
            addCriterion("title_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTitleTypeIdEqualTo(Integer value) {
            addCriterion("title_type_id =", value, "titleTypeId");
            return (Criteria) this;
        }

        public Criteria andTitleTypeIdNotEqualTo(Integer value) {
            addCriterion("title_type_id <>", value, "titleTypeId");
            return (Criteria) this;
        }

        public Criteria andTitleTypeIdGreaterThan(Integer value) {
            addCriterion("title_type_id >", value, "titleTypeId");
            return (Criteria) this;
        }

        public Criteria andTitleTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("title_type_id >=", value, "titleTypeId");
            return (Criteria) this;
        }

        public Criteria andTitleTypeIdLessThan(Integer value) {
            addCriterion("title_type_id <", value, "titleTypeId");
            return (Criteria) this;
        }

        public Criteria andTitleTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("title_type_id <=", value, "titleTypeId");
            return (Criteria) this;
        }

        public Criteria andTitleTypeIdIn(List<Integer> values) {
            addCriterion("title_type_id in", values, "titleTypeId");
            return (Criteria) this;
        }

        public Criteria andTitleTypeIdNotIn(List<Integer> values) {
            addCriterion("title_type_id not in", values, "titleTypeId");
            return (Criteria) this;
        }

        public Criteria andTitleTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("title_type_id between", value1, value2, "titleTypeId");
            return (Criteria) this;
        }

        public Criteria andTitleTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("title_type_id not between", value1, value2, "titleTypeId");
            return (Criteria) this;
        }

        public Criteria andTitleLevelIdIsNull() {
            addCriterion("title_level_id is null");
            return (Criteria) this;
        }

        public Criteria andTitleLevelIdIsNotNull() {
            addCriterion("title_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andTitleLevelIdEqualTo(Integer value) {
            addCriterion("title_level_id =", value, "titleLevelId");
            return (Criteria) this;
        }

        public Criteria andTitleLevelIdNotEqualTo(Integer value) {
            addCriterion("title_level_id <>", value, "titleLevelId");
            return (Criteria) this;
        }

        public Criteria andTitleLevelIdGreaterThan(Integer value) {
            addCriterion("title_level_id >", value, "titleLevelId");
            return (Criteria) this;
        }

        public Criteria andTitleLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("title_level_id >=", value, "titleLevelId");
            return (Criteria) this;
        }

        public Criteria andTitleLevelIdLessThan(Integer value) {
            addCriterion("title_level_id <", value, "titleLevelId");
            return (Criteria) this;
        }

        public Criteria andTitleLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("title_level_id <=", value, "titleLevelId");
            return (Criteria) this;
        }

        public Criteria andTitleLevelIdIn(List<Integer> values) {
            addCriterion("title_level_id in", values, "titleLevelId");
            return (Criteria) this;
        }

        public Criteria andTitleLevelIdNotIn(List<Integer> values) {
            addCriterion("title_level_id not in", values, "titleLevelId");
            return (Criteria) this;
        }

        public Criteria andTitleLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("title_level_id between", value1, value2, "titleLevelId");
            return (Criteria) this;
        }

        public Criteria andTitleLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("title_level_id not between", value1, value2, "titleLevelId");
            return (Criteria) this;
        }

        public Criteria andEditContentIsNull() {
            addCriterion("edit_content is null");
            return (Criteria) this;
        }

        public Criteria andEditContentIsNotNull() {
            addCriterion("edit_content is not null");
            return (Criteria) this;
        }

        public Criteria andEditContentEqualTo(String value) {
            addCriterion("edit_content =", value, "editContent");
            return (Criteria) this;
        }

        public Criteria andEditContentNotEqualTo(String value) {
            addCriterion("edit_content <>", value, "editContent");
            return (Criteria) this;
        }

        public Criteria andEditContentGreaterThan(String value) {
            addCriterion("edit_content >", value, "editContent");
            return (Criteria) this;
        }

        public Criteria andEditContentGreaterThanOrEqualTo(String value) {
            addCriterion("edit_content >=", value, "editContent");
            return (Criteria) this;
        }

        public Criteria andEditContentLessThan(String value) {
            addCriterion("edit_content <", value, "editContent");
            return (Criteria) this;
        }

        public Criteria andEditContentLessThanOrEqualTo(String value) {
            addCriterion("edit_content <=", value, "editContent");
            return (Criteria) this;
        }

        public Criteria andEditContentLike(String value) {
            addCriterion("edit_content like", value, "editContent");
            return (Criteria) this;
        }

        public Criteria andEditContentNotLike(String value) {
            addCriterion("edit_content not like", value, "editContent");
            return (Criteria) this;
        }

        public Criteria andEditContentIn(List<String> values) {
            addCriterion("edit_content in", values, "editContent");
            return (Criteria) this;
        }

        public Criteria andEditContentNotIn(List<String> values) {
            addCriterion("edit_content not in", values, "editContent");
            return (Criteria) this;
        }

        public Criteria andEditContentBetween(String value1, String value2) {
            addCriterion("edit_content between", value1, value2, "editContent");
            return (Criteria) this;
        }

        public Criteria andEditContentNotBetween(String value1, String value2) {
            addCriterion("edit_content not between", value1, value2, "editContent");
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

        public Criteria andAuditPersonIdIsNull() {
            addCriterion("audit_person_id is null");
            return (Criteria) this;
        }

        public Criteria andAuditPersonIdIsNotNull() {
            addCriterion("audit_person_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuditPersonIdEqualTo(String value) {
            addCriterion("audit_person_id =", value, "auditPersonId");
            return (Criteria) this;
        }

        public Criteria andAuditPersonIdNotEqualTo(String value) {
            addCriterion("audit_person_id <>", value, "auditPersonId");
            return (Criteria) this;
        }

        public Criteria andAuditPersonIdGreaterThan(String value) {
            addCriterion("audit_person_id >", value, "auditPersonId");
            return (Criteria) this;
        }

        public Criteria andAuditPersonIdGreaterThanOrEqualTo(String value) {
            addCriterion("audit_person_id >=", value, "auditPersonId");
            return (Criteria) this;
        }

        public Criteria andAuditPersonIdLessThan(String value) {
            addCriterion("audit_person_id <", value, "auditPersonId");
            return (Criteria) this;
        }

        public Criteria andAuditPersonIdLessThanOrEqualTo(String value) {
            addCriterion("audit_person_id <=", value, "auditPersonId");
            return (Criteria) this;
        }

        public Criteria andAuditPersonIdLike(String value) {
            addCriterion("audit_person_id like", value, "auditPersonId");
            return (Criteria) this;
        }

        public Criteria andAuditPersonIdNotLike(String value) {
            addCriterion("audit_person_id not like", value, "auditPersonId");
            return (Criteria) this;
        }

        public Criteria andAuditPersonIdIn(List<String> values) {
            addCriterion("audit_person_id in", values, "auditPersonId");
            return (Criteria) this;
        }

        public Criteria andAuditPersonIdNotIn(List<String> values) {
            addCriterion("audit_person_id not in", values, "auditPersonId");
            return (Criteria) this;
        }

        public Criteria andAuditPersonIdBetween(String value1, String value2) {
            addCriterion("audit_person_id between", value1, value2, "auditPersonId");
            return (Criteria) this;
        }

        public Criteria andAuditPersonIdNotBetween(String value1, String value2) {
            addCriterion("audit_person_id not between", value1, value2, "auditPersonId");
            return (Criteria) this;
        }

        public Criteria andAuditPoinionIsNull() {
            addCriterion("audit_poinion is null");
            return (Criteria) this;
        }

        public Criteria andAuditPoinionIsNotNull() {
            addCriterion("audit_poinion is not null");
            return (Criteria) this;
        }

        public Criteria andAuditPoinionEqualTo(String value) {
            addCriterion("audit_poinion =", value, "auditPoinion");
            return (Criteria) this;
        }

        public Criteria andAuditPoinionNotEqualTo(String value) {
            addCriterion("audit_poinion <>", value, "auditPoinion");
            return (Criteria) this;
        }

        public Criteria andAuditPoinionGreaterThan(String value) {
            addCriterion("audit_poinion >", value, "auditPoinion");
            return (Criteria) this;
        }

        public Criteria andAuditPoinionGreaterThanOrEqualTo(String value) {
            addCriterion("audit_poinion >=", value, "auditPoinion");
            return (Criteria) this;
        }

        public Criteria andAuditPoinionLessThan(String value) {
            addCriterion("audit_poinion <", value, "auditPoinion");
            return (Criteria) this;
        }

        public Criteria andAuditPoinionLessThanOrEqualTo(String value) {
            addCriterion("audit_poinion <=", value, "auditPoinion");
            return (Criteria) this;
        }

        public Criteria andAuditPoinionLike(String value) {
            addCriterion("audit_poinion like", value, "auditPoinion");
            return (Criteria) this;
        }

        public Criteria andAuditPoinionNotLike(String value) {
            addCriterion("audit_poinion not like", value, "auditPoinion");
            return (Criteria) this;
        }

        public Criteria andAuditPoinionIn(List<String> values) {
            addCriterion("audit_poinion in", values, "auditPoinion");
            return (Criteria) this;
        }

        public Criteria andAuditPoinionNotIn(List<String> values) {
            addCriterion("audit_poinion not in", values, "auditPoinion");
            return (Criteria) this;
        }

        public Criteria andAuditPoinionBetween(String value1, String value2) {
            addCriterion("audit_poinion between", value1, value2, "auditPoinion");
            return (Criteria) this;
        }

        public Criteria andAuditPoinionNotBetween(String value1, String value2) {
            addCriterion("audit_poinion not between", value1, value2, "auditPoinion");
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