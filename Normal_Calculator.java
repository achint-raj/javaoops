interface Calculator
{
    int add(int a, int b);
    int sub(int a, int b);
    int mul(int a, int b);
    int div(int a, int b);
}
class Normal_Calculator implements Calculator
{
    public int add(int a, int b)
    {
        return a+b;
    }
    public int sub(int a, int b)
    {
        return a-b;
    }
    public int mul(int a, int b)
    {
        return a*b;
    }
    public int div(int a, int b)
    {
        return a/b;}
        public static void main(String args[])
        {
            Normal_Calculator c=new Normal_Calculator();
            System.out.println("Value after addition="+ c.add(5,2));
            System.out.println("Value after sub="+ c.sub(5,2));
             System.out.println("Value after mul="+ c.mul(5,2));
              System.out.println("Value after div="+ c.div(5,2));
            }
        }