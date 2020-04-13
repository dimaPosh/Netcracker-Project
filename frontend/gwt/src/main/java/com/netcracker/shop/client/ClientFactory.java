package com.netcracker.shop.client;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import com.netcracker.shop.client.mvp.view.IContactsView;
import com.netcracker.shop.client.mvp.view.IMailView;
import com.netcracker.shop.client.mvp.view.IProductView;
import com.netcracker.shop.client.mvp.view.ITasksView;

public interface ClientFactory {
    public EventBus getEventBus();

    public PlaceController getPlaceController();

    public IMailView getMailView();

    public IContactsView getContactsView();

    public ITasksView getTasksView();

    public IProductView getProductView();
}
