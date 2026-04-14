import java.lang.String;

public class RescueAnimal {

    // Instance variables
    private String name;
    private String animalType;
    private String gender;
    private int age;
    private float weight;
    private String acquisitionDate;
    private String acquisitionCountry;
	private String trainingStatus;
    private boolean reserved;
	private String inServiceCountry;


    // Constructor
    public RescueAnimal() {
    	this.name = "";
    	this.animalType = "";
    	this.gender = "";
    	this.age = 0;
    	this.weight = 0.0f;
    	this.acquisitionDate = "";
    	this.acquisitionCountry = "";
    	this.trainingStatus = "intake";
    	this.reserved = false;
    	this.inServiceCountry = "";
    }

    // Getters
	public String getName() {
		return name;
	}

	public String getAnimalType() {
		return animalType;
	}

	public String getGender() {
		return gender;
	}
	
	public int getAge() {
		return age;
	}

	public float getWeight() {
		return weight;
	}

	public String getAcquisitionDate() {
		return acquisitionDate;
	}

	public String getAcquisitionCountry() {
		return acquisitionCountry;
	}

	public boolean getReserved() {
		return reserved;
	}

	public String getInServiceCountry() {
		return inServiceCountry;
	}

	public String getTrainingStatus() {
		return trainingStatus;
	}

	// Setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public void setAcquisitionDate(String acquisitionDate) {
		this.acquisitionDate = acquisitionDate;
	}
	
	public void setAcquisitionLocation(String acquisitionCountry) {
		this.acquisitionCountry = acquisitionCountry;
	}
	
	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}
	
	public void setInServiceCountry(String inServiceCountry) {
		this.inServiceCountry = inServiceCountry;
	}
	
	public void setTrainingStatus(String trainingStatus) {
		this.trainingStatus = trainingStatus;
	}
}
