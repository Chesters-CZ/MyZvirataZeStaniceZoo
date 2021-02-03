package main.java.cz.educanet.zolololgicka;

import main.java.cz.educanet.obvladacenebotakneco.useremanager;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

@Path("zvjer")
public class zvjerinec {
    @Inject
    private useremanager usrmng;

    @POST
    public Response addzvjer(@DefaultValue("-2147483648") int pos, animels animal) {
        if (pos == 0) return Response.status(201, "Your animal's id is: " + usrmng.birthanimal(animal)).build();
        return Response.status(201).build();
    }

    @PUT
    public Response editzvjer(int pos, animels animal){
        usrmng.editanimal(animal, pos);
        return Response.ok().build();
    }

    @DELETE
    public Response remzvjer(int pos) {
        usrmng.slaughteranimal(pos);
        return Response.ok().build();
    }

    @GET
    public Response getzvjer(@DefaultValue("-2147483648") int pos) {
        if (pos == -2147483648) return Response.ok(usrmng.getanimalarray()).build();
        return Response.ok(usrmng.getanimal(pos).toString()).build();
    }
}
