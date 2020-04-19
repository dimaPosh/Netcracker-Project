package com.netcracker.shop.client.mvp.view.contacts;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.netcracker.shop.client.mvp.view.IContactsView;

/**
 * The type Contacts view.
 */
public class ContactsView extends Composite implements IContactsView {
    /**
     * The interface Contacts view ui binder.
     */
    interface ContactsViewUiBinder extends UiBinder<Widget, ContactsView> {	}
    private static ContactsViewUiBinder uiBinder = GWT.create(ContactsViewUiBinder.class);

    private IContactsPresenter presenter;

    /**
     * Instantiates a new Contacts view.
     */
    public ContactsView() {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @Override
    public void setPresenter(IContactsView.IContactsPresenter presenter) {
        this.presenter = presenter;
    }
}