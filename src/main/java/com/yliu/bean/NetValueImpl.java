package com.yliu.bean;

import java.time.LocalDate;

public class NetValueImpl implements NetValue{

    private Double value;
    private Double valuePrev;
    private Double rate;
    private LocalDate date;
    private LocalDate datePrev;


    public NetValueImpl() {
    }

    public NetValueImpl(Double value, LocalDate date) {
        this.value = value;
        this.date = date;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Double getValuePrev() {
        return valuePrev;
    }

    public void setValuePrev(Double valuePrev) {
        this.valuePrev = valuePrev;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDatePrev() {
        return datePrev;
    }

    public void setDatePrev(LocalDate datePrev) {
        this.datePrev = datePrev;
    }
}
