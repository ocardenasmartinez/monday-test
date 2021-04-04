package cl.test.serviceexample.services;

import cl.test.serviceexample.controllers.entities.ClientResponse;

public interface Service {

    ClientResponse getService(Long id, String name);

}
