import java.util.Scanner;

public class Prob4 {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter two characters: ");

  String s = scan.nextLine();
  if (s.chartAt(0) == 'M'){
    System.out.println("Mathematics");
  
  else if (s.chartAt(0) == 'C')
    System.out.println("Computer Science");
  
  else if (s.charAt(0) == 'I')
    System.out.println("Information Technology");
  
  else
   System.out.println("That is not right.");

  }
  if(s.charAt(1) == '1'){
    System.out.println("Freshman");
  
  else if (s.charAt(1) == '2')
    System.out.println("Sophomore");
  
  else if (s.chartAt(1) == '3')
    System.out.println("Junior");
  
  else{
    System.out.println("That is incorrect.");
  } 



  
  }

  }
}