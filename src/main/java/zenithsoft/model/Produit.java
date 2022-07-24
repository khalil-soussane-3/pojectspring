package zenithsoft.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Produit {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String serialNumber;
	private String description;
	@ManyToOne
	private Groupe groupe;

}
