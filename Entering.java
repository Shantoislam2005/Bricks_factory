/** @Author Shanto2005 */
public class Entering extends Component {
    public Rigidbody rb;
    private String Vname;
   
  /// Run only once
  @Override
  public void start() {
      

    rb = (Rigidbody) myObject.getPhysics().getPhysicsEntity();
  }

  /// Repeat every frame
  @Override
  public void repeat() {
      Key Enter = Input.getKey("enter");
      Key Exit = Input.getKey("exit");
      Key EngineOn = Input.getKey("engineon");
      Key EngineOff = Input.getKey("engineoff");
  
  
    if(rb.colliderWithName("Player")) {
        WorldController.findObject("PlayerController").findChildObject("CarW").setEnabled(true);
              
    }else{
              WorldController.findObject("PlayerController").findChildObject("CarW").setEnabled(false);
              
    }
    
     // Ente
  }
} 
