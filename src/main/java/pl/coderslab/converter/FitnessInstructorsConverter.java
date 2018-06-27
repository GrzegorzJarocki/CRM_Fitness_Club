package pl.coderslab.converter;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.coderslab.entity.FitnessInstructors;
import pl.coderslab.repository.FitnessInstructorsRepository;

public class FitnessInstructorsConverter implements Converter<String, FitnessInstructors> {
    @Autowired
    FitnessInstructorsRepository fitnessInstructorsRepository;

    public FitnessInstructors convert(String source) {
        return fitnessInstructorsRepository.findFitnessInstructorsById(Long.valueOf(source));
    }

}
