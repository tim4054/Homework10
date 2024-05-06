public class Main {
    public static void main(String[] args) {
        System.out.println("task1");
        String firstName = "Ivan";
        firstName = firstName + " ";
        String middleName = "Ivanovich";
        middleName = middleName + " ";
        String lastName = "Ivanov";
        lastName = lastName + " ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        System.out.println("task2");
        System.out.println(fullName.toUpperCase());

        System.out.println("task3");
        fullName = "Иванов Семён Семёнович";
        String fullNameTrue = fullName.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — " + fullNameTrue);


    }
}