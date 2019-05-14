package com.flamelab.contract;

import com.flamelab.controller.MathController;
import com.flamelab.service.MathActions;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.verifier.messaging.boot.AutoConfigureMessageVerifier;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@DirtiesContext
@AutoConfigureMessageVerifier
public abstract class ContractBaseTest {

    @Autowired
    private MathActions mathActions;

    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new MathController());
    }

    public void makeMultiplying() {
//        Integer expectedResult = 4;
//        Integer actualResult = mathActions.multiply(2,2);
//        assertEquals(java.util.Optional.of(expectedResult), actualResult);
    }
}
