package ex6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

final class PersonUtils {

    private static final int ADULT_AGE = 18;

    private PersonUtils() {}

    public static List<Person> filterAdultPersons(List<Person> personList) {
//        List<Person> result = new ArrayList<Person>();
//        for (Person person : personList) {
//            if (person.getAge() >= ADULT_AGE) {
//                result.add(person);
//            }
//        }
//        return result;

        return personList.stream()
                .filter(person -> person.getAge() >= ADULT_AGE)
                .collect(Collectors.toList());
    }

    public static List<String> convertToNames(List<Person> personList) {
        return personList.stream()
                .map(person -> person.getName().toUpperCase())
                .collect(Collectors.toList());
    }
}
