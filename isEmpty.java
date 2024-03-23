/** @Author Shanto2005 */
public class IsEmpty extends Component {
  /// Run only once
  @Override
  public void start() {}

  /// Repeat every frame
  @Override
  public void repeat() {
    if(WorldController.findObject("Truck0").getTag() == "Empty") {
        myObject.findChildObject("Truck0").setEnabled(false);
    } else{
        myObject.findChildObject("Truck0").setEnabled(true);
    }
  }
} 
