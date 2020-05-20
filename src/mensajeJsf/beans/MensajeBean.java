package mensajeJsf.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped


public class MensajeBean {
	private String nombre;

	public String getNombre() {
		this.nombre="Juan";
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
