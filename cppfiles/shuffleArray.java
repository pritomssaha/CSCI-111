class Main {
  public static void main(String[] args) {
    int[] x={2,5,1,3,4,7};
    
    for(int element:x){
      System.out.print(element+" " );
     }
    System.out.println("\n"+x.length);
    int[] result=shuffle(x,(x.length)/2);
    for(int element:result){
      System.out.print(element+" " );
     }
}
public static int[] shuffle(int[] a,int n){
  //2,5,1,3,4,7
  //2,3,5,4,1,7
  int l=a.length;
  int m=0, i=0;
  int[] b=new int[l];
  while(m+n<=l+1){
    b[i]=a[m];
    i++;    
    b[i]=a[n];
    n++;   
    m++;
    i++;
  }
  return b; 
  }
}
