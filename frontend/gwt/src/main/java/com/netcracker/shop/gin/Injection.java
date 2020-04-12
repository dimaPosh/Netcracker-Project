/*
 * Copyright
 */

package com.netcracker.shop.gin;

import com.google.gwt.inject.client.Ginjector;
import com.netcracker.shop.client.basic.footer.FooterView;
import com.netcracker.shop.client.basic.header.HeaderView;
import com.netcracker.shop.client.basic.navbar.NavBarView;
import com.netcracker.shop.client.in.log.LogInView;
import com.netcracker.shop.client.main.MainPageView;

/**
 * Injector interface.
 *
 * @since 0.0.1
 */
public interface Injection extends Ginjector {
    MainPageView getMainPageView();
    LogInView getLogInView();
    FooterView getFooterView();
    NavBarView getNavBarView();
    HeaderView getHeaderView();
}