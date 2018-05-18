package ua.ho.godex.learnspring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;
import ua.ho.godex.learnspring.doamain.Developer;
import ua.ho.godex.learnspring.dto.DeveloperDto;
import ua.ho.godex.learnspring.service.DeveloperService;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/developer")
@Slf4j
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

    @GetMapping("/all")
    public ResponseBodyEmitter getAllEmitter() throws IOException {
        ResponseBodyEmitter responseBodyEmitter = new ResponseBodyEmitter();
        List<Developer> developers = developerService.getAll();
        List<DeveloperDto> developerDtos = developers
                .stream()
                .map(developer -> conversionService.convert(developer, DeveloperDto.class))
                .collect(Collectors.toList());
        for (DeveloperDto dto : developerDtos) {
            responseBodyEmitter.send(dto);
        }
//        developerDtos.forEach(developerDto -> responseBodyEmitter.send(developerDto));
        responseBodyEmitter.complete();
        return responseBodyEmitter;
    }

    @PostMapping
    public DeveloperDto createDeveloper(@RequestBody DeveloperDto developerDto) {
        Developer developer = conversionService.convert(developerDto, Developer.class);
        //todo maybe no need
        Developer createdDev = developerService.create(developer);
        return conversionService.convert(createdDev, DeveloperDto.class);
    }

    @GetMapping("/{dev}")
    public Object readDeveloper(@ModelAttribute("dev") Long developerId) {
        Optional<Developer> optionalDeveloper = developerService.findById(developerId);
        if (optionalDeveloper.isPresent()) {
            return conversionService.convert(optionalDeveloper.get(), DeveloperDto.class);
        } else {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/dev/{devId}")
    public DeveloperDto getPage(@PathVariable("devId") String boardId) {
        RestTemplate restTemplate = new RestTemplate();
        log.info("Transfer developerDto rest api id=" + boardId);
        DeveloperDto developerDto = restTemplate.getForObject("http://localhost:8080/api/developer/" + boardId, DeveloperDto.class);
        return developerDto;
    }

    @DeleteMapping("/{id}")
    public void deleteDeveloper(@PathVariable("id") Long id) {
        developerService.deleteById(id);
    }
}
