// The "Desempeno87" class.
import java.awt.*;
import hsa.Console;

public class Desempeno87
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	int[] v1;
	int[] v2;
	int[] v3;
	static Console c;

	Desemp87 ()
	{
	    v1 = new int [5];
	    v2 = new int [5];
	    v3 = new int [5];
	}


	void cargaDatos ()
	{
	    c.println ("Ingrese los valores para cada vector");

	    for (int i = 0 ; i < v1.length ; i++)
	    {
		c.print ("Ingrese valor para v1[" + (i + 1) + "]: ");
		v1 [i] = c.readInt ();
	    }
	    for (int i = 0 ; i < v2.length ; i++)
	    {
		c.print ("Ingrese valor para v2[" + (i + 1) + "]: ");
		v2 [i] = c.readInt ();
	    }
	    for (int i = 0 ; i < v3.length ; i++)
	    {
		c.print ("Ingrese valor para v3[" + (i + 1) + "]: ");
		v3 [i] = c.readInt ();
	    }
	}


	float promedio1 ()
	{
	    float sumaV1 = 0;
	    float prom1;

	    for (int i = 0 ; i < v1.length ; i++)
	    {
		sumaV1 = sumaV1 + v1 [i];
	    }
	    prom1 = sumaV1 / v1.length;

	    return prom1;

	}


	float promedio2 ()
	{
	    float sumaV2 = 0;
	    float prom2;

	    for (int i = 0 ; i < v2.length ; i++)
	    {
		sumaV2 = sumaV2 + v2 [i];
	    }
	    prom2 = sumaV2 / v2.length;

	    return prom2;
	}


	float promedio3 ()
	{
	    float sumaV3 = 0;
	    float prom3;

	    for (int i = 0 ; i < v3.length ; i++)
	    {
		sumaV3 = sumaV3 + v3 [i];
	    }
	    prom3 = sumaV3 / v3.length;

	    return prom3;
	}


	void imprimirDatos ()
	{
	    c.clear ();
	    c.println ("Valor de cada vector: ");

	    c.print ("Vector 1: [ ");
	    for (int i = 0 ; i < v1.length ; i++)
	    {
		c.print (v1 [i] + "-");
	    }
	    c.print ("] y su promedio es :" + promedio1 ());

	    c.println ();

	    c.print ("Vector 2: [ ");
	    for (int i = 0 ; i < v2.length ; i++)
	    {
		c.print (v2 [i] + "-");
	    }
	    c.print ("] y su promedio es :" + promedio2 ());

	    c.println ();

	    c.print ("Vector 3: [ ");
	    for (int i = 0 ; i < v3.length ; i++)
	    {
		c.print (v3 [i] + "-");
	    }
	    c.print ("] y su promedio es :" + promedio3 ());
	}






	public static void main (String[] args)
	{
	    c = new Console ();
	    Desemp87 e = new Desemp87 ();
	    e.cargaDatos ();
	    e.imprimirDatos ();
	    e.promedio1 ();
	    e.promedio2 ();
	    e.promedio3 ();
	} // main method
    } // Desempeno87 class
}

