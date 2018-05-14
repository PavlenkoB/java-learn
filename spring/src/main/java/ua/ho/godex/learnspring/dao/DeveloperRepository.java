package ua.ho.godex.learnspring.dao;

import org.springframework.data.repository.CrudRepository;
import ua.ho.godex.learnspring.doamain.Developer;

public interface DeveloperRepository extends CrudRepository<Developer, Long> {
}
