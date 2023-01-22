package pjatk.s26245bank.repository;


import org.springframework.stereotype.Repository;
import pjatk.s26245bank.model.Client;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ClientRepository {
    private List<Client> clientList = new ArrayList<Client>();

    public void addClient(Client client) throws Exception {
        if (clientList.contains(client)) {
            throw new Exception();
        }
        clientList.add(client);
    }

    public Client findById(int id){
        for (int i = 0; i < clientList.size(); i++) {
            if (clientList.get(i).getId() == (id)) {
                return clientList.get(i);
            }
        }
        return null;
    }

    public Client save(Client c) {
        Client client = new Client();
        client.setId(c.getId());
        client.setName(c.getName());
        client.setLastName(c.getLastName());
        client.setBalance(c.getBalance());
        client.setBankAccountNr(c.getBankAccountNr());
        clientList.add(client);
        return client;
    }

    public List<Client> getAllClients() {
        return clientList;
    }
    public void removeALl() {
        clientList = new ArrayList<>();
    }
}
