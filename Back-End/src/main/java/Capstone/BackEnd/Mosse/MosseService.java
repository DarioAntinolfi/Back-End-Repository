package Capstone.BackEnd.Mosse;

import Capstone.BackEnd.Exception.ItemNotFound;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class MosseService implements IMosseDAO{
    @Autowired
    private MosseRepositery mosseRepositery;
    @Override
    public List<Mosse> findAll() {
        return mosseRepositery.findAll();
    }

    @Override
    public Mosse findById(long id) {
        return mosseRepositery.findById(id).orElseThrow(()-> new ItemNotFound(id));
    }

    @Override
    public Mosse findByIdAndUpdate(long id, Mosse mosse) {
        Mosse trovata = this.mosseRepositery.findById(id).orElseThrow(()-> new ItemNotFound(id));
        trovata.setNome(mosse.getNome());
        trovata.setCosto(mosse.getCosto());
        trovata.setNumeroDadi(mosse.getNumeroDadi());
        trovata.setValoreDadi(mosse.getValoreDadi());
        trovata.setTipoMosse(mosse.getTipoMosse());
        return trovata;

    }

    @Override
    public void findByIdAndDelate(long id) {
        Mosse trovata = this.mosseRepositery.findById(id).orElseThrow(()-> new ItemNotFound(id));
        mosseRepositery.delete(trovata);
        log.info("Elemento cancellato");
    }

    @Override
    public void save(Mosse mosse) {
        mosseRepositery.save(mosse);
        log.info("Salvataggio eseguito");
    }
}
