package metier;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(name = "BK")
public class BanqueEJBImpl implements IBanqueLocal, IBanqueRemote {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Long addCompte(Compte compte) {
		entityManager.persist(compte);
		return compte.getCode();

	}

	@Override
	public List<Compte> getAllComptes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void verser(Long code, double montant) {
		// TODO Auto-generated method stub

	}

	@Override
	public void retirer(Long code, double montant) {
		// TODO Auto-generated method stub

	}

	@Override
	public Compte consulterCompte(Long code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerCompte(Long code) {
		// TODO Auto-generated method stub

	}

}
