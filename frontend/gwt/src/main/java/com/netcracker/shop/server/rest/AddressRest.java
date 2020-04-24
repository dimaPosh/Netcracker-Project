package com.netcracker.shop.server.rest;

import com.netcracker.shop.server.model.AddressModel;
import org.fusesource.restygwt.client.MethodCallback;
import org.fusesource.restygwt.client.RestService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

public interface AddressRest extends RestService {

    @GET
    @Path("/address/all")
    public void addressAll(MethodCallback<List<AddressModel>> callback);
}
