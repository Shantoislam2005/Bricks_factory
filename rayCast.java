/** @Author Shanto2005 */
public class rayCast extends Component {
    public SpatialObject cam;
    public SUIText N;
    String oName;
    SpatialObject CarW;
  /// Run only once
  @Override
  public void start() {
      CarW = WorldController.findObject("PlayerController").findChildObject("CarW");
  }

  /// Repeat every frame
  @Override
  public void repeat() {
    LaserHit lh = new Laser().trace(cam.getTransform().getGlobalPosition(), cam.getTransform().forward(), 50);
 //   N.setText(lh.getObject().getName()+lh.getDistance());
try{ oName = lh.getObject().getName();}catch(Exception e) {}
 
 try{   if(oName == "Truck0") {
     CarW.setEnabled(true);
     WorldController.findObject("Truck0").findComponent("CarController").setEnabled(true);
 } else {
     CarW.setEnabled(false);
     WorldController.findObject("Truck0").findComponent("CarController").setEnabled(false);
 }
 } catch(Exception e) {}
  }
  
} 
