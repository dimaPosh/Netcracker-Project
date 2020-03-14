package com.netcracker.shop.client.address;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;

/**
 * Span span span!
 *
 * @since 0.0.1
 */
public class AddressView extends Composite {

    /**
     * Field for input.
     */
    @UiField
    //@checkstyle VisibilityModifierCheck (2 lines)
    protected TextBox input;

    /**
     * Result of calculation.
     */
    @UiField
    //@checkstyle VisibilityModifierCheck (2 lines)
    protected Label output;

    /**
     * UI binder.
     */
    private final AddressViewUiBinder binder;

    private final AddressRest rest;

    /**
     * Constructor which create a view according to markup from MainView.ui.xml.
     *
     * @param binder Ui binder for this view.
     */
    @Inject
    public AddressView(final AddressViewUiBinder binder, final AddressRest rest) {
        this.binder = binder;
        this.rest = rest;
    }

    /**
     * Init our view.
     *
     * @return This object.
     */
    public final AddressView init() {
        super.initWidget(this.binder.createAndBindUi(this));
        return this;
    }

    /**
     * Send rest query to back end.
     *
     * @param event Using for click event.
     */
    @UiHandler("calculate")
    public void calculateClick(final ClickEvent event) {
        final int value = Integer.parseInt(this.input.getText());
        this.rest.gets(value, new MethodCallback<AddressModel>() {
            @Override
            public void onFailure(Method method, Throwable throwable) {
                Window.alert(new StringBuilder()
                    .append("Error: ").append(throwable.getMessage()).toString()
                );
            }

            @Override
            public void onSuccess(Method method, AddressModel addressModel) {
                AddressView.this.output.setText(addressModel.getAddress());
            }
        });
    }

    /**
     * Interface for autoimplementation of our view.
     *
     * @since 0.0.1
     */
    interface AddressViewUiBinder extends UiBinder<Widget, AddressView> {
    }
}
