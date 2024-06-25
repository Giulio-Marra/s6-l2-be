package giulio_marra.s6_l2_be;

import giulio_marra.s6_l2_be.controller.CreatoreController;
import giulio_marra.s6_l2_be.controller.PostController;
import giulio_marra.s6_l2_be.entities.Creatore;
import giulio_marra.s6_l2_be.entities.Post;
import giulio_marra.s6_l2_be.enums.Categorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
public class CommanndLineRunner implements CommandLineRunner {

    @Autowired
    private CreatoreController creatoreController;

    @Autowired
    private PostController postController;

    @Override
    public void run(String... args) throws Exception {


        //CREAZIONE UTENTI
        Creatore giulio = new Creatore("Giulio", "Marra", "Giulioemail#email.com", LocalDate.of(1995, 1, 21), "immagine");
        Creatore alessio = new Creatore("Alessio", "Palmiero", "    Palmieromail#email.com", LocalDate.of(2000, 7, 12), "immagine");
        creatoreController.saveCreatoriS(giulio);
        creatoreController.saveCreatoriS(alessio);

        //CREAZIONE POST
        List<Categorie> categoriePost1 = Arrays.asList(Categorie.CIBO, Categorie.CULTURA);
        List<Categorie> cagoriePost2 = Arrays.asList(Categorie.POLITICA, Categorie.SCIENZA);
        Post post1 = new Post(categoriePost1, "Pappardelle al ragu", "immagine", "Le pappardelle al rague si anno col ragu e le pappardelle", 215);
        Post post2 = new Post(cagoriePost2, "Elon musk è davvero un essere umano o un andoride?", "immagine", "Si hanno dei dubbi riguardo al fatto che elon sia o meno un umano,si pensa di piu ad un andoide", 1231);
        postController.savePost(post2);
        postController.savePost(post1);

    }
}
