import java.awt.*;
import hsa.Console;

class Desempeno57
{
    static Console c;

    public static void main (String[] args)
    {
	int n, m, j, i, l1, l2, l3, equilatero, isosceles, escaleno;
	m = equilatero = isosceles = escaleno = 0;
	c = new Console ();

	c.print ("Ingrese cantidad de datos a procesar: ");
	n = c.readInt ();


	for (i = 1 ; i <= n ; i++)
	{
	    c.print ("Ingrese medida LADO 1: ");
	    l1 = c.readInt ();

	    c.print ("Ingrese medida LADO 1: ");
	    l2 = c.readInt ();

	    c.print ("Ingrese medida LADO 3: ");
	    l3 = c.readInt ();

	    if (l1 == l2 && l1 == l3 && l2 == l3)
	    {
		equilatero++;
		c.println ("El triangulo " + i + " es EQUILATERO");
	    }
	    else if (l1 == l2 || l1 == l3 || l2 == l3)
	    {
		isosceles++;
		c.println ("El triangulo " + i + " es ISOSCELES");
	    }
	    else
	    {
		escaleno++;
		c.println ("El triangulo " + i + " es ESCALENO");
	    }


	}
	c.println ();
	c.println ("Triangulos EQUILATERO: " + equilatero);
	c.println ("Triangulos ISOSCELES: " + isosceles);
	c.println ("Triangulos ESCALENO: " + escaleno);


	if (equilatero < isosceles && equilatero < escaleno)
	{
	    m = equilatero;
	    c.println ("Se ingreso MENOR cantidad de el triangulo EQUILATERO");
	}
	if (isosceles < equilatero && isosceles < escaleno)
	{
	    m = isosceles;
	    c.println ("Se ingreso MENOR cantidad de el triangulo ISOSCELES");
	}
	if (escaleno < isosceles && escaleno < equilatero)
	{
	    m = escaleno;
	    c.println ("Se ingreso MENOR cantidad de el triangulo ESCALENO");
	}
	if (isosceles == equilatero || isosceles == escaleno || equilatero == escaleno)
	{
	    c.println ("Hay DOS o MAS  VALORES IGUALES");
	}


	// Place your program here.  'c' is the output console
    } // main method
} // Desemp57 class


//Realizá un programa que lea los 3 lados de N
//triángulos, e informe:
//| De cada uno de ellos, qué tipo de triángulo//
//es: equilátero (tres lados iguales), isósceles
//(dos lados iguales), o escaleno (todos los lados
//desiguales).
//| Cantidad de triángulos de cada tipo.
//| Tipo de triángulo del cual se ingresó la menor
//cantidad.
