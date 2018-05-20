/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador;

import aplicacoin.modelo.datos.ListaPalabras;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Tomas Fernandez EdM
 */
@ManagedBean
@ViewScoped
public class PalabraFormBean implements Serializable {

	private String palabraIngresada;
	private ListaPalabras listadoPalabras;

	public PalabraFormBean() {
		listadoPalabras = new ListaPalabras();
	}

	public void agregarPalabra() {
		if ("".equals(palabraIngresada)) {
		} else {
			listadoPalabras.getPalabras().add(palabraIngresada);
		}
	}

	public void reiniciar() {
		listadoPalabras = new ListaPalabras();
	}

	/**
	 * @return the palabraIngresada
	 */
	public String getPalabraIngresada() {
		return palabraIngresada;
	}

	/**
	 * @param palabraIngresada the palabraIngresada to set
	 */
	public void setPalabraIngresada(String palabraIngresada) {
		this.palabraIngresada = palabraIngresada;
	}

	/**
	 * @return the listadoPalabras
	 */
	public ListaPalabras getListadoPalabras() {
		return listadoPalabras;
	}

	/**
	 * @param listadoPalabras the listadoPalabras to set
	 */
	public void setListadoPalabras(ListaPalabras listadoPalabras) {
		this.listadoPalabras = listadoPalabras;
	}

	/**
	 * @return the palabras
	 */
}
