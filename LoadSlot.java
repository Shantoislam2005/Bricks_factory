/** @Author Shanto2005 */
public class loadSlotAT extends Component {
  public AreaTrigger at;
  public SpatialObject ob;
  public String CTruck;
  public SUIButton Close;
  public Time t;
  public float dt;
  String Stime;
  int Itime;
  String SfirstClass;
 public int IfirstClass;
 String StenHole;
 int ItenHole;
 String SthreeHole;
 int IthreeHole;
  // Time text
  public SUIText Truck0Text;

  // Variable for Truck tag
  public String Truck0Tag;

  /// Run only once
  @Override
  public void start() {
    ob = (SpatialObject) myObject;
    at = (AreaTrigger) ob.getPhysics().getPhysicsEntity();
  }

  /// Repeat every frame
  @Override
  public void repeat() {
    // Key Input
    Key L110h4k = Input.getKey("L1 10H 4k");
    Key L110h5k = Input.getKey("L1 10H 5k");
    Key L110h6k = Input.getKey("L1 10H 6k");
    Key L13h4k = Input.getKey("L1 3H 4k");
    Key L13h5k = Input.getKey("L1 3H 5k");
    Key L13h6k = Input.getKey("L1 3H 6k");
    Key L11st4k = Input.getKey("L1 1st 4k");
    Key L11st5k = Input.getKey("L1 1st 5k");
    Key L11st6k = Input.getKey("L1 1st 6k");
   // Key Close = Input.getKey("L1 Close");
    // Current Bricks data type convertion
 try{
    SfirstClass = WorldController.findObject("Create Bricks AT").getChildAt(2).getName();
    IfirstClass = Integer.parseInt(SfirstClass);
    StenHole = WorldController.findObject("Create Bricks AT").getChildAt(3).getName();
    ItenHole = Integer.parseInt(StenHole);
    SthreeHole = WorldController.findObject("Create Bricks AT").getChildAt(4).getName();
    IthreeHole = Integer.parseInt(SthreeHole);
    
  } catch(Exception e) {}
    // get tag
    Truck0Tag = WorldController.findObject("Truck0").getTag();
    // Area Trigger event
    if (at.colliderWithName("Truck0")) {
      if (Truck0Tag == "Empty") {
        ob.findChildObject("LoadW").setEnabled(true);
        CTruck = "Truck0";
      }
    }
    // All key events
    if (L11st4k.isDown()) {
      if (IfirstClass >= 4000) {
        WorldController.findObject(CTruck).findChildObject("Bricks").setEnabled(true);
        WorldController.findObject(CTruck).setTag("1st Class 4k");
        ob.findChildObject("LoadW").setEnabled(false);
     //   dt = 20;
      } 
    }
    if (L11st5k.isDown()) {
      if (IfirstClass >= 5000) {
        WorldController.findObject(CTruck).findChildObject("Bricks").setEnabled(true);
        WorldController.findObject(CTruck).setTag("1st Class 5k");
        ob.findChildObject("LoadW").setEnabled(false);
     //   dt = 20;
      } 
    }
    if (L11st6k.isDown()) {
      if (IfirstClass >= 6000) {
        WorldController.findObject(CTruck).findChildObject("Bricks").setEnabled(true);
        WorldController.findObject(CTruck).setTag("1st Class 6k");
        ob.findChildObject("LoadW").setEnabled(false);
      //  dt = 20;
      } 
    }
    if (L110h4k.isDown()) {
      if (ItenHole >= 4000) {
        WorldController.findObject(CTruck).findChildObject("Bricks").setEnabled(true);
        WorldController.findObject(CTruck).setTag("10 Hole 4k");
        ob.findChildObject("LoadW").setEnabled(false);
      //  dt = 20;
      } else{
          Toast.showText("not warking", 5);
      }
    }
    if (L110h5k.isDown()) {
      if (ItenHole >= 5000) {
        WorldController.findObject(CTruck).findChildObject("Bricks").setEnabled(true);
        WorldController.findObject(CTruck).setTag("10 Hole 5k");
        ob.findChildObject("LoadW").setEnabled(false);
      //  dt = 20;
      } 
    }
    if (L110h6k.isDown()) {
      if (ItenHole >= 6000) {
        WorldController.findObject(CTruck).findChildObject("Bricks").setEnabled(true);
        WorldController.findObject(CTruck).setTag("10 Hole 6k");
        ob.findChildObject("LoadW").setEnabled(false);
      //  dt = 20;
      } 
    }
    if (L13h4k.isDown()) {
      if (IthreeHole >= 4000) {
        WorldController.findObject(CTruck).findChildObject("Bricks").setEnabled(true);
        WorldController.findObject(CTruck).setTag("3 Hole 4k");
        ob.findChildObject("LoadW").setEnabled(false);
      //  dt = 20;
      } 
    }
    if (L13h5k.isDown()) {
      if (IthreeHole >= 5000) {
        WorldController.findObject(CTruck).findChildObject("Bricks").setEnabled(true);
        WorldController.findObject(CTruck).setTag("3 Hole 5k");
        ob.findChildObject("LoadW").setEnabled(false);
      //  dt = 20;
      } 
    }
    if (L13h6k.isDown()) {
      if (IthreeHole >= 6000) {
        WorldController.findObject(CTruck).findChildObject("Bricks").setEnabled(true);
        WorldController.findObject(CTruck).setTag("3 Hole 6k");
        ob.findChildObject("LoadW").setEnabled(false);
      //  dt = 20;
      } 
    }
    // Time
    try {
      if (dt > 1) {
        WorldController.findObject(CTruck).findComponent("CarController").setEnabled(false);
        WorldController.findObject(CTruck).findComponent("Entering").setEnabled(false);
      } else {
        WorldController.findObject(CTruck).findComponent("CarController").setEnabled(true);
        WorldController.findObject(CTruck).findComponent("Entering").setEnabled(true);
      }
    } catch (Exception e) {
    }

    if (dt > 0) {
      dt -= t.deltaTime();
    } else if (dt < 0) {
      dt = 0;
    }
    int min = (int) dt / 60;
    int sc = (int) dt % 60;
    if (CTruck == "Truck0") {
      Truck0Text.setText(min + "m" + " " + sc + "s");
    } 
    // time data type convertion
    Itime = (int) dt;
    Stime = Integer.toString(Itime);
    ob.getChildAt(1).setName(Stime);
    // Close event
    if(Close.isDown()) {
        ob.findChildObject("LoadW").setEnabled(false);
    }
  }
}
