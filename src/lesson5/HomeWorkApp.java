package lesson5;

public class HomeWorkApp {
    public static void main(String[] args) {

        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Angus Young", "Songwriter", "angus@young.com", "8800600500", 15000, 66);
        empArray[1] = new Employee("Phil Rudd", "Musician", "phil@rudd.com", "8800600400", 18500, 67);
        empArray[2] = new Employee("Miley Cyrus", "Singer", "miley@cyrus.com", "8800700200", 14000, 29);
        empArray[3] = new Employee("Cliff Williams", "Singer", "cliff@williams.com", "8800900100", 12500, 72);
        empArray[4] = new Employee("Stevie Young", "Guitarist", "stevie@young.com", "8800500700", 13000, 65);

        for (Employee employee : empArray) {
            if (employee.age > 40) {
                employee.printData();
            }
        }
    }
}
