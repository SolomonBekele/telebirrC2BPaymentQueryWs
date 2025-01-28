package com.example.c2bpayment.C2BPaymentQueryWS;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

@XmlRootElement(name = "C2BPaymentConfirmationRequest", namespace = "http://cps.huawei.com/cpsinterface/c2bpayment")
public class C2BPaymentConfirmationRequest {

    private String transType;
    private String transID;
    private String transTime;
    private double transAmount;
    private String businessShortCode;
    private String billRefNumber;
    private String invoiceNumber;
    private String msisdn;
    private List<KYCInfo> kycInfoList;

    // Getters and Setters
    @XmlElement(name = "TransType")
    public String getTransType() {
        return transType;
    }

    @XmlElement(name = "TransID")
    public String getTransID() {
        return transID;
    }

    @XmlElement(name = "TransTime")
    public String getTransTime() {
        return transTime;
    }

    @XmlElement(name = "TransAmount")
    public double getTransAmount() {
        return transAmount;
    }

    @XmlElement(name = "BusinessShortCode")
    public String getBusinessShortCode() {
        return businessShortCode;
    }

    @XmlElement(name = "BillRefNumber")
    public String getBillRefNumber() {
        return billRefNumber;
    }

    @XmlElement(name = "InvoiceNumber")
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    @XmlElement(name = "MSISDN")
    public String getMsisdn() {
        return msisdn;
    }

    @XmlElement(name = "KYCInfo")
    public List<KYCInfo> getKycInfoList() {
        return kycInfoList;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public void setTransID(String transID) {
        this.transID = transID;
    }

    public void setTransTime(String transTime) {
        this.transTime = transTime;
    }

    public void setTransAmount(double transAmount) {
        this.transAmount = transAmount;
    }

    public void setBusinessShortCode(String businessShortCode) {
        this.businessShortCode = businessShortCode;
    }

    public void setBillRefNumber(String billRefNumber) {
        this.billRefNumber = billRefNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public void setKycInfoList(List<KYCInfo> kycInfoList) {
        this.kycInfoList = kycInfoList;
    }
}

