package pairmatching.domain.crew;

public class Crew {

    private final Course course;
    private final String crewName;

    public Crew(Course course, String crewName) {
        this.course = course;
        this.crewName = crewName;
    }

    public Course getCourse() {
        return course;
    }

    public String getCrewName() {
        return crewName;
    }
}
