
public class five {
    public static void main(String[]args){
    
    int n=6;
    int[] arr={1,2,3,4,5,6};
    int e=0,o=0;
    for(int i=0;i<n;i++){
    if(arr[i]%2==0){
        e++;
    }else {o++;}
    }
    System.out.println("Even:"+e);  
     System.out.println("Odd:"+o);

 }
    }