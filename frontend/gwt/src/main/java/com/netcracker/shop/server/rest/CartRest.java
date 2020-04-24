package com.netcracker.shop.server.rest;

import com.netcracker.shop.server.model.CartModel;
import org.fusesource.restygwt.client.MethodCallback;
import org.fusesource.restygwt.client.RestService;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * The interface Cart rest.
 */
public interface CartRest extends RestService {


    /**
     * Create cart.
     *
     * @param cartModel the cart model
     * @param callback  the callback
     */
    @POST
    @Path("/cart")
    public void createCart(CartModel cartModel, MethodCallback<CartModel> callback);
}
