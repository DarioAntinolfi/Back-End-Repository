package Capstone.BackEnd.Personaggi;

import Capstone.BackEnd.Exception.ItemNotFound;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PersonaggiService implements IPersonaggiDAO{
    @Autowired
    private PersonaggiRepository personaggiRepository;

    @Override
    public List<Personaggi> findAll() {
        return personaggiRepository.findAll();
    }

    @Override
    public Personaggi findById(long id) {
        return personaggiRepository.findById(id).orElseThrow(()-> new ItemNotFound((id)));
    }

    @Override
    public Personaggi findByIdAndUpdate(long id, Personaggi personaggi) {
        Personaggi trovato = this.personaggiRepository.findById(id).orElseThrow(()-> new ItemNotFound((id)));
        trovato.setNome(personaggi.getNome());
        trovato.setArcano(personaggi.getArcano());
        trovato.setImmagine(personaggi.getImmagine());
        trovato.setDestrezza(personaggi.getDestrezza());
        trovato.setEgida(personaggi.getEgida());
        trovato.setForza(personaggi.getForza());
        trovato.setPrecisione(personaggi.getPrecisione());
        trovato.setVita(personaggi.getVita());
        trovato.setResistenza(personaggi.getResistenza());
        trovato.setVelocità(personaggi.getVelocità());
        trovato.setVigore(personaggi.getVigore());
        trovato.setRipresa(personaggi.getRipresa());
        return trovato;
    }

    @Override
    public void findByIdAndDelate(long id) {
        Personaggi trovato = personaggiRepository.findById(id).orElseThrow(()-> new ItemNotFound((id)));
        personaggiRepository.delete(trovato);
        log.info("Elemento cancellato");
    }

    @Override
    public void save(Personaggi personaggi) {
        personaggiRepository.save(personaggi);
        log.info("Salvataggio eseguito");
    }
}
