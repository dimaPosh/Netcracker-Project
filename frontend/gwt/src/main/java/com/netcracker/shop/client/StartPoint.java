/*
 * Copyright
 */

package com.netcracker.shop.client;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.netcracker.shop.client.layout.AppLayout;
import com.netcracker.shop.client.mvp.DemoActivityMapper;
import com.netcracker.shop.client.mvp.DemoPlaceHistoryMapper;
import com.netcracker.shop.client.mvp.place.AccountPlace;
import com.netcracker.shop.client.mvp.place.HomePlace;
import com.netcracker.shop.server.model.CartModel;
import com.netcracker.shop.server.model.RoleModel;
import org.fusesource.restygwt.client.Defaults;

/**
 * Start point in the front end application.
 *
 * @since 0.0.1
 */
public final class StartPoint implements EntryPoint {

    /**
     * Injector field.
     */
    private static Integer userId = null;
    private static Integer role = 2;
    private static CartModel cart = null;
    private SimplePanel containerWidget;
    private HomePlace defaultPlace = new HomePlace();

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public static Integer getUserId() {
        return userId;
    }

    /**
     * Sets user id.
     *
     * @param userId the user id
     */
    public static void setUserId(Integer userId) {
        StartPoint.userId = userId;
    }

    /**
     * Gets role.
     *
     * @return the role
     */
    public static Integer getRole() {
        return role;
    }

    /**
     * Sets role.
     *
     * @param role the role
     */
    public static void setRole(Integer role) {
        StartPoint.role = role;
    }


    /**
     * Gets cart.
     *
     * @return the cart
     */
    public static CartModel getCart() {
        return cart;
    }


    /**
     * Sets cart.
     *
     * @param cart the cart
     */
    public static void setCart(CartModel cart) {
        StartPoint.cart = cart;
    }

    /**
     * Constructor. Create an injector.
     */

    @Override
    public void onModuleLoad() {
        Defaults.setServiceRoot("http://127.0.0.1:8080");
        final AppLayout mainLayout = new AppLayout();
        containerWidget = mainLayout.getAppContentHolder();

        final ClientFactory clientFactory = GWT.create(ClientFactory.class);
        EventBus eventBus = clientFactory.getEventBus();
        PlaceController placeController = clientFactory.getPlaceController();

        // activate activity manager and init display
        ActivityMapper activityMapper = new DemoActivityMapper(clientFactory);
        ActivityManager activityManager = new ActivityManager(activityMapper, eventBus);
        activityManager.setDisplay(containerWidget);

        // display default view with activated history processing
        DemoPlaceHistoryMapper historyMapper = GWT.create(DemoPlaceHistoryMapper.class);
        PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(historyMapper);
        historyHandler.register(placeController, eventBus, defaultPlace);

        RootLayoutPanel.get().add(mainLayout);

        History.newItem("home:");
    }
}