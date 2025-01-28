package com.example.c2bpayment.C2BPaymentQueryWS;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

@XmlRootElement(name = "C2BPaymentValidationRequest", namespace = "http://cps.huawei.com/cpsinterface/c2bpayment")
public class C2BPaymentValidationRequest {

    private String transID;
    private String transTime;
    private double transAmount;
    private String businessShortCode;
    private String billRefNumber;
    private String invoiceNumber;
    private String msisdn;
    private List<KYCInfo> kycInfoList;

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

    @XmlElement(name = "TransAmount")
    public double getTransAmount() {
        return transAmount;
    }

    public void setTransAmount(double transAmount) {
        this.transAmount = transAmount;
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

    @XmlElement(name = "InvoiceNumber")
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    @XmlElement(name = "MSISDN")
    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    @XmlElement(name = "KYCInfo")
    public List<KYCInfo> getKycInfoList() {
        return kycInfoList;
    }

    public void setKycInfoList(List<KYCInfo> kycInfoList) {
        this.kycInfoList = kycInfoList;
    }
}
