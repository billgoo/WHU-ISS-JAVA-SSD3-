import java.util.*;

public class XMLSalesFormatter implements SalesFormatter  {
    private final static String NEW_LINE = System.getProperty("line.separator");
    static private XMLSalesFormatter singletonInstance = null;
    static public XMLSalesFormatter getSingletonInstance() {
        if (singletonInstance == null) {
            singletonInstance = new XMLSalesFormatter();
        }
        return singletonInstance;
    }
    private XMLSalesFormatter() {
    }
    public String formatSales (Sales sales) {
        String out = "<Sales>" + NEW_LINE ;
        for (Order order : sales) {
            out += "  <Order total=\""
                   + order.getTotalCost()
                   + "\">"
                   + NEW_LINE;
            for (OrderItem orderItem: order) {
                out += "    <OrderItem quantity=\""
                       + orderItem.getQuantity()
                       + " price=\""
                       + orderItem.getProduct().getPrice()                                                            
                       + "\">"
                       + orderItem.getProduct().getCode()
                       + "</OrderItem>" + NEW_LINE;
            }
            out += "  </Order>" + NEW_LINE;
        }
        out += "</Sales>";
        return out;
    }
}