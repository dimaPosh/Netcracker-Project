package com.netcracker.shop.client.layout;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * The type App layout.
 */
public class AppLayout extends Composite {
    /**
     * The interface App layout ui binder.
     */
    interface AppLayoutUiBinder extends UiBinder<Widget, AppLayout> {
    }

    private static AppLayoutUiBinder uiBinder = GWT.create(AppLayoutUiBinder.class);

    /**
     * The App content.
     */
    @UiField
    SimplePanel appContent;

    /**
     * Instantiates a new App layout.
     */
    public AppLayout() {
        initWidget(uiBinder.createAndBindUi(this));
    }

    /**
     * Gets app content holder.
     *
     * @return the app content holder
     */
    public SimplePanel getAppContentHolder() {
        return this.appContent;
    }
}