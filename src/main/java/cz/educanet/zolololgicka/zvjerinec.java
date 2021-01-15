package main.java.cz.educanet.zolololgicka;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.Arrays;

@Path("zvjer")
public class zvjerinec {
    public static String[] enimelz;

    @PUT
    public Response addzvjer(@FormParam("animal") String name, @FormParam("id") int pos){
        if (enimelz[pos] != null) return Response.status(400).build();
        enimelz[pos] = name;
        return Response.ok().build();
    }

    @DELETE
    public Response remzvjer(@FormParam("id") int pos){
        enimelz[pos] = null;
        return Response.ok().build();
    }

    @GET
    public Response getzvjer(@DefaultValue("-2147483648") @FormParam("id") int pos){
        if (pos == -2147483648) return Response.ok(Arrays.toString(enimelz)).build();
        return Response.ok(enimelz[pos]).build();
    }
}
