package com.servlet.controller.web;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/trang-chu"})
public class HomeController  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
       // super.doGet(req, resp);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/web/home.jsp");
        requestDispatcher.forward(req, resp);

    }

}
