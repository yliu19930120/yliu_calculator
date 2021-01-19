package com.yliu.calculate;

import com.yliu.bean.NetValue;

import java.util.List;

public interface NetValueCalculator {

    Double calculate(List<NetValue> netValueList);

}
