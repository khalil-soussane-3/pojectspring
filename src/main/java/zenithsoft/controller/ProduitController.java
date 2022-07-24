package zenithsoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zenithsoft.model.Produit;
import zenithsoft.service.ProduitService;

@RestController
@RequestMapping(value = "/produits")
public class ProduitController {
	
	@Autowired
	private ProduitService produitService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Iterable<Produit> findAllProduits() {
		return produitService.findAllProduits();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Produit findProduitById(@PathVariable Long id) {
		return produitService.findProduitById(id);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public Produit saveProduit(@RequestBody Produit produit) {
		return produitService.saveProduit(produit);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteProduitById(@PathVariable Long id) {
		 produitService.deleteProduitById(id);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public Produit updateProduit(@RequestBody Produit produit) {
		return produitService.updateProduit(produit);
	}

	
}
