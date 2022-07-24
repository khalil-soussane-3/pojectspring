package zenithsoft.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import zenithsoft.model.Produit;

@Repository
public interface ProduitRepository extends CrudRepository<Produit, Long>{

}
