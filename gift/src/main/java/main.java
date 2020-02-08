import  chocolates.*;
import sweets.*;
import java.util.*;
public class main {
	public static void sortedMerge(int a[], int b[],  int res[]) 
{ 
int i = 0, j = 0, k = 0; 
while (i < 3) { 
res[k] = a[i]; 
i++; 
k++; 
} 

while (j < 3) { 
res[k] = b[j]; 
j++; 
k++; 
} 

Arrays.sort(res); 
} 

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String[] Merge= {"Diary Milk","Kit-Kat    ","Snickers","Barfi    ","Halva    ","Laddu    "};
		int[] Merge_weight= {150,90,50,200,150,100};
		System.out.println("****Menu****	WEIGHTS");
		for(int i=0;i<6;i++)
		{
			System.out.printf((i+1)+")"+Merge[i]+"\t"+Merge_weight[i]+"\n\n");
		}
		int []qty=new int[6];
		for (int i=0;i<6;i++)
		{
			System.out.printf("Enter the quantity of "+Merge[i]+"::--->");
			qty[i]=sc.nextInt();
		}
		int[] weight =new int[6];
		int[] price = new int[6];
		dairymilk dm = new dairymilk();
		kitkat k=new kitkat();
		snickers s=new snickers();
		barfi b=new barfi();
		halva h=new halva();
		laddu l=new laddu();
		for(int j=0;j<6;j++)
		{
			switch(j)
			{
			case 0 : weight[j] = dm.weight();
					 price[j] = dm.price(qty[j]);
					 break;
			case 1:  weight[j] = k.weight();
			 		 price[j] = k.price(qty[j]);
			 		 break;
			case 2:	 weight[j] = s.weight();
			 		 price[j] = s.price(qty[j]);
			 		 break;
			case 3 : weight[j] = b.weight();
					 price[j] = b.price(qty[j]);
					 break;
			case 4:  weight[j] = h.weight();
			 		 price[j] = h.price(qty[j]);
			 		 break;
			case 5:	 weight[j] = l.weight();
			 		 price[j] = l.price(qty[j]);
			 		 break;
			 }
		}
		for(int i=0;i<6;i++)
			System.out.println(weight[i]+"     "+price[i]);
		
		System.out.println("Choose the option in which you want to sort\n1.)Based On WEIGHT\n2.)Based On PRICE");
		int n=sc.nextInt();
		if(n==1)
		{
			for(int i=0;i<6;i++)
			{
				for(int j=0;j<6;j++)
				{
					if(weight[i]>weight[j])
					{
						int u1=weight[i];
						weight[i]=weight[j];
						weight[j]=u1;
						int u3=price[i];
						price[i]=price[j];
						price[j]=u3;
						String u2=Merge[i];
						Merge[i]=Merge[j];
						Merge[j]=u2;
					}
				}
			}
			System.out.println("****MENU****	WEIGHTS		PRICE");
			for(int i=0;i<6;i++)
			{
				System.out.printf(Merge[i]+"\t"+weight[i]+"\t\t"+price[i]+"\n");
			}
		}
		else if(n==0)
		{
			for(int i=0;i<6;i++)
			{
				for(int j=0;j<6;j++)
				{
					if(price[i]>price[j])
					{
						int u1=price[i];
						price[i]=price[j];
						price[j]=u1;
						int u3=weight[i];
						weight[i]=weight[j];
						weight[j]=u3;
						String u2=Merge[i];
						Merge[i]=Merge[j];
						Merge[j]=u2;
					}
				}
			}
			
			System.out.println("****MENU****	WEIGHT		PRICE");
			for(int i=0;i<6;i++)
			{
				System.out.printf(Merge[i]+"\t"+weight[i]+"\t\t"+price[i]+"\n");
			}
			
		}
		int sum1=0,sum2=0;
		for(int i=0;i<6;i++)
		{
		    sum1+=price[i];
		    sum2+=weight[i];
		}
		System.out.println("*******************************************");
		System.out.println(" Total-Price    "+sum2+"grams        "+sum1);
		System.out.println("*******************************************");
		
	}

}
