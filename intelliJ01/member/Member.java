package hello.core.member;

public class Member {
    private Long id;
    private String names;
    private Grade grade;

    public Member(Long id, String names, Grade grade) {
        this.id = id;
        this.names = names;
        this.grade = grade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return names;
    }

    public void setName(String names) {
        this.names = names;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
