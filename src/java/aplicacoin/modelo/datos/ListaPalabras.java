/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacoin.modelo.datos;

import java.util.ArrayList;

/**
 *
 * @author Tomas Fernandez EdM
 */
public class ListaPalabras {

	private ArrayList<String> palabras;

	public ListaPalabras() {
		palabras = new ArrayList();
	}

	/**
	 * @return the palabras
	 */
	public ArrayList<String> getPalabras() {
		return palabras;
	}

	/**
	 * @param palabras the palabras to set
	 */
	public void setPalabras(ArrayList<String> palabras) {
		this.palabras = palabras;
	}

	/**
	 * @return the palabras
	 */

}
