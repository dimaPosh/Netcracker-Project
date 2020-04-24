package com.netcracker.shop.client.mvp.activity;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.netcracker.shop.client.AppConstants;
import com.netcracker.shop.client.ClientFactory;
import com.netcracker.shop.client.mvp.view.IRegistrationView;
import com.netcracker.shop.client.mvp.view.registration.RegistrationView;

/**
 * The type Registration activity.
 */
public class RegistrationActivity extends AbstractMainActivity implements IRegistrationView.IRegistrationPresenter {

    private ClientFactory clientFactory;

    /**
     * Instantiates a new Registration activity.
     *
     * @param clientFactory the client factory
     */
    public RegistrationActivity(ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }

    @Override
    public void start(AcceptsOneWidget container, EventBus eventBus) {
        applyCurrentLinkStyle(AppConstants.REGISTR_LINK_ID);
        final IRegistrationView view = clientFactory.getRegistrView();
        view.setPresenter(this);
        container.setWidget(view.asWidget());
    }
}
