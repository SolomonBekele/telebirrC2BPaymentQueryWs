package com.example.c2bpayment.C2BPaymentQueryWS;

import jakarta.xml.bind.annotation.XmlElement;

public class KYCInfo {

    private String kycName;
    private String kycValue;

    @XmlElement(name = "KYCName")
    public String getKycName() {
        return kycName;
    }

    public void setKycName(String kycName) {
        this.kycName = kycName;
    }

    @XmlElement(name = "KYCValue")
    public String getKycValue() {
        return kycValue;
    }

    public void setKycValue(String kycValue) {
        this.kycValue = kycValue;
    }
}
