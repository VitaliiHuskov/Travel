package dao;

import entities.Currency;

public interface CurrencyDAO {

	public void addCurrency(Currency currency) throws DAOException;

	public void removeCurrency(Currency currency) throws DAOException;
}
