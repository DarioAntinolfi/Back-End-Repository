package Capstone.BackEnd.Personaggi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/personaggi")
@CrossOrigin(maxAge = 3600)
public class PersonaggiController {
    @Autowired
    private PersonaggiService personaggiService;

    @GetMapping("")
    public List<Personaggi> getPersonaggi(){
        return personaggiService.findAll();
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public void savePersonaggi(@RequestBody Personaggi body){
        personaggiService.save(body);
    }

    @GetMapping(value = "/{id}")
    public Personaggi findById(@PathVariable long id){
        return personaggiService.findById(id);
    }

    @PutMapping("/{id}")
    public Personaggi findByIdAndUpdate(@PathVariable long id, @RequestBody Personaggi body){
        return personaggiService.findByIdAndUpdate(id, body);
    }

    @DeleteMapping("/{id}")
    public void findByIdAndDelete(@PathVariable long id){
        personaggiService.findByIdAndDelate(id);
    }


}
