/*
 * Copyright
 */

package com.netcracker.shop.client.in.log;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import gwt.material.design.client.ui.MaterialButton;

public class LogInView extends Composite {

    @UiField(provided = true)
    protected final MaterialButton button;

    private final LogInViewUiBinder binder;

    @Inject
    public LogInView(MaterialButton button, final LogInViewUiBinder binder) {
        this.button = button;
        this.binder = binder;
    }

    public final LogInView init() {
        super.initWidget(this.binder.createAndBindUi(this));
        return this;
    }

    interface LogInViewUiBinder extends UiBinder<Widget, LogInView> {
    }
}