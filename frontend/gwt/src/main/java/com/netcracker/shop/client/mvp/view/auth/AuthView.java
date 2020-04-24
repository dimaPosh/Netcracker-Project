package com.netcracker.shop.client.mvp.view.auth;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.netcracker.shop.client.StartPoint;
import com.netcracker.shop.client.mvp.view.IAuthView;
import com.netcracker.shop.server.model.LogInModel;
import com.netcracker.shop.server.model.RoleModel;
import com.netcracker.shop.server.model.UserModel;
import com.netcracker.shop.server.rest.LogInRest;
import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.constants.InputType;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialPanel;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.MaterialToast;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;

/**
 * The type Auth view.
 */
public class AuthView extends Composite implements IAuthView {

    /**
     * The Panel.
     */
    @UiField
    protected MaterialPanel panel;
    private LogInRest rest;
    private IAuthPresenter presenter;

    @Override
    public void setPresenter(IAuthPresenter presenter) {
        this.presenter = presenter;
    }


    private static AuthViewUiBinder ourUiBinder = GWT.create(AuthViewUiBinder.class);

    /**
     * Instantiates a new Auth view.
     */
    public AuthView() {
        this.rest = GWT.create(LogInRest.class);
        initWidget(ourUiBinder.createAndBindUi(this));
        panel.setMarginTop(150);
        panel.setMarginLeft(200);
        MaterialTextBox login = new MaterialTextBox();
        MaterialTextBox password = new MaterialTextBox();
        password.setType(InputType.PASSWORD);
        password.setLabel("Password");
        login.setLabel("Login");
        password.setWidth("500px");
        login.setWidth("500px");
        panel.add(login);
        panel.add(password);
        MaterialButton button = new MaterialButton("Войти", IconType.VERIFIED_USER);
        button.setMarginLeft(20);
        button.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                LogInModel logInModel = new LogInModel();
                logInModel.setLogin(login.getText().toString());
                logInModel.setPassword(password.getText().toString());
                rest.login(logInModel, new MethodCallback<UserModel>() {
                    @Override
                    public void onFailure(Method method, Throwable throwable) {
                        MaterialToast.fireToast("Неправильно введен логин или пароль!", 1500);
                    }

                    @Override
                    public void onSuccess(Method method, UserModel userModel) {
                        if (userModel.getId() != null) {
                            MaterialToast.fireToast("Вы успешно авторизовались", 1000);
                            StartPoint.setUserId(userModel.getId());
                            StartPoint.setCart(userModel.getCart());
                            Window.Location.replace("http://127.0.0.1:8888/index.html#account:");
                        } else{
                            MaterialToast.fireToast("Неправильно введен логин или пароль!", 1500);
                            login.setErrorText("Проверьте правильность логина");
                            password.setErrorText("Проверьте правильность пароля");
                        }

                    }
                });
            }
        });
        MaterialButton button1 = new MaterialButton("Зарегестрироваться", IconType.ACCOUNT_BOX);
        button1.setMarginLeft(10);
        button1.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                Window.Location.replace("http://127.0.0.1:8888/index.html#registr:");
            }
        });
        HorizontalPanel hp = new HorizontalPanel();
        hp.setWidth("500px");
        hp.add(button);
        hp.add(button1);
        panel.add(hp);
    }


    /**
     * The interface Auth view ui binder.
     */
    interface AuthViewUiBinder extends UiBinder<Widget, AuthView> {
    }
}