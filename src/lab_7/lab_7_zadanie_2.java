package lab_7;

public class lab_7_zadanie_2 {
    public static void main(String[] args) {

        Fclass2 fclass2 = new lab_7_zadanie_2().new Fclass2();

        // Получаем доступ к закрытым переменным Fclass1 через класс Fclass2
        System.out.println(fclass2.getLabTask());
        System.out.println(fclass2.getLabNumber());

    }

    public class Fclass1 {
        private int labNumber = 7;
        private String labTask = "Создайте методы в fclass2 для доступа к закрытым переменным класса fclass1.";

        public void main(String[] args) {

        }

        public int getLabNumber () {
            // Определяем публичные метод для доступа к приватной переменной
            return labNumber;
        }

        public String getLabTask () {
            // Определяем публичные метод для доступа к приватной переменной
            return labTask;
        }
    }

    public class Fclass2 extends Fclass1 {

    }
}
