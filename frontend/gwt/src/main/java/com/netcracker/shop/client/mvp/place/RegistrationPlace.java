package com.netcracker.shop.client.mvp.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

/**
 * The type Registration place.
 */
public class RegistrationPlace extends Place {
    private static final String VIEW_HISTORY_TOKEN = "registr";

    /**
     * Instantiates a new Registration place.
     */
    public RegistrationPlace() {
    }

    /**
     * The type Tokenizer.
     */
    @Prefix(value = VIEW_HISTORY_TOKEN)
    public static class Tokenizer implements PlaceTokenizer<RegistrationPlace> {
        @Override
        public RegistrationPlace getPlace(String token) {
            return new RegistrationPlace();
        }

        @Override
        public String getToken(RegistrationPlace place) {
            return "";
        }
    }
}
