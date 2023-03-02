package id.kawahedukasi;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/*
 * Simple Endpoint with Different HTTP Method
 */
@Path("/sample")
public class DifferentHttpMethod {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
        return "This is a sample GET endpoint";
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String post() {
        return "This is a sample POST endpoint";
    }

    @PUT
    @Produces(MediaType.TEXT_PLAIN)
    public String put() {
        return "This is a sample PUT endpoint";
    }

    @DELETE
    @Produces(MediaType.TEXT_PLAIN)
    public String delete() {
        return "This is a sample DELETE endpoint";
    }
}
