package mensajeJsf.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entities.Usuario;

@ManagedBean
@SessionScoped
public class MensajeBean {
	private Usuario  usuario;;

	public MensajeBean() {
		this.usuario=new Usuario();
		this.usuario.setNombre("Juan");
	}
	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String guardar() {
		System.out.print(usuario.getEmail()+usuario.getNombre()+usuario.getClave()+usuario.getUsuario());
		if(usuario.getEmail().contentEquals("juanpablo@gmail.com"))
		return "home";
		else
			return "error";
	}
	
}
