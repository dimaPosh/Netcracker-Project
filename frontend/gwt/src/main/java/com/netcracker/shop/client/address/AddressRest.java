package com.netcracker.shop.client.address;


import org.fusesource.restygwt.client.MethodCallback;
import org.fusesource.restygwt.client.RestService;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;


/**
 * Using restyGWT for call back end code.
 *
 * @since 0.0.1
 */
public interface AddressRest extends RestService {

    /**
     * Calculate flat factorial.
     *
     * @param value    the value
     * @param callback the callback
     */
    @GET
    @Path("/address/{value}")
    void gets(@PathParam("value") Integer value, MethodCallback<AddressModel> callback);


    /**
     * Calculate factoiral with automatic define.
     *
     * @param request  the request
     * @param callback the callback
     */
    @POST
    @Path("/address")
    void posts(AddressModel request, MethodCallback<AddressModel> callback);

}

