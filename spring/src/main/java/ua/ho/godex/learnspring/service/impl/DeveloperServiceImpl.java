package ua.ho.godex.learnspring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.ho.godex.learnspring.dao.DeveloperRepository;
import ua.ho.godex.learnspring.doamain.Developer;
import ua.ho.godex.learnspring.service.DeveloperService;
import ua.ho.godex.learnspring.service.impl.MainServiceImpl;

import javax.annotation.PostConstruct;

@Service
public class DeveloperServiceImpl extends MainServiceImpl<Developer> implements DeveloperService {

    DeveloperRepository developerRepository;

    @Autowired
    public DeveloperServiceImpl(DeveloperRepository developerRepository) {
        this.developerRepository = developerRepository;
    }

    @Override
    @PostConstruct
    protected void initRepository() {
        this.setRepository(this.developerRepository);
    }
}
