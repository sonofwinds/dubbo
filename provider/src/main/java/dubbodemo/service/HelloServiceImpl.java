package dubbodemo.service;

import dubbodemo.contract.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloServiceImpl implements HelloService {
private Logger logger = LoggerFactory.getLogger(HelloServiceImpl.class);
    @Override
    public String sayHello(String name) {
        logger.info("enter sayHello,name=" + name);
        logger.info("99999999999");
        return name;
    }
}
