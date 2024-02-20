/** @Author Shanto2005 */
public class CarController extends Component {
  // Key Name
  public String AcceleratorKey = ("accelerator");
  public String BrackKey = ("brack");
  public String EngineOnKey = ("engineOn");
  public String EngineOffKey = ("engineOff");
  public String GearDKey = ("gearD");
  public String GearRKey = ("gearR");
  // Vehicle wheels
  public VehicleWheel flw;
  public VehicleWheel frw;
  public VehicleWheel blw;
  public VehicleWheel brw;
  // Others
  public int TorqueD = 1000;
  public int TorqueR = -400;
  public SpatialObject Car;
  private boolean gears = true;
  public boolean engine = false;
  public SpatialObject Player;
  public SpatialObject PlayerController;
  public SpatialObject CarController;

  /// Run only once
  @Override
  public void start() {
    Car = myObject;
    Player = WorldController.findObject("Player");
    PlayerController = WorldController.findObject("PlayerController");
    CarController = WorldController.findObject("CarController");
  }

  /// Repeat every frame
  @Override
  public void repeat() {

    //  Car.setRotation();
    // Key Input
    Key Accelerator = Input.getKey("accelerator");
    Key Brack = Input.getKey("brack");
    Key EngineOn = Input.getKey("engineOn");
    Key EngineOff = Input.getKey("engineOff");
    Key GearD = Input.getKey("gearD");
    Key GearR = Input.getKey("gearR");
    Key Enter = Input.getKey("enter");
    Key Exit = Input.getKey("exit");

    // Enter
    if (Enter.isDown()) {
      Player.setParent(Car);
      Player.findChildObject("Cam").setEnabled(false);
      Car.findChildObject("ccam").findChildObject("Cam").setEnabled(true);
      PlayerController.setEnabled(false);
      CarController.setEnabled(true);
    } 
    // Exit
    if(Exit.isDown()) {
        PlayerController.setEnabled(true);
        CarController.setEnabled(false);
        Car.findChildObject("Player").removeParent();
        Player.findChildObject("Cam").setEnabled(true);
      Car.findChildObject("ccam").findChildObject("Cam").setEnabled(false);
      
        
        
    }

    // Engine and Gears

    // Engine
    if (EngineOff.isPressed()) {
      engine = true;
      WorldController.findObject("CarController").findChildObject("Engine off").setEnabled(false);
      WorldController.findObject("CarController").findChildObject("Engine on").setEnabled(true);
    } else if (EngineOn.isPressed()) {
      engine = false;
      WorldController.findObject("CarController").findChildObject("Engine on").setEnabled(false);
      WorldController.findObject("CarController").findChildObject("Engine off").setEnabled(true);
    } // Gears
    if (GearR.isPressed()) {
      gears = false;
      WorldController.findObject("CarController").findChildObject("Gear R").setEnabled(false);
      WorldController.findObject("CarController").findChildObject("Gear D").setEnabled(true);
    } else if (GearD.isPressed()) {
      gears = true;
      WorldController.findObject("CarController").findChildObject("Gear D").setEnabled(false);
      WorldController.findObject("CarController").findChildObject("Gear R").setEnabled(true);
    } else {
      // gears = true;
    }

  try{  // Accelerator
    if (engine == true && Accelerator.isPressed()) {

      if (gears == true) {
        flw.setTorque(1000);
        frw.setTorque(1000);
      } else if (gears == false) {
        flw.setTorque(TorqueR);
        frw.setTorque(TorqueR);
      }

    } else {
      flw.setTorque(0);
      frw.setTorque(0);
    }
    } catch(Exception e) {}
try {
    if (Brack.isPressed()) {
      blw.setBrake(100);
      brw.setBrake(100);
    } else {
      blw.setBrake(0);
      brw.setBrake(0);
    }
    } catch(Exception e) {}
  }
}
