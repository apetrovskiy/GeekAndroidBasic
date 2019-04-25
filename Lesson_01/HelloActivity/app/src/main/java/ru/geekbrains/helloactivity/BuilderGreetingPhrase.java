package ru.geekbrains.helloactivity;

public class BuilderGreetingPhrase {
    private int currentHour;
    private GreetingStrings greetingPhrases;

    public BuilderGreetingPhrase(GreetingStrings greetingPhrases, int currentHour) {
        this.currentHour = currentHour;
        this.greetingPhrases = greetingPhrases;
    }

    public String get() {
        String helloer = greetingPhrases.getHelloer();
        if (5 <= currentHour && currentHour < 12){
            return String.format("%s %s!", greetingPhrases.getMorning(), helloer);
        }
        else if (12 <= currentHour && currentHour < 6) {
            return String.format("%s %s!", greetingPhrases.getAfternoon(), helloer);
        }
        else if (6 <= currentHour && currentHour < 9) {
            return String.format("%s %s!", greetingPhrases.getEvening(), helloer);
        }
        else {
            return String.format("%s %s!", greetingPhrases.getNight(), helloer);
        }
    }
}
