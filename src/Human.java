public class Human {
    private int yearOfBirth;
    String name;
    private String town;
    String jobTitle;

    Human(int yearOfBirth, String name, String town, String jobTitle) {
        setYearOfBirth(yearOfBirth);
        this.name = (name == null || name.isBlank()) ? "Информация не указана" : name;
        setTown(town);
        this.jobTitle = (jobTitle == null || jobTitle.isBlank()) ? "Информация не указана" : jobTitle;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name +
                ". Я из города " + town +
                ". Я родился в " + yearOfBirth + " году" +
                ". Я работаю на должности " + jobTitle +
                ". Будем знакомы!";
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = Math.max(yearOfBirth, 0);
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = (town == null || town.isBlank()) ? "Информация не указана" : town;
    }
}
