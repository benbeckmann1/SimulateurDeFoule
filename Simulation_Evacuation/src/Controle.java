
public class Controle{
  private Nombre mod�le;
  public Controle( Nombre mod�le){
    this.mod�le = mod�le;
  }
  
  public void incr�menter(int nombre){
    for(int i = 0; i< nombre; i++){
      mod�le.inc();
    }
  }
}
