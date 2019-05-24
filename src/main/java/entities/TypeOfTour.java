package entities;

public class TypeOfTour {

	private Integer typeOfTourId;
	private String typeOfTourName;

	public TypeOfTour() {

	}

	public TypeOfTour(Integer typeOfTourId, String typeOfTourName) {
		super();
		this.typeOfTourId = typeOfTourId;
		this.typeOfTourName = typeOfTourName;
	}

	public Integer getTypeOfTourId() {
		return typeOfTourId;
	}

	public void setTypeOfTourId(Integer typeOfTourId) {
		this.typeOfTourId = typeOfTourId;
	}

	public String getTypeOfTourName() {
		return typeOfTourName;
	}

	public void setTypeOfTourName(String typeOfTourName) {
		this.typeOfTourName = typeOfTourName;
	}

	@Override
	public String toString() {
		return String.format("TypeOfTour[typeOfTourId=%d,typeOfTourName=%s]", typeOfTourId, typeOfTourName);
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof User) && (typeOfTourId != null) ? typeOfTourId.equals(obj) : (obj == this);
	}

	@Override
	public int hashCode() {
		return (typeOfTourId != null) ? (this.getClass().hashCode() + typeOfTourId.hashCode()) : super.hashCode();
	}

}
