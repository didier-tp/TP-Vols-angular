package vol.metier.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
@DiscriminatorValue("Moral")
public class ClientMoral extends Client {

	private TitreMoral titre;
	private String siret;

	public ClientMoral() {
	}

	@Column(name = "Titre")
	@Enumerated(EnumType.STRING)
	@JsonView(Views.Common.class)
	public TitreMoral getTitre() {
		return titre;
	}

	public void setTitre(TitreMoral titre) {
		this.titre = titre;
	}

	@Column(name = "Siret", length = 50)
	@JsonView(Views.Common.class)
	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}

}
