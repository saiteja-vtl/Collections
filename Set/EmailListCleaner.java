package Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmailListCleaner {
    private List<String> emailList;
    private Set<String> uniqueEmails;

    public EmailListCleaner() {
        this.emailList = new ArrayList<>();
        this.uniqueEmails = new HashSet<>();
    }

    public void addEmails(List<String> emails) {
        emailList.addAll(emails);
    }

    public void removeDuplicates() {
        uniqueEmails.addAll(emailList);
    }

    public void displayUniqueEmails() {
        System.out.println("Unique email addresses:");
        for (String email : uniqueEmails) {
            System.out.println(email);
        }
    }

    public static void main(String[] args) {
        EmailListCleaner cleaner = new EmailListCleaner();

        List<String> emails = List.of(
                "example1@example.com",
                "example2@example.com",
                "example1@example.com",
                "example3@example.com",
                "example4@example.com"
        );


        cleaner.addEmails(emails);


        cleaner.removeDuplicates();


        cleaner.displayUniqueEmails();
    }
}

