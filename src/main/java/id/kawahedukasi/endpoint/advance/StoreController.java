package id.kawahedukasi.endpoint.advance;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/*
 * Multiple Controller
 */
@Path("/store")
public class StoreController {
    @GET
    public String list() {
        return "Find Us at: \n-Bandung\n-Jakarta\n-Surabaya";
    }
}