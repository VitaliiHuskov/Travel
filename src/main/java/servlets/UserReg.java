package servlets;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import defaultDao.DafaultUserDao;
import entities.User;

/**
 * Servlet implementation class UserReg
 */
@WebServlet("/UserReg")
public class UserReg extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		DafaultUserDao userDao = new DafaultUserDao();
		User user = new User();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String dateOfBirth = request.getParameter("dateOfBirth");

		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setLogin(login);
		user.setPassword(password);
		user.setEmail(email);

		try {
			java.util.Date date = sdf.parse(dateOfBirth);
			java.sql.Date sqlDate = new Date(date.getTime());

			user.setDateOfBirth(sqlDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		userDao.addUser(user);
		System.out.println(user);
	}

}
