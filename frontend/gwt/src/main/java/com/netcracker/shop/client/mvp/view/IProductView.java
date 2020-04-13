package com.netcracker.shop.client.mvp.view;

import com.google.gwt.user.client.ui.IsWidget;

public interface IProductView extends IsWidget {
    public void setPresenter(IProductPresenter presenter);

    public interface IProductPresenter {

    }
}
