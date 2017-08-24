package com.hebeu.keyan.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ECollegeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ECollegeExample() {
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

        public Criteria andCollegeNameIsNull() {
            addCriterion("college_name is null");
            return (Criteria) this;
        }

        public Criteria andCollegeNameIsNotNull() {
            addCriterion("college_name is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeNameEqualTo(String value) {
            addCriterion("college_name =", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameNotEqualTo(String value) {
            addCriterion("college_name <>", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameGreaterThan(String value) {
            addCriterion("college_name >", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameGreaterThanOrEqualTo(String value) {
            addCriterion("college_name >=", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameLessThan(String value) {
            addCriterion("college_name <", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameLessThanOrEqualTo(String value) {
            addCriterion("college_name <=", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameLike(String value) {
            addCriterion("college_name like", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameNotLike(String value) {
            addCriterion("college_name not like", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameIn(List<String> values) {
            addCriterion("college_name in", values, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameNotIn(List<String> values) {
            addCriterion("college_name not in", values, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameBetween(String value1, String value2) {
            addCriterion("college_name between", value1, value2, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameNotBetween(String value1, String value2) {
            addCriterion("college_name not between", value1, value2, "collegeName");
            return (Criteria) this;
        }

        public Criteria andDeanIsNull() {
            addCriterion("dean is null");
            return (Criteria) this;
        }

        public Criteria andDeanIsNotNull() {
            addCriterion("dean is not null");
            return (Criteria) this;
        }

        public Criteria andDeanEqualTo(String value) {
            addCriterion("dean =", value, "dean");
            return (Criteria) this;
        }

        public Criteria andDeanNotEqualTo(String value) {
            addCriterion("dean <>", value, "dean");
            return (Criteria) this;
        }

        public Criteria andDeanGreaterThan(String value) {
            addCriterion("dean >", value, "dean");
            return (Criteria) this;
        }

        public Criteria andDeanGreaterThanOrEqualTo(String value) {
            addCriterion("dean >=", value, "dean");
            return (Criteria) this;
        }

        public Criteria andDeanLessThan(String value) {
            addCriterion("dean <", value, "dean");
            return (Criteria) this;
        }

        public Criteria andDeanLessThanOrEqualTo(String value) {
            addCriterion("dean <=", value, "dean");
            return (Criteria) this;
        }

        public Criteria andDeanLike(String value) {
            addCriterion("dean like", value, "dean");
            return (Criteria) this;
        }

        public Criteria andDeanNotLike(String value) {
            addCriterion("dean not like", value, "dean");
            return (Criteria) this;
        }

        public Criteria andDeanIn(List<String> values) {
            addCriterion("dean in", values, "dean");
            return (Criteria) this;
        }

        public Criteria andDeanNotIn(List<String> values) {
            addCriterion("dean not in", values, "dean");
            return (Criteria) this;
        }

        public Criteria andDeanBetween(String value1, String value2) {
            addCriterion("dean between", value1, value2, "dean");
            return (Criteria) this;
        }

        public Criteria andDeanNotBetween(String value1, String value2) {
            addCriterion("dean not between", value1, value2, "dean");
            return (Criteria) this;
        }

        public Criteria andRespDeanIsNull() {
            addCriterion("resp_dean is null");
            return (Criteria) this;
        }

        public Criteria andRespDeanIsNotNull() {
            addCriterion("resp_dean is not null");
            return (Criteria) this;
        }

        public Criteria andRespDeanEqualTo(String value) {
            addCriterion("resp_dean =", value, "respDean");
            return (Criteria) this;
        }

        public Criteria andRespDeanNotEqualTo(String value) {
            addCriterion("resp_dean <>", value, "respDean");
            return (Criteria) this;
        }

        public Criteria andRespDeanGreaterThan(String value) {
            addCriterion("resp_dean >", value, "respDean");
            return (Criteria) this;
        }

        public Criteria andRespDeanGreaterThanOrEqualTo(String value) {
            addCriterion("resp_dean >=", value, "respDean");
            return (Criteria) this;
        }

        public Criteria andRespDeanLessThan(String value) {
            addCriterion("resp_dean <", value, "respDean");
            return (Criteria) this;
        }

        public Criteria andRespDeanLessThanOrEqualTo(String value) {
            addCriterion("resp_dean <=", value, "respDean");
            return (Criteria) this;
        }

        public Criteria andRespDeanLike(String value) {
            addCriterion("resp_dean like", value, "respDean");
            return (Criteria) this;
        }

        public Criteria andRespDeanNotLike(String value) {
            addCriterion("resp_dean not like", value, "respDean");
            return (Criteria) this;
        }

        public Criteria andRespDeanIn(List<String> values) {
            addCriterion("resp_dean in", values, "respDean");
            return (Criteria) this;
        }

        public Criteria andRespDeanNotIn(List<String> values) {
            addCriterion("resp_dean not in", values, "respDean");
            return (Criteria) this;
        }

        public Criteria andRespDeanBetween(String value1, String value2) {
            addCriterion("resp_dean between", value1, value2, "respDean");
            return (Criteria) this;
        }

        public Criteria andRespDeanNotBetween(String value1, String value2) {
            addCriterion("resp_dean not between", value1, value2, "respDean");
            return (Criteria) this;
        }

        public Criteria andSecretaryIsNull() {
            addCriterion("secretary is null");
            return (Criteria) this;
        }

        public Criteria andSecretaryIsNotNull() {
            addCriterion("secretary is not null");
            return (Criteria) this;
        }

        public Criteria andSecretaryEqualTo(String value) {
            addCriterion("secretary =", value, "secretary");
            return (Criteria) this;
        }

        public Criteria andSecretaryNotEqualTo(String value) {
            addCriterion("secretary <>", value, "secretary");
            return (Criteria) this;
        }

        public Criteria andSecretaryGreaterThan(String value) {
            addCriterion("secretary >", value, "secretary");
            return (Criteria) this;
        }

        public Criteria andSecretaryGreaterThanOrEqualTo(String value) {
            addCriterion("secretary >=", value, "secretary");
            return (Criteria) this;
        }

        public Criteria andSecretaryLessThan(String value) {
            addCriterion("secretary <", value, "secretary");
            return (Criteria) this;
        }

        public Criteria andSecretaryLessThanOrEqualTo(String value) {
            addCriterion("secretary <=", value, "secretary");
            return (Criteria) this;
        }

        public Criteria andSecretaryLike(String value) {
            addCriterion("secretary like", value, "secretary");
            return (Criteria) this;
        }

        public Criteria andSecretaryNotLike(String value) {
            addCriterion("secretary not like", value, "secretary");
            return (Criteria) this;
        }

        public Criteria andSecretaryIn(List<String> values) {
            addCriterion("secretary in", values, "secretary");
            return (Criteria) this;
        }

        public Criteria andSecretaryNotIn(List<String> values) {
            addCriterion("secretary not in", values, "secretary");
            return (Criteria) this;
        }

        public Criteria andSecretaryBetween(String value1, String value2) {
            addCriterion("secretary between", value1, value2, "secretary");
            return (Criteria) this;
        }

        public Criteria andSecretaryNotBetween(String value1, String value2) {
            addCriterion("secretary not between", value1, value2, "secretary");
            return (Criteria) this;
        }

        public Criteria andDueJobIsNull() {
            addCriterion("due_job is null");
            return (Criteria) this;
        }

        public Criteria andDueJobIsNotNull() {
            addCriterion("due_job is not null");
            return (Criteria) this;
        }

        public Criteria andDueJobEqualTo(String value) {
            addCriterion("due_job =", value, "dueJob");
            return (Criteria) this;
        }

        public Criteria andDueJobNotEqualTo(String value) {
            addCriterion("due_job <>", value, "dueJob");
            return (Criteria) this;
        }

        public Criteria andDueJobGreaterThan(String value) {
            addCriterion("due_job >", value, "dueJob");
            return (Criteria) this;
        }

        public Criteria andDueJobGreaterThanOrEqualTo(String value) {
            addCriterion("due_job >=", value, "dueJob");
            return (Criteria) this;
        }

        public Criteria andDueJobLessThan(String value) {
            addCriterion("due_job <", value, "dueJob");
            return (Criteria) this;
        }

        public Criteria andDueJobLessThanOrEqualTo(String value) {
            addCriterion("due_job <=", value, "dueJob");
            return (Criteria) this;
        }

        public Criteria andDueJobLike(String value) {
            addCriterion("due_job like", value, "dueJob");
            return (Criteria) this;
        }

        public Criteria andDueJobNotLike(String value) {
            addCriterion("due_job not like", value, "dueJob");
            return (Criteria) this;
        }

        public Criteria andDueJobIn(List<String> values) {
            addCriterion("due_job in", values, "dueJob");
            return (Criteria) this;
        }

        public Criteria andDueJobNotIn(List<String> values) {
            addCriterion("due_job not in", values, "dueJob");
            return (Criteria) this;
        }

        public Criteria andDueJobBetween(String value1, String value2) {
            addCriterion("due_job between", value1, value2, "dueJob");
            return (Criteria) this;
        }

        public Criteria andDueJobNotBetween(String value1, String value2) {
            addCriterion("due_job not between", value1, value2, "dueJob");
            return (Criteria) this;
        }

        public Criteria andInJobIsNull() {
            addCriterion("in_job is null");
            return (Criteria) this;
        }

        public Criteria andInJobIsNotNull() {
            addCriterion("in_job is not null");
            return (Criteria) this;
        }

        public Criteria andInJobEqualTo(String value) {
            addCriterion("in_job =", value, "inJob");
            return (Criteria) this;
        }

        public Criteria andInJobNotEqualTo(String value) {
            addCriterion("in_job <>", value, "inJob");
            return (Criteria) this;
        }

        public Criteria andInJobGreaterThan(String value) {
            addCriterion("in_job >", value, "inJob");
            return (Criteria) this;
        }

        public Criteria andInJobGreaterThanOrEqualTo(String value) {
            addCriterion("in_job >=", value, "inJob");
            return (Criteria) this;
        }

        public Criteria andInJobLessThan(String value) {
            addCriterion("in_job <", value, "inJob");
            return (Criteria) this;
        }

        public Criteria andInJobLessThanOrEqualTo(String value) {
            addCriterion("in_job <=", value, "inJob");
            return (Criteria) this;
        }

        public Criteria andInJobLike(String value) {
            addCriterion("in_job like", value, "inJob");
            return (Criteria) this;
        }

        public Criteria andInJobNotLike(String value) {
            addCriterion("in_job not like", value, "inJob");
            return (Criteria) this;
        }

        public Criteria andInJobIn(List<String> values) {
            addCriterion("in_job in", values, "inJob");
            return (Criteria) this;
        }

        public Criteria andInJobNotIn(List<String> values) {
            addCriterion("in_job not in", values, "inJob");
            return (Criteria) this;
        }

        public Criteria andInJobBetween(String value1, String value2) {
            addCriterion("in_job between", value1, value2, "inJob");
            return (Criteria) this;
        }

        public Criteria andInJobNotBetween(String value1, String value2) {
            addCriterion("in_job not between", value1, value2, "inJob");
            return (Criteria) this;
        }

        public Criteria andThisUnitIsNull() {
            addCriterion("this_unit is null");
            return (Criteria) this;
        }

        public Criteria andThisUnitIsNotNull() {
            addCriterion("this_unit is not null");
            return (Criteria) this;
        }

        public Criteria andThisUnitEqualTo(String value) {
            addCriterion("this_unit =", value, "thisUnit");
            return (Criteria) this;
        }

        public Criteria andThisUnitNotEqualTo(String value) {
            addCriterion("this_unit <>", value, "thisUnit");
            return (Criteria) this;
        }

        public Criteria andThisUnitGreaterThan(String value) {
            addCriterion("this_unit >", value, "thisUnit");
            return (Criteria) this;
        }

        public Criteria andThisUnitGreaterThanOrEqualTo(String value) {
            addCriterion("this_unit >=", value, "thisUnit");
            return (Criteria) this;
        }

        public Criteria andThisUnitLessThan(String value) {
            addCriterion("this_unit <", value, "thisUnit");
            return (Criteria) this;
        }

        public Criteria andThisUnitLessThanOrEqualTo(String value) {
            addCriterion("this_unit <=", value, "thisUnit");
            return (Criteria) this;
        }

        public Criteria andThisUnitLike(String value) {
            addCriterion("this_unit like", value, "thisUnit");
            return (Criteria) this;
        }

        public Criteria andThisUnitNotLike(String value) {
            addCriterion("this_unit not like", value, "thisUnit");
            return (Criteria) this;
        }

        public Criteria andThisUnitIn(List<String> values) {
            addCriterion("this_unit in", values, "thisUnit");
            return (Criteria) this;
        }

        public Criteria andThisUnitNotIn(List<String> values) {
            addCriterion("this_unit not in", values, "thisUnit");
            return (Criteria) this;
        }

        public Criteria andThisUnitBetween(String value1, String value2) {
            addCriterion("this_unit between", value1, value2, "thisUnit");
            return (Criteria) this;
        }

        public Criteria andThisUnitNotBetween(String value1, String value2) {
            addCriterion("this_unit not between", value1, value2, "thisUnit");
            return (Criteria) this;
        }

        public Criteria andRetiredIsNull() {
            addCriterion("retired is null");
            return (Criteria) this;
        }

        public Criteria andRetiredIsNotNull() {
            addCriterion("retired is not null");
            return (Criteria) this;
        }

        public Criteria andRetiredEqualTo(String value) {
            addCriterion("retired =", value, "retired");
            return (Criteria) this;
        }

        public Criteria andRetiredNotEqualTo(String value) {
            addCriterion("retired <>", value, "retired");
            return (Criteria) this;
        }

        public Criteria andRetiredGreaterThan(String value) {
            addCriterion("retired >", value, "retired");
            return (Criteria) this;
        }

        public Criteria andRetiredGreaterThanOrEqualTo(String value) {
            addCriterion("retired >=", value, "retired");
            return (Criteria) this;
        }

        public Criteria andRetiredLessThan(String value) {
            addCriterion("retired <", value, "retired");
            return (Criteria) this;
        }

        public Criteria andRetiredLessThanOrEqualTo(String value) {
            addCriterion("retired <=", value, "retired");
            return (Criteria) this;
        }

        public Criteria andRetiredLike(String value) {
            addCriterion("retired like", value, "retired");
            return (Criteria) this;
        }

        public Criteria andRetiredNotLike(String value) {
            addCriterion("retired not like", value, "retired");
            return (Criteria) this;
        }

        public Criteria andRetiredIn(List<String> values) {
            addCriterion("retired in", values, "retired");
            return (Criteria) this;
        }

        public Criteria andRetiredNotIn(List<String> values) {
            addCriterion("retired not in", values, "retired");
            return (Criteria) this;
        }

        public Criteria andRetiredBetween(String value1, String value2) {
            addCriterion("retired between", value1, value2, "retired");
            return (Criteria) this;
        }

        public Criteria andRetiredNotBetween(String value1, String value2) {
            addCriterion("retired not between", value1, value2, "retired");
            return (Criteria) this;
        }

        public Criteria andProfessorIsNull() {
            addCriterion("professor is null");
            return (Criteria) this;
        }

        public Criteria andProfessorIsNotNull() {
            addCriterion("professor is not null");
            return (Criteria) this;
        }

        public Criteria andProfessorEqualTo(String value) {
            addCriterion("professor =", value, "professor");
            return (Criteria) this;
        }

        public Criteria andProfessorNotEqualTo(String value) {
            addCriterion("professor <>", value, "professor");
            return (Criteria) this;
        }

        public Criteria andProfessorGreaterThan(String value) {
            addCriterion("professor >", value, "professor");
            return (Criteria) this;
        }

        public Criteria andProfessorGreaterThanOrEqualTo(String value) {
            addCriterion("professor >=", value, "professor");
            return (Criteria) this;
        }

        public Criteria andProfessorLessThan(String value) {
            addCriterion("professor <", value, "professor");
            return (Criteria) this;
        }

        public Criteria andProfessorLessThanOrEqualTo(String value) {
            addCriterion("professor <=", value, "professor");
            return (Criteria) this;
        }

        public Criteria andProfessorLike(String value) {
            addCriterion("professor like", value, "professor");
            return (Criteria) this;
        }

        public Criteria andProfessorNotLike(String value) {
            addCriterion("professor not like", value, "professor");
            return (Criteria) this;
        }

        public Criteria andProfessorIn(List<String> values) {
            addCriterion("professor in", values, "professor");
            return (Criteria) this;
        }

        public Criteria andProfessorNotIn(List<String> values) {
            addCriterion("professor not in", values, "professor");
            return (Criteria) this;
        }

        public Criteria andProfessorBetween(String value1, String value2) {
            addCriterion("professor between", value1, value2, "professor");
            return (Criteria) this;
        }

        public Criteria andProfessorNotBetween(String value1, String value2) {
            addCriterion("professor not between", value1, value2, "professor");
            return (Criteria) this;
        }

        public Criteria andViceProfessorIsNull() {
            addCriterion("vice_professor is null");
            return (Criteria) this;
        }

        public Criteria andViceProfessorIsNotNull() {
            addCriterion("vice_professor is not null");
            return (Criteria) this;
        }

        public Criteria andViceProfessorEqualTo(String value) {
            addCriterion("vice_professor =", value, "viceProfessor");
            return (Criteria) this;
        }

        public Criteria andViceProfessorNotEqualTo(String value) {
            addCriterion("vice_professor <>", value, "viceProfessor");
            return (Criteria) this;
        }

        public Criteria andViceProfessorGreaterThan(String value) {
            addCriterion("vice_professor >", value, "viceProfessor");
            return (Criteria) this;
        }

        public Criteria andViceProfessorGreaterThanOrEqualTo(String value) {
            addCriterion("vice_professor >=", value, "viceProfessor");
            return (Criteria) this;
        }

        public Criteria andViceProfessorLessThan(String value) {
            addCriterion("vice_professor <", value, "viceProfessor");
            return (Criteria) this;
        }

        public Criteria andViceProfessorLessThanOrEqualTo(String value) {
            addCriterion("vice_professor <=", value, "viceProfessor");
            return (Criteria) this;
        }

        public Criteria andViceProfessorLike(String value) {
            addCriterion("vice_professor like", value, "viceProfessor");
            return (Criteria) this;
        }

        public Criteria andViceProfessorNotLike(String value) {
            addCriterion("vice_professor not like", value, "viceProfessor");
            return (Criteria) this;
        }

        public Criteria andViceProfessorIn(List<String> values) {
            addCriterion("vice_professor in", values, "viceProfessor");
            return (Criteria) this;
        }

        public Criteria andViceProfessorNotIn(List<String> values) {
            addCriterion("vice_professor not in", values, "viceProfessor");
            return (Criteria) this;
        }

        public Criteria andViceProfessorBetween(String value1, String value2) {
            addCriterion("vice_professor between", value1, value2, "viceProfessor");
            return (Criteria) this;
        }

        public Criteria andViceProfessorNotBetween(String value1, String value2) {
            addCriterion("vice_professor not between", value1, value2, "viceProfessor");
            return (Criteria) this;
        }

        public Criteria andTeacherIsNull() {
            addCriterion("teacher is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIsNotNull() {
            addCriterion("teacher is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherEqualTo(String value) {
            addCriterion("teacher =", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotEqualTo(String value) {
            addCriterion("teacher <>", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherGreaterThan(String value) {
            addCriterion("teacher >", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherGreaterThanOrEqualTo(String value) {
            addCriterion("teacher >=", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLessThan(String value) {
            addCriterion("teacher <", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLessThanOrEqualTo(String value) {
            addCriterion("teacher <=", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLike(String value) {
            addCriterion("teacher like", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotLike(String value) {
            addCriterion("teacher not like", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherIn(List<String> values) {
            addCriterion("teacher in", values, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotIn(List<String> values) {
            addCriterion("teacher not in", values, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherBetween(String value1, String value2) {
            addCriterion("teacher between", value1, value2, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotBetween(String value1, String value2) {
            addCriterion("teacher not between", value1, value2, "teacher");
            return (Criteria) this;
        }

        public Criteria andAssistantIsNull() {
            addCriterion("assistant is null");
            return (Criteria) this;
        }

        public Criteria andAssistantIsNotNull() {
            addCriterion("assistant is not null");
            return (Criteria) this;
        }

        public Criteria andAssistantEqualTo(String value) {
            addCriterion("assistant =", value, "assistant");
            return (Criteria) this;
        }

        public Criteria andAssistantNotEqualTo(String value) {
            addCriterion("assistant <>", value, "assistant");
            return (Criteria) this;
        }

        public Criteria andAssistantGreaterThan(String value) {
            addCriterion("assistant >", value, "assistant");
            return (Criteria) this;
        }

        public Criteria andAssistantGreaterThanOrEqualTo(String value) {
            addCriterion("assistant >=", value, "assistant");
            return (Criteria) this;
        }

        public Criteria andAssistantLessThan(String value) {
            addCriterion("assistant <", value, "assistant");
            return (Criteria) this;
        }

        public Criteria andAssistantLessThanOrEqualTo(String value) {
            addCriterion("assistant <=", value, "assistant");
            return (Criteria) this;
        }

        public Criteria andAssistantLike(String value) {
            addCriterion("assistant like", value, "assistant");
            return (Criteria) this;
        }

        public Criteria andAssistantNotLike(String value) {
            addCriterion("assistant not like", value, "assistant");
            return (Criteria) this;
        }

        public Criteria andAssistantIn(List<String> values) {
            addCriterion("assistant in", values, "assistant");
            return (Criteria) this;
        }

        public Criteria andAssistantNotIn(List<String> values) {
            addCriterion("assistant not in", values, "assistant");
            return (Criteria) this;
        }

        public Criteria andAssistantBetween(String value1, String value2) {
            addCriterion("assistant between", value1, value2, "assistant");
            return (Criteria) this;
        }

        public Criteria andAssistantNotBetween(String value1, String value2) {
            addCriterion("assistant not between", value1, value2, "assistant");
            return (Criteria) this;
        }

        public Criteria andPrimaryIsNull() {
            addCriterion("primary is null");
            return (Criteria) this;
        }

        public Criteria andPrimaryIsNotNull() {
            addCriterion("primary is not null");
            return (Criteria) this;
        }

        public Criteria andPrimaryEqualTo(String value) {
            addCriterion("primary =", value, "primary");
            return (Criteria) this;
        }

        public Criteria andPrimaryNotEqualTo(String value) {
            addCriterion("primary <>", value, "primary");
            return (Criteria) this;
        }

        public Criteria andPrimaryGreaterThan(String value) {
            addCriterion("primary >", value, "primary");
            return (Criteria) this;
        }

        public Criteria andPrimaryGreaterThanOrEqualTo(String value) {
            addCriterion("primary >=", value, "primary");
            return (Criteria) this;
        }

        public Criteria andPrimaryLessThan(String value) {
            addCriterion("primary <", value, "primary");
            return (Criteria) this;
        }

        public Criteria andPrimaryLessThanOrEqualTo(String value) {
            addCriterion("primary <=", value, "primary");
            return (Criteria) this;
        }

        public Criteria andPrimaryLike(String value) {
            addCriterion("primary like", value, "primary");
            return (Criteria) this;
        }

        public Criteria andPrimaryNotLike(String value) {
            addCriterion("primary not like", value, "primary");
            return (Criteria) this;
        }

        public Criteria andPrimaryIn(List<String> values) {
            addCriterion("primary in", values, "primary");
            return (Criteria) this;
        }

        public Criteria andPrimaryNotIn(List<String> values) {
            addCriterion("primary not in", values, "primary");
            return (Criteria) this;
        }

        public Criteria andPrimaryBetween(String value1, String value2) {
            addCriterion("primary between", value1, value2, "primary");
            return (Criteria) this;
        }

        public Criteria andPrimaryNotBetween(String value1, String value2) {
            addCriterion("primary not between", value1, value2, "primary");
            return (Criteria) this;
        }

        public Criteria andOtherIsNull() {
            addCriterion("other is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("other is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(String value) {
            addCriterion("other =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(String value) {
            addCriterion("other <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(String value) {
            addCriterion("other >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(String value) {
            addCriterion("other >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(String value) {
            addCriterion("other <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(String value) {
            addCriterion("other <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLike(String value) {
            addCriterion("other like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotLike(String value) {
            addCriterion("other not like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<String> values) {
            addCriterion("other in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<String> values) {
            addCriterion("other not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(String value1, String value2) {
            addCriterion("other between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(String value1, String value2) {
            addCriterion("other not between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNull() {
            addCriterion("website is null");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNotNull() {
            addCriterion("website is not null");
            return (Criteria) this;
        }

        public Criteria andWebsiteEqualTo(String value) {
            addCriterion("website =", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotEqualTo(String value) {
            addCriterion("website <>", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThan(String value) {
            addCriterion("website >", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("website >=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThan(String value) {
            addCriterion("website <", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThanOrEqualTo(String value) {
            addCriterion("website <=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLike(String value) {
            addCriterion("website like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotLike(String value) {
            addCriterion("website not like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteIn(List<String> values) {
            addCriterion("website in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotIn(List<String> values) {
            addCriterion("website not in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteBetween(String value1, String value2) {
            addCriterion("website between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotBetween(String value1, String value2) {
            addCriterion("website not between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andWechatIdIsNull() {
            addCriterion("wechat_id is null");
            return (Criteria) this;
        }

        public Criteria andWechatIdIsNotNull() {
            addCriterion("wechat_id is not null");
            return (Criteria) this;
        }

        public Criteria andWechatIdEqualTo(String value) {
            addCriterion("wechat_id =", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdNotEqualTo(String value) {
            addCriterion("wechat_id <>", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdGreaterThan(String value) {
            addCriterion("wechat_id >", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_id >=", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdLessThan(String value) {
            addCriterion("wechat_id <", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdLessThanOrEqualTo(String value) {
            addCriterion("wechat_id <=", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdLike(String value) {
            addCriterion("wechat_id like", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdNotLike(String value) {
            addCriterion("wechat_id not like", value, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdIn(List<String> values) {
            addCriterion("wechat_id in", values, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdNotIn(List<String> values) {
            addCriterion("wechat_id not in", values, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdBetween(String value1, String value2) {
            addCriterion("wechat_id between", value1, value2, "wechatId");
            return (Criteria) this;
        }

        public Criteria andWechatIdNotBetween(String value1, String value2) {
            addCriterion("wechat_id not between", value1, value2, "wechatId");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(String value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(String value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(String value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(String value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(String value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(String value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLike(String value) {
            addCriterion("score like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotLike(String value) {
            addCriterion("score not like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<String> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<String> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(String value1, String value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(String value1, String value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andRankingIsNull() {
            addCriterion("ranking is null");
            return (Criteria) this;
        }

        public Criteria andRankingIsNotNull() {
            addCriterion("ranking is not null");
            return (Criteria) this;
        }

        public Criteria andRankingEqualTo(String value) {
            addCriterion("ranking =", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingNotEqualTo(String value) {
            addCriterion("ranking <>", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingGreaterThan(String value) {
            addCriterion("ranking >", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingGreaterThanOrEqualTo(String value) {
            addCriterion("ranking >=", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingLessThan(String value) {
            addCriterion("ranking <", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingLessThanOrEqualTo(String value) {
            addCriterion("ranking <=", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingLike(String value) {
            addCriterion("ranking like", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingNotLike(String value) {
            addCriterion("ranking not like", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingIn(List<String> values) {
            addCriterion("ranking in", values, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingNotIn(List<String> values) {
            addCriterion("ranking not in", values, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingBetween(String value1, String value2) {
            addCriterion("ranking between", value1, value2, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingNotBetween(String value1, String value2) {
            addCriterion("ranking not between", value1, value2, "ranking");
            return (Criteria) this;
        }

        public Criteria andBuildDateIsNull() {
            addCriterion("build_date is null");
            return (Criteria) this;
        }

        public Criteria andBuildDateIsNotNull() {
            addCriterion("build_date is not null");
            return (Criteria) this;
        }

        public Criteria andBuildDateEqualTo(String value) {
            addCriterion("build_date =", value, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateNotEqualTo(String value) {
            addCriterion("build_date <>", value, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateGreaterThan(String value) {
            addCriterion("build_date >", value, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateGreaterThanOrEqualTo(String value) {
            addCriterion("build_date >=", value, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateLessThan(String value) {
            addCriterion("build_date <", value, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateLessThanOrEqualTo(String value) {
            addCriterion("build_date <=", value, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateLike(String value) {
            addCriterion("build_date like", value, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateNotLike(String value) {
            addCriterion("build_date not like", value, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateIn(List<String> values) {
            addCriterion("build_date in", values, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateNotIn(List<String> values) {
            addCriterion("build_date not in", values, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateBetween(String value1, String value2) {
            addCriterion("build_date between", value1, value2, "buildDate");
            return (Criteria) this;
        }

        public Criteria andBuildDateNotBetween(String value1, String value2) {
            addCriterion("build_date not between", value1, value2, "buildDate");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNull() {
            addCriterion("postcode is null");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNotNull() {
            addCriterion("postcode is not null");
            return (Criteria) this;
        }

        public Criteria andPostcodeEqualTo(String value) {
            addCriterion("postcode =", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotEqualTo(String value) {
            addCriterion("postcode <>", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThan(String value) {
            addCriterion("postcode >", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("postcode >=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThan(String value) {
            addCriterion("postcode <", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThanOrEqualTo(String value) {
            addCriterion("postcode <=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLike(String value) {
            addCriterion("postcode like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotLike(String value) {
            addCriterion("postcode not like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIn(List<String> values) {
            addCriterion("postcode in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotIn(List<String> values) {
            addCriterion("postcode not in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeBetween(String value1, String value2) {
            addCriterion("postcode between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotBetween(String value1, String value2) {
            addCriterion("postcode not between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
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

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterion("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveIsNull() {
            addCriterion("is_effective is null");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveIsNotNull() {
            addCriterion("is_effective is not null");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveEqualTo(Integer value) {
            addCriterion("is_effective =", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveNotEqualTo(Integer value) {
            addCriterion("is_effective <>", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveGreaterThan(Integer value) {
            addCriterion("is_effective >", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_effective >=", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveLessThan(Integer value) {
            addCriterion("is_effective <", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveLessThanOrEqualTo(Integer value) {
            addCriterion("is_effective <=", value, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveIn(List<Integer> values) {
            addCriterion("is_effective in", values, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveNotIn(List<Integer> values) {
            addCriterion("is_effective not in", values, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveBetween(Integer value1, Integer value2) {
            addCriterion("is_effective between", value1, value2, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEffectiveNotBetween(Integer value1, Integer value2) {
            addCriterion("is_effective not between", value1, value2, "isEffective");
            return (Criteria) this;
        }

        public Criteria andIsEducationIsNull() {
            addCriterion("is_education is null");
            return (Criteria) this;
        }

        public Criteria andIsEducationIsNotNull() {
            addCriterion("is_education is not null");
            return (Criteria) this;
        }

        public Criteria andIsEducationEqualTo(Integer value) {
            addCriterion("is_education =", value, "isEducation");
            return (Criteria) this;
        }

        public Criteria andIsEducationNotEqualTo(Integer value) {
            addCriterion("is_education <>", value, "isEducation");
            return (Criteria) this;
        }

        public Criteria andIsEducationGreaterThan(Integer value) {
            addCriterion("is_education >", value, "isEducation");
            return (Criteria) this;
        }

        public Criteria andIsEducationGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_education >=", value, "isEducation");
            return (Criteria) this;
        }

        public Criteria andIsEducationLessThan(Integer value) {
            addCriterion("is_education <", value, "isEducation");
            return (Criteria) this;
        }

        public Criteria andIsEducationLessThanOrEqualTo(Integer value) {
            addCriterion("is_education <=", value, "isEducation");
            return (Criteria) this;
        }

        public Criteria andIsEducationIn(List<Integer> values) {
            addCriterion("is_education in", values, "isEducation");
            return (Criteria) this;
        }

        public Criteria andIsEducationNotIn(List<Integer> values) {
            addCriterion("is_education not in", values, "isEducation");
            return (Criteria) this;
        }

        public Criteria andIsEducationBetween(Integer value1, Integer value2) {
            addCriterion("is_education between", value1, value2, "isEducation");
            return (Criteria) this;
        }

        public Criteria andIsEducationNotBetween(Integer value1, Integer value2) {
            addCriterion("is_education not between", value1, value2, "isEducation");
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