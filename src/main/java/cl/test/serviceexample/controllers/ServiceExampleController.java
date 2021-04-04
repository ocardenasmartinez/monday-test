package cl.test.serviceexample.controllers;

import cl.test.serviceexample.services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("service")
public class ServiceExampleController {

    @Autowired
    private Service service;

    @RequestMapping(value = "/get", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getService(@RequestParam Long id, @RequestParam String name) {
        service.getService(id, name);
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }

}
