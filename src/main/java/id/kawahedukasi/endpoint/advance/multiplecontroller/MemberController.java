package id.kawahedukasi.endpoint.advance.multiplecontroller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/*
* Multiple Controller
*/
@Path("/member")
@Produces(MediaType.TEXT_PLAIN)
public class MemberController {
    @GET
    @Path("/info")
    public String info() {
        return "Member: someone  who create  an account in our store";
    }

    @GET
    @Path("/count")
    public String count() {
        return "Current Member: 170 Peoples";
    }

    @GET
    @Path("/register")
    public String register() {
        return "How to register: please visit our store";
    }
}