import java.util.*;
class listtoarr {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int idx=in.nextInt();
        //ArrayList<Integer> list = new ArrayList<>(arr);
        List al = Arrays.asList(arr);
        al.remove(idx);
        Integer a[]=new Integer[al.size()];
        for(int val:a){
            System.out.print(val+" ");
        }
    }
}