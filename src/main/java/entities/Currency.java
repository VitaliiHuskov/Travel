package entities;

public class Currency {

	private Integer currencyId;
	private String currencyType;

	public Currency() {

	}

	public Currency(Integer currencyId, String currencyType) {
		super();
		this.currencyId = currencyId;
		this.currencyType = currencyType;
	}

	public Integer getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(Integer currencyId) {
		this.currencyId = currencyId;
	}

	public String getCurrencyType() {
		return currencyType;
	}

	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}

	@Override
	public String toString() {
		return String.format("Currency[currencyId=%d,currencyType=%s]", currencyId, currencyType);
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof User) && (currencyId != null) ? currencyId.equals(obj) : (obj == this);
	}

	@Override
	public int hashCode() {
		return (currencyId != null) ? (this.getClass().hashCode() + currencyId.hashCode()) : super.hashCode();
	}

}
