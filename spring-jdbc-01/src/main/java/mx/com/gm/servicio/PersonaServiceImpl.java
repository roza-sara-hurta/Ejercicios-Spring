package mx.com.gm.servicio;

import java.util.List;

import mx.com.gm.jdbc.Persona;
import mx.com.gm.jdbc.PersonaDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)  

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	private PersonaDao personaDao;

	public List<Persona> listarPersonas() {
		return personaDao.findAllPersonas();
	}

	public Persona recuperarPersona(Persona persona) {
		return personaDao.findPersonaById(persona.getIdPersona());
	}
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false) 
	public void agregarPersona(Persona persona) {
		personaDao.insertPersona(persona);
	}
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false) 
	public void modificarPersona(Persona persona) {
		personaDao.updatePersona(persona);
	}
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false) 
	public void eliminarPersona(Persona persona) { 
        personaDao.deletePersona(persona); 
    }
}