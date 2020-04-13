package com.netcracker.shop.client.mvp.activity;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.netcracker.shop.client.AppConstants;
import com.netcracker.shop.client.ClientFactory;
import com.netcracker.shop.client.mvp.view.IContactsView;

public class ContactsActivity extends AbstractMainActivity implements IContactsView.IContactsPresenter {
    private ClientFactory clientFactory;

    public ContactsActivity(ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }

    @Override
    public void start(AcceptsOneWidget container, EventBus eventBus) {
        applyCurrentLinkStyle(AppConstants.CONTACTS_LINK_ID);

        final IContactsView view = clientFactory.getContactsView();
        view.setPresenter(this);
        container.setWidget(view.asWidget());
    }
}
