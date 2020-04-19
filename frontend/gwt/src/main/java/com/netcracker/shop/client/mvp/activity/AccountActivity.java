package com.netcracker.shop.client.mvp.activity;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.netcracker.shop.client.AppConstants;
import com.netcracker.shop.client.ClientFactory;
import com.netcracker.shop.client.mvp.view.IAccountView;

/**
 * The type Account activity.
 */
public class AccountActivity extends AbstractMainActivity implements IAccountView.IAccountPresenter {
    private ClientFactory clientFactory;

    /**
     * Instantiates a new Account activity.
     *
     * @param clientFactory the client factory
     */
    public AccountActivity(ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }

    @Override
    public void start(AcceptsOneWidget container, EventBus eventBus) {
        applyCurrentLinkStyle(AppConstants.ACCOUNT_LINK_ID);

        final IAccountView view = clientFactory.getAccountView();
        view.setPresenter(this);
        container.setWidget(view.asWidget());
    }
}
