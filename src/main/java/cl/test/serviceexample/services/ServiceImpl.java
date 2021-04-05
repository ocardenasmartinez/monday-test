package cl.test.serviceexample.services;

import cl.test.serviceexample.controllers.entities.ClientResponse;
import cl.test.serviceexample.database.entities.Client;
import cl.test.serviceexample.database.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ServiceImpl implements Service {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public ClientResponse getService(Long id, String name) {
        Client client = new Client();
        client.setId(id);
        client.setName(name);
        clientRepository.save(client);
        /*if(true) {
            throw new IllegalArgumentException();
        }*/
        return ClientResponse.builder().id(client.getId()).name(client.getName()).build();
    }

}
