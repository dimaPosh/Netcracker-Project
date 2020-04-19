package com.netcracker.shop.client.mvp.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

/**
 * The type Delivery place.
 */
public class DeliveryPlace extends Place {
    private static final String VIEW_HISTORY_TOKEN = "delivery-payment";

    /**
     * Instantiates a new Delivery place.
     */
    public DeliveryPlace() {
    }

    /**
     * The type Tokenizer.
     */
    @Prefix(value = VIEW_HISTORY_TOKEN)
    public static class Tokenizer implements PlaceTokenizer<DeliveryPlace> {
        @Override
        public DeliveryPlace getPlace(String token) {
            return new DeliveryPlace();
        }

        @Override
        public String getToken(DeliveryPlace place) {
            return "";
        }
    }
}

