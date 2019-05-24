package defaultDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.ConnToBase;
import dao.DAOException;
import dao.RoleDAO;
import entities.Role;

public class DefaultRoleDao implements RoleDAO {

	private ConnToBase connToBase = new ConnToBase();

	private static final String SQL_ADD_ROLE = "INSERT INTO roles (role_type) VALUES (?)";
	private static final String SQL_REMOVE_ROLE = "DELETE FROM roles WHERE role_id = ?";

	@Override
	public void addRole(Role role) throws DAOException {

		try (Connection connection = connToBase.getConnection();
				PreparedStatement statement = connection.prepareStatement(SQL_ADD_ROLE)) {

			statement.setString(1, role.getRoleType());

			statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void removeRole(Role role) throws DAOException {

		try (Connection connection = connToBase.getConnection();
				PreparedStatement statement = connection.prepareStatement(SQL_REMOVE_ROLE)) {

			statement.setInt(1, role.getRoleId());

			statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
