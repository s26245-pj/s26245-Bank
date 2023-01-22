package pjatk.s26245bank.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pjatk.s26245bank.model.Client;
import pjatk.s26245bank.service.bankService;

import java.util.List;

@RequestMapping("/clients")
@RestController
public class ClientController {

        @Autowired
        private bankService bankService;

        @PostMapping("/add")
        public Client addClient(@RequestBody Client client) throws Exception {
            return bankService.save(client);
        }

        @GetMapping("{id}")
        public Client findClientByID(@PathVariable int id) {
        return bankService.getClientByID(id);
         }

        @GetMapping("/getall")
        public List<Client> findAllClients() {
            return bankService.getClients();
        }
}
