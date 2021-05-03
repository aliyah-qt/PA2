package com.example.Project2;

import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@WebServlet(name = "CheckoutServlet", value = "/CheckoutServlet")
public class CheckoutServlet extends HttpServlet {
    Hashtable<Integer, String> cart = new Hashtable<Integer, String>();
    int counter = 0;
    Double totalPrice = 0.0;

    /*
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    */

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();

        String item = request.getParameter("button");
        //System.out.println(item);
        HttpSession session = request.getSession();
        if (item.equals("Add Black Milk Tea to Cart")) {
       //     session.setAttribute("");
            counter++;
            cart.put(counter,"Black Milk");
            totalPrice += 4.75;
            System.out.println("black cart");
            System.out.println(totalPrice);
            System.out.println("Mappings of cart : " + cart);
        }
        else if(item.equals("Add Coffee Milk Tea to Cart")){
        //    session.setAttribute("");
            counter++;
            cart.put(counter, "Coffee Milk");
            totalPrice += 5.75;
            System.out.println("coffee cart");
            System.out.println(totalPrice);
            System.out.println("Mappings of cart : " + cart);
        }
        else if(item.equals("Add Earl Grey Milk Tea to Cart")){
            //    session.setAttribute("");
            counter++;
            cart.put(counter, "Earl Grey Milk");
            totalPrice += 5.75;
            System.out.println("earl cart");
            System.out.println(totalPrice);
            System.out.println("Mappings of cart : " + cart);
        }
        else if(item.equals("Add Jasmine Milk Tea to Cart")){
            //    session.setAttribute("");
            counter++;
            cart.put(counter, "Jasmine Milk");
            totalPrice += 5.75;
            System.out.println("jasmine cart");
            System.out.println(totalPrice);
            System.out.println("Mappings of cart : " + cart);
        }
        else if(item.equals("Add Mango Lychee Tea to Cart")){
            //    session.setAttribute("");
            counter++;
            cart.put(counter, "Mango Lychee");
            totalPrice += 5.75;
            System.out.println("mango cart");
            System.out.println(totalPrice);
            System.out.println("Mappings of cart : " + cart);
        }
        else if(item.equals("Add Oolong Milk Tea to Cart")){
            //    session.setAttribute("");
            counter++;
            cart.put(counter, "Oolong Milk");
            totalPrice += 5.75;
            System.out.println("oolong cart");
            System.out.println(totalPrice);
            System.out.println("Mappings of cart : " + cart);
        }
        else if(item.equals("Add Panda Milk Tea to Cart")){
            //    session.setAttribute("");
            counter++;
            cart.put(counter, "Panda Milk");
            totalPrice += 5.75;
            System.out.println("panda cart");
            System.out.println(totalPrice);
            System.out.println("Mappings of cart : " + cart);
        }
        else if(item.equals("Add Peach Green Tea to Cart")){
            //    session.setAttribute("");
            counter++;
            cart.put(counter, "Peach Green");
            totalPrice += 5.75;
            System.out.println("peach cart");
            System.out.println(totalPrice);
            System.out.println("Mappings of cart : " + cart);
        }
        else if(item.equals("Add Taro Milk Tea to Cart")){
            //    session.setAttribute("");
            counter++;
            cart.put(counter, "Taro Milk");
            totalPrice += 5.75;
            System.out.println("taro cart");
            System.out.println(totalPrice);
            System.out.println("Mappings of cart : " + cart);
        }
        else if(item.equals("Add Thai Iced Tea to Cart")){
            //    session.setAttribute("");
            counter++;
            cart.put(counter, "Thai Iced");
            totalPrice += 5.75;
            System.out.println("thai cart");
            System.out.println(totalPrice);
            System.out.println("Mappings of cart : " + cart);
        }

        //RequestDispatcher rd=request.getRequestDispatcher("checkout.html");
        //rd.forward(request, response);

        writer.println("<Html> <body>");
        //writer.println("<h3>Current items in your cart: " + cart.get(counter) + " </h3><br>");
        writer.println("<h3>Current items in your cart: </h3>");

        for(String index: cart.values()){
            writer.print(index + ", ");
        }

        writer.println("<h3>Total: $" + totalPrice + "</h3><br>");
        writer.println("<form name=\"PurchaseOrderForm\"\n" +
                "      onsubmit=\"return validateForm()\"\n" +
                "      action=\"/CheckoutServlet\"\n" +
                "      method=\"POST\"\n" +
                "      enctype=\"text/plain\">\n" +
                "\n" +
                "    <fieldset>\n" +
                "        <legend>Purchase Order Form</legend>\n" +
                "        <br>\n" +
                "        <div class=\"form-container\">\n" +
                "            <div class=\"form-item\">\n" +
                "\n" +
                "                <!--\n" +
                "                <label for=\"pid\">Product Identifier:</label><br>\n" +
                "                <select name=\"Product Identifier\" id=\"pid\" required>\n" +
                "                    <option value=\"Select\">Select</option>\n" +
                "                    <option value=\"Black Milk Tea\">Black Milk Tea</option>\n" +
                "                    <option value=\"Coffee Milk Tea\">Coffee Milk Tea</option>\n" +
                "                    <option value=\"Earl Grey Milk Tea\">Earl Grey Milk Tea</option>\n" +
                "                    <option value=\"Jasmine Milk Tea\">Jasmine Milk Tea</option>\n" +
                "                    <option value=\"Mango Lychee Tea\">Mango Lychee Tea</option>\n" +
                "                    <option value=\"Oolong Milk Tea\">Oolong Milk Tea</option>\n" +
                "                    <option value=\"Panda Milk Tea\">Panda Milk Tea</option>\n" +
                "                    <option value=\"Peach Green Tea\">Peach Green Tea</option>\n" +
                "                    <option value=\"Taro Milk Tea\">Taro Milk Tea</option>\n" +
                "                    <option value=\"Thai Iced Tea\">Thai Iced Tea</option>\n" +
                "                </select>\n" +
                "                <br>\n" +
                "                <br>\n" +
                "                <label for=\"sugar\">Sugar Level:</label><br>\n" +
                "                <select name=\"Sugar Level\" id=\"sugar\" required>\n" +
                "                    <option value=\"Select\">Select</option>\n" +
                "                    <option value=\"100% Regular Sweet\">100% Regular Sweet</option>\n" +
                "                    <option value=\"75% Sweet\">75% Sweet</option>\n" +
                "                    <option value=\"50% Sweet\">50% Sweet</option>\n" +
                "                    <option value=\"25% Sweet\">25% Sweet</option>\n" +
                "                    <option value=\"No Sweet\">No Sweet</option>\n" +
                "\n" +
                "                </select>\n" +
                "                <br>\n" +
                "                <br>\n" +
                "\n" +
                "                <label for=\"qty\">Quantity:</label><br>\n" +
                "                <input type=\"number\" id=\"qty\" name=\"Quantity\" min=\"1\" max=\"5\" required><br>\n" +
                "\n" +
                "                <br>\n" +
                "                -->\n" +
                "                <label for=\"fname\">First Name:</label><br>\n" +
                "                <input type=\"text\" id=\"fname\" maxlength=\"32\" name=\"First Name\" pattern=\"[A-Za-z]{1,32}\" required><br>\n" +
                "\n" +
                "                <br>\n" +
                "\n" +
                "                <label for=\"lname\">Last Name:</label><br>\n" +
                "                <input type=\"text\" id=\"lname\" maxlength=\"32\" name=\"Last Name\" pattern=\"[A-Za-z]{1,32}\" required><br>\n" +
                "\n" +
                "                <br>\n" +
                "\n" +
                "                <label for=\"phone\">Phone Number:</label><br>\n" +
                "                <input type=\"tel\" id=\"phone\" name=\"Phone Number\" placeholder=\"i.e. 123-456-7891\" pattern=\"[0-9]{3}-[0-9]{3}-[0-9]{4}\" required><br>\n" +
                "\n" +
                "                <br>\n" +
                "                <label for=\"ship_addr\"><u>Shipping Address Information</u></label><br>\n" +
                "                <label for=\"addr\">Street:</label><br>\n" +
                "                <input type=\"text\" id=\"addr\" name=\"Address Line 1\" placeholder=\"i.e. 1234 W Irvine Drive\" required><br><br>\n" +
                "                <label for=\"addr\">Apt/Suite/Bldg:</label><br>\n" +
                "                <input type=\"text\" id=\"addr2\" name=\"Address Line 2\" placeholder=\"i.e. Apt 4\"><br><br>\n" +
                "\n" +
                "\n" +
                "\n" +
                "            </div><!-- class form item -->\n" +
                "            <div class=\"form-item\">\n" +
                "                <label for=\"city\">City:</label><br>\n" +
                "                <input type=\"text\" id=\"city\" name=\"City\" required><br><br>\n" +
                "\n" +
                "                <label for=\"state\">State:</label><br>\n" +
                "                <input type=\"text\" id=\"state\" name=\"State\" size=\"5\" pattern=\"[A-Z]{2,2}\" placeholder=\"i.e. CA\" required><br><br>\n" +
                "\n" +
                "                <label for=\"zip_code\">Zip Code:</label><br>\n" +
                "                <input type=\"text\" id=\"zip_code\" name=\"Zip Code\" pattern=\"[0-9]{5,5}\" title=\"Zip code should be exactly 5 digits. e.g. 92801\" required>\n" +
                "\n" +
                "                <br>\n" +
                "                <br>\n" +
                "\n" +
                "                <label for=\"ship_method\">Shipping Method:</label><br>\n" +
                "                <input type=\"radio\" id=\"overnight\" name=\"Shipping Method\" value=\"Overnight\" required>\n" +
                "                <label for=\"overnight\">Overnight</label><br>\n" +
                "\n" +
                "                <input type=\"radio\" id=\"2day\" name=\"Shipping Method\" value=\"2day\" required>\n" +
                "                <label for=\"2day\">2-day expedited</label><br>\n" +
                "\n" +
                "                <input type=\"radio\" id=\"6day\" name=\"Shipping Method\" value=\"6day\" required>\n" +
                "                <label for=\"6day\">6-days ground</label><br>\n" +
                "\n" +
                "                <br>\n" +
                "\n" +
                "                <label for=\"credit_card\"><u>Credit Card Information</u></label><br>\n" +
                "                <label for=\"card_num\">Card Number:</label><br>\n" +
                "                <input type=\"text\" id=\"card_num\" name=\"Card Number\" pattern=\"[0-9]{13,16}\" title=\"Credit card number should be between 13 and 16 digits.\" required><br><br>\n" +
                "\n" +
                "                <label for=\"expiry1\">Expiry Date:</label><br>\n" +
                "                <select id=\"expiry1\" name=\"Expiration Month\">\n" +
                "                    <option value=\"January\">01</option>\n" +
                "                    <option value=\"February\">02</option>\n" +
                "                    <option value=\"March\">03</option>\n" +
                "                    <option value=\"April\">04</option>\n" +
                "                    <option value=\"May\">05</option>\n" +
                "                    <option value=\"June\">06</option>\n" +
                "                    <option value=\"July\">07</option>\n" +
                "                    <option value=\"August\">08</option>\n" +
                "                    <option value=\"September\">09</option>\n" +
                "                    <option value=\"October\">10</option>\n" +
                "                    <option value=\"November\">11</option>\n" +
                "                    <option value=\"December\">12</option>\n" +
                "                </select>\n" +
                "\n" +
                "                <select id=\"expiry2\" name=\"Expiration Year\">\n" +
                "                    <option value=\"2021\">21</option>\n" +
                "                    <option value=\"2022\">22</option>\n" +
                "                    <option value=\"2023\">23</option>\n" +
                "                    <option value=\"2024\">24</option>\n" +
                "                    <option value=\"2025\">25</option>\n" +
                "                    <option value=\"2026\">26</option>\n" +
                "                    <option value=\"2027\">27</option>\n" +
                "                    <option value=\"2028\">28</option>\n" +
                "                    <option value=\"2029\">29</option>\n" +
                "                    <option value=\"2030\">30</option>\n" +
                "                </select>\n" +
                "\n" +
                "                <br>\n" +
                "                <br>\n" +
                "\n" +
                "                <label for=\"sCode\">Security Code:</label><br>\n" +
                "                <input type=\"text\" id=\"sCode\" name=\"Security Code\" size=\"4\" pattern=\"[0-9]{3,4}\" required><br><br>\n" +
                "\n" +
                "                <br>\n" +
                "\n" +
                "                <input type=\"submit\" value=\"Submit\">\n" +
                "\n" +
                "            </div>\n" +
                "        </div>\n" +
                "\n" +
                "    </fieldset>\n" +
                "</form>");
        writer.println("</body> </Html>");

    }
}
