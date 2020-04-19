package com.netcracker.shop.client.mvp.activity;

import java.util.LinkedHashMap;
import java.util.Map;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.netcracker.shop.client.AppConstants;


/**
 * The type Abstract main activity.
 */
public abstract class AbstractMainActivity extends AbstractActivity {
    private static Map<String, Element> navLinks = new LinkedHashMap<>();

    static {
        navLinks.put(AppConstants.HOME_LINK_ID, DOM.getElementById(AppConstants.HOME_LINK_ID));
        navLinks.put(AppConstants.ACCOUNT_LINK_ID, DOM.getElementById(AppConstants.ACCOUNT_LINK_ID));
        navLinks.put(AppConstants.CONTACTS_LINK_ID, DOM.getElementById(AppConstants.CONTACTS_LINK_ID));
        navLinks.put(AppConstants.DELIVERY_LINK_ID, DOM.getElementById(AppConstants.DELIVERY_LINK_ID));
        navLinks.put(AppConstants.PRODUCT_LINK_ID, DOM.getElementById(AppConstants.PRODUCT_LINK_ID));
        navLinks.put(AppConstants.CART_LINK_ID, DOM.getElementById(AppConstants.CART_LINK_ID));
    }

    /**
     * Apply current link style.
     *
     * @param viewId the view id
     */
    public void applyCurrentLinkStyle(String viewId) {
        for (String linkId : navLinks.keySet()) {
            final Element link = navLinks.get(linkId);
            if (link == null) continue;
            if (linkId.equals(viewId)) {
                link.addClassName("b-current");
            } else {
                link.removeClassName("b-current");
            }
        }
    }
}
