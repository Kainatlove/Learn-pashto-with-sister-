package com.sister;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class SignupServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Save info in session (demo only)
        HttpSession session = request.getSession();
        session.setAttribute("username", username);
        session.setAttribute("email", email);

        // Redirect to dashboard
        response.sendRedirect("dashboard.html");
    }
}
