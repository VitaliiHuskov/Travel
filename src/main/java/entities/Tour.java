package entities;

import java.sql.Date;

public class Tour {

	private Integer tourId;
	private String tourName;
	private Date tourDate;
	private Integer toursCountryId;
	private Double tourPrice;
	private Integer tourCurrencyId;
	private Integer numberOfTickets;
	private Date departureDate;
	private String route;
	private String transport;
	private Integer amountOfDays;
	private String accommodation;
	private Integer typeOfTour;
	private String food;

	public Tour() {

	}

	public Tour(String tourName, Date tourDate, Integer toursCountryId, Double tourPrice, Integer tourCurrencyId,
			Integer numberOfTickets, Date departureDate, String route, String transport, Integer amountOfDays,
			String accommodation, Integer typeOfTour, String food) {
		super();
		this.tourName = tourName;
		this.tourDate = tourDate;
		this.toursCountryId = toursCountryId;
		this.tourPrice = tourPrice;
		this.tourCurrencyId = tourCurrencyId;
		this.numberOfTickets = numberOfTickets;
		this.departureDate = departureDate;
		this.route = route;
		this.transport = transport;
		this.amountOfDays = amountOfDays;
		this.accommodation = accommodation;
		this.typeOfTour = typeOfTour;
		this.food = food;
	}

	public Integer getTourId() {
		return tourId;
	}

	public void setTourId(Integer tourId) {
		this.tourId = tourId;
	}

	public String getTourName() {
		return tourName;
	}

	public void setTourName(String tourName) {
		this.tourName = tourName;
	}

	public Date getTourDate() {
		return tourDate;
	}

	public void setTourDate(Date tourDate) {
		this.tourDate = tourDate;
	}

	public Integer getToursCountryId() {
		return toursCountryId;
	}

	public void setToursCountryId(Integer toursCountryId) {
		this.toursCountryId = toursCountryId;
	}

	public Double getTourPrice() {
		return tourPrice;
	}

	public void setTourPrice(Double tourPrice) {
		this.tourPrice = tourPrice;
	}

	public Integer getTourCurrencyId() {
		return tourCurrencyId;
	}

	public void setTourCurrencyId(Integer tourCurrencyId) {
		this.tourCurrencyId = tourCurrencyId;
	}

	public Integer getNumberOfTickets() {
		return numberOfTickets;
	}

	public void setNumberOfTickets(Integer numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public String getTransport() {
		return transport;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	public Integer getAmountOfDays() {
		return amountOfDays;
	}

	public void setAmountOfDays(Integer amountOfDays) {
		this.amountOfDays = amountOfDays;
	}

	public String getAccommodation() {
		return accommodation;
	}

	public void setAccommodation(String accommodation) {
		this.accommodation = accommodation;
	}

	public Integer getTypeOfTour() {
		return typeOfTour;
	}

	public void setTypeOfTour(Integer typeOfTour) {
		this.typeOfTour = typeOfTour;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	@Override
	public String toString() {
		return String.format(
				"Tour[tourId=%d,tourName=%s,tourDate=%t,toursCountryId=%d,tourPrice=%a,tourCurrencyId=%d,\r\n"
						+ "numberOfTickets=%d,departureDate=%t,route=%s,transport=%s,amountOfDays=%d,\r\n"
						+ "accommodation=%s,typeOfTour=%d,food=%s]",
				tourId, tourName, tourDate, toursCountryId, tourPrice, tourCurrencyId, numberOfTickets, departureDate,
				route, transport, amountOfDays, accommodation, typeOfTour, food);
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof User) && (tourId != null) ? tourId.equals(obj) : (obj == this);
	}

	@Override
	public int hashCode() {
		return (tourId != null) ? (this.getClass().hashCode() + tourId.hashCode()) : super.hashCode();
	}

}
