package springboot.template.controller;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProperBeanCreationTest {
    private static final Logger LOG = Logger.getLogger(ProperBeanCreationTest.class);

    @Autowired
    AppController appController;

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void testBeanNotNull() {
        Assert.assertNotNull(appController);
        Assert.assertNotNull(applicationContext);
        LOG.info(applicationContext.getBeanDefinitionCount());
        LOG.info(Arrays.asList(applicationContext.getBeanDefinitionNames()));
    }
}
