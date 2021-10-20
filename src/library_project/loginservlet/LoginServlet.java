package library_project.loginservlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import library_project.user.User;
import library_project.userfetch.UserFetch;



@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UserFetch userfetch;

    public void init() {
        userfetch = new UserFetch();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        try {
            if (userfetch.validate(user)) {
                HttpSession session = request.getSession();
                session.setAttribute("username",user.getUsername());
                 //request.getRequestDispatcher("/loginsuccess.jsp").forward(request, response);
               response.sendRedirect("index.jsp");
            } else {
                HttpSession session = request.getSession();
                session.setAttribute("user", username);
            	request.setAttribute("errMessage", "Invalid Password");
            	request.getRequestDispatcher("/login.jsp").forward(request, response);
               //response.sendRedirect("login.jsp");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
