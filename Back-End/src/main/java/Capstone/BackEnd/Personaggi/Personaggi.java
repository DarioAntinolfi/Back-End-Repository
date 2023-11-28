package Capstone.BackEnd.Personaggi;

import Capstone.BackEnd.Mosse.Mosse;
import jakarta.persistence.*;
import org.hibernate.mapping.Set;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Personaggi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String immagine;
    private int vita;
    private int forza;
    private int precisione;
    private int arcano;
    private int resistenza;
    private int destrezza;
    private int egida;
    private int velocità;
    private int vigore;
    private int ripresa;
    @ManyToMany
    @JoinTable(name = "personaggi_mosse", joinColumns = @JoinColumn(name = "personaggi_id"), inverseJoinColumns = @JoinColumn(name = "mosse_id"))
    private List<Mosse> poolMosse = new ArrayList<>();
    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getImmagine() {
        return immagine;
    }

    public void setImmagine(String immagine) {
        this.immagine = immagine;
    }

    public int getVita() {
        return vita;
    }

    public void setVita(int vita) {
        this.vita = vita;
    }

    public int getForza() {
        return forza;
    }

    public void setForza(int forza) {
        this.forza = forza;
    }

    public int getPrecisione() {
        return precisione;
    }

    public void setPrecisione(int precisione) {
        this.precisione = precisione;
    }

    public int getArcano() {
        return arcano;
    }

    public void setArcano(int arcano) {
        this.arcano = arcano;
    }

    public int getResistenza() {
        return resistenza;
    }

    public void setResistenza(int resistenza) {
        this.resistenza = resistenza;
    }

    public int getDestrezza() {
        return destrezza;
    }

    public void setDestrezza(int destrezza) {
        this.destrezza = destrezza;
    }

    public int getEgida() {
        return egida;
    }

    public void setEgida(int egida) {
        this.egida = egida;
    }

    public int getVelocità() {
        return velocità;
    }

    public void setVelocità(int velocità) {
        this.velocità = velocità;
    }

    public int getVigore() {
        return vigore;
    }

    public void setVigore(int vigore) {
        this.vigore = vigore;
    }

    public int getRipresa() {
        return ripresa;
    }

    public void setRipresa(int ripresa) {
        this.ripresa = ripresa;
    }

    public Personaggi(String nome, int vita, int forza, int precisione, int arcano, int resistenza, int destrezza, int egida, int velocità, int vigore, int ripresa) {
        this.nome = nome;
        this.vita = vita;
        this.forza = forza;
        this.precisione = precisione;
        this.arcano = arcano;
        this.resistenza = resistenza;
        this.destrezza = destrezza;
        this.egida = egida;
        this.velocità = velocità;
        this.vigore = vigore;
        this.ripresa = ripresa;
    }

    @Override
    public String toString() {
        return "Personaggi{" +
                "nome='" + nome + '\'' +
                ", vita=" + vita +
                ", forza=" + forza +
                ", precisione=" + precisione +
                ", arcano=" + arcano +
                ", resistenza=" + resistenza +
                ", destrezza=" + destrezza +
                ", egida=" + egida +
                ", velocità=" + velocità +
                ", vigore=" + vigore +
                ", ripresa=" + ripresa +
                ", poolMosse=" + poolMosse +
                '}';
    }
}
