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
        
        Helicopter h1 = new Helicopter(main);
        main.addDefenceObserver(h1);
        h1.setVisible(true);
        
        Helicopter h2 = new Helicopter(main);
        main.addDefenceObserver(h2);
        h2.setVisible(true);
        
        Tank t1 = new Tank(main);
        main.addDefenceObserver(t1);
        t1.setVisible(true);
        
        Submarine s1 = new Submarine(main);
        main.addDefenceObserver(s1);
        s1.setVisible(true);
        
        main.setVisible(true);
    }
}
