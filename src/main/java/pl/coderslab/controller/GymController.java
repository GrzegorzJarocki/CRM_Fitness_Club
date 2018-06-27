package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import pl.coderslab.entity.Client;
import pl.coderslab.entity.Gym;

import pl.coderslab.repository.ClientRepository;
import pl.coderslab.repository.GymRepository;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping(path = "/gym")
public class GymController {

    @Autowired
    GymRepository gymRepository;

    @Autowired
    ClientRepository clientRepository;

    @GetMapping(path = "/add")
    public String gymSave(@RequestParam(required = false) Long id, Model model) {
        Gym gym = id == null ? new Gym() : gymRepository.findGymById(id);
        model.addAttribute("gym", gym);
        return "gym/add";
    }

    @PostMapping(path = "/add")
    public String saveForm(@Valid Gym gym, BindingResult tweetBindingResult) {
        if (tweetBindingResult.hasErrors()) {
            return "gym/add";
        }

        if (gym.getId() == null) {
            gymRepository.save(gym);
        } else {
            gymRepository.save(gym);
        }
        return "redirect:all";
    }

    @ModelAttribute("gyms")
    public List<Gym> getGyms() {
        return gymRepository.findAll();
    }


    @RequestMapping(path = "/confirmDelete")
    public String confirmDelete() {
        return "gym/confirmDelete";
    }

    @RequestMapping(path = "/delete")
    public String deleteGym(@RequestParam Long id) {
        gymRepository.delete(id);
        return "redirect:all";
    }

    @RequestMapping(path = "/all")
    public String listGyms() {
        return "gym/list";
    }

    @ModelAttribute("clients")
    public List<Client> getClients() {
        return clientRepository.findAll();
    }

}