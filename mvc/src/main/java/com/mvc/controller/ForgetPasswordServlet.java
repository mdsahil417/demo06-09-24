package com.mvc.controller;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mvc.util.DBConnection;

public class ForgetPasswordServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ForgetPasswordServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");

        Connection con = null;
        PreparedStatement preparedStatement = null;

        try {
            con = DBConnection.createConnection();
            String query = "UPDATE users SET password = ? WHERE userName = ?";
            preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, password);
            preparedStatement.setString(2, userName);

            int i = preparedStatement.executeUpdate();

            if (i != 0) {
                request.setAttribute("successMessage", "Password has been reset successfully! Your user ID is " + userName + " and your new password is " + password);
                request.getRequestDispatcher("/ForgetPassword.jsp").forward(request, response);
            } else {
                request.setAttribute("errMessage", "User ID does not exist.");
                request.getRequestDispatcher("/ForgetPassword.jsp").forward(request, response);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            request.setAttribute("errMessage", "An error occurred. Please try again.");
            request.getRequestDispatcher("/ForgetPassword.jsp").forward(request, response);
        }
    }
}