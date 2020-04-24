/*
 * Copyright
 */

package com.netcracker.shop.server.rest;

import com.netcracker.shop.server.model.LogInModel;
import com.netcracker.shop.server.model.UserModel;
import org.fusesource.restygwt.client.MethodCallback;
import org.fusesource.restygwt.client.RestService;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * The interface Log in.
 */
public interface LogInRest extends RestService {

    /**
     * Login.
     *
     * @param request  the request
     * @param callback the callback
     */
    @POST
    @Path("/signin")
    void login(LogInModel request, MethodCallback<UserModel> callback);

    /**
     * Check login.
     *
     * @param login    the login
     * @param callback the callback
     */
    @POST
    @Path("/signup")
    void checkLogin(String login, MethodCallback<Boolean> callback);
}
