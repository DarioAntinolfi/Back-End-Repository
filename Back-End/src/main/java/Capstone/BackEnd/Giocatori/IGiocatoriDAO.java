package Capstone.BackEnd.Giocatori;

import Capstone.BackEnd.Mosse.Mosse;

import java.util.List;

public interface IGiocatoriDAO {
    public List<Giocatori> findAll();
    public Giocatori findById(long id);
    public Giocatori findByIdAndUpdate(long id, Giocatori giocatori);
    public void findByIdAndDelate(long id);
    public void save(Giocatori giocatori);
}
