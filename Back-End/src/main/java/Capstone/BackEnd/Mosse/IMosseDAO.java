package Capstone.BackEnd.Mosse;

import Capstone.BackEnd.Personaggi.Personaggi;

import java.util.List;

public interface IMosseDAO {
    public List<Mosse> findAll();
    public Mosse findById(long id);
    public Mosse findByIdAndUpdate(long id, Mosse mosse);
    public void findByIdAndDelate(long id);
    public void save(Mosse mosse);
}
