package lab_7;

public class lab_7_zadanie_1 {
    public static void main(String[] args) {

    }

    public class fclass1 {
        // Родительский класс fclass 1
        public void main(String[] args) {

        }
    }

    class fclass3 extends fclass1 {
        // создаем класс fclass3, наследуемый от класса fclass1
    }

    class fclass2 extends fclass3 {
        //Создаем класс fclass2,наследуемый от класса fclass3
    }
}
