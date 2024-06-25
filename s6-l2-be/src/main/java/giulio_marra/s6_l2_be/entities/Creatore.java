package giulio_marra.s6_l2_be.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Random;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Creatore {
    private long id;
    private String nome;
    private String cognome;
    private String email;
    private LocalDate data_di_nascita;
    private String avatar;

    public Creatore(String nome, String cognome, String email, LocalDate data_di_nascita, String avatar) {
        this.id = newId();
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.data_di_nascita = data_di_nascita;
        this.avatar = avatar;
    }

    public int newId() {
        Random random = new Random();
        return random.nextInt(1, 100);
    }
}
