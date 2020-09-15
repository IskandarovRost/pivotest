package com.company.pivotest.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "PIVOTEST_TIPS")
@Entity(name = "pivotest_Tips")
public class Tips extends StandardEntity {
    private static final long serialVersionUID = 4358159923744607121L;

    @Column(name = "ROW_")
    protected Integer row;

    @Column(name = "TOTAL_BILL")
    protected Double totalBill;

    @Column(name = "TIP")
    protected String tip;

    @Column(name = "SEX")
    protected String sex;

    @Column(name = "SMOKER")
    protected Integer smoker;

    @Column(name = "DAY_")
    protected String day;

    @Column(name = "TIME_")
    protected String time;

    @Column(name = "SIZE_")
    protected Integer size;

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Time getTime() {
        return time == null ? null : Time.fromId(time);
    }

    public void setTime(Time time) {
        this.time = time == null ? null : time.getId();
    }

    public DayOfWeek getDay() {
        return day == null ? null : DayOfWeek.fromId(day);
    }

    public void setDay(DayOfWeek day) {
        this.day = day == null ? null : day.getId();
    }

    public Smokes getSmoker() {
        return smoker == null ? null : Smokes.fromId(smoker);
    }

    public void setSmoker(Smokes smoker) {
        this.smoker = smoker == null ? null : smoker.getId();
    }

    public Sex getSex() {
        return sex == null ? null : Sex.fromId(sex);
    }

    public void setSex(Sex sex) {
        this.sex = sex == null ? null : sex.getId();
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getRow() {
        return row;
    }

    public Double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(Double totalBill) {
        this.totalBill = totalBill;
    }

}