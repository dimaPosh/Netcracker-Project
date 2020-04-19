package com.netcracker.shop.client.mvp.view;

import com.google.gwt.user.client.ui.IsWidget;

/**
 * The interface Delivery view.
 */
public interface IDeliveryView extends IsWidget {

    /**
     * Sets presenter.
     *
     * @param presenter the presenter
     */
    public void setPresenter(IDeliveryPresenter presenter);

    /**
     * The interface Delivery presenter.
     */
    public interface IDeliveryPresenter {
    }
}
