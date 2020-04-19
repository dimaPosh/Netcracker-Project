package com.netcracker.shop.client.mvp.view.home;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.netcracker.shop.client.mvp.view.IHomeView;

/**
 * The type Home view.
 */
public class HomeView extends Composite implements IHomeView {
    private IHomePresenter presenter;

    @Override
    public void setPresenter(IHomePresenter presenter) {
        this.presenter = presenter;
    }

    /**
     * The interface Home view ui binder.
     */
    interface HomeViewUiBinder extends UiBinder<Widget, HomeView> {
    }

    private static HomeViewUiBinder ourUiBinder = GWT.create(HomeViewUiBinder.class);

    /**
     * Instantiates a new Home view.
     */
    public HomeView() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}