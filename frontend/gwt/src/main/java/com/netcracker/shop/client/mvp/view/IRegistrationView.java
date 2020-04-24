package com.netcracker.shop.client.mvp.view;

import com.google.gwt.user.client.ui.IsWidget;

/**
 * The interface Registration view.
 */
public interface IRegistrationView extends IsWidget {

    /**
     * Sets presenter.
     *
     * @param presenter the presenter
     */
    public void setPresenter(IRegistrationPresenter presenter);

    /**
     * The interface Registration presenter.
     */
    public interface IRegistrationPresenter {

    }
}
