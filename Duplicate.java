import java.io.*;
class Duplicate
{
   public static void main(String ... args)throws IOException
	{
      File f1=new File("xyz.txt");
      PrintWriter pw=new PrintWriter(f1);
      pw.println("we are prologian");
      pw.println("love your goal as your life");
      pw.println("we are prologian");
      pw.println("we live in delhi");
      pw.println("we are also jamian");
      pw.println("proud to be prologian");
	  pw.close();
      FileReader fr1=new FileReader(f1);
      BufferedReader fb1=new BufferedReader(fr1);
      String line1=fb1.readLine();
      File f2=new File("result");
      PrintWriter pw2=new PrintWriter(f2);
      String a[]=new String[10];
      int i=0,k=0,x,y;
      while(line1!=null)
   {
      a[i]=line1;
      i++;
      line1=fb1.readLine();
   }
      for( x=0;x<i;x++)
   {
	  k=0;
      for( y=0;y<i;y++)
     {
       if(a[x].equals(a[y]))
       {
         //pw2.println(a[y]);
         k++;
       }
     }
     if(k>1)
     {
	   k=0;
       pw2.println(a[x]);
	   
     }
	 
   }
   pw2.close();
}
}

       


     