package run.rua.daenerys.api.controller;


import com.fasterxml.jackson.annotation.JsonSetter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api",method = RequestMethod.POST)
public class HomeController {
    public Object Get(Object req)
    {
        return req;
    }

}