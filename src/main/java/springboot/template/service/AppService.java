package springboot.template.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.template.dao.AppDao;
import springboot.template.domain.AppDomain;

/**
 * Simple service method that calls a DAO layer method to retrieve the data from database
 */
@Service
public class AppService {

    private static final Logger LOG = Logger.getLogger(AppService.class);
    @Autowired
    private AppDao appDao;

    public AppDomain testAppService(String testString) {
        LOG.info("Logging this message for testing the logging for spring-boot template application [service]");
        return appDao.testAppDao(testString);
    }
}
