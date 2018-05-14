package ua.ho.godex.learnspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.web.bind.annotation.*;
import ua.ho.godex.learnspring.doamain.Developer;
import ua.ho.godex.learnspring.dto.DeveloperDto;
import ua.ho.godex.learnspring.service.DeveloperService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/developer")
public class DeveloperController {
    final private DeveloperService developerService;
    final private ConversionService conversionService;

    @Autowired
    public DeveloperController(DeveloperService developerService, ConversionService conversionService) {
        this.developerService = developerService;
        this.conversionService = conversionService;
    }

    @GetMapping
    public List<DeveloperDto> getAll() {
        List<Developer> developers = developerService.getAll();
        List<DeveloperDto> developerDtos = developers
                .stream()
                .map(developer -> conversionService.convert(developer, DeveloperDto.class))
                .collect(Collectors.toList());
        return developerDtos;
    }

    @PostMapping
    public DeveloperDto createDeveloper(@RequestBody DeveloperDto developerDto) {
        Developer developer = conversionService.convert(developerDto, Developer.class);
        //todo maybe no need
        Developer createdDev = developerService.create(developer);
        return conversionService.convert(createdDev, DeveloperDto.class);
    }

    @DeleteMapping("/{id}")
    public void deleteDeveloper(@PathVariable("id") Long id) {
        developerService.deleteById(id);
    }
}
