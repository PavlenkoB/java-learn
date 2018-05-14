package ua.ho.godex.learnspring.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;
import ua.ho.godex.learnspring.doamain.Developer;
import ua.ho.godex.learnspring.dto.DeveloperDto;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Service
public class DeveloperDtoConverter implements Converter<DeveloperDto, Developer> {

    private SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");

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
        try {
            Date parse = formatter.parse(dto.getStartWork());
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(parse);
            developer.setStartWork(calendar);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return developer;
    }
}
