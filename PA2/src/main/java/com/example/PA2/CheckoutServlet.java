package com.example.PA2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CheckoutServlet", value = "/CheckoutServlet")
public class CheckoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String item = request.getParameter("button");
        HttpSession session = request.getSession();
        if (item == "Add Black Milk Tea to Cart") {
            session.setAttribute("");
        }
        else if(item == "Add Coffee Milk Tea Cart"){
            session.setAttribute("");

        }



    }
}
