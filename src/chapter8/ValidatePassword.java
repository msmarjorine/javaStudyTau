package chapter8;

import java.util.Scanner;

public class ValidatePassword {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your username");
        String username = scanner.nextLine();
        System.out.println("Please enter your old password");
        String oldPassword = scanner.nextLine();
        System.out.println("Please enter your new password");
        String password = scanner.nextLine();

        String result = checkPassword(password, username, oldPassword) ? "This is a valid password." : "Invalid password. Try again.";
        System.out.println(result);
    }

    /**
     * This method checks if the new password satisfies the following conditions:
     * 8 or more symbols, includes an Uppercase, a special symbol,
     * doesn't contain the username and is not equal to the previous password
     * @param password new password provided by the user
     * @param username the username
     * @param oldPassword the old password
     * @return true or false
     */
    public static boolean checkPassword(String password, String username, String oldPassword){
        return password.length() >= 8 && containsUpperCase(password) && containsSpecialCharacter(password) && isUnique(password, username, oldPassword);
    }

    public static boolean containsUpperCase(String password){
        boolean upper = false;
        for(int i=0; i<password.length(); i++){
            if(Character.isUpperCase(password.charAt(i))){
                upper = true;
            }
        }
        return upper;
    }

    public static boolean containsSpecialCharacter(String password){
        boolean special = false;
        for(int i=0; i<password.length(); i++){
            if(!Character.isLetter(password.charAt(i)) && !Character.isDigit(password.charAt(i)) && !Character.isWhitespace(password.charAt(i))){
                special = true;
            }
        }
        return special;
    }

    public static boolean isUnique(String password, String username, String oldPassword){
        return !password.contains(username) && !password.equals(oldPassword);
    }
}
