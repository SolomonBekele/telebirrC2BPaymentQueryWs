package com.example.c2bpayment.C2BPaymentQueryWS;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "C2BPaymentQueryResult", namespace = "http://cps.huawei.com/cpsinterface/c2bpayment")
public class C2BPaymentQueryResult {
    private String resultCode;
    private String resultDesc;
    private String transID;
    private String billRefNumber;
    private String utilityName;
    private String customerName;
    private String amount;

    @XmlElement(name = "ResultCode")
    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    @XmlElement(name = "ResultDesc")
    public String getResultDesc() {
        return resultDesc;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

    @XmlElement(name = "TransID")
    public String getTransID() {
        return transID;
    }

    public void setTransID(String transID) {
        this.transID = transID;
    }

    @XmlElement(name = "BillRefNumber")
    public String getBillRefNumber() {
        return billRefNumber;
    }

    public void setBillRefNumber(String billRefNumber) {
        this.billRefNumber = billRefNumber;
    }

    @XmlElement(name = "UtilityName")
    public String getUtilityName() {
        return utilityName;
    }

    public void setUtilityName(String utilityName) {
        this.utilityName = utilityName;
    }

    @XmlElement(name = "CustomerName")
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @XmlElement(name = "Amount")
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
