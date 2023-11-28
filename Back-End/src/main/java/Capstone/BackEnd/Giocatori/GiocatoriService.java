package Capstone.BackEnd.Giocatori;

import Capstone.BackEnd.Exception.ItemNotFound;
import Capstone.BackEnd.Mosse.Mosse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class GiocatoriService implements IGiocatoriDAO{
    @Autowired
    private GiocatoriRepository giocatoriRepository;


    @Override
    public List<Giocatori> findAll() {
        return giocatoriRepository.findAll();
    }

    @Override
    public Giocatori findById(long id) {
        return giocatoriRepository.findById(id).orElseThrow(()-> new ItemNotFound(id));
    }

    @Override
    public Giocatori findByIdAndUpdate(long id, Giocatori giocatori) {
        Giocatori trovato = this.giocatoriRepository.findById(id).orElseThrow(()-> new ItemNotFound(id));
        trovato.setName(giocatori.getName());
        trovato.setPassword(giocatori.getPassword());
        trovato.setPunteggio(giocatori.getPunteggio());
        trovato.setPerse(giocatori.getPerse());
        trovato.setVinte(giocatori.getVinte());
        trovato.setSesso(giocatori.getSesso());
        return trovato;
    }

    @Override
    public void findByIdAndDelate(long id) {
        Giocatori trovato = this.giocatoriRepository.findById(id).orElseThrow(()-> new ItemNotFound(id));
        giocatoriRepository.delete(trovato);
        log.info("Elemento cancellato");
    }

    @Override
    public void save(Giocatori giocatori) {
        giocatoriRepository.save(giocatori);
        log.info("Salvataggio eseguito");
    }
}

