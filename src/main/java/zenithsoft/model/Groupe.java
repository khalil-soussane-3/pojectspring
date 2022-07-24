package zenithsoft.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Groupe {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String description;
	@OneToMany(mappedBy = "groupe")
	private List<Produit> produits;
	

}
