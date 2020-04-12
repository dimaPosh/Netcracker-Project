package com.netcracker.shop.client.basic.footer;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class FooterView extends Composite {

    private final FooterViewUiBinder binder;

    @Inject
    public FooterView(FooterViewUiBinder binder) {
        this.binder = binder;
    }

    public final FooterView init(){
        super.initWidget(this.binder.createAndBindUi(this));
        return this;
    }
    interface FooterViewUiBinder extends UiBinder<Widget, FooterView> {
    }
}