package com.merchii;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if ("admin".equals(username) && "1234".equals(password)) {
            out.println("<h2>Login successful ✅</h2>");
            out.println("<p>Welcome, " + username + "!</p>");
            out.println("<a href='dashboard.html'>Go to Dashboard</a>");
        } else {
            out.println("<h2>Login failed ❌</h2>");
            out.println("<p>Invalid username or password. Try again.</p>");
            out.println("<a href='login.html'>Back to Login</a>");
        }
    }
}
