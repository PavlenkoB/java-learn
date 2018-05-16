package ua.ho.godex.learnspring;

import com.mongodb.MongoClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import static org.springframework.data.mongodb.core.query.Criteria.where;

@SpringBootApplication
@PropertySource("classpath:application.yml")
@Slf4j
public class MongoApp {
    public static void main(String[] args) {
        SpringApplication.run(MongoApp.class, args);
        MongoTemplate mongoOps = new MongoTemplate(new MongoClient(), "database");
        mongoOps.insert(new Person("Joe", 34));
        log.info(mongoOps.findOne(new Query(where("name").is("Joe")), Person.class).toString());
        mongoOps.dropCollection("person");

    }

}