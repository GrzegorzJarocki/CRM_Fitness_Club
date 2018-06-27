package pl.coderslab.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.coderslab.entity.Client;

import pl.coderslab.repository.ClientRepository;


public class ClientConverter implements Converter<String, Client> {
    @Autowired
    ClientRepository clientRepository;

    public Client convert(String source) {
        return clientRepository.findClientById(Long.valueOf(source));
    }

}
