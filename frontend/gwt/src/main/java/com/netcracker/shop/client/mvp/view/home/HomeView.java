package com.netcracker.shop.client.mvp.view.home;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.netcracker.shop.client.mvp.view.IHomeView;
import gwt.material.design.client.constants.DialogType;
import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialDialog;
import gwt.material.design.client.ui.MaterialDialogContent;
import gwt.material.design.client.ui.MaterialDialogFooter;
import gwt.material.design.client.ui.MaterialImage;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialPanel;

/**
 * The type Home view.
 */
public class HomeView extends Composite implements IHomeView {
    private IHomePresenter presenter;

    @Override
    public void setPresenter(IHomePresenter presenter) {
        this.presenter = presenter;
    }

    /**
     * The interface Home view ui binder.
     */
    interface HomeViewUiBinder extends UiBinder<Widget, HomeView> {
    }

    private static HomeViewUiBinder ourUiBinder = GWT.create(HomeViewUiBinder.class);

    /**
     * Instantiates a new Home view.
     */
    public HomeView() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}
