package com.hebeu.keyan.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BudgetApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BudgetApplyExample() {
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

        public Criteria andApplyIdIsNull() {
            addCriterion("apply_id is null");
            return (Criteria) this;
        }

        public Criteria andApplyIdIsNotNull() {
            addCriterion("apply_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplyIdEqualTo(String value) {
            addCriterion("apply_id =", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotEqualTo(String value) {
            addCriterion("apply_id <>", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdGreaterThan(String value) {
            addCriterion("apply_id >", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdGreaterThanOrEqualTo(String value) {
            addCriterion("apply_id >=", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLessThan(String value) {
            addCriterion("apply_id <", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLessThanOrEqualTo(String value) {
            addCriterion("apply_id <=", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLike(String value) {
            addCriterion("apply_id like", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotLike(String value) {
            addCriterion("apply_id not like", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdIn(List<String> values) {
            addCriterion("apply_id in", values, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotIn(List<String> values) {
            addCriterion("apply_id not in", values, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdBetween(String value1, String value2) {
            addCriterion("apply_id between", value1, value2, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotBetween(String value1, String value2) {
            addCriterion("apply_id not between", value1, value2, "applyId");
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

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(String value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(String value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(String value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(String value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(String value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLike(String value) {
            addCriterion("project_id like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotLike(String value) {
            addCriterion("project_id not like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<String> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<String> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(String value1, String value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(String value1, String value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andPublishApplyIsNull() {
            addCriterion("publish_apply is null");
            return (Criteria) this;
        }

        public Criteria andPublishApplyIsNotNull() {
            addCriterion("publish_apply is not null");
            return (Criteria) this;
        }

        public Criteria andPublishApplyEqualTo(Double value) {
            addCriterion("publish_apply =", value, "publishApply");
            return (Criteria) this;
        }

        public Criteria andPublishApplyNotEqualTo(Double value) {
            addCriterion("publish_apply <>", value, "publishApply");
            return (Criteria) this;
        }

        public Criteria andPublishApplyGreaterThan(Double value) {
            addCriterion("publish_apply >", value, "publishApply");
            return (Criteria) this;
        }

        public Criteria andPublishApplyGreaterThanOrEqualTo(Double value) {
            addCriterion("publish_apply >=", value, "publishApply");
            return (Criteria) this;
        }

        public Criteria andPublishApplyLessThan(Double value) {
            addCriterion("publish_apply <", value, "publishApply");
            return (Criteria) this;
        }

        public Criteria andPublishApplyLessThanOrEqualTo(Double value) {
            addCriterion("publish_apply <=", value, "publishApply");
            return (Criteria) this;
        }

        public Criteria andPublishApplyIn(List<Double> values) {
            addCriterion("publish_apply in", values, "publishApply");
            return (Criteria) this;
        }

        public Criteria andPublishApplyNotIn(List<Double> values) {
            addCriterion("publish_apply not in", values, "publishApply");
            return (Criteria) this;
        }

        public Criteria andPublishApplyBetween(Double value1, Double value2) {
            addCriterion("publish_apply between", value1, value2, "publishApply");
            return (Criteria) this;
        }

        public Criteria andPublishApplyNotBetween(Double value1, Double value2) {
            addCriterion("publish_apply not between", value1, value2, "publishApply");
            return (Criteria) this;
        }

        public Criteria andMaterialsApplyIsNull() {
            addCriterion("materials_apply is null");
            return (Criteria) this;
        }

        public Criteria andMaterialsApplyIsNotNull() {
            addCriterion("materials_apply is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialsApplyEqualTo(Double value) {
            addCriterion("materials_apply =", value, "materialsApply");
            return (Criteria) this;
        }

        public Criteria andMaterialsApplyNotEqualTo(Double value) {
            addCriterion("materials_apply <>", value, "materialsApply");
            return (Criteria) this;
        }

        public Criteria andMaterialsApplyGreaterThan(Double value) {
            addCriterion("materials_apply >", value, "materialsApply");
            return (Criteria) this;
        }

        public Criteria andMaterialsApplyGreaterThanOrEqualTo(Double value) {
            addCriterion("materials_apply >=", value, "materialsApply");
            return (Criteria) this;
        }

        public Criteria andMaterialsApplyLessThan(Double value) {
            addCriterion("materials_apply <", value, "materialsApply");
            return (Criteria) this;
        }

        public Criteria andMaterialsApplyLessThanOrEqualTo(Double value) {
            addCriterion("materials_apply <=", value, "materialsApply");
            return (Criteria) this;
        }

        public Criteria andMaterialsApplyIn(List<Double> values) {
            addCriterion("materials_apply in", values, "materialsApply");
            return (Criteria) this;
        }

        public Criteria andMaterialsApplyNotIn(List<Double> values) {
            addCriterion("materials_apply not in", values, "materialsApply");
            return (Criteria) this;
        }

        public Criteria andMaterialsApplyBetween(Double value1, Double value2) {
            addCriterion("materials_apply between", value1, value2, "materialsApply");
            return (Criteria) this;
        }

        public Criteria andMaterialsApplyNotBetween(Double value1, Double value2) {
            addCriterion("materials_apply not between", value1, value2, "materialsApply");
            return (Criteria) this;
        }

        public Criteria andTestApplyIsNull() {
            addCriterion("test_apply is null");
            return (Criteria) this;
        }

        public Criteria andTestApplyIsNotNull() {
            addCriterion("test_apply is not null");
            return (Criteria) this;
        }

        public Criteria andTestApplyEqualTo(Double value) {
            addCriterion("test_apply =", value, "testApply");
            return (Criteria) this;
        }

        public Criteria andTestApplyNotEqualTo(Double value) {
            addCriterion("test_apply <>", value, "testApply");
            return (Criteria) this;
        }

        public Criteria andTestApplyGreaterThan(Double value) {
            addCriterion("test_apply >", value, "testApply");
            return (Criteria) this;
        }

        public Criteria andTestApplyGreaterThanOrEqualTo(Double value) {
            addCriterion("test_apply >=", value, "testApply");
            return (Criteria) this;
        }

        public Criteria andTestApplyLessThan(Double value) {
            addCriterion("test_apply <", value, "testApply");
            return (Criteria) this;
        }

        public Criteria andTestApplyLessThanOrEqualTo(Double value) {
            addCriterion("test_apply <=", value, "testApply");
            return (Criteria) this;
        }

        public Criteria andTestApplyIn(List<Double> values) {
            addCriterion("test_apply in", values, "testApply");
            return (Criteria) this;
        }

        public Criteria andTestApplyNotIn(List<Double> values) {
            addCriterion("test_apply not in", values, "testApply");
            return (Criteria) this;
        }

        public Criteria andTestApplyBetween(Double value1, Double value2) {
            addCriterion("test_apply between", value1, value2, "testApply");
            return (Criteria) this;
        }

        public Criteria andTestApplyNotBetween(Double value1, Double value2) {
            addCriterion("test_apply not between", value1, value2, "testApply");
            return (Criteria) this;
        }

        public Criteria andFuelApplyIsNull() {
            addCriterion("fuel_apply is null");
            return (Criteria) this;
        }

        public Criteria andFuelApplyIsNotNull() {
            addCriterion("fuel_apply is not null");
            return (Criteria) this;
        }

        public Criteria andFuelApplyEqualTo(Double value) {
            addCriterion("fuel_apply =", value, "fuelApply");
            return (Criteria) this;
        }

        public Criteria andFuelApplyNotEqualTo(Double value) {
            addCriterion("fuel_apply <>", value, "fuelApply");
            return (Criteria) this;
        }

        public Criteria andFuelApplyGreaterThan(Double value) {
            addCriterion("fuel_apply >", value, "fuelApply");
            return (Criteria) this;
        }

        public Criteria andFuelApplyGreaterThanOrEqualTo(Double value) {
            addCriterion("fuel_apply >=", value, "fuelApply");
            return (Criteria) this;
        }

        public Criteria andFuelApplyLessThan(Double value) {
            addCriterion("fuel_apply <", value, "fuelApply");
            return (Criteria) this;
        }

        public Criteria andFuelApplyLessThanOrEqualTo(Double value) {
            addCriterion("fuel_apply <=", value, "fuelApply");
            return (Criteria) this;
        }

        public Criteria andFuelApplyIn(List<Double> values) {
            addCriterion("fuel_apply in", values, "fuelApply");
            return (Criteria) this;
        }

        public Criteria andFuelApplyNotIn(List<Double> values) {
            addCriterion("fuel_apply not in", values, "fuelApply");
            return (Criteria) this;
        }

        public Criteria andFuelApplyBetween(Double value1, Double value2) {
            addCriterion("fuel_apply between", value1, value2, "fuelApply");
            return (Criteria) this;
        }

        public Criteria andFuelApplyNotBetween(Double value1, Double value2) {
            addCriterion("fuel_apply not between", value1, value2, "fuelApply");
            return (Criteria) this;
        }

        public Criteria andTravelApplyIsNull() {
            addCriterion("travel_apply is null");
            return (Criteria) this;
        }

        public Criteria andTravelApplyIsNotNull() {
            addCriterion("travel_apply is not null");
            return (Criteria) this;
        }

        public Criteria andTravelApplyEqualTo(Double value) {
            addCriterion("travel_apply =", value, "travelApply");
            return (Criteria) this;
        }

        public Criteria andTravelApplyNotEqualTo(Double value) {
            addCriterion("travel_apply <>", value, "travelApply");
            return (Criteria) this;
        }

        public Criteria andTravelApplyGreaterThan(Double value) {
            addCriterion("travel_apply >", value, "travelApply");
            return (Criteria) this;
        }

        public Criteria andTravelApplyGreaterThanOrEqualTo(Double value) {
            addCriterion("travel_apply >=", value, "travelApply");
            return (Criteria) this;
        }

        public Criteria andTravelApplyLessThan(Double value) {
            addCriterion("travel_apply <", value, "travelApply");
            return (Criteria) this;
        }

        public Criteria andTravelApplyLessThanOrEqualTo(Double value) {
            addCriterion("travel_apply <=", value, "travelApply");
            return (Criteria) this;
        }

        public Criteria andTravelApplyIn(List<Double> values) {
            addCriterion("travel_apply in", values, "travelApply");
            return (Criteria) this;
        }

        public Criteria andTravelApplyNotIn(List<Double> values) {
            addCriterion("travel_apply not in", values, "travelApply");
            return (Criteria) this;
        }

        public Criteria andTravelApplyBetween(Double value1, Double value2) {
            addCriterion("travel_apply between", value1, value2, "travelApply");
            return (Criteria) this;
        }

        public Criteria andTravelApplyNotBetween(Double value1, Double value2) {
            addCriterion("travel_apply not between", value1, value2, "travelApply");
            return (Criteria) this;
        }

        public Criteria andMeetApplyIsNull() {
            addCriterion("meet_apply is null");
            return (Criteria) this;
        }

        public Criteria andMeetApplyIsNotNull() {
            addCriterion("meet_apply is not null");
            return (Criteria) this;
        }

        public Criteria andMeetApplyEqualTo(Double value) {
            addCriterion("meet_apply =", value, "meetApply");
            return (Criteria) this;
        }

        public Criteria andMeetApplyNotEqualTo(Double value) {
            addCriterion("meet_apply <>", value, "meetApply");
            return (Criteria) this;
        }

        public Criteria andMeetApplyGreaterThan(Double value) {
            addCriterion("meet_apply >", value, "meetApply");
            return (Criteria) this;
        }

        public Criteria andMeetApplyGreaterThanOrEqualTo(Double value) {
            addCriterion("meet_apply >=", value, "meetApply");
            return (Criteria) this;
        }

        public Criteria andMeetApplyLessThan(Double value) {
            addCriterion("meet_apply <", value, "meetApply");
            return (Criteria) this;
        }

        public Criteria andMeetApplyLessThanOrEqualTo(Double value) {
            addCriterion("meet_apply <=", value, "meetApply");
            return (Criteria) this;
        }

        public Criteria andMeetApplyIn(List<Double> values) {
            addCriterion("meet_apply in", values, "meetApply");
            return (Criteria) this;
        }

        public Criteria andMeetApplyNotIn(List<Double> values) {
            addCriterion("meet_apply not in", values, "meetApply");
            return (Criteria) this;
        }

        public Criteria andMeetApplyBetween(Double value1, Double value2) {
            addCriterion("meet_apply between", value1, value2, "meetApply");
            return (Criteria) this;
        }

        public Criteria andMeetApplyNotBetween(Double value1, Double value2) {
            addCriterion("meet_apply not between", value1, value2, "meetApply");
            return (Criteria) this;
        }

        public Criteria andInternationalApplyIsNull() {
            addCriterion("international_apply is null");
            return (Criteria) this;
        }

        public Criteria andInternationalApplyIsNotNull() {
            addCriterion("international_apply is not null");
            return (Criteria) this;
        }

        public Criteria andInternationalApplyEqualTo(Double value) {
            addCriterion("international_apply =", value, "internationalApply");
            return (Criteria) this;
        }

        public Criteria andInternationalApplyNotEqualTo(Double value) {
            addCriterion("international_apply <>", value, "internationalApply");
            return (Criteria) this;
        }

        public Criteria andInternationalApplyGreaterThan(Double value) {
            addCriterion("international_apply >", value, "internationalApply");
            return (Criteria) this;
        }

        public Criteria andInternationalApplyGreaterThanOrEqualTo(Double value) {
            addCriterion("international_apply >=", value, "internationalApply");
            return (Criteria) this;
        }

        public Criteria andInternationalApplyLessThan(Double value) {
            addCriterion("international_apply <", value, "internationalApply");
            return (Criteria) this;
        }

        public Criteria andInternationalApplyLessThanOrEqualTo(Double value) {
            addCriterion("international_apply <=", value, "internationalApply");
            return (Criteria) this;
        }

        public Criteria andInternationalApplyIn(List<Double> values) {
            addCriterion("international_apply in", values, "internationalApply");
            return (Criteria) this;
        }

        public Criteria andInternationalApplyNotIn(List<Double> values) {
            addCriterion("international_apply not in", values, "internationalApply");
            return (Criteria) this;
        }

        public Criteria andInternationalApplyBetween(Double value1, Double value2) {
            addCriterion("international_apply between", value1, value2, "internationalApply");
            return (Criteria) this;
        }

        public Criteria andInternationalApplyNotBetween(Double value1, Double value2) {
            addCriterion("international_apply not between", value1, value2, "internationalApply");
            return (Criteria) this;
        }

        public Criteria andFacilityApplyIsNull() {
            addCriterion("facility_apply is null");
            return (Criteria) this;
        }

        public Criteria andFacilityApplyIsNotNull() {
            addCriterion("facility_apply is not null");
            return (Criteria) this;
        }

        public Criteria andFacilityApplyEqualTo(Double value) {
            addCriterion("facility_apply =", value, "facilityApply");
            return (Criteria) this;
        }

        public Criteria andFacilityApplyNotEqualTo(Double value) {
            addCriterion("facility_apply <>", value, "facilityApply");
            return (Criteria) this;
        }

        public Criteria andFacilityApplyGreaterThan(Double value) {
            addCriterion("facility_apply >", value, "facilityApply");
            return (Criteria) this;
        }

        public Criteria andFacilityApplyGreaterThanOrEqualTo(Double value) {
            addCriterion("facility_apply >=", value, "facilityApply");
            return (Criteria) this;
        }

        public Criteria andFacilityApplyLessThan(Double value) {
            addCriterion("facility_apply <", value, "facilityApply");
            return (Criteria) this;
        }

        public Criteria andFacilityApplyLessThanOrEqualTo(Double value) {
            addCriterion("facility_apply <=", value, "facilityApply");
            return (Criteria) this;
        }

        public Criteria andFacilityApplyIn(List<Double> values) {
            addCriterion("facility_apply in", values, "facilityApply");
            return (Criteria) this;
        }

        public Criteria andFacilityApplyNotIn(List<Double> values) {
            addCriterion("facility_apply not in", values, "facilityApply");
            return (Criteria) this;
        }

        public Criteria andFacilityApplyBetween(Double value1, Double value2) {
            addCriterion("facility_apply between", value1, value2, "facilityApply");
            return (Criteria) this;
        }

        public Criteria andFacilityApplyNotBetween(Double value1, Double value2) {
            addCriterion("facility_apply not between", value1, value2, "facilityApply");
            return (Criteria) this;
        }

        public Criteria andLabourApplyIsNull() {
            addCriterion("labour_apply is null");
            return (Criteria) this;
        }

        public Criteria andLabourApplyIsNotNull() {
            addCriterion("labour_apply is not null");
            return (Criteria) this;
        }

        public Criteria andLabourApplyEqualTo(Double value) {
            addCriterion("labour_apply =", value, "labourApply");
            return (Criteria) this;
        }

        public Criteria andLabourApplyNotEqualTo(Double value) {
            addCriterion("labour_apply <>", value, "labourApply");
            return (Criteria) this;
        }

        public Criteria andLabourApplyGreaterThan(Double value) {
            addCriterion("labour_apply >", value, "labourApply");
            return (Criteria) this;
        }

        public Criteria andLabourApplyGreaterThanOrEqualTo(Double value) {
            addCriterion("labour_apply >=", value, "labourApply");
            return (Criteria) this;
        }

        public Criteria andLabourApplyLessThan(Double value) {
            addCriterion("labour_apply <", value, "labourApply");
            return (Criteria) this;
        }

        public Criteria andLabourApplyLessThanOrEqualTo(Double value) {
            addCriterion("labour_apply <=", value, "labourApply");
            return (Criteria) this;
        }

        public Criteria andLabourApplyIn(List<Double> values) {
            addCriterion("labour_apply in", values, "labourApply");
            return (Criteria) this;
        }

        public Criteria andLabourApplyNotIn(List<Double> values) {
            addCriterion("labour_apply not in", values, "labourApply");
            return (Criteria) this;
        }

        public Criteria andLabourApplyBetween(Double value1, Double value2) {
            addCriterion("labour_apply between", value1, value2, "labourApply");
            return (Criteria) this;
        }

        public Criteria andLabourApplyNotBetween(Double value1, Double value2) {
            addCriterion("labour_apply not between", value1, value2, "labourApply");
            return (Criteria) this;
        }

        public Criteria andExpertApplyIsNull() {
            addCriterion("expert_apply is null");
            return (Criteria) this;
        }

        public Criteria andExpertApplyIsNotNull() {
            addCriterion("expert_apply is not null");
            return (Criteria) this;
        }

        public Criteria andExpertApplyEqualTo(Double value) {
            addCriterion("expert_apply =", value, "expertApply");
            return (Criteria) this;
        }

        public Criteria andExpertApplyNotEqualTo(Double value) {
            addCriterion("expert_apply <>", value, "expertApply");
            return (Criteria) this;
        }

        public Criteria andExpertApplyGreaterThan(Double value) {
            addCriterion("expert_apply >", value, "expertApply");
            return (Criteria) this;
        }

        public Criteria andExpertApplyGreaterThanOrEqualTo(Double value) {
            addCriterion("expert_apply >=", value, "expertApply");
            return (Criteria) this;
        }

        public Criteria andExpertApplyLessThan(Double value) {
            addCriterion("expert_apply <", value, "expertApply");
            return (Criteria) this;
        }

        public Criteria andExpertApplyLessThanOrEqualTo(Double value) {
            addCriterion("expert_apply <=", value, "expertApply");
            return (Criteria) this;
        }

        public Criteria andExpertApplyIn(List<Double> values) {
            addCriterion("expert_apply in", values, "expertApply");
            return (Criteria) this;
        }

        public Criteria andExpertApplyNotIn(List<Double> values) {
            addCriterion("expert_apply not in", values, "expertApply");
            return (Criteria) this;
        }

        public Criteria andExpertApplyBetween(Double value1, Double value2) {
            addCriterion("expert_apply between", value1, value2, "expertApply");
            return (Criteria) this;
        }

        public Criteria andExpertApplyNotBetween(Double value1, Double value2) {
            addCriterion("expert_apply not between", value1, value2, "expertApply");
            return (Criteria) this;
        }

        public Criteria andDatumApplyIsNull() {
            addCriterion("datum_apply is null");
            return (Criteria) this;
        }

        public Criteria andDatumApplyIsNotNull() {
            addCriterion("datum_apply is not null");
            return (Criteria) this;
        }

        public Criteria andDatumApplyEqualTo(Double value) {
            addCriterion("datum_apply =", value, "datumApply");
            return (Criteria) this;
        }

        public Criteria andDatumApplyNotEqualTo(Double value) {
            addCriterion("datum_apply <>", value, "datumApply");
            return (Criteria) this;
        }

        public Criteria andDatumApplyGreaterThan(Double value) {
            addCriterion("datum_apply >", value, "datumApply");
            return (Criteria) this;
        }

        public Criteria andDatumApplyGreaterThanOrEqualTo(Double value) {
            addCriterion("datum_apply >=", value, "datumApply");
            return (Criteria) this;
        }

        public Criteria andDatumApplyLessThan(Double value) {
            addCriterion("datum_apply <", value, "datumApply");
            return (Criteria) this;
        }

        public Criteria andDatumApplyLessThanOrEqualTo(Double value) {
            addCriterion("datum_apply <=", value, "datumApply");
            return (Criteria) this;
        }

        public Criteria andDatumApplyIn(List<Double> values) {
            addCriterion("datum_apply in", values, "datumApply");
            return (Criteria) this;
        }

        public Criteria andDatumApplyNotIn(List<Double> values) {
            addCriterion("datum_apply not in", values, "datumApply");
            return (Criteria) this;
        }

        public Criteria andDatumApplyBetween(Double value1, Double value2) {
            addCriterion("datum_apply between", value1, value2, "datumApply");
            return (Criteria) this;
        }

        public Criteria andDatumApplyNotBetween(Double value1, Double value2) {
            addCriterion("datum_apply not between", value1, value2, "datumApply");
            return (Criteria) this;
        }

        public Criteria andPrintApplyIsNull() {
            addCriterion("print_apply is null");
            return (Criteria) this;
        }

        public Criteria andPrintApplyIsNotNull() {
            addCriterion("print_apply is not null");
            return (Criteria) this;
        }

        public Criteria andPrintApplyEqualTo(Double value) {
            addCriterion("print_apply =", value, "printApply");
            return (Criteria) this;
        }

        public Criteria andPrintApplyNotEqualTo(Double value) {
            addCriterion("print_apply <>", value, "printApply");
            return (Criteria) this;
        }

        public Criteria andPrintApplyGreaterThan(Double value) {
            addCriterion("print_apply >", value, "printApply");
            return (Criteria) this;
        }

        public Criteria andPrintApplyGreaterThanOrEqualTo(Double value) {
            addCriterion("print_apply >=", value, "printApply");
            return (Criteria) this;
        }

        public Criteria andPrintApplyLessThan(Double value) {
            addCriterion("print_apply <", value, "printApply");
            return (Criteria) this;
        }

        public Criteria andPrintApplyLessThanOrEqualTo(Double value) {
            addCriterion("print_apply <=", value, "printApply");
            return (Criteria) this;
        }

        public Criteria andPrintApplyIn(List<Double> values) {
            addCriterion("print_apply in", values, "printApply");
            return (Criteria) this;
        }

        public Criteria andPrintApplyNotIn(List<Double> values) {
            addCriterion("print_apply not in", values, "printApply");
            return (Criteria) this;
        }

        public Criteria andPrintApplyBetween(Double value1, Double value2) {
            addCriterion("print_apply between", value1, value2, "printApply");
            return (Criteria) this;
        }

        public Criteria andPrintApplyNotBetween(Double value1, Double value2) {
            addCriterion("print_apply not between", value1, value2, "printApply");
            return (Criteria) this;
        }

        public Criteria andOtherApplyIsNull() {
            addCriterion("other_apply is null");
            return (Criteria) this;
        }

        public Criteria andOtherApplyIsNotNull() {
            addCriterion("other_apply is not null");
            return (Criteria) this;
        }

        public Criteria andOtherApplyEqualTo(Double value) {
            addCriterion("other_apply =", value, "otherApply");
            return (Criteria) this;
        }

        public Criteria andOtherApplyNotEqualTo(Double value) {
            addCriterion("other_apply <>", value, "otherApply");
            return (Criteria) this;
        }

        public Criteria andOtherApplyGreaterThan(Double value) {
            addCriterion("other_apply >", value, "otherApply");
            return (Criteria) this;
        }

        public Criteria andOtherApplyGreaterThanOrEqualTo(Double value) {
            addCriterion("other_apply >=", value, "otherApply");
            return (Criteria) this;
        }

        public Criteria andOtherApplyLessThan(Double value) {
            addCriterion("other_apply <", value, "otherApply");
            return (Criteria) this;
        }

        public Criteria andOtherApplyLessThanOrEqualTo(Double value) {
            addCriterion("other_apply <=", value, "otherApply");
            return (Criteria) this;
        }

        public Criteria andOtherApplyIn(List<Double> values) {
            addCriterion("other_apply in", values, "otherApply");
            return (Criteria) this;
        }

        public Criteria andOtherApplyNotIn(List<Double> values) {
            addCriterion("other_apply not in", values, "otherApply");
            return (Criteria) this;
        }

        public Criteria andOtherApplyBetween(Double value1, Double value2) {
            addCriterion("other_apply between", value1, value2, "otherApply");
            return (Criteria) this;
        }

        public Criteria andOtherApplyNotBetween(Double value1, Double value2) {
            addCriterion("other_apply not between", value1, value2, "otherApply");
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

        public Criteria andAuditPersonId3IsNull() {
            addCriterion("audit_person_id3 is null");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId3IsNotNull() {
            addCriterion("audit_person_id3 is not null");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId3EqualTo(String value) {
            addCriterion("audit_person_id3 =", value, "auditPersonId3");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId3NotEqualTo(String value) {
            addCriterion("audit_person_id3 <>", value, "auditPersonId3");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId3GreaterThan(String value) {
            addCriterion("audit_person_id3 >", value, "auditPersonId3");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId3GreaterThanOrEqualTo(String value) {
            addCriterion("audit_person_id3 >=", value, "auditPersonId3");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId3LessThan(String value) {
            addCriterion("audit_person_id3 <", value, "auditPersonId3");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId3LessThanOrEqualTo(String value) {
            addCriterion("audit_person_id3 <=", value, "auditPersonId3");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId3Like(String value) {
            addCriterion("audit_person_id3 like", value, "auditPersonId3");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId3NotLike(String value) {
            addCriterion("audit_person_id3 not like", value, "auditPersonId3");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId3In(List<String> values) {
            addCriterion("audit_person_id3 in", values, "auditPersonId3");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId3NotIn(List<String> values) {
            addCriterion("audit_person_id3 not in", values, "auditPersonId3");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId3Between(String value1, String value2) {
            addCriterion("audit_person_id3 between", value1, value2, "auditPersonId3");
            return (Criteria) this;
        }

        public Criteria andAuditPersonId3NotBetween(String value1, String value2) {
            addCriterion("audit_person_id3 not between", value1, value2, "auditPersonId3");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion3IsNull() {
            addCriterion("audit_poinion3 is null");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion3IsNotNull() {
            addCriterion("audit_poinion3 is not null");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion3EqualTo(String value) {
            addCriterion("audit_poinion3 =", value, "auditPoinion3");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion3NotEqualTo(String value) {
            addCriterion("audit_poinion3 <>", value, "auditPoinion3");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion3GreaterThan(String value) {
            addCriterion("audit_poinion3 >", value, "auditPoinion3");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion3GreaterThanOrEqualTo(String value) {
            addCriterion("audit_poinion3 >=", value, "auditPoinion3");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion3LessThan(String value) {
            addCriterion("audit_poinion3 <", value, "auditPoinion3");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion3LessThanOrEqualTo(String value) {
            addCriterion("audit_poinion3 <=", value, "auditPoinion3");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion3Like(String value) {
            addCriterion("audit_poinion3 like", value, "auditPoinion3");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion3NotLike(String value) {
            addCriterion("audit_poinion3 not like", value, "auditPoinion3");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion3In(List<String> values) {
            addCriterion("audit_poinion3 in", values, "auditPoinion3");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion3NotIn(List<String> values) {
            addCriterion("audit_poinion3 not in", values, "auditPoinion3");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion3Between(String value1, String value2) {
            addCriterion("audit_poinion3 between", value1, value2, "auditPoinion3");
            return (Criteria) this;
        }

        public Criteria andAuditPoinion3NotBetween(String value1, String value2) {
            addCriterion("audit_poinion3 not between", value1, value2, "auditPoinion3");
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