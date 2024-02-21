/** @Author Shanto2005 */
public class SteeringWheel extends Component {
 
 public VehicleWheel flw;
 public VehicleWheel frw;
 public float sw;
 public float ss;
 
  /// Run only once
  @Override
  public void start() {}

  /// Repeat every frame
  @Override
  public void repeat() {
  try { 
    sw = Input.getAxis("stearing").getValue().getX();
      flw.setSteerRelativeVelocity(sw * ss);
      frw.setSteerRelativeVelocity(sw * ss);
      } catch(Exception e) {}
  }
  
} 
