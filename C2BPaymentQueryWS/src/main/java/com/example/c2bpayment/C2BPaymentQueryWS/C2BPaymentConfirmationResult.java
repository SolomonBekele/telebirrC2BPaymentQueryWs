package com.example.c2bpayment.C2BPaymentQueryWS;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "C2BPaymentConfirmationResult", namespace = "http://cps.huawei.com/cpsinterface/c2bpayment")
public class C2BPaymentConfirmationResult {

    private int result;

    @XmlElement
    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}

