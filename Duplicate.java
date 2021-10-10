 public class Duplicate
{
  public static void main(String[]args)
   {
      String str="hello";
      int lenght=str.length();
      char []a=str.toCharArray();
      for(int i=0;i<lenght;i++)
      {
        for(int j=i+1;j<lenght;j++)
	{
	  if(a[i]==a[j])
	  { 
	    System.out.println("duplicate string is  \n"+a[j]);
            
	  }
	}
  
      }
      

   }
}