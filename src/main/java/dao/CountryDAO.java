package dao;

import entities.Country;

public interface CountryDAO {

	public void addCountry(Country country) throws DAOException;

	public void removeCountry(Country country) throws DAOException;

}
