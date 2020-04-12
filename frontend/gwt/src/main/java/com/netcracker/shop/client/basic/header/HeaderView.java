package com.netcracker.shop.client.basic.header;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;


/**
 * The type Header view.
 */
public class HeaderView extends Composite {

    private final HeaderViewUiBinder binder;

    /**
     * Instantiates a new Header view.
     *
     * @param binder the binder
     */
    @Inject
    public HeaderView(HeaderViewUiBinder binder) {
        this.binder = binder;
    }

    /**
     * Init header view.
     *
     * @return the header view
     */
    public final HeaderView init() {
        super.initWidget(this.binder.createAndBindUi(this));
        return this;
    }

    /**
     * The interface Header view ui binder.
     */
    interface HeaderViewUiBinder extends UiBinder<Widget, HeaderView> {
    }
}