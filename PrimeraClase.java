/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Menu");
		System.out.println("1.Pasar de coordenadas polares a rectangulares");
		System.out.println("2.Pasar de coordenadas rectangulares a polares");
		System.out.println("3. salir");
		int opc = opc.nextInt();
		
		switch (opc){
		    case 1: 
		        System.out.println("Ingrese la distancia: ");
		        int distancia= disntacia.nextInt();
		        float angulo = angulo.nextDouble();
		        float x,y;
		        x= distancia* Math.cos(angulo);
		        y= distncia* Math.sin(angulo);
		        System.out.println("La coordenada x es: "+x);
		         System.out.println("La coordenada y es: "+y);
		        break;
		    case 2:
		        
		        
		        break;
		  case 3:
		      break; 
		        
		    
		}
		
	}
}
