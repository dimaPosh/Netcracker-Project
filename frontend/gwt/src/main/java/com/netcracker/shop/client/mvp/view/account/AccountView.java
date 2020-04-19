package com.netcracker.shop.client.mvp.view.account;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.netcracker.shop.client.StartPoint;
import com.netcracker.shop.client.mvp.view.IAccountView;
import com.netcracker.shop.server.model.UserModel;
import com.netcracker.shop.server.rest.UserRest;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;

/**
 * The type Account view.
 */
public class AccountView extends Composite implements IAccountView {
    /**
     * The Login.
     */
    @UiField
    protected TextBox login;
    /**
     * The First name.
     */
    @UiField
    protected TextBox first_name;
    /**
     * The Last name.
     */
    @UiField
    protected TextBox last_name;
    /**
     * The Email.
     */
    @UiField
    protected TextBox email;
    /**
     * The Phone.
     */
    @UiField
    protected TextBox phone;
    private final UserRest rest;
    private UserModel model = new UserModel();
    private static AccountViewUiBinder uiBinder = GWT.create(AccountViewUiBinder.class);

    private IAccountPresenter presenter;

    /**
     * Instantiates a new Account view.
     */
    public AccountView() {
        this.rest = GWT.create(UserRest.class);
        initWidget(uiBinder.createAndBindUi(this));
        this.rest.getUser(100/*StartPoint.getUserId()*/, new MethodCallback<UserModel>() {
            @Override
            public void onFailure(Method method, Throwable throwable) {
                Window.alert("Error: " + throwable.getMessage());
            }

            @Override
            public void onSuccess(Method method, UserModel userModel) {
                login.setText(userModel.getLogin());
                last_name.setText(userModel.getLast_name());
                first_name.setText(userModel.getFirst_name());
                email.setText(userModel.getEmail());
                phone.setText(userModel.getPhone_number());
            }
        });
    }

    @Override
    public void setPresenter(IAccountPresenter presenter) {
        this.presenter = presenter;
    }

    /**
     * The interface Account view ui binder.
     */
    interface AccountViewUiBinder extends UiBinder<Widget, AccountView> {
    }
}