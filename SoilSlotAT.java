/** @Author Shanto2005 */
public class SoilSlotAT extends Component {

public AreaTrigger at;
public SpatialObject ob;
public String obn;
public SUIText SoilT;
public int CurrentSoil;
String sSoil;
public Time t;
float dt;
int i = 0;
  /// Run only once
  @Override
  public void start() {
      ob = (SpatialObject) myObject;
      at = (AreaTrigger) ob.getPhysics().getPhysicsEntity();
      CurrentSoil = 100;
  }
// Add soil
public void addSoil(){
    CurrentSoil += 25;
}
// Remove soil
public void removeSoil() {
    CurrentSoil -= 50;
}

  /// Repeat every frame
  @Override
  public void repeat() {
      
     Key Unload = Input.getKey("UnloadS");
     Key S11c = Input.getKey("s1 1c");
     Key S110h = Input.getKey("s1 10h");
     Key S13h = Input.getKey("s1 3h");
      
    if (at.colliderWithName("Truck0")) {
        ob.setTag("Full");
        ob.findChildObject("Unload").setEnabled(true);
      obn = "Truck0";
    } else{
        ob.setTag("Empty");
        ob.findChildObject("Unload").setEnabled(false);
    }
    // Unload button event
   
  if(Unload.isDown()) {
      if(WorldController.findObject(obn).getTag() == "Soil") {
          WorldController.findObject(obn).findChildObject("Soil").setEnabled(false);
          ob.findChildObject("Unload").setEnabled(false);
          WorldController.findObject(obn).setTag("Empty");
          addSoil();
      } else{
          Toast.showText("No soil in your truck", 5);
      }
  }
  // Soil remove system
  if(S11c.isDown()) {
      if(CurrentSoil >= 50) {
          i = 0;
          dt = 5;
      } else {
          Toast.showText("Not enough soil",5);
      }
  } 
  if(S110h.isDown()) {
      if(CurrentSoil >= 50) {
          i = 0;
          dt = 5;
      } else {
          Toast.showText("Not enough soil",5);
      }
  } 
  if(S13h.isDown()) {
      if(CurrentSoil >= 50) {
          i = 0;
          dt = 5;
      } else {
          Toast.showText("Not enough soil",5);
      }
  } 
  
  dt -= t.deltaTime();
  if(dt > 1 && dt < 3) {
      if(i == 0) {
          removeSoil();
          i++;
      }
  }
  
  
  SoilT.setText(CurrentSoil+" T");
  
  sSoil = Integer.toString(CurrentSoil);
  WorldController.findObject("Create Bricks AT").getChildAt(1).setName(sSoil);
  }
} 
