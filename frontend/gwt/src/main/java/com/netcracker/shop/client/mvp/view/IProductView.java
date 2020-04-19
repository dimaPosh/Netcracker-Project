package com.netcracker.shop.client.mvp.view;

import com.google.gwt.user.client.ui.IsWidget;
import com.netcracker.shop.server.model.ProductModel;

import java.util.List;

/**
 * The interface Product view.
 */
public interface IProductView extends IsWidget {
    /**
     * Sets presenter.
     *
     * @param presenter the presenter
     */
    public void setPresenter(IProductPresenter presenter);

    /**
     * The interface Product presenter.
     */
    public interface IProductPresenter {

    }
}
