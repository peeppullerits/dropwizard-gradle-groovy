package com.example.helloworld
import io.dropwizard.Application
import io.dropwizard.setup.Bootstrap
import io.dropwizard.setup.Environment

public class MainApplication extends Application<MainConfiguration> {
    public static void main(String[] args) throws Exception {
        new MainApplication().run(args)
    }

    @Override
    public void initialize(Bootstrap bootstrap) {
    }

    @Override
    public void run(MainConfiguration configuration,
                    Environment environment) throws ClassNotFoundException {
		environment.jersey().disable()
	}
}
