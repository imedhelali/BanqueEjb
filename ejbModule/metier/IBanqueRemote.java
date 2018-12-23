package metier;

import javax.ejb.Remote;

@Remote
public interface IBanqueRemote {

	public Long addCompte(Compte compte);

	public java.util.List<Compte> getAllComptes();

	public void verser(Long code, double montant);

	public void retirer(Long code, double montant);

	public Compte consulterCompte(Long code);

	public void supprimerCompte(Long code);

}
