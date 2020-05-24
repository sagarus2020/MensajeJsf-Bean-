package mensajeJsf.beans;


import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entities.Contacto;
import entities.Usuario;
import model.ContactoDao;

@ManagedBean
@SessionScoped

public class ContactoBean {
	
	ContactoDao contactoDao = new ContactoDao();
	
	List<Contacto> contactos = new ArrayList<Contacto>();

}
