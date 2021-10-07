/*Realizar un programa que permita cargar por teclado los datos de 4 empleados
(en tres vectores distintos).
2- Generar un cuarto vector con el sueldo total a pagar por empleado (pago por hora*cant horas)
3- Mostrar el dni del empleado que tiene un sueldo mayor.
4- Mostrar cuantos empleados cobran menos de 1500 pesos, cuantos entre
1500 y 3000 y cuantos mas de 3000.
5- imprimir los dni de empleados que trabajan mas de 200 horas al mes.
*/
import hsa.Console;

public class SueldosEmpleados
{
    static Console c;

    int[] dni = new int [4];
    int[] precioHora = new int [4];
    int[] CantHoras = new int [4];
    int[] sueldos = new int [4];

    void cargar ()
    {
	for (int f = 0 ; f < dni.length ; f++)
	{
	    c.print ("Ingrese el dni: ");
	    dni [f] = c.readInt ();
	    c.print ("Ingrese cuanto se le paga la hora de trabajo: ");
	    precioHora [f] = c.readInt ();
	    c.print ("Ingrese la cantidad de horas que trabajo: ");
	    CantHoras [f] = c.readInt ();
	}
    }


    void generarSueldos ()
    {
	for (int f = 0 ; f < sueldos.length ; f++)
	{
	    sueldos [f] = precioHora [f] * CantHoras [f];
	}
    }


    void imprimir ()
    {
	c.println ();
	c.println ("DNI - PRECIO HORA - CANT HORAS - SUELDO A PAGAR");
	for (int f = 0 ; f < dni.length ; f++)
	{

	    c.println (dni [f] + " - " + precioHora [f] + " - " + CantHoras [f] + " - " + sueldos [f]);
	}
    }


    void mayorSueldo ()
    {
	int pos = 0;
	for (int f = 1 ; f < sueldos.length ; f++)
	{
	    if (sueldos [f] > sueldos [pos])
	    {
		pos = f;
	    }
	}
	c.println ();
	c.println ("El empleado con mayor sueldo es DNI: " + dni [pos] + " || con un sueldo de: " + sueldos [pos]);
    }


    void rangoSueldos ()
    {
	int cont1 = 0;
	int cont2 = 0;
	int cont3 = 0;
	for (int f = 0 ; f < sueldos.length ; f++)
	{
	    if (sueldos [f] < 1500)
	    {
		cont1++;
	    }
	    else
	    {
		if (sueldos [f] < 3000)
		{
		    cont2++;
		}
		else
		{
		    cont3++;
		}
	    }
	}
	c.println ("Cantidad de empleados que cobran menos de $1500: " + cont1);
	c.println ("Cantidad de empleados que cobran entre $1500 y $3000: " + cont2);
	c.println ("Cantidad de empleados que cobran mas de $3000: " + cont3);
    }


    void trabajadoresMas200Hs ()
    {
	c.println ();
	c.println ("Trabajadores con mas de 200 Horas al mes: ");
	for (int f = 0 ; f < sueldos.length ; f++)
	{
	    if (CantHoras [f] > 200)
	    {
		c.println (dni [f]);
	    }
	}
    }


    public static void main (String[] args)
    {
	c = new Console ();
	SueldosEmpleados p = new SueldosEmpleados ();
	p.cargar ();
	p.generarSueldos ();
	p.imprimir ();
	p.mayorSueldo ();
	p.rangoSueldos ();
	p.trabajadoresMas200Hs ();

    }
}
