import hsa.Console;

public class Desempeno47
{
    static Console c;
    
    public static void main (String[] args)
    {
	c = new Console ();
	int a1,a2,i;
	
	c.print ("Ingrese el primer valor: ");
	a1=c.readInt();
	
	c.print ("Ingrese el segundo valor: ");
	a2=c.readInt();
	
	i=a1+1;
	
	while (i>a1 && i<a2)
	{
	c.println ("Numeros dentro: " + i);
	i++;
	}
    } 
} 
