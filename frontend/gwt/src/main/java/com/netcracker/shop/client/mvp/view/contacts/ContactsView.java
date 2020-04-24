package com.netcracker.shop.client.mvp.view.contacts;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.netcracker.shop.client.StartPoint;
import com.netcracker.shop.client.mvp.view.IContactsView;
import com.netcracker.shop.server.model.AddressModel;
import com.netcracker.shop.server.rest.AddressRest;
import gwt.material.design.client.constants.ButtonSize;
import gwt.material.design.client.constants.IconSize;
import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.ui.MaterialCollection;
import gwt.material.design.client.ui.MaterialCollectionItem;
import gwt.material.design.client.ui.MaterialCollectionSecondary;
import gwt.material.design.client.ui.MaterialIcon;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialPanel;
import gwt.material.design.client.ui.MaterialToast;
import gwt.material.design.client.ui.MaterialTooltip;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;

import java.util.List;

/**
 * The type Contacts view.
 */
public class ContactsView extends Composite implements IContactsView {
    /**
     * The Panel.
     */
    @UiField
    protected MaterialPanel panel;
    private final AddressRest rest;
    private static ContactsViewUiBinder uiBinder = GWT.create(ContactsViewUiBinder.class);

    private IContactsPresenter presenter;

    /**
     * Instantiates a new Contacts view.
     */
    public ContactsView() {
        initWidget(uiBinder.createAndBindUi(this));
        this.rest = GWT.create(AddressRest.class);
        this.rest.addressAll(new MethodCallback<List<AddressModel>>() {
            @Override
            public void onFailure(Method method, Throwable throwable) {
                MaterialToast.fireToast("Адресса не найдены", 1000);
            }

            @Override
            public void onSuccess(Method method, List<AddressModel> addressModels) {
                MaterialCollection collection = new MaterialCollection();
                collection.setHeader("Адреса наших магазинов ");
                for (int i = 0; i < addressModels.size(); i++) {
                    MaterialCollectionItem item = new MaterialCollectionItem();
                    MaterialCollectionSecondary secondary = new MaterialCollectionSecondary();
                    MaterialLink link = new MaterialLink(IconType.MAP);
                    link.setIconSize(IconSize.SMALL);
                    link.addClickHandler(new ClickHandler() {
                        @Override
                        public void onClick(ClickEvent clickEvent) {
                            Window.open("https://yandex.ru/maps/193/voronezh/catalog/8/?ll=39.200269%2C51.660781&z=12","_blank","enabled");
                        }
                    });
                    MaterialTooltip tooltip = new MaterialTooltip(link, "Посмотреть на карте");
                    secondary.add(tooltip);
                    item.add(new MaterialLabel((i + 1) + ") " + addressModels.get(i).toString()));
                    item.add(secondary);
                    collection.add(item);
                }
                panel.add(collection);
            }
        });
    }

    @Override
    public void setPresenter(IContactsView.IContactsPresenter presenter) {
        this.presenter = presenter;
    }

    /**
     * The interface Contacts view ui binder.
     */
    interface ContactsViewUiBinder extends UiBinder<Widget, ContactsView> {
    }
}