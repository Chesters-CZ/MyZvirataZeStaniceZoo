package main.java.cz.educanet.zolololgicka;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

@Path("profil")
public class profil {
    public static ArrayList<String> retardi = new ArrayList<String>();

    @GET
    public Response blank(){
        return Response.ok().build();
    }
}
