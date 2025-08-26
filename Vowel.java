/*

11.Check whether a character is a vowel or consonant.

*/

public class Vowel{
      public static void main(String[] args){

char name = 'y';

if(name == 'a' || name == 'e' || name == 'i' || name == 'o' || name == 'u' || name == 'A' || name == 'E' || name == 'I' || name == 'O' || name == 'U') {
System.out.println("It is vowels");
}
else if((name >= 'a' && name <= 'z') || (name >= 'A' && name <= 'Z')){
System.out.println("It is consonant");
}
else{
System.out.println("Its not...");
}
	
}
}