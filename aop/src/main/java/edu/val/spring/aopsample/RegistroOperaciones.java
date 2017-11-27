package edu.val.spring.aopsample;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class RegistroOperaciones {
	
	@Pointcut("execution(* MiController.paginicio(..))")  
    public void k(){
		System.out.println("DENTRO DE K");
	}  
      
    
    @After("k()")  
    public void myadvice2 (JoinPoint jp)
    {  
        System.out.println("Después de K...");  
    }

}
