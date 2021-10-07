import hsa.Console;

public class Desempeno44
{
    static Console c;
    
    public static void main (String[] args)
    {
	c = new Console ();
	int i, a;
	i=1;
	a=0;
	
	c.println ("Los numeros multiplos de 7 menores a 100 son: ");
	while (a<98)
	{
	a=i*7;
	if (a%7==0)
	{
	c.print (a + " ");
	i++;
	}
	
	}
    } 
}
