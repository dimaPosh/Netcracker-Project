package com.netcracker.shop.client.mvp.activity;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.netcracker.shop.client.AppConstants;
import com.netcracker.shop.client.ClientFactory;
import com.netcracker.shop.client.mvp.view.IAccountView;
import com.netcracker.shop.client.mvp.view.IAuthView;

/**
 * The type Auth activity.
 */
public class AuthActivity extends AbstractMainActivity implements IAuthView.IAuthPresenter {
    private ClientFactory clientFactory;

    /**
     * Instantiates a new Auth activity.
     *
     * @param clientFactory the client factory
     */
    public AuthActivity(ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }

    @Override
    public void start(AcceptsOneWidget container, EventBus eventBus) {
        applyCurrentLinkStyle(AppConstants.AUTH_LINK_ID);
        final IAuthView view = clientFactory.getAuthView();
        view.setPresenter(this);
        container.setWidget(view);
    }
}
