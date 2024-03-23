/** @Author Shanto2005 */
public class Account extends Component {

  public double Money = 5000.0;
  public SUIText Amount;
  public SpatialObject OrderList;
  // Objects
  iteamlist il = new iteamlist();

  /// Run only once
  @Override
  public void start() {
    Money = 10000.0;
    OrderList = WorldController.findObject("PlayerController").findChildObject("Order list").findChildObject("Scroller").findChildObject("Liner");
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

  // Parking slote button key input
  public void parkingslotbutton() {
    Key ps5 = Input.getKey("Parking 5");
    Key ps6 = Input.getKey("Parking 6");
    Key ps7 = Input.getKey("Parking 7");
    Key ps8 = Input.getKey("Parking 8");
    Key ps9 = Input.getKey("Parking 9");
    Key ps10 = Input.getKey("Parking 10");
    Key ps11 = Input.getKey("Parking 11");
    Key ps12 = Input.getKey("Parking 12");
    Key ps13 = Input.getKey("Parking 13");
    Key ps14 = Input.getKey("Parking 14");
    Key ps15 = Input.getKey("Parking 15");
    Key ps16 = Input.getKey("Parking 16");
    Key ps17 = Input.getKey("Parking 17");
    Key ps18 = Input.getKey("Parking 18");
    Key ps19 = Input.getKey("Parking 19");
    Key ps20 = Input.getKey("Parking 20");
    Key ps21 = Input.getKey("Parking 21");
    Key ps22 = Input.getKey("Parking 22");
    Key ps23 = Input.getKey("Parking 23");
    Key ps24 = Input.getKey("Parking 24");
    Key ps25 = Input.getKey("Parking 25");
    Key ps26 = Input.getKey("Parking 26");
    Key ps27 = Input.getKey("Parking 27");
    Key ps28 = Input.getKey("Parking 28");
    Key ps29 = Input.getKey("Parking 29");
    Key ps30 = Input.getKey("Parking 30");
    Key ps31 = Input.getKey("Parking 31");
    Key ps32 = Input.getKey("Parking 32");
    Key ps33 = Input.getKey("Parking 33");
    Key ps34 = Input.getKey("Parking 34");
    Key ps35 = Input.getKey("Parking 35");
    Key ps36 = Input.getKey("Parking 36");
    Key ps37 = Input.getKey("Parking 37");
    Key ps38 = Input.getKey("Parking 38");
    Key ps39 = Input.getKey("Parking 39");
    Key ps40 = Input.getKey("Parking 40");

    // key event listener

    if (ps5.isDown()) {
      if (Money >= il.parking5) {
        Money -= il.parking5;
        WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Parking Slot").findChildObject("LinearLayout").findChildObject("Parking Slot 05").findChildObject("Button").setEnabled(false);

        WorldController.findObject("Parking slote 5").setEnabled(true);

        Toast.showText("you are successful", 5);
      } else {
        Toast.showText("not enough money", 5);
      }
    }
    if (ps6.isDown()) {
      if (Money >= il.parking6) {
        Money -= il.parking6;
        WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Parking Slot").findChildObject("LinearLayout").findChildObject("Parking Slot 06").findChildObject("Button").setEnabled(false);

        WorldController.findObject("Parking slote 6").setEnabled(true);

        Toast.showText("you are successful", 5);
      } else {
        Toast.showText("not enough money", 5);
      }
    }
    if (ps7.isDown()) {
      if (Money >= il.parking7) {
        Money -= il.parking7;
        WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Parking Slot").findChildObject("LinearLayout").findChildObject("Parking Slot 07").findChildObject("Button").setEnabled(false);

        WorldController.findObject("Parking slote 7").setEnabled(true);

        Toast.showText("you are successful", 5);
      } else {
        Toast.showText("not enough money", 5);
      }
    }
    if (ps8.isDown()) {
      if (Money >= il.parking8) {
        Money -= il.parking8;
        WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Parking Slot").findChildObject("LinearLayout").findChildObject("Parking Slot 08").findChildObject("Button").setEnabled(false);

        WorldController.findObject("Parking slote 8").setEnabled(true);

        Toast.showText("you are successful", 5);
      } else {
        Toast.showText("not enough money", 5);
      }
    }
    if (ps9.isDown()) {
      if (Money >= il.parking9) {
        Money -= il.parking9;
        WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Parking Slot").findChildObject("LinearLayout").findChildObject("Parking Slot 09").findChildObject("Button").setEnabled(false);

        WorldController.findObject("Parking slote 9").setEnabled(true);

        Toast.showText("you are successful", 5);
      } else {
        Toast.showText("not enough money", 5);
      }
    }
    if (ps10.isDown()) {
      if (Money >= il.parking10) {
        Money -= il.parking10;
        WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Parking Slot").findChildObject("LinearLayout").findChildObject("Parking Slot 10").findChildObject("Button").setEnabled(false);

        WorldController.findObject("Parking slote 10").setEnabled(true);

        Toast.showText("you are successful", 5);
      } else {
        Toast.showText("not enough money", 5);
      }
    }
    if (ps11.isDown()) {
      if (Money >= il.parking11) {
        Money -= il.parking11;
        WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Parking Slot").findChildObject("LinearLayout").findChildObject("Parking Slot 11").findChildObject("Button").setEnabled(false);

        WorldController.findObject("Parking slote 11").setEnabled(true);

        Toast.showText("you are successful", 5);
      } else {
        Toast.showText("not enough money", 5);
      }
    }
    if (ps12.isDown()) {
      if (Money >= il.parking12) {
        Money -= il.parking12;
        WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Parking Slot").findChildObject("LinearLayout").findChildObject("Parking Slot 12").findChildObject("Button").setEnabled(false);

        WorldController.findObject("Parking slote 12").setEnabled(true);

        Toast.showText("you are successful", 5);
      } else {
        Toast.showText("not enough money", 5);
      }
    }
    if (ps13.isDown()) {
      if (Money >= il.parking13) {
        Money -= il.parking13;
        WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Parking Slot").findChildObject("LinearLayout").findChildObject("Parking Slot 13").findChildObject("Button").setEnabled(false);

        WorldController.findObject("Parking slote 13").setEnabled(true);

        Toast.showText("you are successful", 5);
      } else {
        Toast.showText("not enough money", 5);
      }
    }
    if (ps14.isDown()) {
      if (Money >= il.parking14) {
        Money -= il.parking14;
        WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Parking Slot").findChildObject("LinearLayout").findChildObject("Parking Slot 14").findChildObject("Button").setEnabled(false);

        WorldController.findObject("Parking slote 14").setEnabled(true);

        Toast.showText("you are successful", 5);
      } else {
        Toast.showText("not enough money", 5);
      }
    }
    if (ps15.isDown()) {
      if (Money >= il.parking15) {
        Money -= il.parking15;
        WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Parking Slot").findChildObject("LinearLayout").findChildObject("Parking Slot 15").findChildObject("Button").setEnabled(false);

        WorldController.findObject("Parking slote 15").setEnabled(true);

        Toast.showText("you are successful", 5);
      } else {
        Toast.showText("not enough money", 5);
      }
    }
    if (ps16.isDown()) {
      if (Money >= il.parking16) {
        Money -= il.parking16;
        WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Parking Slot").findChildObject("LinearLayout").findChildObject("Parking Slot 16").findChildObject("Button").setEnabled(false);

        WorldController.findObject("Parking slote 16").setEnabled(true);

        Toast.showText("you are successful", 5);
      } else {
        Toast.showText("not enough money", 5);
      }
    }
    if (ps17.isDown()) {
      if (Money >= il.parking17) {
        Money -= il.parking17;
        WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Parking Slot").findChildObject("LinearLayout").findChildObject("Parking Slot 17").findChildObject("Button").setEnabled(false);

        WorldController.findObject("Parking slote 17").setEnabled(true);

        Toast.showText("you are successful", 5);
      } else {
        Toast.showText("not enough money", 5);
      }
    }
    if (ps18.isDown()) {
      if (Money >= il.parking18) {
        Money -= il.parking18;
        WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Parking Slot").findChildObject("LinearLayout").findChildObject("Parking Slot 18").findChildObject("Button").setEnabled(false);

        WorldController.findObject("Parking slote 18").setEnabled(true);

        Toast.showText("you are successful", 5);
      } else {
        Toast.showText("not enough money", 5);
      }
    }
    if (ps19.isDown()) {
      if (Money >= il.parking19) {
        Money -= il.parking19;
        WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Parking Slot").findChildObject("LinearLayout").findChildObject("Parking Slot 19").findChildObject("Button").setEnabled(false);

        WorldController.findObject("Parking slote 19").setEnabled(true);

        Toast.showText("you are successful", 5);
      } else {
        Toast.showText("not enough money", 5);
      }
    }
    if (ps20.isDown()) {
      if (Money >= il.parking20) {
        Money -= il.parking20;
        WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Parking Slot").findChildObject("LinearLayout").findChildObject("Parking Slot 20").findChildObject("Button").setEnabled(false);

        WorldController.findObject("Parking slote 20").setEnabled(true);

        Toast.showText("you are successful", 5);
      } else {
        Toast.showText("not enough money", 5);
      }
    }
    if (ps21.isDown()) {
      if (Money >= il.parking21) {
        Money -= il.parking21;
        WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Parking Slot").findChildObject("LinearLayout").findChildObject("Parking Slot 21").findChildObject("Button").setEnabled(false);

        WorldController.findObject("Parking slote 21").setEnabled(true);

        Toast.showText("you are successful", 5);
      } else {
        Toast.showText("not enough money", 5);
      }
    }
    if (ps22.isDown()) {
      if (Money >= il.parking22) {
        Money -= il.parking22;
        WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Parking Slot").findChildObject("LinearLayout").findChildObject("Parking Slot 22").findChildObject("Button").setEnabled(false);

        WorldController.findObject("Parking slote 22").setEnabled(true);

        Toast.showText("you are successful", 5);
      } else {
        Toast.showText("not enough money", 5);
      }
    }
    if (ps23.isDown()) {
      if (Money >= il.parking23) {
        Money -= il.parking23;
        WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Parking Slot").findChildObject("LinearLayout").findChildObject("Parking Slot 23").findChildObject("Button").setEnabled(false);

        WorldController.findObject("Parking slote 23").setEnabled(true);

        Toast.showText("you are successful", 5);
      } else {
        Toast.showText("not enough money", 5);
      }
    }
    if (ps24.isDown()) {
      if (Money >= il.parking24) {
        Money -= il.parking24;
        WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Parking Slot").findChildObject("LinearLayout").findChildObject("Parking Slot 24").findChildObject("Button").setEnabled(false);

        WorldController.findObject("Parking slote 24").setEnabled(true);

        Toast.showText("you are successful", 5);
      } else {
        Toast.showText("not enough money", 5);
      }
    }
    if (ps25.isDown()) {
      if (Money >= il.parking25) {
        Money -= il.parking25;
        WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Parking Slot").findChildObject("LinearLayout").findChildObject("Parking Slot 25").findChildObject("Button").setEnabled(false);

        WorldController.findObject("Parking slote 25").setEnabled(true);

        Toast.showText("you are successful", 5);
      } else {
        Toast.showText("not enough money", 5);
      }
    }
    if (ps26.isDown()) {
      if (Money >= il.parking26) {
        Money -= il.parking26;
        WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Parking Slot").findChildObject("LinearLayout").findChildObject("Parking Slot 26").findChildObject("Button").setEnabled(false);

        WorldController.findObject("Parking slote 26").setEnabled(true);

        Toast.showText("you are successful", 5);
      } else {
        Toast.showText("not enough money", 5);
      }
    }
    if (ps27.isDown()) {
      if (Money >= il.parking27) {
        Money -= il.parking27;
        WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Parking Slot").findChildObject("LinearLayout").findChildObject("Parking Slot 27").findChildObject("Button").setEnabled(false);

        WorldController.findObject("Parking slote 27").setEnabled(true);

        Toast.showText("you are successful", 5);
      } else {
        Toast.showText("not enough money", 5);
      }
    }
    if (ps28.isDown()) {
      if (Money >= il.parking28) {
        Money -= il.parking28;
        WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Parking Slot").findChildObject("LinearLayout").findChildObject("Parking Slot 28").findChildObject("Button").setEnabled(false);

        WorldController.findObject("Parking slote 28").setEnabled(true);

        Toast.showText("you are successful", 5);
      } else {
        Toast.showText("not enough money", 5);
      }
    }
    if (ps29.isDown()) {
      if (Money >= il.parking29) {
        Money -= il.parking29;
        WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Parking Slot").findChildObject("LinearLayout").findChildObject("Parking Slot 29").findChildObject("Button").setEnabled(false);

        WorldController.findObject("Parking slote 29").setEnabled(true);

        Toast.showText("you are successful", 5);
      } else {
        Toast.showText("not enough money", 5);
      }
    }
    if (ps30.isDown()) {
      if (Money >= il.parking30) {
        Money -= il.parking30;
        WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Parking Slot").findChildObject("LinearLayout").findChildObject("Parking Slot 30").findChildObject("Button").setEnabled(false);

        WorldController.findObject("Parking slote 30").setEnabled(true);

        Toast.showText("you are successful", 5);
      } else {
        Toast.showText("not enough money", 5);
      }
    }
    if (ps31.isDown()) {
      if (Money >= il.parking31) {
        Money -= il.parking31;
        WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Parking Slot").findChildObject("LinearLayout").findChildObject("Parking Slot 31").findChildObject("Button").setEnabled(false);

        WorldController.findObject("Parking slote 31").setEnabled(true);

        Toast.showText("you are successful", 5);
      } else {
        Toast.showText("not enough money", 5);
      }
    }
    if (ps32.isDown()) {
      if (Money >= il.parking32) {
        Money -= il.parking32;
        WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Parking Slot").findChildObject("LinearLayout").findChildObject("Parking Slot 32").findChildObject("Button").setEnabled(false);

        WorldController.findObject("Parking slote 32").setEnabled(true);

        Toast.showText("you are successful", 5);
      } else {
        Toast.showText("not enough money", 5);
      }
    }
    if (ps33.isDown()) {
      if (Money >= il.parking33) {
        Money -= il.parking33;
        WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Parking Slot").findChildObject("LinearLayout").findChildObject("Parking Slot 33").findChildObject("Button").setEnabled(false);

        WorldController.findObject("Parking slote 33").setEnabled(true);

        Toast.showText("you are successful", 5);
      } else {
        Toast.showText("not enough money", 5);
      }
    }
    if (ps34.isDown()) {
      if (Money >= il.parking34) {
        Money -= il.parking34;
        WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Parking Slot").findChildObject("LinearLayout").findChildObject("Parking Slot 34").findChildObject("Button").setEnabled(false);

        WorldController.findObject("Parking slote 34").setEnabled(true);

        Toast.showText("you are successful", 5);
      } else {
        Toast.showText("not enough money", 5);
      }
    }
    if (ps35.isDown()) {
      if (Money >= il.parking35) {
        Money -= il.parking35;
        WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Parking Slot").findChildObject("LinearLayout").findChildObject("Parking Slot 35").findChildObject("Button").setEnabled(false);

        WorldController.findObject("Parking slote 35").setEnabled(true);

        Toast.showText("you are successful", 5);
      } else {
        Toast.showText("not enough money", 5);
      }
    }
    if (ps36.isDown()) {
      if (Money >= il.parking36) {
        Money -= il.parking36;
        WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Parking Slot").findChildObject("LinearLayout").findChildObject("Parking Slot 36").findChildObject("Button").setEnabled(false);

        WorldController.findObject("Parking slote 36").setEnabled(true);

        Toast.showText("you are successful", 5);
      } else {
        Toast.showText("not enough money", 5);
      }
    }
    if (ps37.isDown()) {
      if (Money >= il.parking37) {
        Money -= il.parking37;
        WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Parking Slot").findChildObject("LinearLayout").findChildObject("Parking Slot 37").findChildObject("Button").setEnabled(false);

        WorldController.findObject("Parking slote 37").setEnabled(true);

        Toast.showText("you are successful", 5);
      } else {
        Toast.showText("not enough money", 5);
      }
    }
    if (ps38.isDown()) {
      if (Money >= il.parking38) {
        Money -= il.parking38;
        WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Parking Slot").findChildObject("LinearLayout").findChildObject("Parking Slot 38").findChildObject("Button").setEnabled(false);

        WorldController.findObject("Parking slote 38").setEnabled(true);

        Toast.showText("you are successful", 5);
      } else {
        Toast.showText("not enough money", 5);
      }
    }
    if (ps39.isDown()) {
      if (Money >= il.parking39) {
        Money -= il.parking39;
        WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Parking Slot").findChildObject("LinearLayout").findChildObject("Parking Slot 39").findChildObject("Button").setEnabled(false);

        WorldController.findObject("Parking slote 39").setEnabled(true);

        Toast.showText("you are successful", 5);
      } else {
        Toast.showText("not enough money", 5);
      }
    }
    if (ps40.isDown()) {
      if (Money >= il.parking40) {
        Money -= il.parking40;
        WorldController.findObject("PlayerController").findChildObject("Store W").findChildObject("Parking Slot").findChildObject("LinearLayout").findChildObject("Parking Slot 40").findChildObject("Button").setEnabled(false);

        WorldController.findObject("Parking slote 40").setEnabled(true);

        Toast.showText("you are successful", 5);
      } else {
        Toast.showText("not enough money", 5);
      }
    }
  }
  // Truck tag chack
  public boolean tagChack() {
    if (WorldController.findObject("Truck0").getTag() == "Empty") {
      return true;
    } else {
      return false;
    }
  }
  // Buy Soil and coal
  public void buySoilCoal() {
    Key SoilBuy = Input.getKey("Soil buy now");
    Key CoalBuy = Input.getKey("Coal buy now");

    if (SoilBuy.isDown()) {
      if (tagChack() == true) {
        if (Money >= 25.0) {
          Money -= 25.0;
          Toast.showText("Successful", 5);
        } else {
          Toast.showText("Not enough money", 5);
        }
      } else {
        Toast.showText("Empty truck needed", 5);
      }
    }
    if (CoalBuy.isDown()) {
      if (tagChack() == true) {
        if (Money >= 100.0) {
          Money -= 100.0;
          Toast.showText("Successful", 5);
        } else {
          Toast.showText("Not enough money", 5);
        }
      } else{
         Toast.showText("Empty truck needed",5);
     }
    } 
  }
  // Add sell money
  
  public void addMoney() {
    // Key input
       Key Collect0 = Input.getKey("Collect Id0");
       // Get money
       
       double mId0 = Double.parseDouble(OrderList.findChildObject("Id0").getChildAt(23).getName());
    
       // key event
       if(Collect0.isDown()) {
           Money += mId0;
       }
  }
  
  /// Repeat every frame
  @Override
  public void repeat() {
    parkingslotbutton();
    buySoilCoal();
  try{  addMoney(); } catch(Exception e) {}

    Amount.setText(USD(Money));
  }
}
