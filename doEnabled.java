/**
 * @Author Shanto2005
*/
public class doEnabled {
    
    public boolean soilListChack() {
        
        if( WorldController.findObject("All office").findChildObject("Buy soil and coal").findChildObject("Soil load list").findChildObject("Scroller").findChildObject("Liner").findChildObject("Truck0").isEnabled() == true) {
            return true;
        }else{
            return false;
        }
            
        }
    }

