package seedu.address.model.util;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import seedu.address.model.AddressBook;
import seedu.address.model.ReadOnlyAddressBook;
import seedu.address.model.person.*;
import seedu.address.model.tag.SessionTag;
import seedu.address.model.tag.Tag;

/**
 * Contains utility methods for populating {@code AddressBook} with sample data.
 */
public class SampleDataUtil {
    public static Person[] getSamplePersons() {
        return new Person[] {
                new Person(new Name("Alex Yeoh"), new StudyYear("PRI1"),
                        new Phone("87438807"), new Email("alexyeoh@example.com"),
                        new Address("Blk 30 Geylang Street 29, #06-40"),
                        getTagSetFromTags(new Tag("MATH"))),

                new Person(new Name("Bernice Yu"), new StudyYear("PRI6"),
                        new Phone("99272758"), new Email("berniceyu@example.com"),
                        new Address("Blk 30 Lorong 3 Serangoon Gardens, #07-18"),
                        getTagSetFromTags(
                                new Tag("ENG"),
                                new Tag("SCI"),
                                new SessionTag("TUE 1400 1530", new Session("TUE", "1400", "1530")),
                                new SessionTag("THU 1600 1730", new Session("THU", "1600", "1730"))
                        )),

                new Person(new Name("Charlotte Oliveiro"), new StudyYear("SEC5"),
                        new Phone("93210283"), new Email("charlotte@example.com"),
                        new Address("Blk 11 Ang Mo Kio Street 74, #11-04"),
                        getTagSetFromTags(
                                new Tag("PHY"),
                                new Tag("CHEM"),
                                new SessionTag("WED 0900 1030", new Session("WED", "0900", "1030")),
                                new SessionTag("FRI 1000 1130", new Session("FRI", "1000", "1130"))
                        )),

                new Person(new Name("David Li"), new StudyYear("JC2"),
                        new Phone("91031282"), new Email("lidavid@example.com"),
                        new Address("Blk 436 Serangoon Gardens Street 26, #16-43"),
                        getTagSetFromTags(
                                new Tag("MATH"),
                                new Tag("PHY"),
                                new SessionTag("MON 1400 1530", new Session("MON", "1400", "1530")),
                                new SessionTag("WED 1400 1530", new Session("WED", "1400", "1530"))
                        )),

                new Person(new Name("Irfan Ibrahim"), new StudyYear("POLY3"),
                        new Phone("92492021"), new Email("irfan@example.com"),
                        new Address("Blk 47 Tampines Street 20, #17-35"),
                        getTagSetFromTags(
                                new Tag("BIO"),
                                new Tag("CHEM"),
                                new SessionTag("TUE 1000 1130", new Session("TUE", "1000", "1130")),
                                new SessionTag("THU 1400 1530", new Session("THU", "1400", "1530"))
                        )),

                new Person(new Name("Roy Balakrishnan"), new StudyYear("UNI5"),
                        new Phone("92624417"), new Email("royb@example.com"),
                        new Address("Blk 45 Aljunied Street 85, #11-31"),
                        getTagSetFromTags(
                                new Tag("COMSCI"),
                                new SessionTag("SAT 0900 1100", new Session("SAT", "0900", "1100"))
                        ))
        };
    }

    public static ReadOnlyAddressBook getSampleAddressBook() {
        AddressBook sampleAb = new AddressBook();
        for (Person samplePerson : getSamplePersons()) {
            sampleAb.addPerson(samplePerson);
        }
        return sampleAb;
    }

    /**
     * Returns a tag set containing the list of strings given.
     */
    public static Set<Tag> getTagSet(String... Strings) {
        return Arrays.stream(Strings)
                .map(Tag::new)
                .collect(Collectors.toSet());
    }

    /**
     * Returns a tag set containing the list of tags given.
     */
    private static Set<Tag> getTagSetFromTags(Tag... Tags) {
        return Arrays.stream(Tags)
                .collect(Collectors.toSet());
    }

}
