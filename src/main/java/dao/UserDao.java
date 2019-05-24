package dao;

import java.util.List;

import entities.User;

public interface UserDao {

	public void addUser(User user) throws DAOException;

	public void removeUser(User user) throws DAOException;
	
	public List<User> getAllUsers() throws DAOException;
	
	public User getUser(Integer userId) throws DAOException;
	
}
