package defaultDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.ConnToBase;
import dao.DAOException;
import dao.TourDao;
import entities.Tour;

public class DefaultTourDao implements TourDao{
	
	private ConnToBase connToBase = new ConnToBase();
	
	private static final String SQL_ADD_TOUR = "INSERT INTO tours (tour_name, tour_date, tour_country_id, tour_price, tour_currency_id, number_of_tickets, departure_date, route, transport, amount_of_days, accommodation, type_of_tour, food) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
	private static final String SQL_REMOVE_TOUR = "DELETE FROM tours WHERE tour_id = ?";
	
	@Override
	public void addTour(Tour tour) throws DAOException {
		
		try(Connection connection = connToBase.getConnection();
				PreparedStatement statement = connection.prepareStatement(SQL_ADD_TOUR)) {
			
			statement.setString(1, tour.getTourName());
			statement.setDate(2, tour.getTourDate());
			statement.setInt(3, tour.getToursCountryId());
			statement.setDouble(4, tour.getTourPrice());
			statement.setInt(5, tour.getTourCurrencyId());
			statement.setInt(6, tour.getNumberOfTickets());
			statement.setDate(7, tour.getDepartureDate());
			statement.setString(8, tour.getRoute());
			statement.setString(9, tour.getTransport());
			statement.setInt(10, tour.getAmountOfDays());
			statement.setString(11, tour.getAccommodation());
			statement.setInt(12, tour.getTypeOfTour());
			statement.setString(13, tour.getFood());

			statement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void removeTour(Tour tour) throws DAOException {
		try(Connection connection = connToBase.getConnection();
				PreparedStatement statement = connection.prepareStatement(SQL_REMOVE_TOUR)) {
			
			statement.setInt(1, tour.getTourId());
			
			statement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	

}
