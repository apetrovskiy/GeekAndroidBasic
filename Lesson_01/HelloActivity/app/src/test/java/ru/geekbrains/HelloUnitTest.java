package ru.geekbrains;

import org.junit.Test;

import ru.geekbrains.helloactivity.BuilderGreetingPhrase;
import ru.geekbrains.helloactivity.GreetingStrings;

import static org.junit.Assert.assertEquals;

public class HelloUnitTest {
    @Test
    public void BuilderGreetingPhrase_Morning_Test() throws Exception {
        BuilderGreetingPhrase builderGreetingPhrase = getBuilderGreetingPhrase(6);
        assertEquals("Good morning GeekBrains!", builderGreetingPhrase.get());
    }

    @Test
    public void BuilderGreetingPhrase_Afternoon_Test() throws Exception {
        BuilderGreetingPhrase builderGreetingPhrase = getBuilderGreetingPhrase(13);
        assertEquals("Good afternoon GeekBrains!", builderGreetingPhrase.get());
    }

    @Test
    public void BuilderGreetingPhrase_Evening_Test() throws Exception {
        BuilderGreetingPhrase builderGreetingPhrase = getBuilderGreetingPhrase(7);
        assertEquals("Good evening GeekBrains!", builderGreetingPhrase.get());
    }

    @Test
    public void BuilderGreetingPhrase_Night_Test() throws Exception {
        BuilderGreetingPhrase builderGreetingPhrase = getBuilderGreetingPhrase(1);
        assertEquals("Good night GeekBrains!", builderGreetingPhrase.get());
    }

    private BuilderGreetingPhrase getBuilderGreetingPhrase(int currentHour) {
        return new BuilderGreetingPhrase(new GreetingStrings() {
            @Override
            public String getHelloer() {
                return "GeekBrains";
            }

            @Override
            public String getMorning() {
                return "Good morning";
            }

            @Override
            public String getAfternoon() {
                return "Good afternoon";
            }

            @Override
            public String getEvening() {
                return "Good evening";
            }

            @Override
            public String getNight() {
                return "Good night";
            }
        }, currentHour);
    }
}
