package app;


import config.DropwizardExampleConfiguration;
import io.dropwizard.Application;
import io.dropwizard.configuration.ResourceConfigurationSourceProvider;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import resources.ProductController;


public class DropwizardExampleApp extends Application<DropwizardExampleConfiguration> {

    public static void main(String[] args) throws Exception {
        new DropwizardExampleApp().run(args);
    }


    @Override
    public void initialize(Bootstrap<DropwizardExampleConfiguration> bootstrap) {
        // nothing to do yet
        bootstrap.setConfigurationSourceProvider(new ResourceConfigurationSourceProvider());
        super.initialize(bootstrap);
    }

    @Override
    public void run(DropwizardExampleConfiguration configuration,
                    Environment environment) {

        final ProductController productController = new ProductController(configuration);
        environment.jersey().register(productController);

    }

}
