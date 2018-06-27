package pl.coderslab.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.entity.Client;
import pl.coderslab.repository.ClientRepository;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping(path = "/client")
public class ClientController {

    @Autowired
    ClientRepository clientRepository;

    @GetMapping(path ="/add")
    public String clientSave(@RequestParam(required = false) Long id, Model model){
        Client client = id == null ? new Client() : clientRepository.findClientById(id);
        model.addAttribute("client", client);
        return "client/add";
    }

    @PostMapping(path = "/add")
    public String saveForm(@Valid Client client, BindingResult tweetBindingResult) {
        if (tweetBindingResult.hasErrors()) {
            return "client/add";
        }

        if (client.getId() == null) {
            clientRepository.save(client);
        } else {
            clientRepository.save(client);
        }
        return "redirect:all";
    }

    @ModelAttribute("clients")
    public List<Client> getClients() {
        return clientRepository.findAll();
    }



    @RequestMapping(path = "/confirmDelete")
    public String confirmDelete() {
        return "client/confirmDelete";
    }

    @RequestMapping(path = "/delete")
    public String deleteClient(@RequestParam Long id) {
        clientRepository.delete(id);
        return "redirect:all";
    }

    @RequestMapping(path = "/all")
    public String listClients() {
        return "client/list";
    }

}
