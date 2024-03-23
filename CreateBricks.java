/** @Author Shanto2005 */
public class CreateBricks extends Component {
  public Time t;
  public float dt;
  public SUIText timeText;
  public double FirstClass;
  public double TenHole;
  public double ThreeHole;
  public SUIText FirstClassText;
  public SUIText TenHoleText;
  public SUIText ThreeHoleText;
  public SUIText Slot1Status;
  public String buttonS1;
  public int i = 0;
  public String sCoal;
  public int cCoal;
  String sSoil;
  int cSoil;
  // for load slot 1
  int Ls1Time; // Load slot 1 time Integer
  String Ls1TimeS; // Load slot 1 time String
  int ls1i; // Load slot 1 incriment 
  // for Current bricks in String 
  String SfirstClass;
  int IfirstClass;
  String StenHole;
  int ItenHole;
  String SthreeHole;
  int IthreeHole;
  // Objects
  CoalSlotAT cs = new CoalSlotAT();
  /// Run only once
  @Override
  public void start() {}

  public void timer() {
    dt = 300;
    if (dt > 0) {
      dt -= t.deltaTime();
    } else if (dt < 0) {
      dt = 0;
    }
    int min = (int) dt / 60;
    int sc = (int) dt % 60;
    timeText.setText(min + " " + ":" + " " + sc);
  }

  public String USD(double value) {
    if (Math.abs(value) < 1000) {
      return String.format("%.2f", value);
    } else if (Math.abs(value) < 1e6) {
      return String.format("%.1fK", value / 1000);
    } else if (Math.abs(value) < 1e9) {
      return String.format("%.1fM", value / 1e6);
    } else {
      return String.format("%.1fB", value / 1e9);
    }
  }
  // Add 1st class
  public void addFirstClass() {
    FirstClass += 5000.0;
  }
  // Add 10 hole
  public void addTenHole() {
    TenHole += 5000.0;
  }
  // Add three hole
  public void addThreeHole() {
    ThreeHole += 5000.0;
  }
// Remove Bricks
public void removeBricks() {
    Key L11st4k = Input.getKey("L1 1st 4k");
    Key L11st5k = Input.getKey("L1 1st 5k");
    Key L11st6k = Input.getKey("L1 1st 6k");
    Key L110h4k = Input.getKey("L1 10H 4k");
    Key L110h5k = Input.getKey("L1 10H 5k");
    Key L110h6k = Input.getKey("L1 10H 6k");
    Key L13h4k = Input.getKey("L1 3H 4k");
    Key L13h5k = Input.getKey("L1 3H 5k");
    Key L13h6k = Input.getKey("L1 3H 6k");
    
    if(L11st4k.isDown() && FirstClass >= 4000.0) {
        FirstClass -= 4000.0;
    }
    if(L11st5k.isDown() && FirstClass >= 5000.0) {
        FirstClass -= 5000.0;
    }
    if(L11st6k.isDown() && FirstClass >= 6000.0) {
        FirstClass -= 6000.0;
    }
  /*  if(L110h4k.isDown() && TenHole >= 4000.0) {
        TenHole -= 4000.0;
    } */
    if(L110h5k.isDown() && TenHole >= 5000.0) {
        TenHole -= 5000.0;
    }
    if(L110h6k.isDown() && TenHole >= 6000.0) {
        TenHole -= 6000.0;
    }
    if(L13h4k.isDown() && ThreeHole >= 4000.0) {
        ThreeHole -= 4000.0;
    }
    if(L13h5k.isDown() && ThreeHole >= 5000.0) {
        ThreeHole -= 5000.0;
    }
    if(L13h6k.isDown() && ThreeHole >= 6000.0) {
        ThreeHole -= 6000.0;
    }
    
}


  /// Repeat every frame
  @Override
  public void repeat() {
    // Key Input
    Key S11c = Input.getKey("s1 1c");
    Key S110h = Input.getKey("s1 10h");
    Key S13h = Input.getKey("s1 3h");
    
    // Calling
    
// Load slot 1 Keys
Key L11st4k = Input.getKey("L1 1st 4k");
Key L11st5k = Input.getKey("L1 1st 5k");
    Key L11st6k = Input.getKey("L1 1st 6k");
    Key L110h4k = Input.getKey("L1 10H 4k");
    Key L110h5k = Input.getKey("L1 10H 5k");
    Key L110h6k = Input.getKey("L1 10H 6k");
    Key L13h4k = Input.getKey("L1 3H 4k");
    Key L13h5k = Input.getKey("L1 3H 5k");
    Key L13h6k = Input.getKey("L1 3H 6k");
    // Get soil and coal current value
  try{
    sCoal = WorldController.findObject("Create Bricks AT").getChildAt(0).getName();
    cCoal = Integer.parseInt(sCoal);
    sSoil = WorldController.findObject("Create Bricks AT").getChildAt(1).getName();
    cSoil = Integer.parseInt(sSoil);
  } catch(Exception e) {}
    // Key event

    if (S11c.isDown()) {
      if (dt < 1) {
        if (cCoal >= 10 && cSoil >= 50) {
          dt = 20;
          Toast.showText("Bricks making started", 5);
          buttonS1 = "1st class";
          i = 0;
}
        } else {
          Toast.showText("Slot is full", 5);
        }
      } 
      if (S110h.isDown()) {
      if (dt < 1) {
        if (cCoal >= 10 && cSoil >= 50) {
          dt = 20;
          Toast.showText("Bricks making started", 5);
          buttonS1 = "10 Hole";
          i = 0;
}
        } else {
          Toast.showText("Slot is full", 5);
        }
      }
      if (S13h.isDown()) {
      if (dt < 1) {
        if (cCoal >= 10 && cSoil >= 50) {
          dt = 20;
          Toast.showText("Bricks making started", 5);
          buttonS1 = "3 Hole";
          i = 0;
}
        } else {
          Toast.showText("Slot is full", 5);
        }
      }
    
    // Add bricks

    if (dt > 1 && dt < 2) {
      if (buttonS1 == "1st class" && i == 0) {
        addFirstClass();
        i++;
      } else if (buttonS1 == "10 Hole" && i == 0) {
        addTenHole();
        i++;
      } else if (buttonS1 == "3 Hole" && i == 0) {
        addThreeHole();
        i++;
      }
    } 

    // timer
    if (dt > 0) {
      dt -= t.deltaTime();
    } else if (dt < 0) {
      dt = 0;
    }
    int min = (int) dt / 60;
    int sc = (int) dt % 60;
    if (dt > 0) {
      timeText.setText(min + "m" + " " + sc + "s");
    } else {
      timeText.setText("Empty");
    }
    // System for Load slot 1
  try{
    Ls1TimeS = WorldController.findObject("Load slote 1").getChildAt(1).getName();
    Ls1Time = Integer.parseInt(Ls1TimeS);
    if(L11st4k.isDown()) {
        if(FirstClass >= 4000.0) {
            ls1i = 0;
        } else {
            Toast.showText("Not enough bricks",5);
        }
    }
    if(L11st5k.isDown()) {
        if(FirstClass >= 5000.0) {
            ls1i = 0;
        } else {
            Toast.showText("Not enough bricks",5);
        }
    }
    if(L11st6k.isDown()) {
        if(FirstClass >= 6000.0) {
            ls1i = 0;
        } else {
            Toast.showText("Not enough bricks",5);
        }
    }
    if(L110h4k.isDown()) {
        if(TenHole >= 4000.0) {
            ls1i = 0;
            TenHole -= 4000.0;
        } else {
            Toast.showText("Not enough bricks",5);
        }
    }
    if(L110h5k.isDown()) {
        if(TenHole >= 5000.0) {
            ls1i = 0;
        } else {
            Toast.showText("Not enough bricks",5);
        }
    }
    if(L110h6k.isDown()) {
        if(TenHole >= 6000.0) {
            ls1i = 0;
        } else {
            Toast.showText("Not enough bricks",5);
        }
    }
if(L13h4k.isDown()) {
        if(ThreeHole >= 4000.0) {
            ls1i = 0;
        } else {
            Toast.showText("Not enough bricks",5);
        }
    }
    if(L13h5k.isDown()) {
        if(ThreeHole >= 5000.0) {
            ls1i = 0;
        } else {
            Toast.showText("Not enough bricks",5);
        }
    }
    if(L13h6k.isDown()) {
        if(ThreeHole >= 6000.0) {
            ls1i = 0;
        } else {
            Toast.showText("Not enough bricks",5);
        }
    }
    }catch(Exception e) {}
// Data type convert
IfirstClass = (int) FirstClass;
SfirstClass = Integer.toString(IfirstClass);
ItenHole = (int) TenHole;
StenHole = Integer.toString(ItenHole);
IthreeHole = (int) ThreeHole;
SthreeHole = Integer.toString(IthreeHole);

myObject.getChildAt(2).setName(SfirstClass);
myObject.getChildAt(3).setName(StenHole);
myObject.getChildAt(4).setName(SthreeHole);

    FirstClassText.setText(USD(FirstClass));
    TenHoleText.setText(USD(TenHole));
    ThreeHoleText.setText(USD(ThreeHole));
    removeBricks();
  }
}
