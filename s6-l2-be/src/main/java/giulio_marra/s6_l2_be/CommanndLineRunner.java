package giulio_marra.s6_l2_be;

import giulio_marra.s6_l2_be.controller.CreatoreController;
import giulio_marra.s6_l2_be.entities.Creatore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class CommanndLineRunner implements CommandLineRunner {

    @Autowired
    private CreatoreController creatoreController;

    @Override
    public void run(String... args) throws Exception {


        //CREAZIONE UTENTI
        Creatore giulio = new Creatore("Giulio", "Marra", "Giulioemail#email.com", LocalDate.of(1995, 1, 21), "immagine");
        Creatore alessio = new Creatore("Alessio", "Palmiero", "    Palmieromail#email.com", LocalDate.of(2000, 7, 12), "immagine");
        creatoreController.saveCreatoriS(giulio);
        creatoreController.saveCreatoriS(alessio);

        //

    }
}
