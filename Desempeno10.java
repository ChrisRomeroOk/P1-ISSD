import hsa.Console;

public class Desempeno10
{
    static Console c;
    public static void main (String[] args)
    {
	c = new Console ();
	int num1, num2, suma, diferencia, producto, division;
	c.print ("Ingrese el primer numero: ");
	num1 = c.readInt ();
	c.print ("Ingrese el segundo numero: ");
	num2 = c.readInt ();
	if (num1 > num2)
	{
	    suma = num1 + num2;
	    diferencia = num1 - num2;
	    c.println ("la suma de los numeros es: " + suma);
	    c.println ("la diferencia de los numeros es: " + diferencia);
	}
	else
	{
	    producto = num1 * num2;
	    division = num1 / num2;
	    c.println ("el producto de los numeros es: " + producto);
	    c.println ("la division de los numeros es: " + division);
	}
    }
}


