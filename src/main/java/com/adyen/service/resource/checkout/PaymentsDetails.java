package com.adyen.service.resource.checkout;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.service.Resource;

import java.util.Arrays;

public class PaymentsDetails extends Resource {

    public PaymentsDetails(Service service) {
        super(service, service.getClient().getConfig().getCheckoutEndpoint() + "/" + Client.CHECKOUT_API_VERSION +
                "/payments/details", Arrays.asList("paymentData", "details" ));
    }
}
