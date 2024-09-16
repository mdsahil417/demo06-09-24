package mypackage71;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class ResetPasswordServlet
 */
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/reset")
public class ResetPasswordServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String newPassword = request.getParameter("newPassword");

        // For demonstration purposes, we'll just check if the username exists.
        // In a real application, you should check the username in your database and update the password.
        if ("sahil".equals(username)) {
            // Update the password (this is just a placeholder, update your database here)
            // Assuming the password is successfully updated
            response.sendRedirect("reset.html?message=Password+has+been+reset+successfully");
        } else {
            // User does not exist
            response.sendRedirect("reset.html?message=Username+not+found");
        }
    }
}
