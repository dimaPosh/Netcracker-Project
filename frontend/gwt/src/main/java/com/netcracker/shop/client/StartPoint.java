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
import com.netcracker.shop.client.mvp.place.MailPlace;
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
    private SimplePanel containerWidget;
    private MailPlace defaultPlace = new MailPlace();

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

        History.newItem("mail:");
    }
}