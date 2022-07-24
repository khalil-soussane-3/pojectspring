package zenithsoft.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import zenithsoft.model.Groupe;

@Repository
public interface GroupeRepository extends CrudRepository<Groupe,Long> {

}
