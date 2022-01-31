package jobayed.SpringCorePracticeFive.Animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Parrot implements Speakable{
    private String id ;
    private String speech;

    @Autowired
    public void setId(@Value("#{randomSpeech.getSpeech()?.length()}") String id) {
        this.id = id;
    }

    @Autowired
    public void setSpeech(@Value("#{new java.util.Date().toLocaleString()+' - '+randomSpeech.getSpeech()}") String speech) {
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
