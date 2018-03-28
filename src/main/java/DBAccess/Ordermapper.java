
package DBAccess;

import FunctionLayer.LoginSampleException;
import FunctionLayer.Order;
import FunctionLayer.OrderException;
import FunctionLayer.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Nicolai
 */
public class Ordermapper {
   
    
     public static void createOrder(User user, Order order) throws OrderException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO orderlist (length, width, height, user_id) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );
            ps.setInt( 1, order.getLength());
            ps.setInt( 2, order.getWidth());
            ps.setInt( 3, order.getHeight());
            ps.setInt( 4, user.getId());
            ps.executeUpdate();
            } catch ( SQLException | ClassNotFoundException ex ) {
            throw new OrderException(ex.getMessage() );
        }
}
 
      public static ArrayList<Order> getOrders(int userId) throws OrderException  {
        ArrayList<Order> orderList = new ArrayList<>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT orderlist.id, orderlist.length, orderlist.width, "
                    + "orderlist.height, orderlist.status FROM useradmin.orderlist"
                    + " inner join useradmin.users on useradmin.orderlist.user_id = useradmin.users.id "
                    + "where orderlist.user_id =? order by orderlist.id";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                int length = rs.getInt("length");
                int width = rs.getInt("width");
                int height = rs.getInt("height");
                String status = rs.getString("status");
                Order order = new Order(id, height, length, width, status);
                orderList.add(order);
            }
            return orderList;
        } catch (ClassNotFoundException | SQLException ex) {
            throw new OrderException(ex.getMessage());
        }
    }
 
     
     
     
}