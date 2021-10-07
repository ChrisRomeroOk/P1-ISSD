/*Confeccioná un programa que lea N pares
de datos, en donde cada par de datos
corresponde a la medida de la base y la altura
de un triángulo. El programa deberá informar:
| De cada triángulo, la medida de su base, su
altura y su superficie.
| La cantidad de triángulos cuya superficie sea
mayor a 12.*/
import hsa.Console;

public class Desempeno52
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int n, i, mayores;
	float base, altura, superficie;

	mayores = 0;

	c.print ("Ingrese la cantidad de datos a procesar: ");
	n = c.readInt ();

	for (i = 1 ; i <= n ; i++)
	{
	    c.print ("Ingrese medida de la base del triangulo: ");
	    base = c.readFloat ();

	    c.print ("Ingrese medida de la altura del triangulo: ");
	    altura = c.readFloat ();

	    superficie = base * altura;

	    c.println ();

	    c.println ("El triangulo numero: " + i + " tiene una base de: " + base + " y una altura de: " + altura + " , su superficie es: " + superficie);

	    if (superficie > 12)
	    {
		mayores++;
	    }
	}
	c.println ();
	c.println ("La cantidad de triangulos cuya superficie es mayor a 12 es: " + mayores);
    }
}
