package com.netcracker.shop.client.mvp.view.cart;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.netcracker.shop.client.mvp.view.ICartView;

/**
 * The type Cart view.
 */
public class CartView extends Composite implements ICartView{
    private ICartPresenter presenter;

    @Override
    public void setPresenter(ICartPresenter presenter) {
        this.presenter=presenter;
    }

    /**
     * The interface Cart view ui binder.
     */
    interface CartViewUiBinder extends UiBinder<Widget, CartView> {
    }

    private static CartViewUiBinder ourUiBinder = GWT.create(CartViewUiBinder.class);

    /**
     * Instantiates a new Cart view.
     */
    public CartView() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}