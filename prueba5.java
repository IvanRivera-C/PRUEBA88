
import java.util.Scanner;
public class prueba5{
public static void main(String[] args){

int opcion;

System.out.println("ESCRIBE UN NUMERO DEL UNO AL 10");
Scanner entrada= new Scanner(System.in);
opcion = entrada.nextInt();  
switch(opcion){
case 1: System.out.println("I");
	break;
case 2: System.out.println("II");
	break;
case 3: System.out.println("III");
	break;
case  4:	System.out.println("IV");
	break;
case 5: System.out.println("V");
	break;
case 6: System.out.println("VI");
	break;
case  7: System.out.println("VII");
	break;
case 8: System.out.println("VII");
	break;
case  9: System.out.println("XI");
	break; 
case 10: System.out.println("X");
	break; 
    default: 
    	System.out.println("EL RANGO NO CORRESPONDEL");
	break;
}


}

}
