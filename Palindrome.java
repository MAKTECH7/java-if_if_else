/*

17.Check if a number is a palindrome (e.g., 121, 1331)

*/

public class Palindrome{
       public static void main(String[] args){

int num = 1210; 

int first = num/100;
int second = num % 10;

if(first == second){
System.out.println(num + " : Palindrome");
}
else {
System.out.println(num + " : Not Palindrome");
}

}
}