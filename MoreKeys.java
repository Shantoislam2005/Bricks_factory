/** @Author Shanto2005 */
public class MoreKeys extends Component {
public SUIButton OrderList;
public SUIButton CloseOrderList;
public SUIButton AllTruckL;
public SUIButton CloseAllTL;

  /// Run only once
  @Override
  public void start() {}

  /// Repeat every frame
  @Override
  public void repeat() {
    if(OrderList.isDown()) {
        myObject.findChildObject("Order list").setEnabled(true);
    } if(CloseOrderList.isDown()) {
        myObject.findChildObject("Order list").setEnabled(false);
    }
    if(AllTruckL.isDown()) {
        myObject.findChildObject("All truck list").setEnabled(true);
    } if(CloseAllTL.isDown()) {
        myObject.findChildObject("All truck list").setEnabled(false);
    }
  }
} 
