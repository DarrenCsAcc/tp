package seedu.trackascholar.testutil;

import static seedu.trackascholar.logic.commands.CommandTestUtil.VALID_APPLICATION_STATUS_AMY;
import static seedu.trackascholar.logic.commands.CommandTestUtil.VALID_APPLICATION_STATUS_BOB;
import static seedu.trackascholar.logic.commands.CommandTestUtil.VALID_EMAIL_AMY;
import static seedu.trackascholar.logic.commands.CommandTestUtil.VALID_EMAIL_BOB;
import static seedu.trackascholar.logic.commands.CommandTestUtil.VALID_NAME_AMY;
import static seedu.trackascholar.logic.commands.CommandTestUtil.VALID_NAME_BOB;
import static seedu.trackascholar.logic.commands.CommandTestUtil.VALID_PHONE_AMY;
import static seedu.trackascholar.logic.commands.CommandTestUtil.VALID_PHONE_BOB;
import static seedu.trackascholar.logic.commands.CommandTestUtil.VALID_SCHOLARSHIP_AMY;
import static seedu.trackascholar.logic.commands.CommandTestUtil.VALID_SCHOLARSHIP_BOB;
import static seedu.trackascholar.logic.commands.CommandTestUtil.VALID_TAG_FRIEND;
import static seedu.trackascholar.logic.commands.CommandTestUtil.VALID_TAG_HUSBAND;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.trackascholar.model.TrackAScholar;
import seedu.trackascholar.model.applicant.Applicant;

/**
 * A utility class containing a list of {@code Applicant} objects to be used in tests.
 */
public class TypicalApplicants {

    public static final Applicant ALICE = new ApplicantBuilder().withName("Alice Pauline")
            .withPhone("94351253").withEmail("alice@example.com")
            .withScholarship("Global Merit").withApplicationStatus("pending")
            .withTags("friends").build();
    public static final Applicant BENSON = new ApplicantBuilder().withName("Benson Meier")
            .withPhone("98765432").withEmail("johnd@example.com")
            .withScholarship("Merit").withApplicationStatus("accepted")
            .withTags("owesMoney", "friends").build();
    public static final Applicant CARL = new ApplicantBuilder().withName("Carl Kurz")
            .withPhone("95352563").withEmail("heinz@example.com")
            .withScholarship("Sports").withApplicationStatus("pending").build();
    public static final Applicant DANIEL = new ApplicantBuilder().withName("Daniel Meier")
            .withPhone("87652533").withEmail("cornelia@example.com")
            .withScholarship("Arts").withApplicationStatus("rejected").withTags("friends").build();
    public static final Applicant ELLE = new ApplicantBuilder().withName("Elle Meyer")
            .withPhone("9482224").withEmail("werner@example.com")
            .withScholarship("Global Merit").withApplicationStatus("pending").build();
    public static final Applicant FIONA = new ApplicantBuilder().withName("Fiona Kunz")
            .withPhone("9482427").withEmail("lydia@example.com")
            .withScholarship("Global Merit").withApplicationStatus("pending").build();
    public static final Applicant GEORGE = new ApplicantBuilder().withName("George Best")
            .withPhone("9482442").withEmail("anna@example.com")
            .withScholarship("Global Merit").withApplicationStatus("accepted").build();

    // Manually added
    public static final Applicant HOON = new ApplicantBuilder().withName("Hoon Meier")
            .withPhone("8482424").withEmail("stefan@example.com")
            .withScholarship("Global Merit").withApplicationStatus("pending").build();
    public static final Applicant IDA = new ApplicantBuilder().withName("Ida Mueller")
            .withPhone("8482131").withEmail("hans@example.com")
            .withScholarship("Global Merit").withApplicationStatus("pending").build();

    // Manually added - Applicant's details found in {@code CommandTestUtil}
    public static final Applicant AMY = new ApplicantBuilder().withName(VALID_NAME_AMY).withPhone(VALID_PHONE_AMY)
            .withEmail(VALID_EMAIL_AMY).withScholarship(VALID_SCHOLARSHIP_AMY)
            .withApplicationStatus(VALID_APPLICATION_STATUS_AMY).withTags(VALID_TAG_FRIEND).build();
    public static final Applicant BOB = new ApplicantBuilder().withName(VALID_NAME_BOB).withPhone(VALID_PHONE_BOB)
            .withEmail(VALID_EMAIL_BOB).withScholarship(VALID_SCHOLARSHIP_BOB)
            .withApplicationStatus(VALID_APPLICATION_STATUS_BOB).withTags(VALID_TAG_HUSBAND, VALID_TAG_FRIEND)
            .build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalApplicants() {} // prevents instantiation

    /**
     * Returns an {@code TrackAScholar} with all the typical applicants.
     */
    public static TrackAScholar getTypicalTrackAScholar() {
        TrackAScholar trackAScholar = new TrackAScholar();
        for (Applicant applicant : getTypicalApplicants()) {
            trackAScholar.addApplicant(applicant);
        }
        return trackAScholar;
    }

    public static List<Applicant> getTypicalApplicants() {
        return new ArrayList<>(Arrays.asList(ALICE, BENSON, CARL, DANIEL, ELLE, FIONA, GEORGE));
    }
}
