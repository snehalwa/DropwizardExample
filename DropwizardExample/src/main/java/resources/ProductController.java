package resources;

import config.DropwizardExampleConfiguration;
import model.Product;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/products")
public class ProductController {

    private DropwizardExampleConfiguration dropwizardExampleConfiguration;

    public ProductController(DropwizardExampleConfiguration dropwizardExampleConfiguration) {

        this.dropwizardExampleConfiguration = dropwizardExampleConfiguration;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Product> getAll() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Earphone", "Wireless earphone", 1500));
        productList.add(new Product(2, "Webcam", "Web cam", 3590));
        return productList;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Product getProduct(@PathParam("id") long id) {

        return dropwizardExampleConfiguration.getDefaultProductConfig();

    }
}
