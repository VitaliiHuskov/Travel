package defaultDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.ConnToBase;
import dao.UserRoleDAO;
import entities.UserRole;

public class DefaultUserRoleDao implements UserRoleDAO {
	
	private ConnToBase connToBase = new ConnToBase();
	
	private static final String SQL_ADD_USER_ROLE = "INSERT INTO user_role (user_id, role_id) VALUES (?, ?)";
	private static final String SQL_REMOVE_USER_ROLE = "DELETE FROM user_role WHERE user_role_id = ?";

	@Override
	public void addUserRole(UserRole userRole) {

		try(Connection connection = connToBase.getConnection();
				PreparedStatement statement = connection.prepareStatement(SQL_ADD_USER_ROLE)) {
			
			statement.setInt(1, userRole.getUserId());
			statement.setInt(2, userRole.getRoleId());
			
			statement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void removeUserRole(UserRole userRole) {
		
		try(Connection connection = connToBase.getConnection();
				PreparedStatement statement = connection.prepareStatement(SQL_REMOVE_USER_ROLE)) {
			
			statement.setInt(1, userRole.getUserRoleId());
			
			statement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
