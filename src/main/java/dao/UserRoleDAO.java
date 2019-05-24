package dao;

import entities.UserRole;

public interface UserRoleDAO {

	public void addUserRole(UserRole userRole) throws DAOException;

	public void removeUserRole(UserRole userRole) throws DAOException;

}
