package com.netcracker.shop.client.mvp.view;

import com.google.gwt.user.client.ui.IsWidget;

/**
 * The interface Account view.
 */
public interface IAccountView extends IsWidget {
    /**
     * Sets presenter.
     *
     * @param presenter the presenter
     */
    public void setPresenter(IAccountPresenter presenter);

    /**
     * The interface Account presenter.
     */
    public interface IAccountPresenter {
    }
}
