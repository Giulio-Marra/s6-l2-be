package giulio_marra.s6_l2_be.controller;

import giulio_marra.s6_l2_be.entities.Creatore;
import giulio_marra.s6_l2_be.service.CreatoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/creatori")
public class CreatoreController {
    @Autowired
    private CreatoreService creatoreService;

    @GetMapping
    public List<Creatore> getCreatori() {
        return creatoreService.getCreatoreList();
    }

    @GetMapping("/{id}")
    public Creatore getCreatore(@PathVariable long id) {
        return creatoreService.getCreatoreById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Creatore saveCreatoriS(@RequestBody Creatore body) {
        return creatoreService.saveCreatore(body);
    }

    @DeleteMapping("/{id}")
    public void deleteCreatore(@PathVariable long id) {
        creatoreService.deleteCreatoreById(id);
    }

    @PutMapping("/{id}")
    public Creatore getCreatoreAndUpdate(@PathVariable long id, @RequestBody Creatore body) {
        return creatoreService.findAndUpdateCreatore(id, body);
    }

}
