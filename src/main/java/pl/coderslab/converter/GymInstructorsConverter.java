package pl.coderslab.converter;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.coderslab.entity.GymInstructors;
import pl.coderslab.repository.GymInstructorsRepository;

public class GymInstructorsConverter implements Converter<String, GymInstructors> {
    @Autowired
    GymInstructorsRepository gymInstructorsRepository;

    public GymInstructors convert(String source) {
        return gymInstructorsRepository.findGymInstructorsById(Long.valueOf(source));
    }

}