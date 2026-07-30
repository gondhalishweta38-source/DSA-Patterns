public class Zero{
public static void main(String[] args){
  int a[]={0,2,0,1,8};

 int i=0;
 for(int j=0;j<a.length-1;j++){
 if(a[j] !=0){
 int temp=a[i];
 a[i]=a[j];
 a[j]=temp;
  i++;
  }
}

for(int j=0;j<a.length-1;j++){
 System.out.println(a[j]);
}
}
}
  
  