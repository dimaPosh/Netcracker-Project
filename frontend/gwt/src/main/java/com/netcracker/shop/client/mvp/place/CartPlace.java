package com.netcracker.shop.client.mvp.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

/**
 * The type Cart place.
 */
public class CartPlace extends Place {
    private static final String VIEW_HISTORY_TOKEN = "cart";

    /**
     * Instantiates a new Cart place.
     */
    public CartPlace() {
    }

    /**
     * The type Tokenizer.
     */
    @Prefix(value = VIEW_HISTORY_TOKEN)
    public static class Tokenizer implements PlaceTokenizer<CartPlace> {
        @Override
        public CartPlace getPlace(String token) {
            return new CartPlace();
        }

        @Override
        public String getToken(CartPlace place) {
            return "";
        }
    }
}
