package Sort;
import Sort.Students;
import Sort.Application;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<Students> peoples = new ArrayList<Students>();

        Students people1 = new Students(3, "Ivan", "Ivanov", 23);
        Students people2 = new Students(8, "Petr", "Petrov", 42);
        Students people3 = new Students(30, "Vova", "Vladimirov", 51);
        Students people4 = new Students(42, "Olga", "Olegovna", 15);
        Students people5 = new Students(18, "Sergey", "Smirnov", 33);
        Students people6 = new Students(10, "Evgeniy", "Sidorov", 20);
        Students people7 = new Students(22, "Denis", "Petrenko", 19);
        Students people8 = new Students(39, "Anna", "Sergeeva", 60);
        Students people9 = new Students(5, "Roman", "Romanov", 24);
        Students people10 = new Students(1, "Oleg", "Maximov", 39);

        peoples.add(people1);
        peoples.add(people2);
        peoples.add(people3);
        peoples.add(people4);
        peoples.add(people5);
        peoples.add(people6);
        peoples.add(people7);
        peoples.add(people8);
        peoples.add(people9);
        peoples.add(people10);

        Application function = new Application();
        function.SortById(peoples);



        for(Students people : peoples){
            System.out.println(people);

        }

        System.out.println("Средний возраст студентов: " +  function.averageAge(peoples));


    }
}
