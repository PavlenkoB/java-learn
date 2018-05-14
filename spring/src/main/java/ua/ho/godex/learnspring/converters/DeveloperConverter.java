package ua.ho.godex.learnspring.converters;

import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;
import ua.ho.godex.learnspring.doamain.Developer;
import ua.ho.godex.learnspring.dto.DeveloperDto;

@Service
public class DeveloperConverter implements Converter<Developer, DeveloperDto> {
    @Override
    public DeveloperDto convert(Developer developer) {
        DeveloperDto developerDto = new DeveloperDto();
        developerDto.setId(developer.getId());
        developerDto.setEmail(developer.getEmail());
        developerDto.setLogin(developer.getLogin());
        developerDto.setSalary(developer.getSalary());
        developerDto.setPassword("***");
        return developerDto;
    }
}
