package TreeMap;

import java.util.Objects;

public class SubjectGrate {
    private final String subject;
    private final int grate;

    public SubjectGrate(String subject, int grate) {
        this.subject = subject;
        this.grate = grate;
    }

    public String getSubject() {
        return subject;
    }

    public int getGrate() {
        return grate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SubjectGrate that = (SubjectGrate) o;
        return grate == that.grate && Objects.equals(subject, that.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject, grate);
    }

    @Override
    public String toString() {
        return "Student: " + subject + " Grade: " + grate;
    }
}
