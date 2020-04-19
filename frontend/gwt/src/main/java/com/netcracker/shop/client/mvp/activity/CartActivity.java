package com.netcracker.shop.client.mvp.activity;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.netcracker.shop.client.AppConstants;
import com.netcracker.shop.client.ClientFactory;
import com.netcracker.shop.client.mvp.view.ICartView;

/**
 * The type Cart activity.
 */
public class CartActivity extends AbstractMainActivity implements ICartView.ICartPresenter {
    private ClientFactory clientFactory;

    /**
     * Instantiates a new Cart activity.
     *
     * @param clientFactory the client factory
     */
    public CartActivity(ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }

    @Override
    public void start(AcceptsOneWidget container, EventBus eventBus) {
        applyCurrentLinkStyle(AppConstants.CART_LINK_ID);

        final ICartView view = clientFactory.getCartView();
        view.setPresenter(this);
        container.setWidget(view.asWidget());
    }
}
