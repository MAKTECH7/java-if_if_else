/*
6.Check if a year is a leap year.
*/

public class Program{
       public static void main(String[] args){

int year = 2028;

if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
System.out.println("Leap year");
}
else{
System.out.println("Not leap year");
}

}
}