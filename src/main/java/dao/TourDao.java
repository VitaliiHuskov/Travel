package dao;

import entities.Tour;

public interface TourDao {

	public void addTour(Tour tour) throws DAOException;
	
	public void removeTour(Tour tour) throws DAOException;
}
