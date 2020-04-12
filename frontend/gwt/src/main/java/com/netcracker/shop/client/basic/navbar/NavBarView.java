package com.netcracker.shop.client.basic.navbar;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.netcracker.shop.client.Navigation;

public class NavBarView extends Composite {

    private final NavBarViewUiBinder binder;
    private Navigation navigation;

    @Inject
    public NavBarView(NavBarViewUiBinder binder) {
        this.binder = binder;
        this.navigation = Navigation.HOME;
    }

    public Navigation getNavigation() {
        return this.navigation;
    }

    public final NavBarView init() {
        super.initWidget(this.binder.createAndBindUi(this));
        return this;
    }

    @UiHandler("account")
    public void accountClick(final ClickEvent event) {
        this.navigation = Navigation.LOGIN;
    }

    interface NavBarViewUiBinder extends UiBinder<Widget, NavBarView> {
    }
}