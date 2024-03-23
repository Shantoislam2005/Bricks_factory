/** @Author Shanto2005 */
public class OfficeAt extends Component {

public AreaTrigger BuySoilCoalAT;
public SpatialObject BuySoilCoalOB;
public SpatialObject CreateBricksOB;
public AreaTrigger CreateBricksAT;
  /// Run only once
  @Override
  public void start() {
      BuySoilCoalOB = (SpatialObject) WorldController.findObject("Buy Soil Coal AT");
      BuySoilCoalAT = (AreaTrigger) BuySoilCoalOB.getPhysics().getPhysicsEntity();
      
      CreateBricksOB = (SpatialObject) WorldController.findObject("Create Bricks AT");
      CreateBricksAT = (AreaTrigger) CreateBricksOB.getPhysics().getPhysicsEntity();
  }


  /// Repeat every frame
  @Override
  public void repeat() {
    if (BuySoilCoalAT.isTriggering()) {
        WorldController.findObject("All office").findChildObject("Buy soil and coal").setEnabled(true);
      
    } else{
        WorldController.findObject("All office").findChildObject("Buy soil and coal").setEnabled(false);
    }
    
    if (CreateBricksAT.isTriggering()) {
        WorldController.findObject("All office").findChildObject("Create bricks").setEnabled(true);
      
    } else{
        WorldController.findObject("All office").findChildObject("Create bricks").setEnabled(false);
    }
  }
} 
