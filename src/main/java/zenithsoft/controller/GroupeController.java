package zenithsoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zenithsoft.model.Groupe;
import zenithsoft.model.Produit;
import zenithsoft.service.GroupeService;
import zenithsoft.service.ProduitService;

@RestController
@RequestMapping(value = "/groupes")
public class GroupeController {

    @Autowired
    private GroupeService groupeService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Iterable<Groupe> findAllGroupes() {
        return groupeService.findAllGroupes();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Groupe findGroupeById(@PathVariable Long id) {
        return groupeService.findGroupeById(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Groupe saveGroupe(@RequestBody Groupe groupe) {
        return groupeService.saveGroupe(groupe);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteGroupeById(@PathVariable Long id) {
        groupeService.deleteGroupeById(id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public Groupe updateGroupe(@RequestBody Groupe groupe) {
        return groupeService.updateGroupe(groupe);
    }

}
