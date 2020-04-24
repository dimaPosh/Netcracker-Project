package com.netcracker.shop.server.rest;

import com.netcracker.shop.server.model.CartDetailModel;
import com.netcracker.shop.server.model.ProductModel;
import org.fusesource.restygwt.client.MethodCallback;
import org.fusesource.restygwt.client.RestService;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.List;

/**
 * The interface Cart detail rest.
 */
public interface CartDetailRest extends RestService {


    /**
     * Cart detail all.
     *
     * @param id       the id
     * @param callback the callback
     */
    @GET
    @Path("/cartdetail/all/{id}")
    public void cartDetailAll(@PathParam("id") Integer id, MethodCallback<List<CartDetailModel>> callback);

    /**
     * Create cart detail.
     *
     * @param model    the model
     * @param callback the callback
     */
    @POST
    @Path("/cartdetail")
    public void createCartDetail(CartDetailModel model, MethodCallback<CartDetailModel> callback);


    /**
     * Delete cart detail.
     *
     * @param id       the id
     * @param callback the callback
     */
    @DELETE
    @Path("/cartdetail/delete")
    public void deleteCartDetail(Integer id, MethodCallback<CartDetailModel> callback);
}
