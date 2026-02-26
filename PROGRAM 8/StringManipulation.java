public class StringManipulation
{
public static void main(String[]args)
{
String str="Hello,World!";
int length=str.length();
System.out.println("Length:"+length);
String uppercase=str.toUpperCase();
System.out.println("Uppercase:"+uppercase);
String lower=str.toLowerCase();
System.out.println("lowecase:"+lower);
String replaced=str.replace('o','x');
System.out.println("replaced:"+replaced);
String substring=str.substring(7,12);
System.out.println("substring:"+substring);
boolean startsWith =str.startsWith("Hello");
System.out.println("starts with HELLO:"+startsWith);
boolean endsWith =str.endsWith("WORLD");
System.out.println("ends with WORLD:"+endsWith); 
String trimmed="hello,world!".trim();
System.out.println("Trimmed:"+trimmed);
}
}

    
    
                                                                                                                                                                                                                            

