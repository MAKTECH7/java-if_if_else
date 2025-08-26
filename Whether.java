/*
7.Check whether a character is uppercase or lowercase.
*/

public class Whether{
      public static void main(String[] args){

String name = "whether";

if(name.equals(name.toUpperCase())){
System.out.println("Character is uppercase");
}
else if (name.equals(name.toLowerCase())){
System.out.println("Character is lower");
}
else{
System.out.println("Character is not alphapet");
}

}
}