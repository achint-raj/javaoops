public class queoutput{
    static int num = 5;
    public void setNUM(int setto)
    {
        num = setto;
    }
}
class Main {
    static queoutput apple = new queoutput1();
    static queoutput orange = new queoutput1();
    public static void main(String args[])
{
    apple.setNUM(16);
    orange.setNUM(17);
    System.out.println(apple.num);
    System.out.println(orange.num);
}
}
