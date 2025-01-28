package com.example.c2bpayment.C2BPaymentQueryWS;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class C2BPaymentController {

    private static final String NAMESPACE_URI = "http://cps.huawei.com/cpsinterface/c2bpayment";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "C2BPaymentQueryRequest")
    @ResponsePayload
    public C2BPaymentQueryResult handlePaymentQuery(@RequestPayload C2BPaymentQueryRequest request) {
        C2BPaymentQueryResult response = new C2BPaymentQueryResult();
        response.setResultCode("0");
        response.setResultDesc("Success");
        response.setTransID(request.getTransID());
        response.setBillRefNumber(request.getBillRefNumber());
        response.setUtilityName("Bill payment");
        response.setCustomerName("test");
        response.setAmount("3");

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "C2BPaymentValidationRequest")
    @ResponsePayload
    public C2BPaymentValidationResult validatePayment(@RequestPayload C2BPaymentValidationRequest request) {
        // Here, we would implement the actual logic to validate the payment.
        C2BPaymentValidationResult result = new C2BPaymentValidationResult();
        result.setResultCode("0");
        result.setResultDesc("Success");
        result.setThirdPartyTransID(request.getTransID());
        return result;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "C2BPaymentConfirmationRequest")
    @ResponsePayload
    public C2BPaymentConfirmationResult handlePaymentConfirmation(@RequestPayload C2BPaymentConfirmationRequest request) {
        // Your business logic here

        // Example response, you can modify this based on actual logic
        C2BPaymentConfirmationResult response = new C2BPaymentConfirmationResult();
        response.setResult(0); // Result code can be based on actual logic

        return response;
    }

}
