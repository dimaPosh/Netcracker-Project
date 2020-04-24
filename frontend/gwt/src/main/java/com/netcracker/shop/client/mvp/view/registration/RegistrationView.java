package com.netcracker.shop.client.mvp.view.registration;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.netcracker.shop.client.mvp.view.IRegistrationView;
import com.netcracker.shop.server.model.AddressModel;
import com.netcracker.shop.server.model.CartModel;
import com.netcracker.shop.server.model.UserModel;
import com.netcracker.shop.server.rest.AddressRest;
import com.netcracker.shop.server.rest.CartRest;
import com.netcracker.shop.server.rest.LogInRest;
import com.netcracker.shop.server.rest.UserRest;
import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.constants.InputType;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialCollection;
import gwt.material.design.client.ui.MaterialCollectionItem;
import gwt.material.design.client.ui.MaterialPanel;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.MaterialToast;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;

import java.util.List;

/**
 * The type Registration view.
 */
public class RegistrationView extends Composite implements IRegistrationView {
    /**
     * The Panel.
     */
    @UiField
    protected MaterialPanel panel;
    private CartRest cartRest;
    private LogInRest rest;
    private AddressRest addressRest;
    private UserRest userRest;
    private IRegistrationPresenter presenter;
    private CartModel cart = new CartModel();
    private AddressModel address = new AddressModel();
    private UserModel userModel = new UserModel();

    @Override
    public void setPresenter(IRegistrationPresenter presenter) {
        this.presenter = presenter;
    }


    private static RegistrationViewUiBinder ourUiBinder = GWT.create(RegistrationViewUiBinder.class);

    /**
     * Instantiates a new Registration view.
     */
    public RegistrationView() {
        this.rest = GWT.create(LogInRest.class);
        this.addressRest = GWT.create(AddressRest.class);
        this.cartRest = GWT.create(CartRest.class);
        this.userRest = GWT.create(UserRest.class);
        initWidget(ourUiBinder.createAndBindUi(this));
        panel.setMarginTop(20);
        panel.setMarginLeft(200);
        MaterialCollection collection = new MaterialCollection();
        collection.setWidth("500px");
        MaterialCollectionItem item = new MaterialCollectionItem();
        MaterialTextBox login = new MaterialTextBox();
        login.setLabel("Login: ");
        login.setType(InputType.TEXT);
        login.setMaxLength(25);
        item.add(login);
        collection.add(item);
        MaterialTextBox password = new MaterialTextBox();
        item = new MaterialCollectionItem();
        password.setLabel("Password: ");
        password.setType(InputType.PASSWORD);
        password.setMaxLength(255);
        item.add(password);
        collection.add(item);
        MaterialTextBox password1 = new MaterialTextBox();
        item = new MaterialCollectionItem();
        password1.setLabel("Repeat password: ");
        password1.setType(InputType.PASSWORD);
        password1.setMaxLength(255);
        item.add(password1);
        collection.add(item);
        MaterialTextBox firstName = new MaterialTextBox();
        item = new MaterialCollectionItem();
        firstName.setLabel("Фамилия: ");
        firstName.setType(InputType.TEXT);
        firstName.setMaxLength(25);
        item.add(firstName);
        collection.add(item);
        MaterialTextBox lastName = new MaterialTextBox();
        item = new MaterialCollectionItem();
        lastName.setLabel("Имя: ");
        lastName.setType(InputType.TEXT);
        lastName.setMaxLength(25);
        item.add(lastName);
        collection.add(item);
        MaterialTextBox email = new MaterialTextBox();
        item = new MaterialCollectionItem();
        email.setLabel("Email: ");
        email.setType(InputType.EMAIL);
        email.setMaxLength(40);
        item.add(email);
        collection.add(item);
        MaterialTextBox phone = new MaterialTextBox();
        item = new MaterialCollectionItem();
        phone.setLabel("Телефон: ");
        phone.setType(InputType.TEL);
        phone.setMaxLength(25);
        item.add(phone);
        collection.add(item);
        addressRest.addressAll(new MethodCallback<List<AddressModel>>() {
            @Override
            public void onFailure(Method method, Throwable throwable) {
                MaterialToast.fireToast("Не удалось загрузить адресса");
            }

            @Override
            public void onSuccess(Method method, List<AddressModel> addressModels) {
                address = addressModels.get(0);
                MaterialTextBox addressTextBox = new MaterialTextBox();
                MaterialCollectionItem itemAd = new MaterialCollectionItem();
                addressTextBox.setLabel("Аддрес доставки: ");
                addressTextBox.setType(InputType.TEXT);
                addressTextBox.setMaxLength(225);
                addressTextBox.setEnabled(false);
                addressTextBox.setText(address.toString());
                itemAd.add(addressTextBox);
                collection.add(itemAd);
                userModel.setAddress(address);
            }
        });
        MaterialTextBox promo = new MaterialTextBox();
        item = new MaterialCollectionItem();
        promo.setLabel("Промокод: ");
        promo.setType(InputType.TEXT);
        promo.setMaxLength(30);
        item.add(promo);
        collection.add(item);
        panel.add(collection);
        MaterialButton button = new MaterialButton("Зарегестрироваться", IconType.ACCOUNT_BOX);
        button.setMarginLeft(100);
        button.setWidth("300px");
        button.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                if (password.getText().equals(password1.getText())) {
                    password.setSuccessText("Пароли совпадают");
                    password1.setSuccessText("Пароли совпадают");
                    rest.checkLogin(login.getText(), new MethodCallback<Boolean>() {
                        @Override
                        public void onFailure(Method method, Throwable throwable) {
                            MaterialToast.fireToast("Упс, что-то пошло не так...", 2000);
                            MaterialToast.fireToast("Попробуйте еще раз!", 2000);
                        }

                        @Override
                        public void onSuccess(Method method, Boolean aBoolean) {
                            if (!aBoolean) {
                                MaterialToast.fireToast("Такой логин уже занят(", 2000);
                                MaterialToast.fireToast("Придумайте что-то еще!", 2000);
                                login.setErrorText("Введите другой логин");
                            } else {
                                login.clearErrorText();
                                login.setSuccessText("Логин уникален");
                                cart.setId(1000);
                                cart.setPromo_code(promo.getText());
                                cartRest.createCart(cart, new MethodCallback<CartModel>() {
                                    @Override
                                    public void onFailure(Method method, Throwable throwable) {
                                        MaterialToast.fireToast("Упс, что-то пошло не так...", 2000);
                                    }

                                    @Override
                                    public void onSuccess(Method method, CartModel cartModels) {
                                        promo.setSuccessText("Промокод успешно добавлен");
                                        userModel.setId(1003);
                                        userModel.setLogin(login.getText());
                                        userModel.setEmail(email.getText());
                                        userModel.setFirst_name(firstName.getText());
                                        userModel.setLast_name(lastName.getText());
                                        userModel.setPhone_number(phone.getText());
                                        userModel.setPassword(password.getText());
                                        userModel.setRole(2);
                                        userModel.setCart(cartModels);
                                        userRest.createUser(userModel, new MethodCallback<UserModel>() {
                                            @Override
                                            public void onFailure(Method method, Throwable throwable) {
                                                MaterialToast.fireToast("Упс, что-то пошло не так...", 2000);
                                                MaterialToast.fireToast("Попробуйте еще раз!", 2000);
                                            }

                                            @Override
                                            public void onSuccess(Method method, UserModel userModel) {
                                                Window.Location.replace("http://127.0.0.1:8888/index.html#auth:");
                                            }
                                        });
                                    }
                                });
                            }
                        }
                    });
                } else {
                    MaterialToast.fireToast("Повторите ввод пароля!", 2000);
                    password.clear();
                    password1.clear();
                    password.setErrorText("Пароли не совпадают");
                    password1.setErrorText("Пароли не совпадают");
                }
            }
        });
        panel.add(button);
    }

    /**
     * The interface Registration view ui binder.
     */
    interface RegistrationViewUiBinder extends UiBinder<Widget, RegistrationView> {
    }
}