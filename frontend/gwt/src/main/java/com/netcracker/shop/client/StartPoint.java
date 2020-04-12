/*
 * Copyright
 */

package com.netcracker.shop.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.UIObject;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.netcracker.shop.client.in.log.LogInView;
import com.netcracker.shop.gin.Injection;
import gwt.material.design.client.resources.MaterialResources;
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
    private final Injection injection;

    /**
     * Constructor. Create an injector.
     */
    public StartPoint() {
        this.injection = GWT.create(Injection.class);
    }

    @Override
    public void onModuleLoad() {
        Defaults.setServiceRoot("http://127.0.0.1:8080");
        RootPanel.get().add(this.injection.getMainPageView().init());
    }


    /**
     * Injector interface.
     *
     * @since 0.0.1
     */
}