package zenithsoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zenithsoft.model.Groupe;
import zenithsoft.model.Produit;
import zenithsoft.repository.GroupeRepository;
import zenithsoft.repository.ProduitRepository;

@Service
public class GroupeService {

    @Autowired
    private GroupeRepository groupeRepository;

    public Iterable<Groupe> findAllGroupes() {
        return groupeRepository.findAll();
    }

    public Groupe findGroupeById(Long id) { return groupeRepository.findById(id).get();}

    public Groupe saveGroupe(Groupe groupe) {return groupeRepository.save(groupe);}

    public void deleteGroupeById(Long id) {
        groupeRepository.deleteById(id);
    }

    public Groupe updateGroupe(Groupe groupe) {
        return groupeRepository.save(groupe);
    }

}
