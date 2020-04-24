package com.netcracker.shop.server.rest;

import com.netcracker.shop.server.model.OrderDetailModel;
import org.fusesource.restygwt.client.MethodCallback;
import org.fusesource.restygwt.client.RestService;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.List;

/**
 * The interface Order detail rest.
 */
public interface OrderDetailRest extends RestService {

    /**
     * Gets all.
     *
     * @param id       the id
     * @param callback the callback
     * @return the all
     */
    @GET
    @Path("/orderdetail/all/{id}")
    void  getAll(@PathParam("id") Integer id, MethodCallback<List<OrderDetailModel>> callback);

    /**
     * Create order detail order detail model.
     *
     * @param orderDetailModel the order detail model
     * @param callback         the callback
     * @return the order detail model
     */
    @POST
    @Path("/orderdetail")
    void  createOrderDetail(OrderDetailModel orderDetailModel, MethodCallback<OrderDetailModel> callback);

}
