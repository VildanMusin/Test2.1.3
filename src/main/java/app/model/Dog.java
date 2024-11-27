package app.model;

import org.springframework.stereotype.Component;

@Component("dog")
public class Dog extends Animal{
    public static void speak(){
        System.out.println("Im a dog");
    }

    @Override
    public String toString() {
        return "Dog";
    }
}
