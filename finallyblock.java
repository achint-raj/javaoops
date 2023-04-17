import java.io.*;

public class finallyblock {
    public static void main(String args[]){
        int i,j=1,k=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        i=8;
        try{
        
            j=Integer.parseInt(br.readLine());
            k=i/j;
            System.out.println("output is:"+k);

        }
        catch(IOException e){
            System.out.println("some IO error");
        }
        catch(ArithmeticException ae){
            System.out.println("Cannot divisible by zero:"+ ae);
        }
        catch(Exception e){
            System.out.println("Unknown Exception");
        }
        finally{
            try{
                br.close();
            }
            catch(IOException e){
                System.out.println("br close handled");
            }
            
        System.out.println("finally  bye");
        }
    }
}