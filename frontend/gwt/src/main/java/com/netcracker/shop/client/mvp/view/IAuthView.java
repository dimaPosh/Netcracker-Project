package com.netcracker.shop.client.mvp.view;

import com.google.gwt.user.client.ui.IsWidget;

/**
 * The interface Auth view.
 */
public interface IAuthView extends IsWidget {

    /**
     * Sets presenter.
     *
     * @param presenter the presenter
     */
    public void setPresenter(IAuthPresenter presenter);

    /**
     * The interface Auth presenter.
     */
    public interface IAuthPresenter {

    }
}
