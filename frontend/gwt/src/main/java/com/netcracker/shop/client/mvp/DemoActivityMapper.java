package com.netcracker.shop.client.mvp;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.netcracker.shop.client.ClientFactory;
import com.netcracker.shop.client.mvp.activity.CartActivity;
import com.netcracker.shop.client.mvp.activity.ContactsActivity;
import com.netcracker.shop.client.mvp.activity.AccountActivity;
import com.netcracker.shop.client.mvp.activity.HomeActivity;
import com.netcracker.shop.client.mvp.activity.ProductActivity;
import com.netcracker.shop.client.mvp.activity.DeliveryActivity;
import com.netcracker.shop.client.mvp.place.CartPlace;
import com.netcracker.shop.client.mvp.place.ContactsPlace;
import com.netcracker.shop.client.mvp.place.AccountPlace;
import com.netcracker.shop.client.mvp.place.HomePlace;
import com.netcracker.shop.client.mvp.place.ProductPlace;
import com.netcracker.shop.client.mvp.place.DeliveryPlace;

/**
 * The type Demo activity mapper.
 */
public class DemoActivityMapper implements ActivityMapper {
    private ClientFactory clientFactory;

    /**
     * Instantiates a new Demo activity mapper.
     *
     * @param clientFactory the client factory
     */
    public DemoActivityMapper(ClientFactory clientFactory) {
        super();
        this.clientFactory = clientFactory;
    }

    @Override
    public Activity getActivity(Place place) {
        if (place instanceof AccountPlace) {
            return new AccountActivity(clientFactory);
        } else if (place instanceof ContactsPlace) {
            return new ContactsActivity(clientFactory);
        } else if (place instanceof DeliveryPlace) {
            return new DeliveryActivity(clientFactory);
        } else if (place instanceof ProductPlace) {
            return new ProductActivity(clientFactory);
        } else if (place instanceof HomePlace) {
            return new HomeActivity(clientFactory);
        } else if(place instanceof CartPlace){
            return new CartActivity(clientFactory);
        }
        return null;
    }
}
