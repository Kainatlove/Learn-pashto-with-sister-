package com.merchii;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class PaymentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        String paymentCode = request.getParameter("paymentCode");
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if ("123456".equals(paymentCode)) {  // Demo purpose
            out.println("<h2>Payment Verified ✅</h2>");
            out.println("<p>You now have full access to paid courses.</p>");
        } else {
            out.println("<h2>Payment Failed ❌</h2>");
            out.println("<p>Please send correct Easypaisa code to 03349231846 / 03480992409</p>");
        }
    }
}
