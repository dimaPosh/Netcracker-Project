package com.netcracker.shop.gin;

import com.google.gwt.inject.client.Ginjector;
import com.netcracker.shop.client.mvp.view.product.ProductView;

public interface Injection extends Ginjector {
    ProductView getProductView();
}
