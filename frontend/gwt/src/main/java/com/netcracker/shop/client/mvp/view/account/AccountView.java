package com.netcracker.shop.client.mvp.view.account;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.netcracker.shop.client.StartPoint;
import com.netcracker.shop.client.mvp.view.IAccountView;
import com.netcracker.shop.server.model.UserModel;
import com.netcracker.shop.server.rest.UserRest;
import gwt.material.design.client.constants.ButtonSize;
import gwt.material.design.client.constants.IconSize;
import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.ui.MaterialCollection;
import gwt.material.design.client.ui.MaterialCollectionItem;
import gwt.material.design.client.ui.MaterialIcon;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialPanel;
import gwt.material.design.client.ui.MaterialToast;
import gwt.material.design.client.ui.MaterialTooltip;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;

/**
 * The type Account view.
 */
public class AccountView extends Composite implements IAccountView {
    /**
     * The Panel.
     */
    @UiField
    protected MaterialPanel panel;
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
        if (StartPoint.getUserId() != null) {
            this.rest.getUser(StartPoint.getUserId(), new MethodCallback<UserModel>() {
                @Override
                public void onFailure(Method method, Throwable throwable) {
                }

                @Override
                public void onSuccess(Method method, UserModel userModel) {
                    HorizontalPanel hp = new HorizontalPanel();
                    MaterialCollection collection = new MaterialCollection();
                    MaterialCollectionItem item = new MaterialCollectionItem();
                    MaterialIcon icon = new MaterialIcon(IconType.ACCOUNT_CIRCLE);
                    icon.setIconSize(IconSize.MEDIUM);
                    item.add(icon);
                    collection.add(item);
                    item = new MaterialCollectionItem();
                    item.add(new Label("Login: " + userModel.getLogin()));
                    collection.add(item);
                    item = new MaterialCollectionItem();
                    item.add(new Label("Фамилия: " + userModel.getLast_name()));
                    collection.add(item);
                    item = new MaterialCollectionItem();
                    item.add(new Label("Имя: " + userModel.getFirst_name()));
                    collection.add(item);
                    item = new MaterialCollectionItem();
                    item.add(new Label("Email: " + userModel.getEmail()));
                    collection.add(item);
                    item = new MaterialCollectionItem();
                    item.add(new Label("Телефон: " + userModel.getPhone_number()));
                    collection.add(item);
                    item = new MaterialCollectionItem();
                    item.add(new Label("Аддрес вашего магазина: " + userModel.getAddress().toString()));
                    collection.add(item);
                    hp.add(collection);
                    MaterialLink link = new MaterialLink(IconType.CANCEL);
                    link.setIconSize(IconSize.LARGE);
                    link.addClickHandler(new ClickHandler() {
                        @Override
                        public void onClick(ClickEvent clickEvent) {
                            StartPoint.setUserId(null);
                            Window.Location.replace("http://127.0.0.1:8888/index.html#home:");
                        }
                    });
                    MaterialTooltip tooltip = new MaterialTooltip(link, "Выйти");
                    tooltip.setDelayMs(10);
                    hp.add(tooltip);
                    panel.add(hp);
                }
            });
        } else {
            Window.Location.replace("http://127.0.0.1:8888/index.html#auth:");
        }
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