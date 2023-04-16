public class exceptioncode {
    public static void main(String args[]){
        int i=4;
        int j=31;
        int k=2;
        int arr[]=new int[4];
        try{
            j=i/k;
            for(int c=0;c<=4;c++)   //exception arises here
            arr[c]=c+1;
           }
       // }
        catch(ArithmeticException ae){
            System.out.println("Exceptional case");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Maximum elements sored can be4");
        }
       
       // System.out.println(j);
       for(int value : arr)
       System.out.println(value);
    }
}
