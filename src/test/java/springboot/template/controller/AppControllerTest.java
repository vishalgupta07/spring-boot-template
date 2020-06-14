package springboot.template.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Objects;

/**
 * Test class for AppController
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class AppControllerTest {

    @Autowired
    AppController appController;

    @Test
    public void appControllerTest() {
        Assert.assertEquals("AppDomain(appString=vishalgupta07)",
                Objects.requireNonNull(appController.testAppController("vishalgupta07").getBody()).toString());
    }
}
