package com.netcracker.shop.client.mvp;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.netcracker.shop.client.ClientFactory;
import com.netcracker.shop.client.mvp.activity.ContactsActivity;
import com.netcracker.shop.client.mvp.activity.MailActivity;
import com.netcracker.shop.client.mvp.activity.ProductActivity;
import com.netcracker.shop.client.mvp.activity.TasksActivity;
import com.netcracker.shop.client.mvp.place.ContactsPlace;
import com.netcracker.shop.client.mvp.place.MailPlace;
import com.netcracker.shop.client.mvp.place.ProductPlace;
import com.netcracker.shop.client.mvp.place.TasksPlace;

public class DemoActivityMapper implements ActivityMapper {
    private ClientFactory clientFactory;

    public DemoActivityMapper(ClientFactory clientFactory) {
        super();
        this.clientFactory = clientFactory;
    }

    @Override
    public Activity getActivity(Place place) {
        if (place instanceof MailPlace) {
            return new MailActivity(clientFactory);
        } else if (place instanceof ContactsPlace) {
            return new ContactsActivity(clientFactory);
        } else if (place instanceof TasksPlace) {
            return new TasksActivity(clientFactory);
        } else if (place instanceof ProductPlace) {
            return new ProductActivity(clientFactory);
        }
        return null;
    }
}
