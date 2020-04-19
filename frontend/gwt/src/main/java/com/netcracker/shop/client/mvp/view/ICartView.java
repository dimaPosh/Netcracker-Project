package com.netcracker.shop.client.mvp.view;

import com.google.gwt.user.client.ui.IsWidget;

/**
 * The interface Cart view.
 */
public interface ICartView extends IsWidget {

    /**
     * Sets presenter.
     *
     * @param presenter the presenter
     */
    public void setPresenter(ICartPresenter presenter);

    /**
     * The interface Cart presenter.
     */
    public interface ICartPresenter{

    }
}
