package com.netcracker.shop.server.rest;

import com.netcracker.shop.server.model.UserModel;
import org.fusesource.restygwt.client.MethodCallback;
import org.fusesource.restygwt.client.RestService;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * The interface User rest.
 */
public interface UserRest extends RestService {
    /**
     * Gets user.
     *
     * @param id       the id
     * @param callback the callback
     */
    @GET
    @Path("/user/{id}")
    public void getUser(@PathParam("id") Integer id, MethodCallback<UserModel> callback);


    @POST
    @Path("/user")
    public void createUser(UserModel user, MethodCallback<UserModel> model);
}
