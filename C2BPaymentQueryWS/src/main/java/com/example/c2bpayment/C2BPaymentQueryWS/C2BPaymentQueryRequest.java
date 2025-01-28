package com.example.c2bpayment.C2BPaymentQueryWS;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "C2BPaymentQueryRequest", namespace = "http://cps.huawei.com/cpsinterface/c2bpayment")
public class C2BPaymentQueryRequest {
    private String transType;
    private String transID;
    private String transTime;
    private String businessShortCode;
    private String billRefNumber;
    private String msisdn;

    @XmlElement(name = "TransType")
    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    @XmlElement(name = "TransID")
    public String getTransID() {
        return transID;
    }

    public void setTransID(String transID) {
        this.transID = transID;
    }

    @XmlElement(name = "TransTime")
    public String getTransTime() {
        return transTime;
    }

    public void setTransTime(String transTime) {
        this.transTime = transTime;
    }

    @XmlElement(name = "BusinessShortCode")
    public String getBusinessShortCode() {
        return businessShortCode;
    }

    public void setBusinessShortCode(String businessShortCode) {
        this.businessShortCode = businessShortCode;
    }

    @XmlElement(name = "BillRefNumber")
    public String getBillRefNumber() {
        return billRefNumber;
    }

    public void setBillRefNumber(String billRefNumber) {
        this.billRefNumber = billRefNumber;
    }

    @XmlElement(name = "MSISDN")
    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }
}
