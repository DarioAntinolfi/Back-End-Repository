package Capstone.BackEnd.Exception;

public class ItemNotFound extends RuntimeException{
    public ItemNotFound(long id){
        super("Oggetto con id " + " non è stato trovato");
    }
}
