//alumno: Christian Romero
import hsa.Console;

public class Desempeno15
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	float sueldo, aumento, sueldoACobrar;
	int antiguedad;
	c.print ("Ingrese el sueldo: ");
	sueldo = c.readFloat ();
	c.print ("Ingrese los anos de antiguedad: ");
	antiguedad = c.readInt ();
	if (sueldo < 4500 && antiguedad >= 10)
	{
	    aumento = sueldo * 10 / 100;
	    sueldoACobrar = sueldo + aumento;
	    c.println ("El sueldo a cobrar es: " + sueldoACobrar);
	}
	if (sueldo < 4500 && antiguedad < 10)
	{
	    aumento = sueldo * 5 / 100;
	    sueldoACobrar = sueldo + aumento;
	    c.println ("El sueldo a cobrar es: " + sueldoACobrar);
	}
	sueldoACobrar = sueldo;
	c.println ("El sueldo a cobrar es: " + sueldoACobrar);
    }
}
