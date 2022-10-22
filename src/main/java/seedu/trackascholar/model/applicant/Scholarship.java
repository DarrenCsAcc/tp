package seedu.trackascholar.model.applicant;

import static java.util.Objects.requireNonNull;
import static seedu.trackascholar.commons.util.AppUtil.checkArgument;

/**
 * Represents an Applicant's Scholarship name in TrackAScholar.
 * Guarantees: immutable; is valid as declared in {@link #isValidScholarship(String)}
 */
public class Scholarship implements Comparable<Scholarship> {

    public static final String MESSAGE_CONSTRAINTS = "Scholarship can take any values, and it should not be blank";

    /*
     * The first character of the trackascholar must not be a whitespace,
     * otherwise " " (a blank string) becomes a valid input.
     */
    public static final String VALIDATION_REGEX = "[^\\s].*";

    public final String scholarship;

    /**
     * Constructs an {@code Address}.
     *
     * @param scholarship A valid scholarship.
     */
    public Scholarship(String scholarship) {
        requireNonNull(scholarship);
        checkArgument(isValidScholarship(scholarship), MESSAGE_CONSTRAINTS);
        this.scholarship = scholarship;
    }

    /**
     * Returns true if a given string is a valid email.
     */
    public static boolean isValidScholarship(String test) {
        return test.matches(VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return scholarship;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Scholarship // instanceof handles nulls
                && scholarship.equals(((Scholarship) other).scholarship)); // state check
    }

    @Override
    public int hashCode() {
        return scholarship.hashCode();
    }

    @Override
    public int compareTo(Scholarship other) {
        return this.scholarship.compareTo(other.scholarship);
    }
}
