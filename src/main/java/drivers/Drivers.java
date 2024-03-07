package drivers;

public enum Drivers {
	CHROME("chrome");

	private String value;

	Drivers(String string) {
		this.value = string;
	}

	public String getValue() {
		return value;
	}

}
