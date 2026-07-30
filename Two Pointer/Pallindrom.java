public class Pallindrom{
public static void main(String[] args){
 String str="MBDAM";

   int i=0;
   int j=str.length()-1;
   boolean isP=true;

  while(i<j){
     if(str.charAt(i) !=str.charAt(j)){
         isP=false;
    break;
       }
       i++;
       j--;
    }
          if(isP==true){ System.out.println("NP");
                  }

            else{
 System.out.println("NP");
  }
}
}

    