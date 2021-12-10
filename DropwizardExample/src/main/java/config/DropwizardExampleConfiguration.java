package config;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import model.Product;

import javax.validation.constraints.NotNull;

public class DropwizardExampleConfiguration extends Configuration {

    public Product getDefaultProductConfig() {
        return defaultProductConfig;
    }
    @NotNull
    @JsonProperty("product")
    private Product defaultProductConfig;

}
