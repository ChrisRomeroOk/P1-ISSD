//Desarrollá un programa que solicite la carga
//de 15 números e imprima la suma de los
//últimos 10 valores ingresados

import hsa.Console;

public class Desempeno53
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();

	int i, n, suma;
	suma=0;
       
	for (i=1;i<15;i++)
	{
	c.print ("Ingrese un valor: ");
	n=c.readInt();
	
	if (i>=5)
	{
	suma=suma+n;
	}
	}
	c.println ("La suma de los ultimos 10 numeros ingresados es: " + suma);
    }
}
