package com.netcracker.shop.client.mvp.view;

import com.google.gwt.user.client.ui.IsWidget;

/**
 * The interface Home view.
 */
public interface IHomeView extends IsWidget {
    /**
     * Sets presenter.
     *
     * @param presenter the presenter
     */
    public void setPresenter(IHomePresenter presenter);

    /**
     * The interface Home presenter.
     */
    public interface IHomePresenter {

    }
}
