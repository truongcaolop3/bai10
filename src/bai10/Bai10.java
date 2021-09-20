/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;
        
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Bai10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String username, password;
        Scanner sc = new Scanner(System.in);
        System.out.print("Your username: ");
        username = sc.next();
        sc.nextLine();

        System.out.print("Your password: ");
        password = sc.nextLine();

        if(username.equals("HuyHoang") && password.equals("2021")) {
                System.out.printf("Bạn đã nhập đúng (%s, %s) ", username, password);    
        } else {
                System.out.println("Bạn đã nhập sai username or password ");
        }
        System.out.println("");
        sc.close();
    }
}
