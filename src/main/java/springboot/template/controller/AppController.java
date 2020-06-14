package springboot.template.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.template.service.AppService;

/**
 * Controller class that gets invoked to handle http request
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/services")
public class AppController {

    @Autowired
    private AppService appService;

    @GetMapping("/testApp/{testString}")
    @Cacheable(value = "appCache")
    public ResponseEntity testAppController(@PathVariable("testString") String testString) {
        return ResponseEntity.ok().body(appService.testAppService(testString));
    }
}
