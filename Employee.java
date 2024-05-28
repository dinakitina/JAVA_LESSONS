public class Employee {
    private String fio;
    private String position;
    private String email;
    private long phoneNumber;
    private String salary;
    private int age;
        public static void main (String[] args){
            Employee worker1 = new Employee();
            worker1.fio = "Муромец Илья Батькович";
            worker1.position = "Богатырь";
            worker1.email = "beresta33@mail.ru";
            worker1.phoneNumber = 123456789L;
            worker1.salary = "Хлеб, соль, брага";
            worker1.age = 33;
            System.out.println("Сотрудник 1: " + worker1.fio + " на позиции: "
            + worker1.position + " электронная почта: " + worker1.email + 
            " звонить по номеру: " + worker1.phoneNumber + " в качестве оплаты принимает: "
            + worker1.salary + " годин: " + worker1.age);
        }
}