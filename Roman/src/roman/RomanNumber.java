package roman;

import javax.annotation.Generated;

public class RomanNumber implements Comparable<RomanNumber> {

	public static final RomanNumber ONE = new RomanNumber("I", 1);
	public static final RomanNumber FOUR = new RomanNumber("IV", 4);
	public static final RomanNumber FIVE = new RomanNumber("V", 5);
	public static final RomanNumber NINE = new RomanNumber("IX", 9);
	public static final RomanNumber TEN = new RomanNumber("X", 10);
	public static final RomanNumber FORTY = new RomanNumber("XL", 40);
	public static final RomanNumber FIFTY = new RomanNumber("L", 50);
	public static final RomanNumber NINETY = new RomanNumber("XC", 90);
	public static final RomanNumber HUNDRED = new RomanNumber("C", 100);
	public static final RomanNumber FOUR_HUNDRED = new RomanNumber("CD", 400);
	public static final RomanNumber FIVE_HUNDRED = new RomanNumber("D", 500);
	public static final RomanNumber NINE_HUNDRED = new RomanNumber("CM", 900);
	public static final RomanNumber ONE_THOUSAND = new RomanNumber("M", 1000);

	private String roman;
	private Integer decimal;

	public RomanNumber() {
		// TODO Auto-generated constructor stub
	}

	public RomanNumber(String romanNotation, Integer integerNotation) {
		super();
		this.roman = romanNotation;
		this.decimal = integerNotation;
	}

	public String getRoman() {
		return roman;
	}

	public Integer getDecimal() {
		return decimal;
	}

	@Override
	@Generated(value = "Eclipse Generated")
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((decimal == null) ? 0 : decimal.hashCode());
		result = prime * result + ((roman == null) ? 0 : roman.hashCode());
		return result;
	}

	@Override
	@Generated(value = "Eclipse Generated")
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RomanNumber other = (RomanNumber) obj;
		if (decimal == null) {
			if (other.decimal != null)
				return false;
		} else if (!decimal.equals(other.decimal))
			return false;
		if (roman == null) {
			if (other.roman != null)
				return false;
		} else if (!roman.equals(other.roman))
			return false;
		return true;
	}

	@Override
	public int compareTo(RomanNumber o) {
		return this.decimal.compareTo(o.decimal);
	}
}
