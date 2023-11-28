package Capstone.BackEnd;

import Capstone.BackEnd.Mosse.MosseService;
import Capstone.BackEnd.Personaggi.PersonaggiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class GameRunner implements CommandLineRunner {
    @Autowired
    PersonaggiService personaggiService;
    @Autowired
    MosseService mosseService;
    @Override
    public void run(String... args) throws Exception {
    }
}
