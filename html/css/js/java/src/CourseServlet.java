package com.merchii;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "1234".equals(password)) {
            response.sendRedirect("dashboard.html");
        } else {
            PrintWriter out = response.getWriter();
            out.println("<h2>Login Failed</h2>");
            out.println("<p>Username or Password incorrect</p>");
        }
    }
}
