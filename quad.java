import java.util.*;
import java.lang.*;
class quad
{ public static void main(String args[])
{Scanner s=new Scanner(System.in);
double d;
double root1;
double root2;
System.out.println("enter a\n");
int a=s.nextInt();
System.out.println("enter b\n");
int b=s.nextInt();
System.out.println("enter c\n");
int c=s.nextInt();
d=(b*b)-(4*a*c);
if(d>0)
{ System.out.println("real roots\n");
 root1=((-b)+Math.sqrt(d))/(2*a);
 root2=((-b)-Math.sqrt(d))/(2*a);
System.out.println("root 1:\n" +root1);
System.out.println("root 2:\n" +root2);
}
else if(d==0)
{ System.out.println("equal roots\n");
  root1=((-b)/(2*a));
  root2=root1;
System.out.println("root1:\n"+root1);
System.out.println("root2:\n"+root2);
}
else
{System.out.println("imaginery roots\n");
}}}
 