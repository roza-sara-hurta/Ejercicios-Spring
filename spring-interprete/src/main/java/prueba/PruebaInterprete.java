package prueba;

import beans.*;
public class PruebaInterprete {

	public static void main(String[] args) {
		Traductor traductor = new Traductor();
		InterpreteEspanol interprete = new InterpreteEspanol();
		//El interprete se inyecta manualmente
		//Y solamente puede recibir un interprete en Español
		//No un interprete en Inglés u otros idiomas
		traductor.setInterprete(interprete);//injeccion de independecia
		traductor.setNombre("Carlos Esparza");//injeccin de valores
		traductor.hablar();
		}
}
