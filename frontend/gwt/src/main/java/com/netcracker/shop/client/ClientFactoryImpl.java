package com.netcracker.shop.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.Window;
import com.netcracker.shop.client.mvp.view.IAuthView;
import com.netcracker.shop.client.mvp.view.ICartView;
import com.netcracker.shop.client.mvp.view.IContactsView;
import com.netcracker.shop.client.mvp.view.IAccountView;
import com.netcracker.shop.client.mvp.view.IHomeView;
import com.netcracker.shop.client.mvp.view.IProductView;
import com.netcracker.shop.client.mvp.view.IDeliveryView;
import com.netcracker.shop.client.mvp.view.IRegistrationView;
import com.netcracker.shop.client.mvp.view.auth.AuthView;
import com.netcracker.shop.client.mvp.view.cart.CartView;
import com.netcracker.shop.client.mvp.view.contacts.ContactsView;
import com.netcracker.shop.client.mvp.view.account.AccountView;
import com.netcracker.shop.client.mvp.view.home.HomeView;
import com.netcracker.shop.client.mvp.view.product.ProductView;
import com.netcracker.shop.client.mvp.view.delivery.DeliveryView;
import com.netcracker.shop.client.mvp.view.registration.RegistrationView;
import com.netcracker.shop.server.model.ProductModel;
import com.netcracker.shop.server.rest.ProductRest;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;

import java.util.List;

/**
 * The type Client factory.
 */
public class ClientFactoryImpl implements ClientFactory {
    private final EventBus eventBus = new SimpleEventBus();
    private final PlaceController placeController = new PlaceController(eventBus);

    private final IAuthView authView = new AuthView();
    private final IHomeView homeView = new HomeView();
    private final IAccountView accountView = new AccountView();
    private final IContactsView contactsView = new ContactsView();
    private final IDeliveryView deliveryView = new DeliveryView();
    private final IProductView productView = new ProductView();
    private final ICartView cartView = new CartView();
    private final IRegistrationView registrationView = new RegistrationView();

    @Override
    public EventBus getEventBus() {
        return eventBus;
    }

    @Override
    public PlaceController getPlaceController() {
        return placeController;
    }

    @Override
    public IHomeView getHomeView() {
        return homeView;
    }

    @Override
    public IAccountView getAccountView() {
        return new AccountView();
    }

    @Override
    public IContactsView getContactsView() {
        return contactsView;
    }

    @Override
    public IDeliveryView getDeliveryView() {
        return deliveryView;
    }

    @Override
    public IProductView getProductView() {
        return new ProductView();
    }

    @Override
    public ICartView getCartView() {
        return new CartView();
    }

    @Override
    public IAuthView getAuthView() {
        return new AuthView();
    }

    @Override
    public IRegistrationView getRegistrView() {
        return new RegistrationView();
    }
}

