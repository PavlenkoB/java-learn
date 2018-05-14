package ua.ho.godex.learnspring.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;
import ua.ho.godex.learnspring.doamain.Developer;
import ua.ho.godex.learnspring.dto.DeveloperDto;

@Service
public class DeveloperDtoConverter implements Converter<DeveloperDto, Developer> {
    @Override
    public Developer convert(DeveloperDto dto) {
        Developer developer = new Developer();
        if (dto.getId() != null) {
            developer.setId(dto.getId());
        }
        if (dto.getPassword() != null) {
            developer.setPassword(dto.getPassword());
        }
        developer.setEmail(dto.getEmail());
        developer.setLogin(dto.getLogin());
        developer.setSalary(dto.getSalary());
        return developer;
    }
}
