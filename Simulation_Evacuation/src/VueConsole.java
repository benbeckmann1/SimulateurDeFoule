import java.util.*;

public class VueConsole implements Observer{

  public VueConsole( Nombre mod�le){
    mod�le.addObserver(this);
  }
  
  public void update(Observable src, Object arg){
    System.out.println("update ! : " + arg);
  }
}
