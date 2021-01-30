package controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class helloController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ApiOperation(value = "Hello Test",tags = "hello Sample")
    public ResponseEntity hello(){
        return new ResponseEntity("hello", HttpStatus.OK);
    }

}
