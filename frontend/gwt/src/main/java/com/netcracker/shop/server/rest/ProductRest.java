package com.netcracker.shop.server.rest;

import com.netcracker.shop.server.model.ProductModel;
import org.fusesource.restygwt.client.MethodCallback;
import org.fusesource.restygwt.client.RestService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.List;

public interface ProductRest extends RestService {
    @GET
    @Path("/product/{id}")
    public void product(@PathParam("id") Integer id, MethodCallback<ProductModel> callback);

    @GET
    @Path("/product/all")
    public void productAll(MethodCallback<List<ProductModel>> methodCallback);
}
