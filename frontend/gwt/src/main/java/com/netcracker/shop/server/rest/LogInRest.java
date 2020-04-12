/*
 * Copyright
 */

package com.netcracker.shop.server.rest;

import com.netcracker.shop.server.model.LogInModel;
import org.fusesource.restygwt.client.MethodCallback;
import org.fusesource.restygwt.client.RestService;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;

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
    @GET
    @Path("/security/login")
    void login(LogInModel request, MethodCallback<String> callback);
}
