package giulio_marra.s6_l2_be.service;

import giulio_marra.s6_l2_be.entities.Creatore;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class CreatoreService {
    private List<Creatore> creatoreList = new ArrayList<>();

    public List<Creatore> getCreatoreList() {
        return creatoreList;
    }

    public Creatore saveCreatore(Creatore body) {
        creatoreList.add(body);
        System.out.println("utente salvato");
        return body;
    }

    public Creatore getCreatoreById(long id) {
        for (Creatore creatore : creatoreList) {
            if (creatore.getId() == id) {
                return creatore;
            }
        }
        throw new IllegalArgumentException("Creatore non trovato per l'ID: " + id);
    }

    public void deleteCreatoreById(long id) {
        Iterator<Creatore> iterator = creatoreList.iterator();
        while (iterator.hasNext()) {
            Creatore creatore = iterator.next();
            if (creatore.getId() == id) {
                iterator.remove();
                return;
            }
        }
        throw new IllegalArgumentException("Creatore non trovato per l'ID: " + id);
    }

    public Creatore findAndUpdateCreatore(long id, Creatore updatedCreatore) {
        for (Creatore creatore : creatoreList) {
            if (creatore.getId() == id) {
                creatore.setNome(updatedCreatore.getNome());
                creatore.setCognome(updatedCreatore.getCognome());
                creatore.setEmail(updatedCreatore.getEmail());
                creatore.setData_di_nascita(updatedCreatore.getData_di_nascita());
                creatore.setAvatar(updatedCreatore.getAvatar());
                return creatore;
            }
        }
        throw new IllegalArgumentException("Creatore non trovato per l'ID: " + id);
    }


}
