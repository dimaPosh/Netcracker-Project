package com.netcracker.shop.client.mvp.activity;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.netcracker.shop.client.AppConstants;
import com.netcracker.shop.client.ClientFactory;
import com.netcracker.shop.client.mvp.view.IProductView;

public class ProductActivity extends AbstractMainActivity implements IProductView.IProductPresenter {
    private ClientFactory clientFactory;

    public ProductActivity(ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }

    @Override
    public void start(AcceptsOneWidget container, EventBus eventBus) {
        applyCurrentLinkStyle(AppConstants.PRODUCT_LINK_ID);

        final IProductView view = clientFactory.getProductView();
        view.setPresenter(this);
        container.setWidget(view.asWidget());
    }
}
