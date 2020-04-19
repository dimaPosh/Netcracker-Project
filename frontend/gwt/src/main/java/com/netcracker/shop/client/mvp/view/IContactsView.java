package com.netcracker.shop.client.mvp.view;

import com.google.gwt.user.client.ui.IsWidget;

/**
 * The interface Contacts view.
 */
public interface IContactsView extends IsWidget {
    /**
     * Sets presenter.
     *
     * @param presenter the presenter
     */
    public void setPresenter(IContactsPresenter presenter);

    /**
     * The interface Contacts presenter.
     */
    public interface IContactsPresenter {
    }
}