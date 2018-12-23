package metier;

import javax.ejb.Local;

@Local
public interface IBanqueLocal {
	public Long addCompte(Compte compte);

	public java.util.List<Compte> getAllComptes();

	public void verser(Long code, double montant);

	public void retirer(Long code, double montant);

	public Compte consulterCompte(Long code);

	public void supprimerCompte(Long code);

}
