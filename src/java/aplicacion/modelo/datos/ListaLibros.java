/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.datos;

import aplicacion.modelo.dominio.Libro;
import java.util.ArrayList;

/**
 *
 * @author Tomas Fernandez EdM
 */
public class ListaLibros {

	private ArrayList<Libro> listaLibros;

	public ListaLibros() {
		listaLibros = new ArrayList();
	}

	public void agregarLibro(Libro unLibro) {
		listaLibros.add(unLibro);
	}

	public ListaLibros(ArrayList<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}

	/**
	 * @return the listaLibros
	 */
	public ArrayList<Libro> getListaLibros() {
		return listaLibros;
	}

	/**
	 * @param listaLibros the listaLibros to set
	 */
	public void setListaLibros(ArrayList<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}
}
