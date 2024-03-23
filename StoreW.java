/** @Author Shanto2005 */
public class StoreW extends Component {
  /// Run only once
  @Override
  public void start() {}

  /// Repeat every frame
  @Override
  public void repeat() {
    Key store = Input.getKey("StoreB");
    Key trucks = Input.getKey("Trucks");
    Key Ps = Input.getKey("Parking slot");
    Key Ls = Input.getKey("Load slot");
    Key close = Input.getKey("Close store");
    
    if (store.isDown()) {
        WorldController.findObject("PlayerController").findChildObject("Store W").setEnabled(true);
    } if(Ps.isDown()){
            WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Parking Slot").setEnabled(true);
            
            WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Trucks").setEnabled(false);
            
          WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Load Slot").setEnabled(false); 
    }if(Ls.isDown()){
            WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Parking Slot").setEnabled(false);
            
            WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Trucks").setEnabled(false);
            
          WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Load Slot").setEnabled(true); 
    }if(trucks.isDown()){
            WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Parking Slot").setEnabled(false);
            
            WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Trucks").setEnabled(true);
            
          WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Load Slot").setEnabled(false); 
    } if(close.isDown()) {
                WorldController.findObject("PlayerController").findChildObject("Store W").setEnabled(false);
    }
 
 
  }
} 
