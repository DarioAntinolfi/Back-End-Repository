package Capstone.BackEnd.Personaggi;

import java.util.ArrayList;
import java.util.List;

public interface IPersonaggiDAO {
    public List<Personaggi> findAll();
    public Personaggi findById(long id);
    public Personaggi findByIdAndUpdate(long id, Personaggi personaggi);
    public void findByIdAndDelate(long id);
    public void save(Personaggi personaggi);
}
