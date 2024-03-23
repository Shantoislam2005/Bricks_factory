/** @Author Shanto2005 */
public class BuySoilCoalW extends Component {

  public SpatialObject SoilPanel;
  public SpatialObject CoalPanel;
  public SpatialObject SoilSendP;
  public SpatialObject CoalSendP;
  public SpatialObject SoilLL;
  public SpatialObject CoalLL;
  boolean isEnable[] = new boolean[31];
boolean isEnableC[] = new boolean[31];
  /// Run only once
  @Override
  public void start() {
    SoilPanel = WorldController.findObject("All office").findChildObject("Buy soil and coal").findChildObject("SoilP");

    CoalPanel = WorldController.findObject("All office").findChildObject("Buy soil and coal").findChildObject("CoalP");
    SoilSendP = WorldController.findObject("All office").findChildObject("Buy soil and coal").findChildObject("Soil load list");
    SoilLL = WorldController.findObject("All office").findChildObject("Buy soil and coal").findChildObject("Soil load list").findChildObject("Scroller").findChildObject("Liner");
  CoalSendP = WorldController.findObject("All office").findChildObject("Buy soil and coal").findChildObject("Coal load list");  
  CoalLL = WorldController.findObject("All office").findChildObject("Buy soil and coal").findChildObject("Coal load list").findChildObject("Scroller").findChildObject("Liner");
    
  }
  
  

  public boolean ChackEnable() {
    boolean r = false;
    isEnable[0] = SoilLL.getChildAt(0).isEnabled();

    if (isEnable[0] == true) {
      r = true;
    }
    return r;
  }
  // Coal load list chake
  public boolean ChackEnableC() {
    boolean r = false;
    isEnableC[0] = CoalLL.getChildAt(0).isEnabled();

    if (isEnableC[0] == true) {
      r = true;
    }
    return r;
  }

  /// Repeat every frame
  @Override
  public void repeat() {
    Key SoilP = Input.getKey("Soil Panel");
    Key CoalP = Input.getKey("Coal Panel");
    Key Close = Input.getKey("Close soilcoalW");
    Key SoilBuy = Input.getKey("Soil buy now");
    Key CoalBuy = Input.getKey("Coal buy now");
    // Panels buttons
    if (SoilP.isDown()) {
      SoilPanel.setEnabled(true);
      CoalPanel.setEnabled(false);
    }
    if (CoalP.isDown()) {
      SoilPanel.setEnabled(false);
      CoalPanel.setEnabled(true);
    }
    if (Close.isDown()) {
      myObject.setEnabled(false);
    }

    // Soil Buy now buttons
    if (SoilBuy.isDown()) {
      if (ChackEnable() == true) {
        SoilSendP.setEnabled(true);
      } else{
          
      }
    }
    // Coal Buy now buttons
    if (CoalBuy.isDown()) {
      if (ChackEnableC() == true) {
        CoalSendP.setEnabled(true);
      } else{
          
      }
    }
  }
}
