package com.netcracker.shop.client.mvp.view.cart;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.netcracker.shop.client.StartPoint;
import com.netcracker.shop.client.mvp.view.ICartView;
import com.netcracker.shop.server.model.CartDetailModel;
import com.netcracker.shop.server.model.OrderDetailModel;
import com.netcracker.shop.server.model.OrderModel;
import com.netcracker.shop.server.model.UserModel;
import com.netcracker.shop.server.rest.CartDetailRest;
import com.netcracker.shop.server.rest.OrderDetailRest;
import com.netcracker.shop.server.rest.OrderRest;
import com.netcracker.shop.server.rest.UserRest;
import gwt.material.design.client.constants.ButtonSize;
import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialCollection;
import gwt.material.design.client.ui.MaterialCollectionItem;
import gwt.material.design.client.ui.MaterialCollectionSecondary;
import gwt.material.design.client.ui.MaterialImage;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialPanel;
import gwt.material.design.client.ui.MaterialToast;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;

import java.util.List;

/**
 * The type Cart view.
 */
public class CartView extends Composite implements ICartView {
    /**
     * The Panel.
     */
    @UiField
    protected MaterialPanel panel;
    private ICartPresenter presenter;
    private UserRest userRest;
    private OrderRest orderRest;
    private OrderDetailRest orderDetailRest;
    private CartDetailRest rest;

    @Override
    public void setPresenter(ICartPresenter presenter) {
        this.presenter = presenter;
    }


    private static CartViewUiBinder ourUiBinder = GWT.create(CartViewUiBinder.class);

    /**
     * Instantiates a new Cart view.
     */
    public CartView() {
        this.rest = GWT.create(CartDetailRest.class);
        this.orderDetailRest = GWT.create(OrderDetailRest.class);
        this.orderRest = GWT.create(OrderRest.class);
        this.userRest = GWT.create(UserRest.class);
        initWidget(ourUiBinder.createAndBindUi(this));
        if (StartPoint.getCart() == null) {
            panel.add(new MaterialLabel("Сначала авторизуйтесь!"));
        } else {
            this.rest.cartDetailAll(StartPoint.getCart().getId(), new MethodCallback<List<CartDetailModel>>() {
                @Override
                public void onFailure(Method method, Throwable throwable) {
                    MaterialToast.fireToast("Кажется у нас на сервере какие-то неполадки", 1000);
                }

                @Override
                public void onSuccess(Method method, List<CartDetailModel> cartDetailModels) {
                    if (cartDetailModels.size() == 0) {
                        MaterialToast.fireToast("Ничего не нашлось(", 1000);
                    } else {
                        MaterialCollection collection = new MaterialCollection();
                        Float sum = (float) 0;
                        for (int i = 0; i < cartDetailModels.size(); i++) {
                            sum += cartDetailModels.get(i).getProduct().getPrice();
                            MaterialCollectionItem item = new MaterialCollectionItem();
                            item.add(new MaterialLabel((i + 1) + ") " + cartDetailModels.get(i).getProduct().getName()));
                            MaterialCollectionSecondary secondary = new MaterialCollectionSecondary();
                            MaterialImage image = new MaterialImage(cartDetailModels.get(i).getProduct().getImage());
                            image.setWidth("75px");
                            image.setHeight("75px");
                            secondary.add(image);
                            item.add(secondary);
                            item.setHeight("120px");
                            MaterialButton button = new MaterialButton("Удалить", IconType.DELETE);
                            button.setMarginTop(45);
                            int finalI = i;
                            button.addClickHandler(new ClickHandler() {
                                @Override
                                public void onClick(ClickEvent clickEvent) {
                                    rest.deleteCartDetail(cartDetailModels.get(finalI).getId(), new MethodCallback<CartDetailModel>() {
                                        @Override
                                        public void onFailure(Method method, Throwable throwable) {
                                            MaterialToast.fireToast("Упс, что-то пошло не так...", 1000);
                                        }

                                        @Override
                                        public void onSuccess(Method method, CartDetailModel cartDetailModel) {
                                            if (cartDetailModel != null) {
                                                MaterialToast.fireToast("Удалено", 1000);
                                                Window.Location.replace("http://127.0.0.1:8888/index.html#product:");
                                            } else
                                                MaterialToast.fireToast("Упс, что-то пошло не так...", 1000);
                                        }
                                    });
                                }
                            });
                            item.add(button);
                            collection.add(item);
                        }
                        panel.add(collection);
                        panel.add(new MaterialLabel("Сумма: " + sum));
                        MaterialButton order = new MaterialButton("Заказать", IconType.SHOP);
                        order.setMarginLeft(890);
                        Float finalSum = sum;
                        order.addClickHandler(new ClickHandler() {
                            @Override
                            public void onClick(ClickEvent clickEvent) {
                                if (cartDetailModels.size() != 0) {
                                    userRest.getUser(StartPoint.getUserId(), new MethodCallback<UserModel>() {
                                        @Override
                                        public void onFailure(Method method, Throwable throwable) {
                                        }

                                        @Override
                                        public void onSuccess(Method method, UserModel userModels) {
                                            OrderModel orderModel = new OrderModel();
                                            orderModel.setId(1002);
                                            orderModel.setPromo_code(cartDetailModels.get(0).getCart().getPromo_code());
                                            orderModel.setAmount(finalSum);
                                            orderModel.setUser(userModels);
                                            orderModel.setAddress(userModels.getAddress());
                                            orderRest.createOrder(orderModel, new MethodCallback<OrderModel>() {
                                                @Override
                                                public void onFailure(Method method, Throwable throwable) {
                                                    MaterialToast.fireToast("Не удалось создать заказ", 2000);
                                                }

                                                @Override
                                                public void onSuccess(Method method, OrderModel orderModels) {
                                                    for (int i = 0; i < cartDetailModels.size(); i++) {
                                                        OrderDetailModel orderDetailModel = new OrderDetailModel();
                                                        orderDetailModel.setId(1003);
                                                        orderDetailModel.setProduct(cartDetailModels.get(i).getProduct());
                                                        orderDetailModel.setOrder(orderModels);
                                                        int finalI = i;
                                                        orderDetailRest.createOrderDetail(orderDetailModel, new MethodCallback<OrderDetailModel>() {
                                                            @Override
                                                            public void onFailure(Method method, Throwable throwable) {
                                                                MaterialToast.fireToast("Не удалось добавить товар", 2000);
                                                            }

                                                            @Override
                                                            public void onSuccess(Method method, OrderDetailModel orderDetailModel) {
                                                                MaterialToast.fireToast("Товар добавлен", 400);
                                                                rest.deleteCartDetail(cartDetailModels.get(finalI).getId(), new MethodCallback<CartDetailModel>() {
                                                                    @Override
                                                                    public void onFailure(Method method, Throwable throwable) {
                                                                        MaterialToast.fireToast("Упс, что-то пошло не так...", 1000);
                                                                    }

                                                                    @Override
                                                                    public void onSuccess(Method method, CartDetailModel cartDetailModel) {
                                                                        if (cartDetailModel != null) {
                                                                            Window.Location.replace("http://127.0.0.1:8888/index.html#product:");
                                                                        } else
                                                                            MaterialToast.fireToast("Упс, что-то пошло не так...", 1000);
                                                                    }
                                                                });
                                                            }
                                                        });
                                                    }
                                                    MaterialToast.fireToast("Вы успешно оформили заказ!", 5000);
                                                }
                                            });
                                        }
                                    });
                                }
                            }
                        });
                        panel.add(order);
                    }
                }
            });
        }
    }

    /**
     * The interface Cart view ui binder.
     */
    interface CartViewUiBinder extends UiBinder<Widget, CartView> {
    }
}