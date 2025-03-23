import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MemberSearch {
    public static List<Member> findMembersByCriterion(List<Member> members, Predicate<Member> criterion){
        return members.stream()
                .filter(criterion)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        // Sample members
        List<Member> members = Arrays.asList(
                new Member("Alice", 30),
                new Member("Bob", 40),
                new Member("Charlie", 25),
                new Member("David", 35)
        );

        // Define a criterion: Find members older than 30
        Predicate<Member> ageAbove30 = member -> member.getAge() > 30;

        // Use the method to filter members
        List<Member> filteredMembers = findMembersByCriterion(members, ageAbove30);

        // Print the filtered members
        filteredMembers.forEach(System.out::println);
    }
}