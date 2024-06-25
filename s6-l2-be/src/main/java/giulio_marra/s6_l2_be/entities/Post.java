package giulio_marra.s6_l2_be.entities;


import giulio_marra.s6_l2_be.enums.Categorie;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Random;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Post {
    private long id;
    private List<Categorie> categorie;
    private String titolo;
    private String cover;
    private String contenuto;
    private int tempo_di_lettura;

    public Post(List<Categorie> categorie, String titolo, String cover, String contenuto, int tempo_di_lettura) {
        this.id = newId();
        this.categorie = categorie;
        this.titolo = titolo;
        this.cover = cover;
        this.contenuto = contenuto;
        this.tempo_di_lettura = tempo_di_lettura;
    }

    public int newId() {
        Random random = new Random();
        return random.nextInt(1, 100);
    }
}
