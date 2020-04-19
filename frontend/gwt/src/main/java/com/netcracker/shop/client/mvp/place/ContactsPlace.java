package com.netcracker.shop.client.mvp.place;


import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

/**
 * The type Contacts place.
 */
public class ContactsPlace extends Place {
    private static final String VIEW_HISTORY_TOKEN = "contacts";

    /**
     * Instantiates a new Contacts place.
     */
    public ContactsPlace() {
    }

    /**
     * The type Tokenizer.
     */
    @Prefix(value = VIEW_HISTORY_TOKEN)
    public static class Tokenizer implements PlaceTokenizer<ContactsPlace> {
        @Override
        public ContactsPlace getPlace(String token) {
            return new ContactsPlace();
        }

        @Override
        public String getToken(ContactsPlace place) {
            return "";
        }
    }
}
