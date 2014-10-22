package com.example.helloworld
import io.dropwizard.Application
import io.dropwizard.setup.Bootstrap
import io.dropwizard.setup.Environment
import org.eclipse.jetty.servlets.CrossOriginFilter

import javax.servlet.DispatcherType
import javax.servlet.FilterRegistration

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
	}
}
