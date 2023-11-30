package Capstone.BackEnd.Mosse;

import Capstone.BackEnd.Personaggi.Personaggi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mosse")
public class MosseController {
    @Autowired MosseService mosseService;

    @GetMapping("")
    public List<Mosse> getMosse(){
        return mosseService.findAll();
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public void savePersonaggi(@RequestBody Mosse body){
        mosseService.save(body);
    }

    @GetMapping(value = "/{id}")
    public Mosse findById(@PathVariable long id){
        return mosseService.findById(id);
    }

    @PutMapping("/{id}")
    public Mosse findByIdAndUpdate(@PathVariable long id, @RequestBody Mosse body){
        return mosseService.findByIdAndUpdate(id, body);
    }

    @DeleteMapping("/{id}")
    public void findByIdAndDelete(@PathVariable long id){
        mosseService.findByIdAndDelate(id);
    }
}
