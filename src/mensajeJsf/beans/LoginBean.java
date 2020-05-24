package mensajeJsf.beans;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Query;

import entities.Usuario;
import model.UsuarioDao;

@ManagedBean
@SessionScoped

public class LoginBean {

	private Usuario  usuario;

	public LoginBean() {
		this.usuario=new Usuario();
		
	}
	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String login() {
		UsuarioDao uDao=new UsuarioDao();
		
		
		Query q=uDao.getEm().createQuery("select u from usuario uvwhere u.email =?1");
		
		q.setp
		
		System.out.print(usuario.getEmail()+usuario.getNombre()+usuario.getClave()+usuario.getUsuario());
		if(u!=null) {
		return "home";}
		else {
			return "error";}
	}
	
}
