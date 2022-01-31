package jobayed.SpringCorePracticeFive;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomSpeech {
    final String[] texts = new String[]{
            "Good Morning",
            "Thank you",
            "Kola khabo",
            null
    };

    public String getSpeech(){
        Random random = new Random();

        return texts[random.nextInt(texts.length)];
    }
}
