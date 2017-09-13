package vol.metier.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
@DiscriminatorValue("EI")
public class ClientEI extends Client {

	private TitrePhysique titre;
	private String prenom;

	public ClientEI() {
	}

	@Column(name = "Titre")
	@Enumerated(EnumType.STRING)
	@JsonView(Views.Common.class)
	public TitrePhysique getTitre() {
		return titre;
	}

	public void setTitre(TitrePhysique titre) {
		this.titre = titre;
	}

	@Column(name = "Prenom", length = 50)
	@JsonView(Views.Common.class)
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
