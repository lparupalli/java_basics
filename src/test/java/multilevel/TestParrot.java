package multilevel;

import com.lalitha.multilevel.Parrot;
import com.lalitha.multilevel.Animal;

public class TestParrot {
    public static void main(String[] args){
        Parrot p = new Parrot("Parrot1",'F', " white ", true);
        //Animal a  = new Animal("Dog",'M', "Brown");
        System.out.println("Name :"+ p.getName());
        System.out.println("gender: " +p.getGender());
        System.out.println("color:" + p.getColor());
        System.out.println("canFly :" +p.isCanFly());
        p.createSound();
    }

}
