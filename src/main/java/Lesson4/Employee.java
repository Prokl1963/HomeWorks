package Lesson4;

public class Employee {

         int id;
         String name;
         String position;
         String phone;
         int salary;
         int age;

         public Employee(int id, String name, String position, String phone, int salary, int age) {
                this.id = id;
                this.name = name;
                this.position = position;
                this.phone = phone;
                this.salary = salary;
                this.age = age;
        }


        void info () {
                System.out.println("Коллега под номером " + id + ", по фамилии "+ name + ", в должности " + position + " " + age + " лет от роду, с зарплатой " + salary + ". Звонить по тел. " + phone );
}
        void infoYacht () {
                System.out.println("Яхтсмен с номером " + id + ", по фамилии "+ name + ", судовая роль " + position + " " + age + " лет от роду, с зарплатой " + salary + ". Звонить по тел. " + phone );
        }
        int salaryPlus () {
               return (salary+10000);
        }






    /*

        public void info() {
            System.out.println("Id: " + id + "; Имя сотрудника: " + name + "; Должность: " + "; Телефон:" + phone + "; Зарплата:" + salary + "; Возраст:" + age);
        }

        public void changeSalary(String name, float salary) {
            this.name = name;
            this.salary = salary;
            System.out.println("У сотрудника " + name + " Новый оклад: " + salary);
        }
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.id = 1;
        employee1.name = "Ivanov";
        employee1.position = "team leader";
        employee1.phone = "222-3-22";
        employee1.salary = 3500;
        employee1.age = 37;
        info(employee1);


    }

     */

}
