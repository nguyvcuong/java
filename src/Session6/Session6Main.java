package Session6;

import Session6.American;
import Session6.Asian;
import Session6.Human;

public class Session6Main {
    public static void main(String[]args){
        // Human = new Human ();ko the tao dc doi tuong tu lop truu tuong
        Asian a = new Asian();
        American an = new American();
        Human h = new Human() { //anonynous class ko ten
            @Override
            public void eat() {

            }

            @Override
            public void sleep() {

            }
        };

    }
}