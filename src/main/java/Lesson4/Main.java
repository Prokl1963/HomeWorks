package Lesson4;

public class Main {
    public static void main(String[] args) {
        Employee coll1 = new Employee(1, "Иванов", "Начальник отдела", "223 322", 150000, 35);
        Employee coll2 = new Employee(2, "Петров", "заместитель начальника отдела", "223 324", 140000, 32);
        Employee coll3 = new Employee(3, "Sidorov", "TeamLead", "223 325", 110000, 35);
        Employee coll4 = new Employee(4, "Jonson", "coffeeBoy", "no phone, just call", 25000, 20);
        Employee coll5 = new Employee(5, "тётя Глаша", "уборщица", "no phone, just call", 30000, 55);

//        coll1.id = 1;
//        coll1.name = "Иванов";
//        coll1.position = "начальник отдела";
//        coll1.phone = "223-322";
//        coll1.salary = 170000;
//        coll1.age = 35;

//        System.out.println("прямо из мэйна Коллега под номером " + coll1.id + " по фамилии "+ coll1.name + " в должности " + coll1.position + " " + coll1.age + " лет от роду с зарплатой " + coll1.salary + " звонить по тел. " + coll1.phone );

        coll1.info();
        coll2.info();
        coll3.info();
        coll4.info();
        coll5.info();

        System.out.println();
        System.out.println("А теперь через массив");
        System.out.println();

        Employee[] nextGroupArray = new Employee[5];
        nextGroupArray[0] = new Employee(11, "Koltsov", "Capitan", "892312312", 130000, 30);
        nextGroupArray[1] = new Employee(12, "Ivantsov", "Mate", "892312312", 90000, 31);
        nextGroupArray[2] = new Employee(13, "Suprunov", "steersman", "892312313", 80000, 52);
        nextGroupArray[3] = new Employee(14, "Smirnov", "Crew", "892312314", 66000, 43);
        nextGroupArray[4] = new Employee(15, "Sidorov", "Crew", "892312315", 45000, 38);

        nextGroupArray[3].info();

        System.out.println();
        System.out.println("А теперь в цикле");
        System.out.println("список всех яхтсменов:");
        for (int i = 0; i < 5; i++) {

            nextGroupArray[i].infoYacht();

        }
        System.out.println();
        System.out.println("Яхтсмены старше 40");

        for (int i = 0; i < 5; i++) {
            if (nextGroupArray[i].age > 40) {
                System.out.println("Яхтсмен под номером " + (i + 1) + " " + nextGroupArray[i].name + " его возраст: " + nextGroupArray[i].age);
            }

        }
 /*       for (int i = 0; i < 5; i++) {
            if (nextGroupArray[i].age > 35) {
                nextGroupArray[i].infoYacht();
                nextGroupArray[i].salaryPlus();
                nextGroupArray[i].infoYacht();
                System.out.println("Яхтсмен под номером " + (i + 1) + " " + nextGroupArray[i].name + " его судовая роль: " + nextGroupArray[i].position);
            }

        } */

    }


}

