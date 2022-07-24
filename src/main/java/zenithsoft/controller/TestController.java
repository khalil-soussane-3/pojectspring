package zenithsoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zenithsoft.model.Produit;
import zenithsoft.repository.GroupeRepository;
import zenithsoft.repository.ProduitRepository;

@RestController
@RequestMapping(value = "/test")
public class TestController {
	
	@Autowired
	private ProduitRepository produitRepository;

	@Autowired
	private GroupeRepository groupeRepository;
	
	@RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
	public String hello(@PathVariable String name) {
		return "hello : "+name;
	}
	
	@RequestMapping(value = "/produit", method = RequestMethod.POST)
	public void getProduit() {
		Produit produit = new Produit();
		produit.setDescription("description 00");
		produit.setSerialNumber("serial 00");
		produitRepository.save(produit);

		Produit produit01 = new Produit();
		produit01.setDescription("description 01");
		produit01.setSerialNumber("serial 01");
		produitRepository.save(produit01);

		Produit produit02 = new Produit();
		produit02.setDescription("description 02");
		produit02.setSerialNumber("serial 02");
		produitRepository.save(produit02);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public String deleteproduit(){
		produitRepository.deleteById(6L);
		return "done" ;
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public void updateproduit(@RequestBody Produit prod){
			produitRepository.save(prod);
	}

}






