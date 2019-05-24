package defaultDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.ConnToBase;
import dao.CurrencyDAO;
import dao.DAOException;
import entities.Currency;

public class DefaultCurrencyDao implements CurrencyDAO {

	private ConnToBase connToBase = new ConnToBase();

	private static final String SQL_ADD_CURRENCY = "INSERT INTO currency (currency_type) VALUES (?)";
	private static final String SQL_REMOVE_CURRENCY = "DELETE FROM currency WHERE currency_id = ?";

	@Override
	public void addCurrency(Currency currency) throws DAOException {

		try (Connection connection = connToBase.getConnection();
				PreparedStatement statement = connection.prepareStatement(SQL_ADD_CURRENCY)) {

			statement.setString(1, currency.getCurrencyType());

			statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void removeCurrency(Currency currency) throws DAOException {

		try (Connection connection = connToBase.getConnection();
				PreparedStatement statement = connection.prepareStatement(SQL_REMOVE_CURRENCY)) {

			statement.setInt(1, currency.getCurrencyId());

			statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
