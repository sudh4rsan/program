package Practice;
import java.util.Scanner;
public class RajuRay {
	public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	System.out.println("enter the string1:");
	String str1=a.next();
	System.out.println("enter the string2:");
	String str2=a.next();
	System.out.println("enter the pin number");
	String pin=a.next();
	int plen=pin.length();
	System.out.println("enter the number");
	int number=a.nextInt();
	int len1=str1.length();
	int len2=str2.length();
   if(len1>len2)
   {
	  String dummy=str1.charAt(0)+""+str2+""+pin.charAt(number-1)+""+pin.charAt(plen-number);
	  char[] d=dummy.toCharArray();
	  for(int i=0;i<dummy.length();i++)
		{
			if(Character.isUpperCase(d[i]))
			{
				int  str=(int)d[i]+32;
				System.out.print((char)str);
			}
			else if(Character.isLowerCase(d[i]))
			{
				int str=(int)d[i]-32;
				System.out.print((char)str);
			}
			else
			{
				System.out.print(d[i]);
			}
		}
	  }
   else
   {
	   String dummy1=str2.charAt(0)+""+str1+""+pin.charAt(number-1)+""+pin.charAt(plen-number);
	   char[] d=dummy1.toCharArray();
		  for(int i=0;i<dummy1.length();i++)
			{
				if(Character.isUpperCase(d[i]))
				{
					int  str=(int)d[i]+32;
					System.out.print((char)str);
				}
				else if(Character.isLowerCase(d[i]))
				{
					int str=(int)d[i]-32;
					System.out.print((char)str);
				}
				else
				{
					System.out.print(d[i]);
				}
			}
   }
	}

}
