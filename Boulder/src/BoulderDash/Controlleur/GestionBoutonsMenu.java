package BoulderDash.Controlleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import BoulderDash.BoulderDash;
import BoulderDash.Vue.Vues;

public class GestionBoutonsMenu implements ActionListener {

	private JButton bouton1;

	/**
	 * constructeur du gestionaire de menu
	 * 
	 * @param b1
	 *            bouton Jouer
	 * @param b2
	 *            bouton Editeur
	 * @param b3
	 *            bouton Quitter
	 */
	public GestionBoutonsMenu(JButton b1) {
		this.bouton1 = b1;

	}

	/**
	 * déclenche les bonnes actions en fonction des boutons appuyés
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == this.bouton1) {
			BoulderDash.getFen().changerVue(Vues.MENUCHOIXNIVEAU);
			BoulderDash.getJeu().resetScore();

		}
	}
}