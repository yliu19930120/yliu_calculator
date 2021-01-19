package com.yliu.bean;

import java.time.LocalDate;

public interface NetValue {

    void setValue(Double value);
    Double getValue();

    void setRate(Double rate);
    Double getRate();

    void setDate(LocalDate date);
    LocalDate getDate();

    void setDatePrev(LocalDate datePrev);
    LocalDate getDatePrev();

    void setValuePrev(Double valuePrev);
    Double getValuePrev();

}
