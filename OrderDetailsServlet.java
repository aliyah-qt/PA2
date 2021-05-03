package com.example.Project2;

import javax.servlet.annotation.WebServlet;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "OrderDetailsServlet", value = "/OrderDetailsServlet")
public class OrderDetailsServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        File obj = new File("form_validation.js");

        System.out.println("dude i made it in the order details servlet");

        /*
        if(obj.exists()){

            if(obj.validateForm() != true){
                RequestDispatcher rd=request.getRequestDispatcher("failOrder.html");
                rd.forward(request, response);
            }
            else{
                RequestDispatcher rd=request.getRequestDispatcher("successOrder.html");
                rd.forward(request, response);
            }


        }
        else{
            System.out.println("The file doesn't exist bro.");
        }




        if(validateForm() != true){
            RequestDispatcher rd=request.getRequestDispatcher("failOrder.html");
            rd.forward(request, response);
        }
        else{
            RequestDispatcher rd=request.getRequestDispatcher("successOrder.html");
            rd.forward(request, response);
        }
        */

    }
}

