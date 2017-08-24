package com.hebeu.keyan.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BudgetAdjustExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BudgetAdjustExample() {
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

        public Criteria andBudgetIdIsNull() {
            addCriterion("budget_id is null");
            return (Criteria) this;
        }

        public Criteria andBudgetIdIsNotNull() {
            addCriterion("budget_id is not null");
            return (Criteria) this;
        }

        public Criteria andBudgetIdEqualTo(Integer value) {
            addCriterion("budget_id =", value, "budgetId");
            return (Criteria) this;
        }

        public Criteria andBudgetIdNotEqualTo(Integer value) {
            addCriterion("budget_id <>", value, "budgetId");
            return (Criteria) this;
        }

        public Criteria andBudgetIdGreaterThan(Integer value) {
            addCriterion("budget_id >", value, "budgetId");
            return (Criteria) this;
        }

        public Criteria andBudgetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("budget_id >=", value, "budgetId");
            return (Criteria) this;
        }

        public Criteria andBudgetIdLessThan(Integer value) {
            addCriterion("budget_id <", value, "budgetId");
            return (Criteria) this;
        }

        public Criteria andBudgetIdLessThanOrEqualTo(Integer value) {
            addCriterion("budget_id <=", value, "budgetId");
            return (Criteria) this;
        }

        public Criteria andBudgetIdIn(List<Integer> values) {
            addCriterion("budget_id in", values, "budgetId");
            return (Criteria) this;
        }

        public Criteria andBudgetIdNotIn(List<Integer> values) {
            addCriterion("budget_id not in", values, "budgetId");
            return (Criteria) this;
        }

        public Criteria andBudgetIdBetween(Integer value1, Integer value2) {
            addCriterion("budget_id between", value1, value2, "budgetId");
            return (Criteria) this;
        }

        public Criteria andBudgetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("budget_id not between", value1, value2, "budgetId");
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

        public Criteria andPublishTotalIsNull() {
            addCriterion("publish_total is null");
            return (Criteria) this;
        }

        public Criteria andPublishTotalIsNotNull() {
            addCriterion("publish_total is not null");
            return (Criteria) this;
        }

        public Criteria andPublishTotalEqualTo(Double value) {
            addCriterion("publish_total =", value, "publishTotal");
            return (Criteria) this;
        }

        public Criteria andPublishTotalNotEqualTo(Double value) {
            addCriterion("publish_total <>", value, "publishTotal");
            return (Criteria) this;
        }

        public Criteria andPublishTotalGreaterThan(Double value) {
            addCriterion("publish_total >", value, "publishTotal");
            return (Criteria) this;
        }

        public Criteria andPublishTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("publish_total >=", value, "publishTotal");
            return (Criteria) this;
        }

        public Criteria andPublishTotalLessThan(Double value) {
            addCriterion("publish_total <", value, "publishTotal");
            return (Criteria) this;
        }

        public Criteria andPublishTotalLessThanOrEqualTo(Double value) {
            addCriterion("publish_total <=", value, "publishTotal");
            return (Criteria) this;
        }

        public Criteria andPublishTotalIn(List<Double> values) {
            addCriterion("publish_total in", values, "publishTotal");
            return (Criteria) this;
        }

        public Criteria andPublishTotalNotIn(List<Double> values) {
            addCriterion("publish_total not in", values, "publishTotal");
            return (Criteria) this;
        }

        public Criteria andPublishTotalBetween(Double value1, Double value2) {
            addCriterion("publish_total between", value1, value2, "publishTotal");
            return (Criteria) this;
        }

        public Criteria andPublishTotalNotBetween(Double value1, Double value2) {
            addCriterion("publish_total not between", value1, value2, "publishTotal");
            return (Criteria) this;
        }

        public Criteria andMaterialsTotalIsNull() {
            addCriterion("materials_total is null");
            return (Criteria) this;
        }

        public Criteria andMaterialsTotalIsNotNull() {
            addCriterion("materials_total is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialsTotalEqualTo(Double value) {
            addCriterion("materials_total =", value, "materialsTotal");
            return (Criteria) this;
        }

        public Criteria andMaterialsTotalNotEqualTo(Double value) {
            addCriterion("materials_total <>", value, "materialsTotal");
            return (Criteria) this;
        }

        public Criteria andMaterialsTotalGreaterThan(Double value) {
            addCriterion("materials_total >", value, "materialsTotal");
            return (Criteria) this;
        }

        public Criteria andMaterialsTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("materials_total >=", value, "materialsTotal");
            return (Criteria) this;
        }

        public Criteria andMaterialsTotalLessThan(Double value) {
            addCriterion("materials_total <", value, "materialsTotal");
            return (Criteria) this;
        }

        public Criteria andMaterialsTotalLessThanOrEqualTo(Double value) {
            addCriterion("materials_total <=", value, "materialsTotal");
            return (Criteria) this;
        }

        public Criteria andMaterialsTotalIn(List<Double> values) {
            addCriterion("materials_total in", values, "materialsTotal");
            return (Criteria) this;
        }

        public Criteria andMaterialsTotalNotIn(List<Double> values) {
            addCriterion("materials_total not in", values, "materialsTotal");
            return (Criteria) this;
        }

        public Criteria andMaterialsTotalBetween(Double value1, Double value2) {
            addCriterion("materials_total between", value1, value2, "materialsTotal");
            return (Criteria) this;
        }

        public Criteria andMaterialsTotalNotBetween(Double value1, Double value2) {
            addCriterion("materials_total not between", value1, value2, "materialsTotal");
            return (Criteria) this;
        }

        public Criteria andTestTotalIsNull() {
            addCriterion("test_total is null");
            return (Criteria) this;
        }

        public Criteria andTestTotalIsNotNull() {
            addCriterion("test_total is not null");
            return (Criteria) this;
        }

        public Criteria andTestTotalEqualTo(Double value) {
            addCriterion("test_total =", value, "testTotal");
            return (Criteria) this;
        }

        public Criteria andTestTotalNotEqualTo(Double value) {
            addCriterion("test_total <>", value, "testTotal");
            return (Criteria) this;
        }

        public Criteria andTestTotalGreaterThan(Double value) {
            addCriterion("test_total >", value, "testTotal");
            return (Criteria) this;
        }

        public Criteria andTestTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("test_total >=", value, "testTotal");
            return (Criteria) this;
        }

        public Criteria andTestTotalLessThan(Double value) {
            addCriterion("test_total <", value, "testTotal");
            return (Criteria) this;
        }

        public Criteria andTestTotalLessThanOrEqualTo(Double value) {
            addCriterion("test_total <=", value, "testTotal");
            return (Criteria) this;
        }

        public Criteria andTestTotalIn(List<Double> values) {
            addCriterion("test_total in", values, "testTotal");
            return (Criteria) this;
        }

        public Criteria andTestTotalNotIn(List<Double> values) {
            addCriterion("test_total not in", values, "testTotal");
            return (Criteria) this;
        }

        public Criteria andTestTotalBetween(Double value1, Double value2) {
            addCriterion("test_total between", value1, value2, "testTotal");
            return (Criteria) this;
        }

        public Criteria andTestTotalNotBetween(Double value1, Double value2) {
            addCriterion("test_total not between", value1, value2, "testTotal");
            return (Criteria) this;
        }

        public Criteria andFuelTotalIsNull() {
            addCriterion("fuel_total is null");
            return (Criteria) this;
        }

        public Criteria andFuelTotalIsNotNull() {
            addCriterion("fuel_total is not null");
            return (Criteria) this;
        }

        public Criteria andFuelTotalEqualTo(Double value) {
            addCriterion("fuel_total =", value, "fuelTotal");
            return (Criteria) this;
        }

        public Criteria andFuelTotalNotEqualTo(Double value) {
            addCriterion("fuel_total <>", value, "fuelTotal");
            return (Criteria) this;
        }

        public Criteria andFuelTotalGreaterThan(Double value) {
            addCriterion("fuel_total >", value, "fuelTotal");
            return (Criteria) this;
        }

        public Criteria andFuelTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("fuel_total >=", value, "fuelTotal");
            return (Criteria) this;
        }

        public Criteria andFuelTotalLessThan(Double value) {
            addCriterion("fuel_total <", value, "fuelTotal");
            return (Criteria) this;
        }

        public Criteria andFuelTotalLessThanOrEqualTo(Double value) {
            addCriterion("fuel_total <=", value, "fuelTotal");
            return (Criteria) this;
        }

        public Criteria andFuelTotalIn(List<Double> values) {
            addCriterion("fuel_total in", values, "fuelTotal");
            return (Criteria) this;
        }

        public Criteria andFuelTotalNotIn(List<Double> values) {
            addCriterion("fuel_total not in", values, "fuelTotal");
            return (Criteria) this;
        }

        public Criteria andFuelTotalBetween(Double value1, Double value2) {
            addCriterion("fuel_total between", value1, value2, "fuelTotal");
            return (Criteria) this;
        }

        public Criteria andFuelTotalNotBetween(Double value1, Double value2) {
            addCriterion("fuel_total not between", value1, value2, "fuelTotal");
            return (Criteria) this;
        }

        public Criteria andTravelTotalIsNull() {
            addCriterion("travel_total is null");
            return (Criteria) this;
        }

        public Criteria andTravelTotalIsNotNull() {
            addCriterion("travel_total is not null");
            return (Criteria) this;
        }

        public Criteria andTravelTotalEqualTo(Double value) {
            addCriterion("travel_total =", value, "travelTotal");
            return (Criteria) this;
        }

        public Criteria andTravelTotalNotEqualTo(Double value) {
            addCriterion("travel_total <>", value, "travelTotal");
            return (Criteria) this;
        }

        public Criteria andTravelTotalGreaterThan(Double value) {
            addCriterion("travel_total >", value, "travelTotal");
            return (Criteria) this;
        }

        public Criteria andTravelTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("travel_total >=", value, "travelTotal");
            return (Criteria) this;
        }

        public Criteria andTravelTotalLessThan(Double value) {
            addCriterion("travel_total <", value, "travelTotal");
            return (Criteria) this;
        }

        public Criteria andTravelTotalLessThanOrEqualTo(Double value) {
            addCriterion("travel_total <=", value, "travelTotal");
            return (Criteria) this;
        }

        public Criteria andTravelTotalIn(List<Double> values) {
            addCriterion("travel_total in", values, "travelTotal");
            return (Criteria) this;
        }

        public Criteria andTravelTotalNotIn(List<Double> values) {
            addCriterion("travel_total not in", values, "travelTotal");
            return (Criteria) this;
        }

        public Criteria andTravelTotalBetween(Double value1, Double value2) {
            addCriterion("travel_total between", value1, value2, "travelTotal");
            return (Criteria) this;
        }

        public Criteria andTravelTotalNotBetween(Double value1, Double value2) {
            addCriterion("travel_total not between", value1, value2, "travelTotal");
            return (Criteria) this;
        }

        public Criteria andMeetTotalIsNull() {
            addCriterion("meet_total is null");
            return (Criteria) this;
        }

        public Criteria andMeetTotalIsNotNull() {
            addCriterion("meet_total is not null");
            return (Criteria) this;
        }

        public Criteria andMeetTotalEqualTo(Double value) {
            addCriterion("meet_total =", value, "meetTotal");
            return (Criteria) this;
        }

        public Criteria andMeetTotalNotEqualTo(Double value) {
            addCriterion("meet_total <>", value, "meetTotal");
            return (Criteria) this;
        }

        public Criteria andMeetTotalGreaterThan(Double value) {
            addCriterion("meet_total >", value, "meetTotal");
            return (Criteria) this;
        }

        public Criteria andMeetTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("meet_total >=", value, "meetTotal");
            return (Criteria) this;
        }

        public Criteria andMeetTotalLessThan(Double value) {
            addCriterion("meet_total <", value, "meetTotal");
            return (Criteria) this;
        }

        public Criteria andMeetTotalLessThanOrEqualTo(Double value) {
            addCriterion("meet_total <=", value, "meetTotal");
            return (Criteria) this;
        }

        public Criteria andMeetTotalIn(List<Double> values) {
            addCriterion("meet_total in", values, "meetTotal");
            return (Criteria) this;
        }

        public Criteria andMeetTotalNotIn(List<Double> values) {
            addCriterion("meet_total not in", values, "meetTotal");
            return (Criteria) this;
        }

        public Criteria andMeetTotalBetween(Double value1, Double value2) {
            addCriterion("meet_total between", value1, value2, "meetTotal");
            return (Criteria) this;
        }

        public Criteria andMeetTotalNotBetween(Double value1, Double value2) {
            addCriterion("meet_total not between", value1, value2, "meetTotal");
            return (Criteria) this;
        }

        public Criteria andInternationalTotalIsNull() {
            addCriterion("international_total is null");
            return (Criteria) this;
        }

        public Criteria andInternationalTotalIsNotNull() {
            addCriterion("international_total is not null");
            return (Criteria) this;
        }

        public Criteria andInternationalTotalEqualTo(Double value) {
            addCriterion("international_total =", value, "internationalTotal");
            return (Criteria) this;
        }

        public Criteria andInternationalTotalNotEqualTo(Double value) {
            addCriterion("international_total <>", value, "internationalTotal");
            return (Criteria) this;
        }

        public Criteria andInternationalTotalGreaterThan(Double value) {
            addCriterion("international_total >", value, "internationalTotal");
            return (Criteria) this;
        }

        public Criteria andInternationalTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("international_total >=", value, "internationalTotal");
            return (Criteria) this;
        }

        public Criteria andInternationalTotalLessThan(Double value) {
            addCriterion("international_total <", value, "internationalTotal");
            return (Criteria) this;
        }

        public Criteria andInternationalTotalLessThanOrEqualTo(Double value) {
            addCriterion("international_total <=", value, "internationalTotal");
            return (Criteria) this;
        }

        public Criteria andInternationalTotalIn(List<Double> values) {
            addCriterion("international_total in", values, "internationalTotal");
            return (Criteria) this;
        }

        public Criteria andInternationalTotalNotIn(List<Double> values) {
            addCriterion("international_total not in", values, "internationalTotal");
            return (Criteria) this;
        }

        public Criteria andInternationalTotalBetween(Double value1, Double value2) {
            addCriterion("international_total between", value1, value2, "internationalTotal");
            return (Criteria) this;
        }

        public Criteria andInternationalTotalNotBetween(Double value1, Double value2) {
            addCriterion("international_total not between", value1, value2, "internationalTotal");
            return (Criteria) this;
        }

        public Criteria andFacilityTotalIsNull() {
            addCriterion("facility_total is null");
            return (Criteria) this;
        }

        public Criteria andFacilityTotalIsNotNull() {
            addCriterion("facility_total is not null");
            return (Criteria) this;
        }

        public Criteria andFacilityTotalEqualTo(Double value) {
            addCriterion("facility_total =", value, "facilityTotal");
            return (Criteria) this;
        }

        public Criteria andFacilityTotalNotEqualTo(Double value) {
            addCriterion("facility_total <>", value, "facilityTotal");
            return (Criteria) this;
        }

        public Criteria andFacilityTotalGreaterThan(Double value) {
            addCriterion("facility_total >", value, "facilityTotal");
            return (Criteria) this;
        }

        public Criteria andFacilityTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("facility_total >=", value, "facilityTotal");
            return (Criteria) this;
        }

        public Criteria andFacilityTotalLessThan(Double value) {
            addCriterion("facility_total <", value, "facilityTotal");
            return (Criteria) this;
        }

        public Criteria andFacilityTotalLessThanOrEqualTo(Double value) {
            addCriterion("facility_total <=", value, "facilityTotal");
            return (Criteria) this;
        }

        public Criteria andFacilityTotalIn(List<Double> values) {
            addCriterion("facility_total in", values, "facilityTotal");
            return (Criteria) this;
        }

        public Criteria andFacilityTotalNotIn(List<Double> values) {
            addCriterion("facility_total not in", values, "facilityTotal");
            return (Criteria) this;
        }

        public Criteria andFacilityTotalBetween(Double value1, Double value2) {
            addCriterion("facility_total between", value1, value2, "facilityTotal");
            return (Criteria) this;
        }

        public Criteria andFacilityTotalNotBetween(Double value1, Double value2) {
            addCriterion("facility_total not between", value1, value2, "facilityTotal");
            return (Criteria) this;
        }

        public Criteria andLabourTotalIsNull() {
            addCriterion("labour_total is null");
            return (Criteria) this;
        }

        public Criteria andLabourTotalIsNotNull() {
            addCriterion("labour_total is not null");
            return (Criteria) this;
        }

        public Criteria andLabourTotalEqualTo(Double value) {
            addCriterion("labour_total =", value, "labourTotal");
            return (Criteria) this;
        }

        public Criteria andLabourTotalNotEqualTo(Double value) {
            addCriterion("labour_total <>", value, "labourTotal");
            return (Criteria) this;
        }

        public Criteria andLabourTotalGreaterThan(Double value) {
            addCriterion("labour_total >", value, "labourTotal");
            return (Criteria) this;
        }

        public Criteria andLabourTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("labour_total >=", value, "labourTotal");
            return (Criteria) this;
        }

        public Criteria andLabourTotalLessThan(Double value) {
            addCriterion("labour_total <", value, "labourTotal");
            return (Criteria) this;
        }

        public Criteria andLabourTotalLessThanOrEqualTo(Double value) {
            addCriterion("labour_total <=", value, "labourTotal");
            return (Criteria) this;
        }

        public Criteria andLabourTotalIn(List<Double> values) {
            addCriterion("labour_total in", values, "labourTotal");
            return (Criteria) this;
        }

        public Criteria andLabourTotalNotIn(List<Double> values) {
            addCriterion("labour_total not in", values, "labourTotal");
            return (Criteria) this;
        }

        public Criteria andLabourTotalBetween(Double value1, Double value2) {
            addCriterion("labour_total between", value1, value2, "labourTotal");
            return (Criteria) this;
        }

        public Criteria andLabourTotalNotBetween(Double value1, Double value2) {
            addCriterion("labour_total not between", value1, value2, "labourTotal");
            return (Criteria) this;
        }

        public Criteria andExpertTotalIsNull() {
            addCriterion("expert_total is null");
            return (Criteria) this;
        }

        public Criteria andExpertTotalIsNotNull() {
            addCriterion("expert_total is not null");
            return (Criteria) this;
        }

        public Criteria andExpertTotalEqualTo(Double value) {
            addCriterion("expert_total =", value, "expertTotal");
            return (Criteria) this;
        }

        public Criteria andExpertTotalNotEqualTo(Double value) {
            addCriterion("expert_total <>", value, "expertTotal");
            return (Criteria) this;
        }

        public Criteria andExpertTotalGreaterThan(Double value) {
            addCriterion("expert_total >", value, "expertTotal");
            return (Criteria) this;
        }

        public Criteria andExpertTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("expert_total >=", value, "expertTotal");
            return (Criteria) this;
        }

        public Criteria andExpertTotalLessThan(Double value) {
            addCriterion("expert_total <", value, "expertTotal");
            return (Criteria) this;
        }

        public Criteria andExpertTotalLessThanOrEqualTo(Double value) {
            addCriterion("expert_total <=", value, "expertTotal");
            return (Criteria) this;
        }

        public Criteria andExpertTotalIn(List<Double> values) {
            addCriterion("expert_total in", values, "expertTotal");
            return (Criteria) this;
        }

        public Criteria andExpertTotalNotIn(List<Double> values) {
            addCriterion("expert_total not in", values, "expertTotal");
            return (Criteria) this;
        }

        public Criteria andExpertTotalBetween(Double value1, Double value2) {
            addCriterion("expert_total between", value1, value2, "expertTotal");
            return (Criteria) this;
        }

        public Criteria andExpertTotalNotBetween(Double value1, Double value2) {
            addCriterion("expert_total not between", value1, value2, "expertTotal");
            return (Criteria) this;
        }

        public Criteria andDatumTotalIsNull() {
            addCriterion("datum_total is null");
            return (Criteria) this;
        }

        public Criteria andDatumTotalIsNotNull() {
            addCriterion("datum_total is not null");
            return (Criteria) this;
        }

        public Criteria andDatumTotalEqualTo(Double value) {
            addCriterion("datum_total =", value, "datumTotal");
            return (Criteria) this;
        }

        public Criteria andDatumTotalNotEqualTo(Double value) {
            addCriterion("datum_total <>", value, "datumTotal");
            return (Criteria) this;
        }

        public Criteria andDatumTotalGreaterThan(Double value) {
            addCriterion("datum_total >", value, "datumTotal");
            return (Criteria) this;
        }

        public Criteria andDatumTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("datum_total >=", value, "datumTotal");
            return (Criteria) this;
        }

        public Criteria andDatumTotalLessThan(Double value) {
            addCriterion("datum_total <", value, "datumTotal");
            return (Criteria) this;
        }

        public Criteria andDatumTotalLessThanOrEqualTo(Double value) {
            addCriterion("datum_total <=", value, "datumTotal");
            return (Criteria) this;
        }

        public Criteria andDatumTotalIn(List<Double> values) {
            addCriterion("datum_total in", values, "datumTotal");
            return (Criteria) this;
        }

        public Criteria andDatumTotalNotIn(List<Double> values) {
            addCriterion("datum_total not in", values, "datumTotal");
            return (Criteria) this;
        }

        public Criteria andDatumTotalBetween(Double value1, Double value2) {
            addCriterion("datum_total between", value1, value2, "datumTotal");
            return (Criteria) this;
        }

        public Criteria andDatumTotalNotBetween(Double value1, Double value2) {
            addCriterion("datum_total not between", value1, value2, "datumTotal");
            return (Criteria) this;
        }

        public Criteria andPrintTotalIsNull() {
            addCriterion("print_total is null");
            return (Criteria) this;
        }

        public Criteria andPrintTotalIsNotNull() {
            addCriterion("print_total is not null");
            return (Criteria) this;
        }

        public Criteria andPrintTotalEqualTo(Double value) {
            addCriterion("print_total =", value, "printTotal");
            return (Criteria) this;
        }

        public Criteria andPrintTotalNotEqualTo(Double value) {
            addCriterion("print_total <>", value, "printTotal");
            return (Criteria) this;
        }

        public Criteria andPrintTotalGreaterThan(Double value) {
            addCriterion("print_total >", value, "printTotal");
            return (Criteria) this;
        }

        public Criteria andPrintTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("print_total >=", value, "printTotal");
            return (Criteria) this;
        }

        public Criteria andPrintTotalLessThan(Double value) {
            addCriterion("print_total <", value, "printTotal");
            return (Criteria) this;
        }

        public Criteria andPrintTotalLessThanOrEqualTo(Double value) {
            addCriterion("print_total <=", value, "printTotal");
            return (Criteria) this;
        }

        public Criteria andPrintTotalIn(List<Double> values) {
            addCriterion("print_total in", values, "printTotal");
            return (Criteria) this;
        }

        public Criteria andPrintTotalNotIn(List<Double> values) {
            addCriterion("print_total not in", values, "printTotal");
            return (Criteria) this;
        }

        public Criteria andPrintTotalBetween(Double value1, Double value2) {
            addCriterion("print_total between", value1, value2, "printTotal");
            return (Criteria) this;
        }

        public Criteria andPrintTotalNotBetween(Double value1, Double value2) {
            addCriterion("print_total not between", value1, value2, "printTotal");
            return (Criteria) this;
        }

        public Criteria andOtherTotalIsNull() {
            addCriterion("other_total is null");
            return (Criteria) this;
        }

        public Criteria andOtherTotalIsNotNull() {
            addCriterion("other_total is not null");
            return (Criteria) this;
        }

        public Criteria andOtherTotalEqualTo(Double value) {
            addCriterion("other_total =", value, "otherTotal");
            return (Criteria) this;
        }

        public Criteria andOtherTotalNotEqualTo(Double value) {
            addCriterion("other_total <>", value, "otherTotal");
            return (Criteria) this;
        }

        public Criteria andOtherTotalGreaterThan(Double value) {
            addCriterion("other_total >", value, "otherTotal");
            return (Criteria) this;
        }

        public Criteria andOtherTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("other_total >=", value, "otherTotal");
            return (Criteria) this;
        }

        public Criteria andOtherTotalLessThan(Double value) {
            addCriterion("other_total <", value, "otherTotal");
            return (Criteria) this;
        }

        public Criteria andOtherTotalLessThanOrEqualTo(Double value) {
            addCriterion("other_total <=", value, "otherTotal");
            return (Criteria) this;
        }

        public Criteria andOtherTotalIn(List<Double> values) {
            addCriterion("other_total in", values, "otherTotal");
            return (Criteria) this;
        }

        public Criteria andOtherTotalNotIn(List<Double> values) {
            addCriterion("other_total not in", values, "otherTotal");
            return (Criteria) this;
        }

        public Criteria andOtherTotalBetween(Double value1, Double value2) {
            addCriterion("other_total between", value1, value2, "otherTotal");
            return (Criteria) this;
        }

        public Criteria andOtherTotalNotBetween(Double value1, Double value2) {
            addCriterion("other_total not between", value1, value2, "otherTotal");
            return (Criteria) this;
        }

        public Criteria andManageTotalIsNull() {
            addCriterion("manage_total is null");
            return (Criteria) this;
        }

        public Criteria andManageTotalIsNotNull() {
            addCriterion("manage_total is not null");
            return (Criteria) this;
        }

        public Criteria andManageTotalEqualTo(Double value) {
            addCriterion("manage_total =", value, "manageTotal");
            return (Criteria) this;
        }

        public Criteria andManageTotalNotEqualTo(Double value) {
            addCriterion("manage_total <>", value, "manageTotal");
            return (Criteria) this;
        }

        public Criteria andManageTotalGreaterThan(Double value) {
            addCriterion("manage_total >", value, "manageTotal");
            return (Criteria) this;
        }

        public Criteria andManageTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("manage_total >=", value, "manageTotal");
            return (Criteria) this;
        }

        public Criteria andManageTotalLessThan(Double value) {
            addCriterion("manage_total <", value, "manageTotal");
            return (Criteria) this;
        }

        public Criteria andManageTotalLessThanOrEqualTo(Double value) {
            addCriterion("manage_total <=", value, "manageTotal");
            return (Criteria) this;
        }

        public Criteria andManageTotalIn(List<Double> values) {
            addCriterion("manage_total in", values, "manageTotal");
            return (Criteria) this;
        }

        public Criteria andManageTotalNotIn(List<Double> values) {
            addCriterion("manage_total not in", values, "manageTotal");
            return (Criteria) this;
        }

        public Criteria andManageTotalBetween(Double value1, Double value2) {
            addCriterion("manage_total between", value1, value2, "manageTotal");
            return (Criteria) this;
        }

        public Criteria andManageTotalNotBetween(Double value1, Double value2) {
            addCriterion("manage_total not between", value1, value2, "manageTotal");
            return (Criteria) this;
        }

        public Criteria andPostTotalIsNull() {
            addCriterion("post_total is null");
            return (Criteria) this;
        }

        public Criteria andPostTotalIsNotNull() {
            addCriterion("post_total is not null");
            return (Criteria) this;
        }

        public Criteria andPostTotalEqualTo(Double value) {
            addCriterion("post_total =", value, "postTotal");
            return (Criteria) this;
        }

        public Criteria andPostTotalNotEqualTo(Double value) {
            addCriterion("post_total <>", value, "postTotal");
            return (Criteria) this;
        }

        public Criteria andPostTotalGreaterThan(Double value) {
            addCriterion("post_total >", value, "postTotal");
            return (Criteria) this;
        }

        public Criteria andPostTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("post_total >=", value, "postTotal");
            return (Criteria) this;
        }

        public Criteria andPostTotalLessThan(Double value) {
            addCriterion("post_total <", value, "postTotal");
            return (Criteria) this;
        }

        public Criteria andPostTotalLessThanOrEqualTo(Double value) {
            addCriterion("post_total <=", value, "postTotal");
            return (Criteria) this;
        }

        public Criteria andPostTotalIn(List<Double> values) {
            addCriterion("post_total in", values, "postTotal");
            return (Criteria) this;
        }

        public Criteria andPostTotalNotIn(List<Double> values) {
            addCriterion("post_total not in", values, "postTotal");
            return (Criteria) this;
        }

        public Criteria andPostTotalBetween(Double value1, Double value2) {
            addCriterion("post_total between", value1, value2, "postTotal");
            return (Criteria) this;
        }

        public Criteria andPostTotalNotBetween(Double value1, Double value2) {
            addCriterion("post_total not between", value1, value2, "postTotal");
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