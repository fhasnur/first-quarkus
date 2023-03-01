package id.kawahedukasi;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/*
 * Simple Endpoint with Different Routes Name
 */
@Path("/people")
@Produces(MediaType.TEXT_PLAIN)
public class DifferentEndpointWithSameRoutes {
    @GET
    @Path("/name")
    public String name() {
        return "Name: Fandi Hasnur";
    }

    @GET
    @Path("/address")
    public String address() {
        return "Address: Jl. Kembang, Baubau";
    }

    @GET
    @Path("/school")
    public String school() {
        return "School: Universitas Negeri Makassar";
    }
}
