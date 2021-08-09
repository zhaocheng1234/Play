package com.example.demo.lisener;

import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class HelloSpringApplicationRunListener implements SpringApplicationRunListener {
    @Override
    public void starting() {
        
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment configurableEnvironment) {

    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext configurableApplicationContext) {

    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext configurableApplicationContext) {

    }

    @Override
    public void finished(ConfigurableApplicationContext configurableApplicationContext, Throwable throwable) {

    }
}
