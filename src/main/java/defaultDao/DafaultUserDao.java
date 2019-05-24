package defaultDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.ConnToBase;
import dao.DAOException;
import dao.UserDao;
import entities.User;

public class DafaultUserDao implements UserDao {

	private ConnToBase connToBase = new ConnToBase();

	private static final String SQL_ADD_USER = "INSERT INTO users (user_firstname, user_lastname, user_login, user_password, user_email, date_of_birth) VALUES (?, ?, ?, ?, ?, ?)";
	private static final String SQL_REMOVE_USER = "DELETE FROM users WHERE user_id = ?";
	private static final String SQL_GET_ALL_USERS = "SELECT * FROM users";
	private static final String SQL_GET_USER = "SELECT * FROM users WHERE user_id = ?";

	@Override
	public void addUser(User user) throws DAOException {

		try (Connection connection = connToBase.getConnection();
				PreparedStatement statement = connection.prepareStatement(SQL_ADD_USER)) {

			statement.setString(1, user.getFirstName());
			statement.setString(2, user.getLastName());
			statement.setString(3, user.getLogin());
			statement.setString(4, user.getPassword());
			statement.setString(5, user.getEmail());
			statement.setDate(6, user.getDateOfBirth());

			statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void removeUser(User user) throws DAOException {

		try (Connection connection = connToBase.getConnection();
				PreparedStatement statement = connection.prepareStatement(SQL_REMOVE_USER)) {

			statement.setInt(1, user.getUserId());

			statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<User> getAllUsers() throws DAOException {
		List<User> userList = new ArrayList<User>();
		User user = new User();

		try (Connection connection = connToBase.getConnection();
				PreparedStatement statement = connection.prepareStatement(SQL_GET_ALL_USERS);
				ResultSet resultSet = statement.executeQuery()) {

			while (resultSet.next()) {

				user.setFirstName(resultSet.getString("user_firstname"));
				user.setLastName(resultSet.getString("user_lastname"));
				user.setLogin(resultSet.getString("user_login"));
				user.setPassword(resultSet.getString("user_password"));
				user.setEmail(resultSet.getString("user_email"));
				user.setDateOfBirth(resultSet.getDate("date_of_birth"));
				user.setUserTourId(resultSet.getInt("user_tour_id"));

				userList.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public User getUser(Integer userId) throws DAOException {
		User user = null;

		try (Connection connection = connToBase.getConnection();
				PreparedStatement statement = connection.prepareStatement(SQL_GET_USER);
				ResultSet resultSet = statement.executeQuery()) {

			statement.setInt(1, userId);

			while (resultSet.next()) {
				user = new User(resultSet.getString("user_firstname"), resultSet.getString("user_lastname"),
						resultSet.getString("user_login"), resultSet.getString("user_password"),
						resultSet.getString("user_email"), resultSet.getDate("date_of_birth"),
						resultSet.getInt("user_tour_id"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return user;
	}

}
