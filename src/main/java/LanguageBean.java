public class LanguageBean {

    @LocalizedString(key = "hello")
    private String greetings;

    @LocalizedString(key = "enjoy")
    private String dinnerWelcoming;

    @LocalizedString(key = "cheers")
    private String toastProposal;

    private void init(){
        System.out.println("LanguageBean is initializing..........");
    }

    public String getGreetings() {
        return greetings;
    }

    public String getDinnerWelcoming() {
        return dinnerWelcoming;
    }

    public String getToastProposal() {
        return toastProposal;
    }
}
