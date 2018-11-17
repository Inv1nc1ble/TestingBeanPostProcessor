import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class LanguageBean {

    User user;

    @LocalizedString(key = "greetings")
    private String greetings;

    @LocalizedString(key = "dinnerWelcoming")
    private String dinnerWelcoming;

    @LocalizedString(key = "toastProposal")
    private String toastProposal;



    private void init(){
        System.out.println("LanguageBean is initializing..........");
        System.out.println("Dinner Welcoming in Germany = " + dinnerWelcoming);
        System.out.println("That's how we say Hello in Germany - " + greetings);

    }



}
