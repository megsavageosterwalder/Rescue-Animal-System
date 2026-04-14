public class Monkey extends RescueAnimal {
	private String species;
	private float tailLength;
	private float height;
	private float bodyLength;
	
	// Constructor that initializes all attributes
	public Monkey(String name, String species, String gender, int age, float weight,
			String acquisitionDate, String acquisitionCountry, String trainingStatus,
			boolean reserved, String inServiceCountry,
			float tailLength, float height, float bodyLength) {
		
		setName(name);
		this.species = species;
		setGender(gender);
		setAge(age);
		setWeight(weight);
		setAcquisitionDate(acquisitionDate);
		setAcquisitionLocation(acquisitionCountry);
		setTrainingStatus(trainingStatus);
		setReserved(reserved);
		setInServiceCountry(inServiceCountry);
		this.tailLength = tailLength;
		this.height = height;
		this.bodyLength = bodyLength;
	}
	
	// Accessors and mutators for monkey-specific attributes
	public String getSpecies() {
		return species;
	}
	
	public void setSpecies(String species) {
		this.species = species;
	}
	
	public float getTailLength() {
		return tailLength;
	}
	
	public void setTailLength(float tailLength) {
		this.tailLength = tailLength;
	}
	
	public float getHeight() {
		return height;
	}
	
	public void setHeight(float height) {
		this.height = height;
	}
	
	public float getBodyLength() {
		return bodyLength;
	}
	
	public void setBodyLength(float bodyLength) {
		this.bodyLength = bodyLength;
	}
	
	@Override
	public String toString() {
		return "Name: " + getName() +
				", Species: " + species +
				", Gender: " + getGender() +
				", Age: " + getAge() +
				", Weight: " + getWeight() +
				", Acquisition Date: " + getAcquisitionDate() +
				", Acquisition Country: " + getAcquisitionCountry() +
				", Training Status: " + getTrainingStatus() +
				", Reserved: " + getReserved() +
				", In Service Country: " + getInServiceCountry() +
				", Tail Length: " + tailLength +
				", Height: " + height +
				", Body Length: " + bodyLength;
	}
}

	
