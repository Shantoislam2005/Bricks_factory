/** @Author Shanto2005 */
public class ChackEnable extends Component {
  /// Run only once
  @Override
  public void start() {}

  /// Repeat every frame
  @Override
  public void repeat() {
    myObject.rotateInSeconds(45, 45, 0);
  }
} 
