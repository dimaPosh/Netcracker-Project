package com.netcracker.shop.server.rest;

import com.netcracker.shop.server.model.ProductModel;
import org.fusesource.restygwt.client.MethodCallback;
import org.fusesource.restygwt.client.RestService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.List;

/**
 * The interface Product rest.
 */
public interface ProductRest extends RestService {
    /**
     * Product.
     *
     * @param id       the id
     * @param callback the callback
     */
    @GET
    @Path("/product/{id}")
    public void product(@PathParam("id") Integer id, MethodCallback<ProductModel> callback);

    /**
     * Product all.
     *
     * @param methodCallback the method callback
     */
    @GET
    @Path("/product/all")
    public void productAll(MethodCallback<List<ProductModel>> methodCallback);
}
