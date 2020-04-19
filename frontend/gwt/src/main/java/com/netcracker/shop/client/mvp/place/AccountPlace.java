package com.netcracker.shop.client.mvp.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

/**
 * The type Account place.
 */
public class AccountPlace extends Place {
    private static final String VIEW_HISTORY_TOKEN = "account";

    /**
     * Instantiates a new Account place.
     */
    public AccountPlace() {
    }

    /**
     * The type Tokenizer.
     */
    @Prefix(value = VIEW_HISTORY_TOKEN)
    public static class Tokenizer implements PlaceTokenizer<AccountPlace> {
        @Override
        public AccountPlace getPlace(String token) {
            return new AccountPlace();
        }

        @Override
        public String getToken(AccountPlace place) {
            return "";
        }
    }
}