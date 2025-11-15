/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class Starter {
    public static void main(String[] args) {
        MainController main = new MainController();
        main.addDefenceObserver(new Helicopter());
        main.addDefenceObserver(new Tank());
        main.addDefenceObserver(new Submarine());
        
        main.notifyObservers();
    }
}
