/** @Author Shanto2005 */
public class ParkingAT extends Component {

public AreaTrigger at;
public SpatialObject ob;
  /// Run only once
  @Override
  public void start() {
      ob = (SpatialObject) myObject;
      at = (AreaTrigger) ob.getPhysics().getPhysicsEntity();
  }


  /// Repeat every frame
  @Override
  public void repeat() {
    if (at.isTriggering()) {
        ob.setTag("Full");
      
    } else{
        ob.setTag("Empty");
    }
  }
} 
