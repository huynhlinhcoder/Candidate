/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import controller.ManagerCandidate;

/**
 *
 * @author huynh
 */
public class Main {
    public static void main(String[] args) {
        String title= "PROGRAMING MANAGEMENT CANDIDATE";
        String[] s= new String[] {"Experience", "Fresher", "Intern", "Searching", "Exit"};
        //new ManagerCandidate(title, args).run();
        Menu<String> menu= new ManagerCandidate(title, s);
        menu.run();
    }
}
