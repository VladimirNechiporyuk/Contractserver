package com.flamelab.contract;

import com.flamelab.controller.MathServerController;
import com.flamelab.service.MathService;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.verifier.messaging.boot.AutoConfigureMessageVerifier;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.AnnotationConfigWebContextLoader;

@RunWith(SpringRunner.class)
@ContextConfiguration(loader = AnnotationConfigWebContextLoader.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@DirtiesContext
@AutoConfigureMessageVerifier
public abstract class ContractBaseTest {

    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new MathServerController(new MathService()));
    }

    public void makeMultiplying() {
    }
}
