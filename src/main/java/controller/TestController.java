package controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import repository.TestMapper;

@Controller
public class TestController {

    @Autowired
    private TestMapper testMapper;

    @ResponseBody
    @ApiOperation(value = "Mybatis Test",tags = "Mybatis xml")
    @RequestMapping(value = "/gettime", method = RequestMethod.GET)
    public String test(){
        System.out.println(testMapper.getTime());
        return "hello";
    }
}
