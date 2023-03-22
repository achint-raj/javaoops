import java.util.*;

public class splitter {
public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    String newstr[] = str.split("\\..");

    // int len=newstr.length;
    // System.out.println(len);
    // for(String a:newstr)
    // System.out.println(a);
    int len = newstr.length; boolean flag=false;
   if(len == 4){
   for(int i=0;i<len;i++){
    int val = Integer.parseInt(newstr[i]);
    if(val >=10 && val <= 125){
        flag=true;
    continue;}
    else 
    break;
   }  
    }
    else
    flag=false;
    // break;
   
   if(flag==true)

    System.out.println("true");else
    System.out.println("false");

}    

}