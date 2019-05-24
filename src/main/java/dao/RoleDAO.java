package dao;

import entities.Role;

public interface RoleDAO {

	public void addRole(Role role) throws DAOException;

	public void removeRole(Role role) throws DAOException;

}
