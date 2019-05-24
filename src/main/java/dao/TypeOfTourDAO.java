package dao;

import entities.TypeOfTour;

public interface TypeOfTourDAO {

	public void addTypeOfTour(TypeOfTour typeOfTour) throws DAOException;

	public void removeTypeOfTour(TypeOfTour typeOfTour) throws DAOException;

}
