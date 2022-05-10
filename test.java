
 import java.util.Scanner;
 public class test {
     public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
         int A= sc.nextInt();
         int B= sc.nextInt();
         int C= sc.nextInt();
         int sum = B+C;
       
         if(sum>=60){    // 시가 변할경우
          A+= sum / 60;
            B = sum % 60;
            
           if(A>=24){
           A = A-24;
           }
            System.out.println(A +" "+ B );
       } else if(sum<60){    //시가 변하지 않을 경우   
         System.out.println(A+" "+sum);
       }  
     }
 }