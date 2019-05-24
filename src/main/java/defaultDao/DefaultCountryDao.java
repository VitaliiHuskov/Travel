package defaultDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.ConnToBase;
import dao.CountryDAO;
import dao.DAOException;
import entities.Country;

public class DefaultCountryDao implements CountryDAO {

	private ConnToBase connToBase = new ConnToBase();

	private static final String SQL_ADD_COUNTRY = "INSERT INTO countries (country_name) VALUES (?)";
	private static final String SQL_REMOVE_COUNTRY = "DELETE FROM countries WHERE country_id = ?";

	@Override
	public void addCountry(Country country) throws DAOException {

		try (Connection connection = connToBase.getConnection();
				PreparedStatement statement = connection.prepareStatement(SQL_ADD_COUNTRY)) {

			statement.setString(1, country.getCoutryName());

			statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void removeCountry(Country country) throws DAOException {

		try (Connection connection = connToBase.getConnection();
				PreparedStatement statement = connection.prepareStatement(SQL_REMOVE_COUNTRY)) {

			statement.setInt(1, country.getCoutryId());

			statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
