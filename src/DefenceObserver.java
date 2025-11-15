
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
    
    public void notifyObservers();
    
    
}
