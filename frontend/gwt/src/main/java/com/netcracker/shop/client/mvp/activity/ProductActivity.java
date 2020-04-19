package com.netcracker.shop.client.mvp.activity;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.netcracker.shop.client.AppConstants;
import com.netcracker.shop.client.ClientFactory;
import com.netcracker.shop.client.mvp.view.IProductView;
import com.netcracker.shop.client.mvp.view.product.ProductView;
import com.netcracker.shop.server.model.ProductModel;
import com.netcracker.shop.server.rest.ProductRest;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;

import java.util.List;

/**
 * The type Product activity.
 */
public class ProductActivity extends AbstractMainActivity implements IProductView.IProductPresenter {
    private ClientFactory clientFactory;


    /**
     * Instantiates a new Product activity.
     *
     * @param clientFactory the client factory
     */
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
