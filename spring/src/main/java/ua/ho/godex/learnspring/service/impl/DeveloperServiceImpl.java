package ua.ho.godex.learnspring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.ho.godex.learnspring.dao.DeveloperRepository;
import ua.ho.godex.learnspring.doamain.Developer;
import ua.ho.godex.learnspring.service.DeveloperService;

import javax.annotation.PostConstruct;

@Service
@Repository
@Transactional
public class DeveloperServiceImpl extends MainServiceImpl<Developer> implements DeveloperService {

    private DeveloperRepository developerRepository;

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
