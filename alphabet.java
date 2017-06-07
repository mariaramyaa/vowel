public static void main(string args[])
{
char ch
scanner scan =new scanner (System.in);
System.out.print("Enter the charactor:");
ch=scan.next().charAt(0);
if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
{
System.out.print(ch+"is an Alphabet");
}
else
{
System.out.print(ch+"is not an Alphabet");
}
}
}
