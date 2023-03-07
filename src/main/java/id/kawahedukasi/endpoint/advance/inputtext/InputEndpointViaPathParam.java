package id.kawahedukasi.endpoint.advance.inputtext;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/*
 * Get Input Endpoint Via Path Param
 */
@Path("/my-day")
@Produces(MediaType.TEXT_PLAIN)
public class InputEndpointViaPathParam {
    @GET
    @Path("/{mood}")
    public String myDay(@PathParam("mood") String mood) {
        switch(mood) {
            case "happy":
                return "today was favored by fortune";
            case "sad":
                return "feeling or showing sorrow";
            case "angry":
                return "i'm angry that she didn't call me";
            default:
                return "Unknown Mood, are u not a human?";
        }
    }
}
