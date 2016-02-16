package com.stormpath.tutorial;


import com.stormpath.tutorial.config.SpringSecurityWebAppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {Application.class, SpringSecurityWebAppConfig.class})
@EnableWebSecurity
@WebAppConfiguration
public class ApplicationTests {
    @Autowired
    com.stormpath.sdk.application.Application application;

	@Test
	public void contextLoads() {
        assertEquals("My Application", application.getName());
	}

}
