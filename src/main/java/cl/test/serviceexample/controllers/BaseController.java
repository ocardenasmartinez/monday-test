package cl.test.serviceexample.controllers;

import cl.test.serviceexample.controllers.entities.ClientResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class BaseController {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> exceptionHandler() {
        return new ResponseEntity<>("Error", HttpStatus.OK);
    }

}
