package handout_file_pracktick;

public class Movies {
    private String name;
    private int year;
    private String[] genres;
    private String type;
    private int[] length;
    private double budget;
    private Director director;
    private Cast[] cast;

    public Movies(String name, int year, String[] genres, String type, int[] length, double budget, Director director, Cast[] cast) {
        this.name = name;
        this.year = year;
        this.genres = genres;
        this.type = type;
        this.length = length;
        this.budget = budget;
        this.director = director;
        this.cast = cast;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String[] getGentes() {
        return genres;
    }

    public void setGentes(String[] gentes) {
        this.genres = gentes;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int[] getLength() {
        return length;
    }

    public void setLength(int[] length) {
        this.length = length;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

}
