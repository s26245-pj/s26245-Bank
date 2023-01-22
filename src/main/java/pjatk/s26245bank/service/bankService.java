package pjatk.s26245bank.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pjatk.s26245bank.model.Client;
import pjatk.s26245bank.repository.ClientRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class bankService {

    @Autowired
    private ClientRepository clientRepository;

    private List<Client> clientList = new ArrayList<>();

    public List<Client> getClients() {
        return clientRepository.getAllClients();
    }

    public Client getClientByID(int id) {
        return clientRepository.findById(id);
    }

    public Client save(Client client) {
        return clientRepository.save(client);
    }



    public Optional<Client> findById(int id) {
        Optional<Client> optionalClient = Optional.ofNullable(clientRepository.findById(id));

        return optionalClient;
    }

    public double withdrawal(Client client, double amount){
        return client.getBalance() - amount;
    }
    public double deposit(Client client, double amount){
        return client.getBalance() + amount;
    }
}
