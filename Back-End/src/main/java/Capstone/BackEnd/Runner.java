package Capstone.BackEnd;

import Capstone.BackEnd.Personaggi.PersonaggiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Runner implements CommandLineRunner {
    @Autowired
    PersonaggiService personaggiService;
    @Override
    public void run(String... args) throws Exception {
    }
}
