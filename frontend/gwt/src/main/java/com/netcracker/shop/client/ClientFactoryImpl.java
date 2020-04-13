package com.netcracker.shop.client;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.place.shared.PlaceController;
import com.netcracker.shop.client.mvp.view.IContactsView;
import com.netcracker.shop.client.mvp.view.IMailView;
import com.netcracker.shop.client.mvp.view.IProductView;
import com.netcracker.shop.client.mvp.view.ITasksView;
import com.netcracker.shop.client.mvp.view.contacts.ContactsView;
import com.netcracker.shop.client.mvp.view.mail.MailView;
import com.netcracker.shop.client.mvp.view.product.ProductView;
import com.netcracker.shop.client.mvp.view.tasks.TasksView;

public class ClientFactoryImpl implements ClientFactory {
    private final EventBus eventBus = new SimpleEventBus();
    private final PlaceController placeController = new PlaceController(eventBus);

    private final IMailView mailView = new MailView();
    private final IContactsView contactsView = new ContactsView();
    private final ITasksView tasksView = new TasksView();
    private final IProductView productView = new ProductView();

    @Override
    public EventBus getEventBus() {
        return eventBus;
    }

    @Override
    public PlaceController getPlaceController() {
        return placeController;
    }

    @Override
    public IMailView getMailView() {
        return mailView;
    }

    @Override
    public IContactsView getContactsView() {
        return contactsView;
    }

    @Override
    public ITasksView getTasksView() {
        return tasksView;
    }

    @Override
    public IProductView getProductView() {
        return productView;
    }
}

