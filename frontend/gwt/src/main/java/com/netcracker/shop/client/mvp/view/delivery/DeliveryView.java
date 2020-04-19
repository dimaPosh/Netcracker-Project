package com.netcracker.shop.client.mvp.view.delivery;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.netcracker.shop.client.mvp.view.IDeliveryView;

/**
 * The type Delivery view.
 */
public class DeliveryView extends Composite implements IDeliveryView {
    /**
     * The interface Delivery view ui binder.
     */
    interface DeliveryViewUiBinder extends UiBinder<Widget, DeliveryView> {
    }

    private static DeliveryViewUiBinder uiBinder = GWT.create(DeliveryViewUiBinder.class);

    private IDeliveryPresenter presenter;

    /**
     * Instantiates a new Delivery view.
     */
    public DeliveryView() {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @Override
    public void setPresenter(IDeliveryPresenter presenter) {
        this.presenter = presenter;
    }
}