package main.java.cz.educanet.zolololgicka;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

@Path("zvjer")
public class zvjerinec {
    public static ArrayList<String> enimelz = new ArrayList<String>();

    @PUT
    public Response addzvjer(@QueryParam("animal") String name){
        enimelz.add(name);
        return Response.ok().build();
    }

    @DELETE
    public Response remzvjer(@QueryParam("id") int pos){
        enimelz.remove(pos);
        return Response.ok().build();
    }

    @GET
    public Response getzvjer(@DefaultValue("-2147483648") @QueryParam("id") int pos){
        if (pos == -2147483648) {
            StringBuilder sendthis = new StringBuilder();
            for (String enimel : enimelz) {
                sendthis.append(enimel);
            }
            return Response.ok(sendthis.toString()).build();
        }
        return Response.ok(enimelz.get(pos)).build();
    }
}
