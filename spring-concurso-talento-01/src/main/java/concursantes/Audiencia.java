package concursantes;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audiencia {

	@Pointcut("execution(* concursantes.Concursante.ejecutar(..))")
	public void ejecutarShow() {
	}

	@Around("ejecutarShow()")
	public void monitorearShow(ProceedingJoinPoint joinpoint) {
		try {
			System.out.println("El show está por comenzar, favor de tomar asiento...");
			System.out.println("Favor de apagar celulares...");

			// Anotamos la hora de inicio
			long horaInicio =  System.currentTimeMillis();

			// Se llama al método de negocio (método objetivo)
			 joinpoint.proceed();

			Thread.sleep(1000); // 1 segundo //Este delay en milisegundos es
								// opcional y se puede poner en los métodos //de
								// negocio para simular la duración del método

			long horaTermino = System.currentTimeMillis();

			System.out.println("El show ha termiado, aplausos");
			System.out.println("El show tuvo una duración:" + (horaTermino - horaInicio));
		} catch (Throwable t) {
			System.out.println("El show fue terrible, se devolverán las entradas");
		}
	}
}