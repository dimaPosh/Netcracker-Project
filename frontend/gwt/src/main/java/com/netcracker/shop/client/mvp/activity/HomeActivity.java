package com.netcracker.shop.client.mvp.activity;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.netcracker.shop.client.AppConstants;
import com.netcracker.shop.client.ClientFactory;
import com.netcracker.shop.client.mvp.view.IHomeView;

/**
 * The type Home activity.
 */
public class HomeActivity extends AbstractMainActivity implements IHomeView.IHomePresenter {
    private ClientFactory clientFactory;

    /**
     * Instantiates a new Home activity.
     *
     * @param clientFactory the client factory
     */
    public HomeActivity(ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }

    @Override
    public void start(AcceptsOneWidget container, EventBus eventBus) {
        applyCurrentLinkStyle(AppConstants.HOME_LINK_ID);
        final IHomeView view = clientFactory.getHomeView();
        view.setPresenter(this);
        container.setWidget(view.asWidget());
    }
}
