package giulio_marra.s6_l2_be;

import giulio_marra.s6_l2_be.controller.CreatoreController;
import giulio_marra.s6_l2_be.entities.Creatore;
import giulio_marra.s6_l2_be.service.CreatoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class CommanndLineRunner implements CommandLineRunner {
    @Autowired
    private CreatoreService creatoreService;

    @Autowired
    private CreatoreController creatoreController;

    @Override
    public void run(String... args) throws Exception {

        Creatore giulio = new Creatore("Giulio", "Marra", "Giulioemail#email.com", LocalDate.of(1995, 1, 21), "immagine");
        creatoreController.saveCreatoriS(giulio);

    }
}
