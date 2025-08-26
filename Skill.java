/*
Check if a number is divisible by both 3 and 7.
*/

public class Skill{
      public static void main(String[] args){

int no = 21;

if(no % 3 == 0 && no % 7 == 0){
System.out.println("3 and 7 is divisible:" + no);
}
else{
System.out.println("3 and 7 is not divisible:" + no);
}

}
}