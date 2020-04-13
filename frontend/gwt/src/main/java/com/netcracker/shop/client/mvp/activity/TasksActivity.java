package com.netcracker.shop.client.mvp.activity;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.netcracker.shop.client.AppConstants;
import com.netcracker.shop.client.ClientFactory;
import com.netcracker.shop.client.mvp.view.ITasksView;

public class TasksActivity extends AbstractMainActivity implements ITasksView.ITasksPresenter {
    private ClientFactory clientFactory;

    public TasksActivity(ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }

    @Override
    public void start(AcceptsOneWidget container, EventBus eventBus) {
        applyCurrentLinkStyle(AppConstants.TASKS_LINK_ID);

        final ITasksView view = clientFactory.getTasksView();
        view.setPresenter(this);
        container.setWidget(view.asWidget());
    }
}
