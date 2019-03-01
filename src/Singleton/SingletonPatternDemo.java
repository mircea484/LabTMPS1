package Singleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {

        //constructor ilegal
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Obtinem singurul obiect disponibil
        SingleObject object = SingleObject.getInstance();
        SingleObject object1 = SingleObject.getInstance();

        //Afisam mesjul
        object.showMessage();
    }
}
