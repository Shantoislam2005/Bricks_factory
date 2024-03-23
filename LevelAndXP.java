/** @Author Shanto2005 */
public class LevelAndXP extends Component {
  int Level = 1;
  int CurrentXP;
  int MaxXP = 100;
  public SUIText LevelT;
  public SUIText XPT;
  public SUIProgressBar PBar;
  // Get XP from client
  int OLId0;
  
  
  /// Run only once
  @Override
  public void start() {}
  
// Level incriment 
public void LevelUp() {
    if(CurrentXP == MaxXP) {
        Level++;
        MaxXP += 100;
        CurrentXP = 0;
    }
}
// Get XP and Done button event
public void GetXP() {
    Key Done0 = Input.getKey("done Id0");
    
    OLId0 = Integer.parseInt(WorldController.findObject("PlayerController").findChildObject("Order list").findChildObject("Scroller").findChildObject("Liner").findChildObject("Id0").getChildAt(26).getName());
    // Button event
    if(Done0.isDown()) {
        CurrentXP += OLId0;
    }
}
  /// Repeat every frame
  @Override
  public void repeat() {
    LevelUp();
 try{   GetXP(); } catch(Exception e) {}
    
    LevelT.setText(Level);
    PBar.setMaxValue(MaxXP);
    PBar.setValue(CurrentXP);
    XPT.setText(CurrentXP+"/"+MaxXP);
  }
} 
