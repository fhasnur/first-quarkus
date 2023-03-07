package id.kawahedukasi.endpoint.advance.multiplecontroller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/*
 * Multiple Controller
 */
@Path("/product")
@Produces(MediaType.TEXT_PLAIN)
public class ProductController {
    @GET
    public String list() {
        return "Our Product: \n-Gold\n-Silver";
    }

    @GET
    @Path("/bestSeller")
    public String bestSeller() {
        return "Our Best Seller: Gold 10 gram";
    }
}