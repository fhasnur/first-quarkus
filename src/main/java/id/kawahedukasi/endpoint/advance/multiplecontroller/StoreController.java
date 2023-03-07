package id.kawahedukasi.endpoint.advance.multiplecontroller;

import id.kawahedukasi.endpoint.advance.injectionbeans.service.StoreService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/*
 * Multiple Controller
 */
@Path("/store")
@Produces(MediaType.TEXT_PLAIN)
public class StoreController {
    @Inject
    StoreService storeService;

    @GET
    public String list() {
        return storeService.list();
    }

    @GET
    @Path("/city")
    public String info(@QueryParam("city") String city) {
        return storeService.info(city);
    }
}