package com.netcracker.shop.client.mvp.view.product;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.netcracker.shop.client.StartPoint;
import com.netcracker.shop.client.mvp.view.IProductView;
import com.netcracker.shop.server.model.CartDetailModel;
import com.netcracker.shop.server.model.ProductModel;
import com.netcracker.shop.server.rest.CartDetailRest;
import com.netcracker.shop.server.rest.ProductRest;
import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialImage;
import gwt.material.design.client.ui.MaterialToast;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;

import java.util.List;

/**
 * The type Product view.
 */
public class ProductView extends Composite implements IProductView {

    /**
     * The Flex table.
     */
    @UiField
    protected FlexTable flexTable;
    private IProductPresenter presenter;
    private final CartDetailRest cartDetailRest;
    private final ProductRest rest;
    private List<ProductModel> productModel;

    @Override
    public void setPresenter(IProductPresenter presenter) {
        this.presenter = presenter;
    }


    /**
     * The interface Product view ui binder.
     */
    interface ProductViewUiBinder extends UiBinder<Widget, ProductView> {
    }

    private static ProductViewUiBinder ourUiBinder = GWT.create(ProductViewUiBinder.class);

    /**
     * Instantiates a new Product view.
     */
    public ProductView() {
        this.rest = GWT.create(ProductRest.class);
        this.cartDetailRest = GWT.create(CartDetailRest.class);
        this.rest.productAll(new MethodCallback<List<ProductModel>>() {

            @Override
            public void onFailure(Method method, Throwable throwable) {
                MaterialToast.fireToast("Продукты не найдены", 1000);
            }

            @Override
            public void onSuccess(Method method, List<ProductModel> model) {
                flexTable.setWidth("100%");
                for (int i = 0; i < model.size(); i += 5) {
                    int j = i;
                    while (j < model.size() && j < i + 5) {
                        VerticalPanel verticalPanel = new VerticalPanel();
                        verticalPanel.setSpacing(1);
                        MaterialImage image = new MaterialImage(model.get(j).getImage());
                        image.setWidth("100px");
                        image.setWidth("100px");
                        verticalPanel.add(image);
                        verticalPanel.add(new HTML("<h6><h6>" + model.get(j).getName()));
                        verticalPanel.add(new HTML("<h5><h5>" + model.get(j).getPrice().toString() + "₽"));
                        MaterialButton button = new MaterialButton("Добавить");
                        button.setIconType(IconType.ADD_SHOPPING_CART);
                        int finalJ = j;
                        button.addClickHandler(new ClickHandler() {
                            @Override
                            public void onClick(ClickEvent clickEvent) {
                                CartDetailModel cartDetailModel = new CartDetailModel();
                                cartDetailModel.setId(1000);
                                cartDetailModel.setCart(StartPoint.getCart());
                                cartDetailModel.setProduct(model.get(finalJ));
                                cartDetailRest.createCartDetail(cartDetailModel, new MethodCallback<CartDetailModel>() {
                                    @Override
                                    public void onFailure(Method method, Throwable throwable) {
                                        MaterialToast.fireToast("Упс, что-то полшо не так...", 500);
                                    }

                                    @Override
                                    public void onSuccess(Method method, CartDetailModel cartDetailModel) {
                                        MaterialToast.fireToast("Добавлено", 500);
                                    }
                                });
                            }
                        });
                        verticalPanel.add(button);
                        j++;
                        flexTable.setWidget(i, j - i, verticalPanel);
                    }
                }
            }
        });
        initWidget(ourUiBinder.createAndBindUi(this));
    }

}