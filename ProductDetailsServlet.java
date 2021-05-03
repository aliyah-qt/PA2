package com.example.Project2;

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
            //System.out.println("sample");
            RequestDispatcher rd=request.getRequestDispatcher("black.html");
            rd.forward(request, response);
        }
        if(tea.equals("Coffee Milk Tea")){
            RequestDispatcher rd=request.getRequestDispatcher("coffee.html");
            rd.forward(request, response);
        }
        if(tea.equals("Earl Grey Milk Tea")){
            RequestDispatcher rd=request.getRequestDispatcher("earl.html");
            rd.forward(request, response);
        }
        if(tea.equals("Jasmine Milk Tea")){
            RequestDispatcher rd=request.getRequestDispatcher("jasmine.html");
            rd.forward(request, response);
        }
        if(tea.equals("Mango Lychee Tea")){
            RequestDispatcher rd=request.getRequestDispatcher("mango.html");
            rd.forward(request, response);
        }
        if(tea.equals("Oolong Milk Tea")){
            RequestDispatcher rd=request.getRequestDispatcher("oolong.html");
            rd.forward(request, response);
        }
        if(tea.equals("Panda Milk Tea")){
            RequestDispatcher rd=request.getRequestDispatcher("panda.html");
            rd.forward(request, response);
        }
        if(tea.equals("Peach Green Tea")){
            RequestDispatcher rd=request.getRequestDispatcher("peach.html");
            rd.forward(request, response);
        }
        if(tea.equals("Taro Milk Tea")){
            RequestDispatcher rd=request.getRequestDispatcher("taro.html");
            rd.forward(request, response);
        }
        if(tea.equals("Thai Iced Tea")){
            RequestDispatcher rd=request.getRequestDispatcher("thai.html");
            rd.forward(request, response);
        }

        else{
            out.print("You didn't request a valid tea! Please click the back button and try again.");
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
