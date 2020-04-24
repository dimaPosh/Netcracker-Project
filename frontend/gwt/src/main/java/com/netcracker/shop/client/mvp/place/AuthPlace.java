package com.netcracker.shop.client.mvp.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

/**
 * The type Auth place.
 */
public class AuthPlace extends Place {
    private static final String VIEW_HISTORY_TOKEN = "auth";

    /**
     * Instantiates a new Auth place.
     */
    public AuthPlace() {
    }

    /**
     * The type Tokenizer.
     */
    @Prefix(value = VIEW_HISTORY_TOKEN)
    public static class Tokenizer implements PlaceTokenizer<AuthPlace> {
        @Override
        public AuthPlace getPlace(String token) {
            return new AuthPlace();
        }

        @Override
        public String getToken(AuthPlace place) {
            return "";
        }
    }
}
