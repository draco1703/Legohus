package FunctionLayer;

import DBAccess.UserMapper;
import DBAccess.Ordermapper;
import java.util.ArrayList;


public class LogicFacade {

    public static User login( String email, String password ) throws LoginSampleException {
        return UserMapper.login( email, password );
    } 

    public static User createUser( String email, String password ) throws LoginSampleException {
        User user = new User(email, password, "customer");
        UserMapper.createUser( user );
        return user;
    }
    
      public static ArrayList<Order> getOrders(int userId) throws OrderException {
        return Ordermapper.getOrders(userId);
    
      }
      
    public static void createOrder(User user, Order order) throws OrderException{
         Ordermapper.createOrder(user, order);
    }
    
    
  

}
