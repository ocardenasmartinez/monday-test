package cl.test.serviceexample.services;

import cl.test.serviceexample.database.entities.Client;
import cl.test.serviceexample.database.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ServiceImpl implements Service {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public void getService(Long id, String name) {
        Client client = new Client();
        client.setId(id);
        client.setName(name);
        clientRepository.save(client);
    }

}
