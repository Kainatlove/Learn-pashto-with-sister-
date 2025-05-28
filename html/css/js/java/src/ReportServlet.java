package com.sister;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class ReportServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String userEmail = request.getParameter("email");
        String issue = request.getParameter("issue");

        // You can log or save this issue to a file or database
        System.out.println("New Issue Reported:");
        System.out.println("Email: " + userEmail);
        System.out.println("Issue: " + issue);

        // Redirect user to thank you or dashboard
        response.sendRedirect("thankyou.html");
    }
}
