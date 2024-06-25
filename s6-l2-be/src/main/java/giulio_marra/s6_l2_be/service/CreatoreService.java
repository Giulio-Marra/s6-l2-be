package giulio_marra.s6_l2_be.service;

import giulio_marra.s6_l2_be.entities.Creatore;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
}
