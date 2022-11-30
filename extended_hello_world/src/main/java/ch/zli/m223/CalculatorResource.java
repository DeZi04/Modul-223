package ch.zli.m223;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import io.quarkus.runtime.annotations.QuarkusMain;
import lombok.RequiredArgsConstructor;

@Path("calculator") // localhost:8080/calculator/add
@RequiredArgsConstructor
public class CalculatorResource {

    public final CalcService calcService;


    @GET
    @Path("/add")
    @Produces(MediaType.TEXT_PLAIN)
    public Number add(@QueryParam(value = "a") String a , @QueryParam(value = "b") String b) {
        return calcService.add(Double.valueOf(a) , Double.valueOf(b));
    }
}