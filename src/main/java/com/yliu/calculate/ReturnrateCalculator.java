package com.yliu.calculate;

import com.yliu.bean.NetValue;

import java.util.List;

public class ReturnrateCalculator implements NetValueCalculator {

    @Override
    public Double calculate(List<NetValue> netValueList) {
        if(netValueList.isEmpty()){
            return null;
        }
        Double valuePrev = netValueList.get(0).getValuePrev();
        valuePrev = valuePrev==null?netValueList.get(0).getValue():valuePrev;

        return netValueList.get(netValueList.size()-1).getValue()/valuePrev-1;
    }
}
