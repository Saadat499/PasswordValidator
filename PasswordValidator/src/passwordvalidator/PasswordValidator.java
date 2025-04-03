/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package passwordvalidator;
import java.util.*;

public class PasswordValidator {
      public static boolean validatePassword(String password){
        if(password.length()<8){
            System.out.println("Invalid password");
            return false;
        }
        return true;
        
      }
      public static boolean main(String[]args){
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password:");
        String password = sc.nextLine();
        
        boolean isValid = validatePassword(password);
        
        if(isValid){
            System.out.println("Valid Password");
    }
        else{
            System.out.println("Invalid password");
        }
        
        
      
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        
        for(int i = 0;i<password.length();i++){
        char ch = password.charAt(i);
        if(Character.isUpperCase(ch)){
            hasUpperCase = true;
        }
        else if(Character.isLowerCase(ch)){
            hasLowerCase = true;
        }
        else if(Character.isDigit(ch)){
            hasDigit = true;
        }
        else if(Character.isSpaceChar(ch)){
            hasSpecialChar = true;
        }
        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
}
          return false;
        
}
}

 