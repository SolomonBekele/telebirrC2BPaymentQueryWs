package com.example.c2bpayment.C2BPaymentQueryWS;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "C2BPaymentValidationResult", namespace = "http://cps.huawei.com/cpsinterface/c2bpayment")
public class C2BPaymentValidationResult {

    private String resultCode;
    private String resultDesc;
    private String thirdPartyTransID;

    @XmlElement
    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    @XmlElement
    public String getResultDesc() {
        return resultDesc;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

    @XmlElement
    public String getThirdPartyTransID() {
        return thirdPartyTransID;
    }

    public void setThirdPartyTransID(String thirdPartyTransID) {
        this.thirdPartyTransID = thirdPartyTransID;
    }
}
