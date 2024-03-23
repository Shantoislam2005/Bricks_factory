/** @Author Shanto2005 */
public class Truck0 extends Component {
  public SpatialObject truck;
  public SpatialObject soil;
  public SpatialObject coal;
  public SpatialObject SoilList;
  public SpatialObject OrderList;
  public SUIText timerText;
  public Time t;
  public float dt;
  boolean ps[] = new boolean[41];
  String psTag[] = new String[41];
  public Quaternion TR = new Quaternion(0, 0, 0, 0);

// Text class
public SUIText LoadT;

public SUIText TimeT;

  /// Run only once
  @Override
  public void start() {
    truck = WorldController.findObject("Truck0");
    SoilList = WorldController.findObject("All office").findChildObject("Buy soil and coal").findChildObject("Soil load list").findChildObject("Scroller").findChildObject("Liner").findChildObject("Truck0");

    OrderList = WorldController.findObject("PlayerController").findChildObject("Order list").findChildObject("Scroller").findChildObject("Liner").findChildObject("Id0");
  }

// Get tag
public String getTag(String t) {
    if(t == "1st Class 4k") {
        return "1st Class";
    } else if(t == "1st Class 5k") {
        return "1st Class";
    } else if(t == "1st Class 6k") {
        return "1st Class";
    } else if(t == "10 Hole 4k") {
        return "10 Hole";
    } else if (t == "10 Hole 5k") {
        return "10 Hole";
    } else if (t == "10 Hole 6k") {
        return "10 Hole";
    } else if (t == "3 Hole 4k") {
        return "3 Hole";
    } else if (t == "3 Hole 5k") {
        return "3 Hole";
    } else if (t == "3 Hole 6k") {
        return "3 Hole";
    } else{
        return "null";
    }
}
  /// Repeat every frame
  @Override
  public void repeat() {
    // Key input
    Key SL0 = Input.getKey("SLT0");
    Key CL0 = Input.getKey("CLT0");
    Key Send0 = Input.getKey("Id0 ST0");
    // CountDown timer
    if (dt > 0) {
      dt -= t.deltaTime();
    } else if (dt < 0) {
      dt = 0;
    }
    int min = (int) dt / 60;
    int sc = (int) dt % 60;
  try{ timerText.setText(min + " " + ":" + " " + sc);} catch(Exception e) {}
    // Key Event
    if (SL0.isDown()) {
      dt = 300;
      truck.findChildObject("Soil").setEnabled(true);
      truck.setTag("Soil");
      WorldController.findObject("All office").findChildObject("Buy soil and coal").findChildObject("Soil load list").setEnabled(false);

    } else if (CL0.isDown()) {
      dt = 600;
      truck.findChildObject("Coal").setEnabled(true);
      truck.setTag("Coal");
      WorldController.findObject("All office").findChildObject("Buy soil and coal").findChildObject("Coal load list").setEnabled(false);
    }
    if (Send0.isDown()) {
      if (OrderList.getChildAt(25).getName() == getTag(truck.getTag())) {
        dt = 20;
        truck.setTag("Empty");
        truck.findChildObject("Bricks").setEnabled(false);
      } 
    }

    if (dt > 1) {
      truck.setEnabled(false);
    } else {
      truck.setEnabled(true);
    } // Get parking slot Current tag
    psTag[1] = WorldController.findObject("Parking slote 1").getTag();
    psTag[2] = WorldController.findObject("Parking slote 2").getTag();
    psTag[3] = WorldController.findObject("Parking slote 3").getTag();
    psTag[4] = WorldController.findObject("Parking slote 4").getTag();
    psTag[5] = WorldController.findObject("Parking slote 5").getTag();
    psTag[6] = WorldController.findObject("Parking slote 6").getTag();
    psTag[7] = WorldController.findObject("Parking slote 7").getTag();
    psTag[8] = WorldController.findObject("Parking slote 8").getTag();
    psTag[9] = WorldController.findObject("Parking slote 9").getTag();
    psTag[10] = WorldController.findObject("Parking slote 10").getTag();
    psTag[11] = WorldController.findObject("Parking slote 11").getTag();
    psTag[12] = WorldController.findObject("Parking slote 12").getTag();
    psTag[13] = WorldController.findObject("Parking slote 13").getTag();
    psTag[14] = WorldController.findObject("Parking slote 14").getTag();
    psTag[15] = WorldController.findObject("Parking slote 15").getTag();
    psTag[16] = WorldController.findObject("Parking slote 16").getTag();
    psTag[17] = WorldController.findObject("Parking slote 17").getTag();
    psTag[18] = WorldController.findObject("Parking slote 18").getTag();
    psTag[19] = WorldController.findObject("Parking slote 19").getTag();
    psTag[20] = WorldController.findObject("Parking slote 20").getTag();
    psTag[21] = WorldController.findObject("Parking slote 21").getTag();
    psTag[22] = WorldController.findObject("Parking slote 22").getTag();
    psTag[23] = WorldController.findObject("Parking slote 23").getTag();
    psTag[24] = WorldController.findObject("Parking slote 24").getTag();
    psTag[25] = WorldController.findObject("Parking slote 25").getTag();
    psTag[26] = WorldController.findObject("Parking slote 26").getTag();
    psTag[27] = WorldController.findObject("Parking slote 27").getTag();
    psTag[28] = WorldController.findObject("Parking slote 28").getTag();
    psTag[29] = WorldController.findObject("Parking slote 29").getTag();
    psTag[30] = WorldController.findObject("Parking slote 30").getTag();
    psTag[31] = WorldController.findObject("Parking slote 31").getTag();
    psTag[32] = WorldController.findObject("Parking slote 32").getTag();
    psTag[33] = WorldController.findObject("Parking slote 33").getTag();
    psTag[34] = WorldController.findObject("Parking slote 34").getTag();
    psTag[35] = WorldController.findObject("Parking slote 35").getTag();
    psTag[36] = WorldController.findObject("Parking slote 36").getTag();
    psTag[37] = WorldController.findObject("Parking slote 37").getTag();
    psTag[38] = WorldController.findObject("Parking slote 38").getTag();
    psTag[39] = WorldController.findObject("Parking slote 39").getTag();
    psTag[40] = WorldController.findObject("Parking slote 40").getTag();
    // Check empty and teleport
    if (dt > 1 && dt < 3) {
      if (psTag[1] == "Empty") {
        truck.setPosition(304.17f, 30.9f, 286.95f);
        TR = truck.getRotation();
        TR.setY(90);
      } else if (psTag[2] == "Empty") {
        truck.setPosition(304.17f, 30.9f, 282.98f);
        TR = truck.getRotation();
        TR.setY(90);
      } else if (psTag[3] == "Empty") {
        truck.setPosition(304.17f, 30.9f, 279.13f);
        TR = truck.getRotation();
        TR.setY(90);
      } else if (psTag[4] == "Empty") {
        truck.setPosition(304.17f, 30.9f, 275.32f);
        TR = truck.getRotation();
        TR.setY(90);
      } else if (psTag[5] == "Empty") {
        truck.setPosition(304.17f, 30.9f, 271.45f);
        TR = truck.getRotation();
        TR.setY(90);
      } else if (psTag[6] == "Empty") {
        truck.setPosition(304.17f, 30.9f, 267.72f);
        TR = truck.getRotation();
        TR.setY(90);
      } else if (psTag[7] == "Empty") {
        truck.setPosition(304.17f, 30.9f, 263.91f);
        TR = truck.getRotation();
        TR.setY(90);
      } else if (psTag[8] == "Empty") {
        truck.setPosition(304.17f, 30.9f, 260.13f);
        TR = truck.getRotation();
        TR.setY(90);
      } else if (psTag[9] == "Empty") {
        truck.setPosition(304.17f, 30.9f, 256.38f);
        TR = truck.getRotation();
        TR.setY(90);
      } else if (psTag[10] == "Empty") {
        truck.setPosition(304.17f, 30.9f, 252.63f);
        TR = truck.getRotation();
        TR.setY(90);
      } else if (psTag[11] == "Empty") {
        truck.setPosition(322.34f, 30.9f, 252.63f);
        TR = truck.getRotation();
        TR.setY(90);
      } else if (psTag[12] == "Empty") {
        truck.setPosition(322.34f, 30.9f, 256.57f);
        TR = truck.getRotation();
        TR.setY(90);
      } else if (psTag[13] == "Empty") {
        truck.setPosition(322.34f, 30.9f, 260.42f);
        TR = truck.getRotation();
        TR.setY(90);
      } else if (psTag[14] == "Empty") {
        truck.setPosition(322.34f, 30.9f, 264.24f);
        TR = truck.getRotation();
        TR.setY(90);
      } else if (psTag[15] == "Empty") {
        truck.setPosition(322.34f, 30.9f, 268.09f);
        TR = truck.getRotation();
        TR.setY(90);
      } else if (psTag[16] == "Empty") {
        truck.setPosition(322.34f, 30.9f, 271.85f);
        TR = truck.getRotation();
        TR.setY(90);
      } else if (psTag[17] == "Empty") {
        truck.setPosition(322.34f, 30.9f, 275.60f);
        TR = truck.getRotation();
        TR.setY(90);
      } else if (psTag[18] == "Empty") {
        truck.setPosition(322.34f, 30.9f, 279.32f);
        TR = truck.getRotation();
        TR.setY(90);
      } else if (psTag[19] == "Empty") {
        truck.setPosition(322.34f, 30.9f, 283.07f);
        TR = truck.getRotation();
        TR.setY(90);
      } else if (psTag[20] == "Empty") {
        truck.setPosition(322.34f, 30.9f, 286.82f);
        TR = truck.getRotation();
        TR.setY(90);
      } else if (psTag[21] == "Empty") {
        truck.setPosition(334.03f, 30.9f, 286.82f);
        TR = truck.getRotation();
        TR.setY(90);
      } else if (psTag[22] == "Empty") {
        truck.setPosition(334.03f, 30.9f, 283.04f);
        TR = truck.getRotation();
        TR.setY(90);
      } else if (psTag[23] == "Empty") {
        truck.setPosition(334.03f, 30.9f, 279.31f);
        TR = truck.getRotation();
        TR.setY(90);
      } else if (psTag[24] == "Empty") {
        truck.setPosition(334.03f, 30.9f, 275.62f);
        TR = truck.getRotation();
        TR.setY(90);
      } else if (psTag[25] == "Empty") {
        truck.setPosition(334.03f, 30.9f, 271.90f);
        TR = truck.getRotation();
        TR.setY(90);
      } else if (psTag[26] == "Empty") {
        truck.setPosition(334.03f, 30.9f, 268.21f);
        TR = truck.getRotation();
        TR.setY(90);
      } else if (psTag[27] == "Empty") {
        truck.setPosition(334.03f, 30.9f, 264.52f);
        TR = truck.getRotation();
        TR.setY(90);
      } else if (psTag[28] == "Empty") {
        truck.setPosition(334.03f, 30.9f, 260.78f);
        TR = truck.getRotation();
        TR.setY(90);
      } else if (psTag[29] == "Empty") {
        truck.setPosition(334.03f, 30.9f, 256.89f);
        TR = truck.getRotation();
        TR.setY(90);
      } else if (psTag[30] == "Empty") {
        truck.setPosition(334.03f, 30.9f, 253.11f);
        TR = truck.getRotation();
        TR.setY(90);
      } else if (psTag[31] == "Empty") {
        truck.setPosition(354.38f, 30.9f, 253.11f);
        TR = truck.getRotation();
        TR.setY(90);
      } else if (psTag[32] == "Empty") {
        truck.setPosition(354.38f, 30.9f, 256.85f);
        TR = truck.getRotation();
        TR.setY(90);
      } else if (psTag[33] == "Empty") {
        truck.setPosition(354.38f, 30.9f, 260.52f);
        TR = truck.getRotation();
        TR.setY(90);
      } else if (psTag[34] == "Empty") {
        truck.setPosition(354.38f, 30.9f, 264.21f);
        TR = truck.getRotation();
        TR.setY(90);
      } else if (psTag[35] == "Empty") {
        truck.setPosition(354.38f, 30.9f, 268.01f);
        TR = truck.getRotation();
        TR.setY(90);
      } else if (psTag[36] == "Empty") {
        truck.setPosition(354.38f, 30.9f, 271.75f);
        TR = truck.getRotation();
        TR.setY(90);
      } else if (psTag[37] == "Empty") {
        truck.setPosition(354.38f, 30.9f, 275.40f);
        TR = truck.getRotation();
        TR.setY(90);
      } else if (psTag[38] == "Empty") {
        truck.setPosition(354.38f, 30.9f, 279.13f);
        TR = truck.getRotation();
        TR.setY(90);
      } else if (psTag[39] == "Empty") {
        truck.setPosition(354.38f, 30.9f, 282.87f);
        TR = truck.getRotation();
        TR.setY(90);
      } else if (psTag[40] == "Empty") {
        truck.setPosition(354.38f, 30.9f, 286.55f);
        TR = truck.getRotation();
        TR.setY(90);
      }
    }

    if (truck.getTag() == "Empty") {
      SoilList.setEnabled(true);
    } else {
      SoilList.setEnabled(false);
      
    }
    // Text system
    LoadT.setText(truck.getTag());
    if(dt > 1) {
      TimeT.setText(min+"m"+" "+sc+"s");
      } else{
          TimeT.setText("Done");
      }
  }
}
