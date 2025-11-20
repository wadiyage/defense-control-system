
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public interface DefenceObserver  {
   
    public boolean addDefenceObserver(SuperDefence defenceObserver);
    public boolean removeDefenceObserver(SuperDefence defenceObserver);
    
    public void notifyObservers(String message);
    public void notifyObservers(String message, int remain);
    
    public void displayMessagesFromHelicopter(String message);
    public void displayMessagesFromTank(String message);
    public void displayMessagesFromSubmarine(String message);
    
    public void notifyControlPanel(String message);
    public void notifyControlPanel(String message, int remain);
    
    
    public void changeAltitude(int altitude);
}
