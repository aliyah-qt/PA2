package com.example.FirstApp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "ProductDetailsServlet", value = "/ProductDetailsServlet")
public class ProductDetailsServlet extends HttpServlet {

    @Override
    public void init() throws ServletException{
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String tea=request.getParameter("Product Identifier");

        if(tea.equals("Black Milk Tea")){
            RequestDispatcher rd=request.getRequestDispatcher("black.html");
            rd.forward(request, response);
        }
        if(tea.equals("Coffee Milk Tea")){
            RequestDispatcher rd=request.getRequestDispatcher("coffee.html");
            rd.forward(request, response);
        }
        else{
            out.print("You didn't request a valid tea! WHY??");
            //RequestDispatcher rd=request.getRequestDispatcher("login.html");
            //rd.include(request, response);
        }

        /*

        PrintWriter writer = response.getWriter();
        writer.println("<Html> <body>");
        String tea = request.getParameter("Product Identifier");
        writer.println("<h3>The tea you chose is: " + tea + "</h3>");
        writer.println("</body> <Html>");

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/black.html");
        rd.include(request, response);

         */
    }
}
