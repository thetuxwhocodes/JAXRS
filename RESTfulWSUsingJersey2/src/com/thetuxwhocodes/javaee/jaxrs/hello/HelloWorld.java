package com.thetuxwhocodes.javaee.jaxrs.hello;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 

@Path("hello")
public class HelloWorld {
 
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getIt() {
        return "Hello World! Have some REST served through Jersey 2. :)";
    }
}