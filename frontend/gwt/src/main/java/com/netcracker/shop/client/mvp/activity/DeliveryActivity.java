package com.netcracker.shop.client.mvp.activity;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.netcracker.shop.client.AppConstants;
import com.netcracker.shop.client.ClientFactory;
import com.netcracker.shop.client.mvp.view.IDeliveryView;

/**
 * The type Delivery activity.
 */
public class DeliveryActivity extends AbstractMainActivity implements IDeliveryView.IDeliveryPresenter {
    private ClientFactory clientFactory;

    /**
     * Instantiates a new Delivery activity.
     *
     * @param clientFactory the client factory
     */
    public DeliveryActivity(ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }

    @Override
    public void start(AcceptsOneWidget container, EventBus eventBus) {
        applyCurrentLinkStyle(AppConstants.DELIVERY_LINK_ID);

        final IDeliveryView view = clientFactory.getDeliveryView();
        view.setPresenter(this);
        container.setWidget(view.asWidget());
    }
}
