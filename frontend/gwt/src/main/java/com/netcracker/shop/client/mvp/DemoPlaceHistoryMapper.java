package com.netcracker.shop.client.mvp;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import com.netcracker.shop.client.mvp.place.AuthPlace;
import com.netcracker.shop.client.mvp.place.CartPlace;
import com.netcracker.shop.client.mvp.place.ContactsPlace;
import com.netcracker.shop.client.mvp.place.AccountPlace;
import com.netcracker.shop.client.mvp.place.HomePlace;
import com.netcracker.shop.client.mvp.place.ProductPlace;
import com.netcracker.shop.client.mvp.place.DeliveryPlace;
import com.netcracker.shop.client.mvp.place.RegistrationPlace;

/**
 * The interface Demo place history mapper.
 */
@WithTokenizers({CartPlace.Tokenizer.class, HomePlace.Tokenizer.class,
    AccountPlace.Tokenizer.class, ContactsPlace.Tokenizer.class,
    DeliveryPlace.Tokenizer.class, ProductPlace.Tokenizer.class,
    AuthPlace.Tokenizer.class, RegistrationPlace.Tokenizer.class})
public interface DemoPlaceHistoryMapper extends PlaceHistoryMapper {
}
