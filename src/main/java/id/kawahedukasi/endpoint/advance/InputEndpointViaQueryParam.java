package id.kawahedukasi.endpoint.advance;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/*
 * Get Input Endpoint Via Query Param
 */
@Path("/math")
@Produces(MediaType.TEXT_PLAIN)
public class InputEndpointViaQueryParam {
    @GET
    @Path("/pow")
    public String myDay(@QueryParam("x") Integer x, @QueryParam("y") Integer y) {
        return "Math Pow Result: " + Math.pow(x,y);
    }
}