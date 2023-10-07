package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    private Animal cat;
    private Animal dog;
    private Timer time;
    public AnimalsCage(@Qualifier("cat") Animal cat, @Qualifier("dog") Animal dog, Timer time){
        this.cat = cat;
        this.dog = dog;
        this.time = time;
    }
    public Long getTimer(){
        return time.getTime();
    }
    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(cat.toString() + "\t" + dog.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }

}
