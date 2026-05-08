
public class four {
    public static void main(){
        int n=5;
        int[] num={1,2,3,4,5};
        int sum=0;
      for(int i=0;i<n;i++){
          sum+=num[i];
      }  
      float avg=(float)sum/2;
      System.out.println(avg);
    }
}
