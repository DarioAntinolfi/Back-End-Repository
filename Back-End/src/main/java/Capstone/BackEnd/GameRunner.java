package Capstone.BackEnd;

import Capstone.BackEnd.Giocatori.Giocatori;
import Capstone.BackEnd.Giocatori.GiocatoriService;
import Capstone.BackEnd.Mosse.Mosse;
import Capstone.BackEnd.Mosse.MosseService;
import Capstone.BackEnd.Personaggi.Personaggi;
import Capstone.BackEnd.Personaggi.PersonaggiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class GameRunner implements CommandLineRunner {
    @Autowired
    public PersonaggiService personaggiService;
    @Autowired
    public MosseService mosseService;
    @Autowired
    public GiocatoriService giocatoriService;
    @Override
    public void run(String... args) throws Exception {
        Personaggi trovato = personaggiService.findById(12);
        log.info(trovato.toString());
        trovato.setImmagine("https://res.cloudinary.com/dngnhhzso/image/upload/v1703168443/Capstone/photo_6033111531463490874_y_fqlrgl_Square_jbvjxe.jpg");
        personaggiService.save(trovato);
    }
}
