package com.netcracker.shop.client.mvp.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class ProductPlace extends Place {
    private static final String VIEW_HISTORY_TOKEN = "product";

    public ProductPlace() {
    }

    @Prefix(value = VIEW_HISTORY_TOKEN)
    public static class Tokenizer implements PlaceTokenizer<ProductPlace> {
        @Override
        public ProductPlace getPlace(String token) {
            return new ProductPlace();
        }

        @Override
        public String getToken(ProductPlace place) {
            return "";
        }
    }
}
