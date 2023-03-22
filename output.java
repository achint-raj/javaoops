public class output {
    static int x=1;
    static int y=3;
    public static void m(int y){
        System.out.println(x);//1
        System.out.println(y);//2
    x=output.y;
    System.out.println("Output.y="+output.y);//3
    System.out.println(x);//3
    y=x+1;
    x-=1;
    System.out.println(y);//4
    }
    public static void main(String args[]){
        int y=2;
        System.out.println(y);//2
        m(y);
        System.out.println(x);//3
        System.out.println(y);//2
        System.out.print(x==y);//false

    }
    
}
