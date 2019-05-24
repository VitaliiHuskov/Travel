package entities;

public class Country {

	private Integer countryId;
	private String countryName;

	public Country() {

	}

	public Country(Integer countryId, String countryName) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
	}

	public Integer getCoutryId() {
		return countryId;
	}

	public void setCoutryId(Integer countryId) {
		this.countryId = countryId;
	}

	public String getCoutryName() {
		return countryName;
	}

	public void setCoutryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		return String.format("Country[countryId=%d,countryName=%s]", countryId, countryName);
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof User) && (countryId != null) ? countryId.equals(obj) : (obj == this);
	}

	@Override
	public int hashCode() {
		return (countryId != null) ? (this.getClass().hashCode() + countryId.hashCode()) : super.hashCode();
	}

}
