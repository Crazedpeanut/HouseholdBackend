package net.johnkendall.household.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by john on 29/01/2017.
 */
@RestController
public class HealthCheck {

    @RequestMapping("/_health")
    public String healthCheck()
    {
        return "Up and Running";
    }
}
