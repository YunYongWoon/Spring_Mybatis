package controller;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ApiOperation(value = "Mybatis Test",tags = "mybatis bean")
    public String root() throws JsonProcessingException{
        System.out.println("루트");
        ObjectMapper jsonMapper = new ObjectMapper();
        jsonMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        System.out.println(jsonMapper.writeValueAsString(userService.getUserList()));
        //System.out.println(new ObjectMapper().writeValueAsString(userService.getUserList()));

        return "home";
    }
}
