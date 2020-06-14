package springboot.template.dao;

import org.springframework.stereotype.Repository;
import springboot.template.domain.AppDomain;

@Repository
public class AppDao {
    public AppDomain testAppDao(String testString) {
        return new AppDomain(testString);
    }
}
