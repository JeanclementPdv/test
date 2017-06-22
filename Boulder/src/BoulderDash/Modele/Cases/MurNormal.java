package BoulderDash.Modele.Cases;

import BoulderDash.Modele.Niveau;
import BoulderDash.Modele.Animation.Animation;
import BoulderDash.Modele.Animation.TableAnimation;

public class MurNormal extends Case {

	/**
	 * @param x
	 * @param y
	 */
	public MurNormal(int x, int y) {
		super(x, y);
	}

	@Override
	public Animation getAnimation() {
		return TableAnimation.getMur();
	}

	@Override
	public String ID() {
		return "N";
	}

	/**
	 * fonction d'arrivée d'objet chutable (même comportement qu'un élément
	 * Chutable
	 * 
	 * @see Chutable
	 */
	@Override
	public EtatChutable chutableArrive(Niveau N) {

		if (((Chutable) N.getCase(getX(), getY() - 1)).instable()) {
			N.echangeCases(getX() + 1, getY(), getX(), getY() - 1);
			N.remplirUpTable(getX(), getY() - 1);
			return EtatChutable.Chute;
		} else {
			return EtatChutable.Instable;
		}
	}
}
