/** @Author Shanto2005 */
public class Times extends Component {
public Time t;
public float dt;
public SUIText timeText;
String Status;
public SUIText StatusT;
 
  /// Run only once
  @Override
  public void start() {
      dt = 780;
  }
  
  public void timer() {
       if(dt > 0) {
        dt -= t.deltaTime();
    } else if(dt < 0){
        dt = 0;
    }
    int min = (int) dt / 60;
    int sc = (int) dt % 60;
    timeText.setText(min+" "+":"+" "+sc);
  }

  /// Repeat every frame
  @Override
  public void repeat() {
     dt += t.deltaTime();
    int min = (int) dt / 60;
    int sc = (int) dt % 60;
    timeText.setText(min+" "+":"+" "+sc);
    if(min == 24) {
        dt = 0;
    }
    // day night
    if(min >= 6 && min <= 18) {
        Status = "Day";
    } else {
        Status = "Night";
    }
    myObject.getChildAt(0).setName(Status);
  }
} 
