/** @Author Shanto2005 */
public class CoalSlotAT extends Component {

  public AreaTrigger at;
  public SpatialObject ob;
  public String obn;
  public SUIText CoalT;
  public int CurrentCoal;
  public Time t;
  int i = 0;
  float dt;

  /// Run only once
  @Override
  public void start() {
    ob = (SpatialObject) myObject;
    at = (AreaTrigger) ob.getPhysics().getPhysicsEntity();
    CurrentCoal = 20;
  }
  // Add soil
  public void addCoal() {
    CurrentCoal += 10;
  }
  // Remove coal
  public void removeCoal() {
    CurrentCoal -= 10;
  }
  /// Repeat every frame
  @Override
  public void repeat() {

    Key Unload = Input.getKey("UnloadC");
    Key S11c = Input.getKey("s1 1c");
    Key S110h = Input.getKey("s1 10h");
    Key S13h = Input.getKey("s1 3h");

    if (at.colliderWithName("Truck0")) {
      ob.setTag("Full");
      ob.findChildObject("Unload").setEnabled(true);
      obn = "Truck0";
    } else {
      ob.setTag("Empty");
      ob.findChildObject("Unload").setEnabled(false);
    }
    // Unload button event

    if (Unload.isDown()) {
      if (WorldController.findObject(obn).getTag() == "Coal") {
        WorldController.findObject(obn).findChildObject("Coal").setEnabled(false);
        ob.findChildObject("Unload").setEnabled(false);
        WorldController.findObject(obn).setTag("Empty");
        addCoal();
      } else {
        Toast.showText("No  in your truck", 5);
      }
    }
    // Remove coal events
    dt -= t.deltaTime();
    if (S11c.isDown()) {
      if (CurrentCoal >= 10) {
        i = 0;
        dt = 5;
      }else{
          Toast.showText("Not enough coal",5);
      }
    } 
      if (S110h.isDown()) {
      if (CurrentCoal >= 10) {
        i = 0;
        dt = 5;
      }else{
          Toast.showText("Not enough coal",5);
      }
    }
      if (S13h.isDown()) {
      if (CurrentCoal >= 10) {
        i = 0;
        dt = 5;
      }else{
          Toast.showText("Not enough coal",5);
      }
    }

    if (dt > 1 && dt < 3) {
      if (i == 0) {
        removeCoal();
        i++;
      }
    }

    String cc = Integer.toString(CurrentCoal);
    WorldController.findObject("Create Bricks AT").getChildAt(0).setName(cc);

    CoalT.setText(CurrentCoal + " T");
  }
}
