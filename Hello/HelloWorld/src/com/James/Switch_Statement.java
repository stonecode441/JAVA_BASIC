package com.James;

public class Switch_Statement {
    public static void main(String[] args){
        String role = "admin"; // int

        switch (role) {
            case "admin": // case 1
                System.out.println("you are an admin");
                break;
            case "moderator":
                System.out.println("you are a moderator");
                break;
            default:
                System.out.println("you are guess");
        }
//        if (role == "admin")
//            System.out.println("you are an admin");
//        else if (role == "moderator")
//            System.out.println("you are modeator");
//        else
//            System.out.println("you are a guest");


    }
}
