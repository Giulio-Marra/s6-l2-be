package giulio_marra.s6_l2_be.controller;

import giulio_marra.s6_l2_be.entities.Creatore;
import giulio_marra.s6_l2_be.service.CreatoreService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @PostMapping
    public Creatore saveCreatoriS(@RequestBody Creatore body) {
        return creatoreService.saveCreatore(body);
    }
}
