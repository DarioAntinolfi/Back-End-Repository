package Capstone.BackEnd.Mosse;

import Capstone.BackEnd.Giocatori.Giocatori;
import Capstone.BackEnd.Personaggi.Personaggi;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Mosse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private int valoreDadi;
    private  int numeroDadi;
    private TipoMosse tipoMosse;
    private int costo;
    @ManyToMany
    @JoinTable(name = "personaggi_mosse", joinColumns = @JoinColumn(name = "mosse_id"), inverseJoinColumns = @JoinColumn(name = "personaggi_id"))
    private List<Personaggi> conosciutaDa = new ArrayList<>();

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValoreDadi() {
        return valoreDadi;
    }

    public void setValoreDadi(int valoreDadi) {
        this.valoreDadi = valoreDadi;
    }

    public int getNumeroDadi() {
        return numeroDadi;
    }

    public void setNumeroDadi(int numeroDadi) {
        this.numeroDadi = numeroDadi;
    }

    public TipoMosse getTipoMosse() {
        return tipoMosse;
    }

    public void setTipoMosse(TipoMosse tipoMosse) {
        this.tipoMosse = tipoMosse;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Mosse() {
    }

    public Mosse(String nome, int valoreDadi, int numeroDadi, TipoMosse tipoMosse, int costo) {
        this.nome = nome;
        this.valoreDadi = valoreDadi;
        this.numeroDadi = numeroDadi;
        this.tipoMosse = tipoMosse;
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Mosse{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", valoreDadi=" + valoreDadi +
                ", numeroDadi=" + numeroDadi +
                ", tipoMosse=" + tipoMosse +
                ", costo=" + costo +
                '}';
    }
}
