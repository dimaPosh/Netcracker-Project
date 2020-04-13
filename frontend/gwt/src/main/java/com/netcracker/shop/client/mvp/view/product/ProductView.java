package com.netcracker.shop.client.mvp.view.product;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.netcracker.shop.client.mvp.view.IProductView;
import com.netcracker.shop.server.model.ProductModel;
import com.netcracker.shop.server.rest.ProductRest;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;

import java.util.ArrayList;
import java.util.List;

public class ProductView extends Composite implements IProductView {

    @UiField
    protected FlexTable flexTable;
    private List<ProductModel> productModel = new ArrayList<>();
    private IProductPresenter presenter;
    private final ProductRest rest;


    @Override
    public void setPresenter(IProductPresenter presenter) {
        this.presenter = presenter;
    }

    interface ProductViewUiBinder extends UiBinder<Widget, ProductView> {
    }

    private static ProductViewUiBinder ourUiBinder = GWT.create(ProductViewUiBinder.class);

    public ProductView() {
        this.rest = GWT.create(ProductRest.class);
        /*
        this.rest.productAll(new MethodCallback<List<ProductModel>>() {

            @Override
            public void onFailure(Method method, Throwable throwable) {
                Window.alert("Error: " + throwable.getMessage());
            }

            @Override
            public void onSuccess(Method method, List<ProductModel> model) {
                productModel.addAll(model);
            }
        });
         */
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}