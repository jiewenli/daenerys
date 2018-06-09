package run.rua.daenerys.api.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import run.rua.daenerys.api.DaenerysProperties;

@RestController
@RequestMapping(value = "api",method = RequestMethod.POST)
public class HomeController {


    private static final Logger log = LoggerFactory.getLogger(HomeController.class);

    private DaenerysProperties daenerysProperties;

    @Autowired
    public HomeController(DaenerysProperties customProperties) {
        this.daenerysProperties = customProperties;
    }

    @RequestMapping(value = "properties/daenerys",method = RequestMethod.GET)
    public Object GetProperties()
    {
        log.info("load..");
        return daenerysProperties;
    }



    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public Object Get()
    {
        return "hello world";
    }
}