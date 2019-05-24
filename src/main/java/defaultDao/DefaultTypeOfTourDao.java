package defaultDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.ConnToBase;
import dao.DAOException;
import dao.TypeOfTourDAO;
import entities.TypeOfTour;

public class DefaultTypeOfTourDao implements TypeOfTourDAO {

	private ConnToBase connToBase = new ConnToBase();

	private static final String SQL_ADD_TYPE_OF_TOUR = "INSERT INTO type_of_tour (type_of_tour_name) VALUES (?)";
	private static final String SQL_REMOVE_TYPE_OF_TOUR = "DELETE FROM type_of_tour WHERE type_of_tour_id = ?";

	@Override
	public void addTypeOfTour(TypeOfTour typeOfTour) throws DAOException {

		try (Connection connection = connToBase.getConnection();
				PreparedStatement statement = connection.prepareStatement(SQL_ADD_TYPE_OF_TOUR)) {

			statement.setString(1, typeOfTour.getTypeOfTourName());

			statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void removeTypeOfTour(TypeOfTour typeOfTour) throws DAOException {

		try (Connection connection = connToBase.getConnection();
				PreparedStatement statement = connection.prepareStatement(SQL_REMOVE_TYPE_OF_TOUR)) {

			statement.setInt(1, typeOfTour.getTypeOfTourId());

			statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
