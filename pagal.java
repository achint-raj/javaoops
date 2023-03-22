import java.util.*;
abstract class khata
{
    float balance;
    long accountnumber;
    String accountholdersname;
    String address;
    khata()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter balance");
        balance=in.nextFloat();
        System.out.println("enter account number:");
        accountnumber=in.nextLong();
        in.nextLine();
        System.out.println("Enter accouontholdersname:");
        accountholdersname=in.nextLine();
        System.out.println("Enter address");
        address=in.nextLine();
    }
    khata(float b) //long an, String ahn, String add)
    {
        /*balance=b;
        accountnumber=an;
        accountholdersname=ahn;
        address=add;*/
    }
    abstract void withdrawl();
    abstract void deposit();
    void display()
    {
        System.out.println("The balance is:"+balance);
    }
}
class Savingkhata extends khata
{
    float rate;
Savingkhata()
{
    super();
    Scanner in=new Scanner(System.in);
    System.out.println("enter rate:");
    rate=in.nextFloat();
}
    void withdrawl()
    {}
    void deposit()
    {}
    void calc()
    {
        balance+=(balance * rate)/100.0;
    }
    void display()
    {
        System.out.println("rate:"+rate);
        System.out.println("nwe balance="+balance);// with all details
        System.out.println("Account number="+accountnumber);
        System.out.println("khatadhari="+accountholdersname);
        System.out.println("pata="+address);
    }
}
class Currentkhata extends khata
{
    float odl;
    Currentkhata()
    {
        super(5);
        Scanner in=new Scanner(System.in);
        System.out.println("Enter odl");
        odl=in.nextFloat();
    }
    void withdrawl()
    {}
    void deposit()
    {}
    void display()
    {
        System.out.println("Overdraftlimit:"+odl);// with full details
    }
}

public class pagal {
    public static void main(String args[])
    {
        Savingkhata obj1=new Savingkhata();
        obj1.calc();
        obj1.display();
        Currentkhata obj2=new Currentkhata();
        obj2.display();
        obj1.display();
    }
    
}
