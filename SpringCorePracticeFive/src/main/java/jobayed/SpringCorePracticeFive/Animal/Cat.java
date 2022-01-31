package jobayed.SpringCorePracticeFive.Animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cat implements Speakable{

    private int id = 1;
    private String speech = "Not interested to speak";

    @Autowired
    public void setId(@Value("1234") int id) {
        this.id = id;
    }

    @Autowired
    public void setSpeech(@Value("Meawww...") String speech) {
        this.speech = speech;
    }

    @Override
    public void speak(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", speech='" + speech + '\'' +
                '}';
    }
}
