/*
Check if a number is divisible by both 3 and 7.
*/



public class Skill{
      public static void main(String[] args){

int no = 21;

            // incomplete logic from here need some changes which i mentioned below from Maktech7
/*
if(no % 3 == 0 && no % 7 == 0){
System.out.println("3 and 7 is divisible:" + no);
}
else{
System.out.println("3 and 7 is not divisible:" + no);
}
*/


if(no % 3 == 0){
System.out.println(no+" no is divisible by 3:");
}
if(no%7 ==0){
      System.out.println(no+" no is divisible by 7");
}
if(no % 3!=0 && no % 7!=0){
System.out.println("3 and 7 is not divisible for:" + no);
}



}
}
