package com.example.oop_laba7;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/other_services")
public class OtherServicesServlet extends HttpServlet {

    @Override
    protected  void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

//        PrintWriter printWriter = resp.getWriter();
//        printWriter.println("Other services!");
//        printWriter.close();
        req.getRequestDispatcher("/otherServices.jsp").forward(req, resp);
    }
}
