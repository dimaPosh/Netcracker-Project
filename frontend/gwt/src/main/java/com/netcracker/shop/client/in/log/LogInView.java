/*
 * Copyright
 */

package com.netcracker.shop.client.in.log;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.netcracker.shop.server.model.LogInModel;
import com.netcracker.shop.server.rest.LogInRest;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialPanel;
import gwt.material.design.client.ui.MaterialTextBox;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;

/**
 * The type Log in view.
 */
public class LogInView extends Composite {

    /**
     * The Login.
     */
    @UiField(provided = true)
    protected MaterialTextBox login;

    /**
     * The Password.
     */
    @UiField(provided = true)
    protected MaterialTextBox password;

    private final LogInRest rest;

    private final LogInViewUiBinder binder;

    /**
     * Instantiates a new Log in view.
     *
     * @param rest   the rest
     * @param binder the binder
     */
    @Inject
    public LogInView(final LogInRest rest, final LogInViewUiBinder binder, final MaterialTextBox login, final MaterialTextBox password) {
        this.rest = rest;
        this.binder = binder;
        this.login = login;
        this.password = password;
    }

    /**
     * Init log in view.
     *
     * @return the log in view
     */
    public final LogInView init() {
        super.initWidget(this.binder.createAndBindUi(this));
        return this;
    }

    /**
     * Log in click.
     *
     * @param event the event
     */
    @UiHandler("LOG_IN")
    public void logInClick(final ClickEvent event) {
        final LogInModel model = new LogInModel();
        model.setLogin(this.login.getText());
        model.setPassword(this.password.getText());
        this.rest.login(model, new MethodCallback<String>() {
            @Override
            public void onFailure(Method method, Throwable throwable) {
                Window.alert("Error: " + throwable.getMessage());
            }

            @Override
            public void onSuccess(Method method, String s) {
                Window.alert(s);
            }
        });
    }

    /**
     * The interface Log in view ui binder.
     */
    interface LogInViewUiBinder extends UiBinder<Widget, LogInView> {
    }
}