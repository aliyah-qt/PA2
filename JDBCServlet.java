package com.example.Project2;

import java.io.*;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.*;
import javax.servlet.*;

@WebServlet(name = "JDBCServlet", value = "/JDBCServlet")
public class JDBCServlet extends HttpServlet
{

    Connection con;
    Statement statement;
    // JDBC driver name and database
    final String JDBC_DRIVER = "com.mysql.jdbc.Driver";//com.mysql.jc.jdbc.Driver
    final String DB_URL="jdbc:mysql://localhost:3306/testd";
    final String schema = "all_products";
    final String uname = "root";
    final String pwd = "Spra98nak6!";

    public void init (ServletConfig config) throws ServletException
    {
        //System.out.println("i made it");
        super.init(config);

        try {
            // Register JDBC driver
            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection("jdbc:mysql:// localhost:3306/"+schema,uname,pwd);
            statement = con.createStatement();
        } catch (ClassNotFoundException e) {
            throw new UnavailableException("JDBCDemoServlet.init() ClassNotFoundException: " + e.getMessage());
        } catch (SQLException e) {
            throw new UnavailableException("JDBCDemoServlet.init() SQLException: " + e.getMessage());
        }


    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sql = "SELECT id, description, price FROM table_all_products";
        System.out.println("i made it in to do get!");
        try{
            ResultSet rs = statement.executeQuery(sql);


            PrintWriter writer = response.getWriter();
            writer.println("<Html> <body>");

            while(rs.next()){
                rs.getString("id");
                rs.getString("description");
                rs.getString("price");
                writer.println("</br>");
            }
            writer.println(("</body> </Html>"));
            statement.close();

        } catch(SQLException e) {

        }
    }
    @Override
    public void destroy() {
        //close the connection
        if (con != null)
            try {
                con.close();
            } catch (SQLException ignore) {}
    }
}
