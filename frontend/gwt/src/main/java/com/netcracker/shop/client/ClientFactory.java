package com.netcracker.shop.client;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import com.netcracker.shop.client.mvp.view.ICartView;
import com.netcracker.shop.client.mvp.view.IContactsView;
import com.netcracker.shop.client.mvp.view.IAccountView;
import com.netcracker.shop.client.mvp.view.IHomeView;
import com.netcracker.shop.client.mvp.view.IProductView;
import com.netcracker.shop.client.mvp.view.IDeliveryView;

/**
 * The interface Client factory.
 */
public interface ClientFactory {
    /**
     * Gets event bus.
     *
     * @return the event bus
     */
    public EventBus getEventBus();

    /**
     * Gets place controller.
     *
     * @return the place controller
     */
    public PlaceController getPlaceController();

    /**
     * Gets home view.
     *
     * @return the home view
     */
    public IHomeView getHomeView();

    /**
     * Gets account view.
     *
     * @return the account view
     */
    public IAccountView getAccountView();

    /**
     * Gets contacts view.
     *
     * @return the contacts view
     */
    public IContactsView getContactsView();

    /**
     * Gets delivery view.
     *
     * @return the delivery view
     */
    public IDeliveryView getDeliveryView();

    /**
     * Gets product view.
     *
     * @return the product view
     */
    public IProductView getProductView();

    /**
     * Gets cart view.
     *
     * @return the cart view
     */
    public ICartView getCartView();
}
