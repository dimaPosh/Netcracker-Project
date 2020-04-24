package com.netcracker.shop.server.rest;

import com.netcracker.shop.server.model.OrderModel;
import org.fusesource.restygwt.client.MethodCallback;
import org.fusesource.restygwt.client.RestService;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.List;

/**
 * The interface Order rest.
 */
public interface OrderRest extends RestService {
    /**
     * Gets all.
     *
     * @param id       the id
     * @param callback the callback
     * @return the all
     */
    @GET
    @Path("/order/all/{id}")
    void getAll(@PathParam("id") Integer id, MethodCallback<List<OrderModel>> callback);

    /**
     * Create order detail order detail model.
     *
     * @param orderModel the order model
     * @param callback   the callback
     * @return the order detail model
     */
    @POST
    @Path("/order")
    void createOrder(OrderModel orderModel, MethodCallback<OrderModel> callback);
}
