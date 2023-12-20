package Capstone.BackEnd.Giocatori;

import Capstone.BackEnd.Personaggi.Personaggi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/giocatori")
@CrossOrigin(origins = "http://localhost:4200/")
public class GiocatoriController {
    @Autowired GiocatoriService giocatoriService;

    @GetMapping("")
    public List<Giocatori> getGiocatori(){
        return giocatoriService.findAll();
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public void savePersonaggi(@RequestBody Giocatori body){
        giocatoriService.save(body);
    }

    @GetMapping(value = "/{id}")
    public Giocatori findById(@PathVariable long id){
        return giocatoriService.findById(id);
    }

    @PutMapping("/{id}")
    public Giocatori findByIdAndUpdate(@PathVariable long id, @RequestBody Giocatori body){
        return giocatoriService.findByIdAndUpdate(id, body);
    }

    @DeleteMapping("/{id}")
    public void findByIdAndDelete(@PathVariable long id){
        giocatoriService.findByIdAndDelate(id);
    }
}
