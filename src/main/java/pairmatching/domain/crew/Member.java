package pairmatching.domain.crew;

public class Member {

    private final Course course;
    private final String memberName;

    public Member(Course course, String memberName) {
        this.course = course;
        this.memberName = memberName;
    }

    public Course getCourse() {
        return course;
    }

    public String getMemberName() {
        return memberName;
    }
}
