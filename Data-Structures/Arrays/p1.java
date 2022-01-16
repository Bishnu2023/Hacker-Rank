//Array of ArrayList
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
class A
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size of the Array of ArrayList: ");
		int n=Integer.parseInt((br.readLine()));
		ArrayList<String>[] al=new ArrayList[n];
		
		//Initializing every row of the Array of ArrayList 

		for(int i=0; i<n ; i++)
		{
			al[i]=new ArrayList<String>();
		}

		System.out.println("Size of Array of ArrayList: "+al.length);
		for(int i=0; i<n; i++)
		{
			System.out.print("Enter elements of Group"+(i+1)+":");
			String s=br.readLine();
			String sp[]=s.split("\\ ");
			for(int j=0; j<sp.length; j++)
			{
				al[i].add(sp[j]);
			}
		}
		for(int i=0; i<n; i++)
		{
			System.out.print("Elements of Group"+(i+1)+" are:");
			for(int j=0; j<al[i].size(); j++)
			{
				System.out.print(al[i].get(j)+" ");
			}
			System.out.println();
		}
	}
      /*public static void main(String args[])
	{
		int n=3;
		ArrayList<String>[] al=new ArrayList[n];
		//Initizating each rows
		for(int i=0; i<n ; i++)
		{
			al[i]=new ArrayList<String>();
		}
		al[0].add("Aakash");
		al[0].add("Aastha");
		al[0].add("Adarsh");
		al[1].add("Ansh");
		al[1].add("Bishnu");
		al[2].add("Daman");
		//Displaying the elements of Array of ArrayList (al)
		for(int i=0; i<n; i++)
		{
			System.out.println(al[i]);
		}
	}*/
}
