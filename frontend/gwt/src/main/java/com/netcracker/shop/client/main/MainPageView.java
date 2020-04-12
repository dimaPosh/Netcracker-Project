/*
 * Copyright
 */

package com.netcracker.shop.client.main;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.netcracker.shop.gin.Injection;
import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.ui.MaterialFooter;
import gwt.material.design.client.ui.MaterialHeader;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialSideNav;


/**
 * The type Main page view.
 */
public class MainPageView extends Composite {


    private final Injection injection;
    private final MainPageViewUiBinder binder;
    @UiField(provided = true)
    protected DockPanel dockPanel;

    /**
     * Instantiates a new Main page view.
     *
     * @param injection
     * @param binder    the binder
     */
    @Inject
    public MainPageView(Injection injection, MainPageViewUiBinder binder, DockPanel dockPanel) {
        this.injection = injection;
        this.binder = binder;
        this.dockPanel = dockPanel;
        this.dockPanel.add(this.injection.getHeaderView().init(), DockPanel.NORTH);
        this.dockPanel.add(this.injection.getFooterView().init(), DockPanel.SOUTH);
        this.dockPanel.add(this.injection.getNavBarView().init(), DockPanel.WEST);
        switch (this.injection.getNavBarView().getNavigation()) {
            case HOME:
                this.dockPanel.add(this.injection.getLogInView().init(), DockPanel.CENTER);
                return;
            case LOGIN:
                this.dockPanel.add(this.injection.getLogInView().init(), DockPanel.CENTER);
                return;
        }
    }


    /**
     * Init main page view.
     *
     * @return the main page view
     */
    public final MainPageView init() {
        super.initWidget(this.binder.createAndBindUi(this));
        return this;
    }

    /**
     * The interface Main page view ui binder.
     */
    interface MainPageViewUiBinder extends UiBinder<Widget, MainPageView> {
    }
}