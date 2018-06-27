package pl.coderslab.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.entity.Client;
import pl.coderslab.entity.Fitness;
import pl.coderslab.entity.Gym;
import pl.coderslab.repository.ClientRepository;
import pl.coderslab.repository.FitnessRepository;
import pl.coderslab.repository.GymRepository;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(path = "/fitness")
public class FitnessController {

    @Autowired
    FitnessRepository fitnessRepository;

    @Autowired
    ClientRepository clientRepository;

    @GetMapping(path = "/add")
    public String fitnessSave(@RequestParam(required = false) Long id, Model model) {
        Fitness fitness = id == null ? new Fitness() : fitnessRepository.findFitnessById(id);
        model.addAttribute("fitness", fitness);
        return "fitness/add";
    }

    @PostMapping(path = "/add")
    public String saveForm(@Valid Fitness fitness, BindingResult tweetBindingResult) {
        if (tweetBindingResult.hasErrors()) {
            return "fitness/add";
        }


        double finalPrice= 25*fitness.getHours();

        fitness.setFinalPrice(finalPrice);

        if (fitness.getId() == null) {
            fitnessRepository.save(fitness);
        } else {
            fitnessRepository.save(fitness);
        }
        return "redirect:all";
    }

    @ModelAttribute("fitnesses")
    public List<Fitness> getFitnessses() {
        return fitnessRepository.findAll();
    }


    @RequestMapping(path = "/confirmDelete")
    public String confirmDelete() {
        return "fitness/confirmDelete";
    }

    @RequestMapping(path = "/delete")
    public String deleteGym(@RequestParam Long id) {
        fitnessRepository.delete(id);
        return "redirect:all";
    }

    @RequestMapping(path = "/all")
    public String listFitnesses() {
        return "fitness/list";
    }

    @ModelAttribute("clients")
    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    @ModelAttribute("hours")
    public List<Integer> getHours() {
        List<Integer> list = new ArrayList<>();
     for(int i=1; i<21; i++){
         list.add(i);

     }
        return list;
    }

}
