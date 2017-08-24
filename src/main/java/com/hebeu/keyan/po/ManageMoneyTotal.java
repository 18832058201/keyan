package com.hebeu.keyan.po;

public class ManageMoneyTotal {
    private Integer id;

    private Integer collegeId;

    private Integer year;

    private Double totalMoney;

    private Double availMoney;

    private Double applyMoney;

    private Double paymentMoney;

    private Double availApply;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Double getAvailMoney() {
        return availMoney;
    }

    public void setAvailMoney(Double availMoney) {
        this.availMoney = availMoney;
    }

    public Double getApplyMoney() {
        return applyMoney;
    }

    public void setApplyMoney(Double applyMoney) {
        this.applyMoney = applyMoney;
    }

    public Double getPaymentMoney() {
        return paymentMoney;
    }

    public void setPaymentMoney(Double paymentMoney) {
        this.paymentMoney = paymentMoney;
    }

    public Double getAvailApply() {
        return availApply;
    }

    public void setAvailApply(Double availApply) {
        this.availApply = availApply;
    }
}