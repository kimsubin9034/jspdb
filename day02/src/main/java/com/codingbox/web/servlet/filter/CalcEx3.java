package com.codingbox.web.servlet.filter;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add3")
public class CalcEx3 extends HttpServlet {
   @Override
   protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String[] numStr = request.getParameterValues("num");
      
      if (numStr == null) {
          response.getWriter().println("No numbers provided.");
          return;
      }
      
      int result = 0;
      for (int i = 0; i < numStr.length; i++) {
         int num = Integer.parseInt(numStr[i]);
         result += num;
      }
      
      response.getWriter().printf("result is %d\n", result);
   }
}
