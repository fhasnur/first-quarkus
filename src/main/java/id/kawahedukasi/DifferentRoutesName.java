package id.kawahedukasi;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/*
 * Simple Endpoint with Different Routes Name
 */
@Path("")
public class DifferentRoutesName {

    @GET
    @Path("/info")
    @Produces(MediaType.TEXT_PLAIN)
    public String info() {
        return "Info: an abstact concept that refers to that wich has the power to inform";
    }

    @GET
    @Path("/about")
    @Produces(MediaType.TEXT_PLAIN)
    public String about() {
        return "About: used to indicate movement within a particular area";
    }

    @GET
    @Path("/home")
    @Produces(MediaType.TEXT_PLAIN)
    public String home() {
        return "Home: a space used a permanent or semi-permanent residence for one or many humans";
    }

}
