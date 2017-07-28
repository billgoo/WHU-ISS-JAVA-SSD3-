import java.util.*;

public class HTMLSalesFormatter implements SalesFormatter  {
    private final static String NEW_LINE = System.getProperty("line.separator");
    static private HTMLSalesFormatter singletonInstance = null;
    static public HTMLSalesFormatter getSingletonInstance() {
        if (singletonInstance == null) {
            singletonInstance = new HTMLSalesFormatter();
        }
        return singletonInstance;
    }
    private HTMLSalesFormatter() {
    }
    public String formatSales (Sales sales) {
        String out = "<html>"
                     + NEW_LINE
                     + "  <body>"
                     + NEW_LINE + ""
                     + "    <center><h2>Orders</h2></center>"
                     + NEW_LINE;
        for (Order order : sales) {
            out += "    <hr>"
                   + NEW_LINE
                   + "    <h4>"
                   + "Total = "
                   + order.getTotalCost()
                   + "</h4>"
                   + NEW_LINE;           
            for (OrderItem orderItem: order) {
                out += "      <p>" + NEW_LINE;
                out += "         "
                       +"<b>code:</b> "
                	   + orderItem.getProduct().getCode()
                	   + "<br>"
                	   + NEW_LINE
                	   +"<b>quantity:</b> "
                	   + orderItem.getQuantity()
                       + "<br>"
                       + NEW_LINE
                       +"<b>price:</b> "
                       +orderItem.getProduct().getPrice()
                       + NEW_LINE;
                out += "      </p>" + NEW_LINE;
            }
        }
        out += "  </body>" + NEW_LINE + "</html>";
        return out;
    }
}

