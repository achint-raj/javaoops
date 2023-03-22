import java.util.*;
class Merge {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
       merge_sort(arr,0,n-1);

    }
    public static void merge_sort(int arr[], int beg, int end){
        int mid;
        int temp[]=new int[arr.length];
        if(beg<end){
           mid = (beg+end)/2;
           merge_sort(arr,beg,mid);
           merge_sort(arr,mid+1,end);
           merge(arr,temp,beg,mid,mid+1,end);
           for(int i=0;i<arr.length;i++){
            System.out.print(temp[i]+" ");
           }
        }
           
    }
    public static void merge(int arr[], int temp[] , int beg1, int end1, int beg2, int end2){
        int i=beg1;
        int j=beg2;
        int k=beg1;
        while((i<=end1) && (j<=end2)){
            if(arr[i]<=arr[j])
            temp[k++]=arr[i++];

            else
            temp[k++]=arr[j++];

        }
        while(i<=end1)
        temp[k++]=arr[i++];
        while(j<=end2)
        temp[k++]=arr[j++];
    }

}


public static void merge_sort(int arr[], int beg, int end){
    if(beg == end){
        int ba[]=new int[1];
        ba[0]=arr[beg];
        return ba;
    }
    int mid=(beg+end)/2;
    int fsh[]=merge_sort(arr, beg, mid);
    int ssh[]=merge_sort(arr, mid+1, end);
    int fsa[]=merge(fsh,ssh);
    return fsa;
}
public static void merge(int fsh[], int ssh[]){
    System.out.println("Merging two arrays");
    int ans[]=new int[fsh.length+ssh.length];
    int i=0,j=0,k=0;
    while(i<fsh.length && j<ssh.length){
        if(fsh[i]<=ssh[j]){
            ans[k]=fsh[i];i++;
            k++;
        }
        else{
            ans[k]=ssh[j];
            j++;
            k++;
        }
        
    }
}