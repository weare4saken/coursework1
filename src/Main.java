public class Main {

    private static final Employee[] employees = new Employee [10];

    public static void makeListOfEmployees(Employee[] arr) {
        for (Object s : arr) {
            System.out.println(s);
        }
    }

        public static void showResult(String s) {
        System.out.println(s);
    }

    public static String allSalaryPerMonth(Employee[] arr) {
        int sum = 0;
        for (Employee employee : arr) {
            sum = sum + employee.getSalary();
        }
        return "Общая сумма затрат на зарплаты в месяц: " + sum + " рублей.";
    }

    public static String minSalary(Employee[] arr) {
        int min = arr[0].getSalary();
        for (Employee employee : arr) {
            if (employee.getSalary() < min) {
                min = employee.getSalary();
            }
        }
        String employeeWithMinSalary = null;
        for (Employee employee : arr) {
            if (employee.getSalary() == min) {
                employeeWithMinSalary = employee.getFullName();
            }
        }
        return "Сотрудник с минимальной зарплатой: " + employeeWithMinSalary + ", " + min + " рублей.";
    }

    public static String maxSalary(Employee[] arr) {
        int max = arr[0].getSalary();
        for (Employee employee : arr) {
            if (employee.getSalary() > max) {
                max = employee.getSalary();
            }
        }
        String employeeWithMaxSalary = null;
        for (Employee employee : arr) {
            if (employee.getSalary() == max) {
                employeeWithMaxSalary = employee.getFullName();
            }
        }
        return "Сотрудник с максимальной зарплатой: " + employeeWithMaxSalary + ", " + max + " рублей.";
    }

    public static String averageSalary(Employee[] arr) {
        int sum = 0;
        for (Employee employee : arr) {
            sum = (sum + employee.getSalary());
        }
        int avarageSum = sum / arr.length;
        return "Средняя зарплата сотрудников в месяц: " + avarageSum + " рублей.";
    }

    public static String printAllListOfEmployee(Employee[] arr) {
        StringBuilder employee = new StringBuilder();
        for (Employee value : arr) {
            employee.append(value.getFullName()).append("\n");
        }
        String stringEmployee = employee.toString();
        return "Список сотрудников:\n" + stringEmployee;
    }

    public static void raiseSalary(Employee[] arr, int percent) {
        float index = 1 + (float) percent / 100;
        for (Employee employee : arr) {
            int newSalary = (int) ((float) employee.getSalary() * index);
            System.out.println("У сотрудника " + employee.getFullName() + ", зарплата стала: " + newSalary);
        }
    }

    public static Employee[] peopleFromDepartment(Employee[] arr, int department) {
        int index = 0;
        for (Employee employee : arr) {
            if (employee.getDepartment() == department) {
                index++;
            }
        }

        Employee[] arr2 = new Employee[index];
        int counter = 0;
        for (Employee employee : arr) {
            if (employee.getDepartment() == department) {
                arr2[counter] = employee;
                counter++;
            }
        }
        return arr2;
    }

    public static void minSalaryOnDepartment(Employee[] arr, int department) {
        System.out.println(minSalary(peopleFromDepartment(arr, department)));
    }

    public static void maxSalaryOnDepartment(Employee[] arr, int department) {
        System.out.println(maxSalary(peopleFromDepartment(arr, department)));
    }

    public static void allSalaryPerMonthOnDepartment(Employee[] arr, int department) {
        System.out.println(allSalaryPerMonth(peopleFromDepartment(arr, department)));
    }

    public static void averageSalaryPerMonthOnDepartment(Employee[] arr, int department) {
        System.out.println(averageSalary(peopleFromDepartment(arr, department)));
    }


    public static void raiseSalaryOnDepartment(Employee[] arr, int department, int percent) {
        raiseSalary((peopleFromDepartment(arr, department)), percent);
    }

    public static String allListOfEmployeeOnDepartment(Employee[] arr) {
        StringBuilder employee = new StringBuilder();
        for (Employee value : arr) {
            employee.append(value.getId()).append(". ").append(value.getFullName()).append(". Зарплата: ").append(value.getSalary()).append("\n");
        }
        String stringEmployee = employee.toString();
        return "Список сотрудников:\n" + stringEmployee;
    }

    public static String printAllListOfEmployeeOnDepartment(Employee[] arr, int department) {
        return allListOfEmployeeOnDepartment(peopleFromDepartment(arr, department));
    }

    public static void printAllEmployeeWithSalaryLessGiven(Employee[] arr, int givenSalary) {
        System.out.println("Список людей, у которых заплата меньше " + givenSalary + " рублей");
        for (Employee employee : arr) {
            if (employee.getSalary() < givenSalary) {
                System.out.println(employee.getId() + ". " + employee.getFullName() + ", зарплата: " + employee.getSalary() + " рублей.");
            }
        }
    }

    public static void printAllEmployeeWithSalaryMoreGiven(Employee[] arr, int givenSalary) {
        System.out.println("Список людей, у которых заплата больше " + givenSalary + " рублей");
        for (Employee employee : arr) {
            if (employee.getSalary() > givenSalary) {
                System.out.println(employee.getId() + ". " + employee.getFullName() + ", зарплата: " + employee.getSalary() + " рублей.");
            }
        }
    }



    public static void main(String[] args) {

        employees[0] = new Employee("Абаев Сергей Викторович", 3, 51_400);
        employees[1] = new Employee("Бортников Анатолий Степанович", 4, 64_859);
        employees[2] = new Employee("Волков Дмитрий Олегович", 1, 32_623);
        employees[3] = new Employee("Сироткин Дмитрий Иванович", 5, 41_623);
        employees[4] = new Employee("Мулов Геннадий Петрович", 3, 49_911);
        employees[5] = new Employee("Семенова Ирина Владимировна", 2, 60_158);
        employees[6] = new Employee("Давыдова Ксения Игоревна", 2, 29_174);
        employees[7] = new Employee("Шумко Игорь Ильич", 4, 38_004);
        employees[8] = new Employee("Туполев Григорий Викторович", 1, 54_117);
        employees[9] = new Employee("Федянин Марат Денисович", 5, 36_419);

        makeListOfEmployees(employees);                                                               //Базовая сложность 8a
        showResult(allSalaryPerMonth(employees));                                                     //Базовая сложность 8b
        showResult(minSalary(employees));                                                             //Базовая сложность 8c
        showResult(maxSalary(employees));                                                             //Базовая сложность 8d
        showResult(averageSalary(employees));                                                         //Базовая сложность 8e
        showResult(printAllListOfEmployee(employees));                                                //Базовая сложность 8f

        raiseSalary(employees, 5);                                                             //Повышенная сложность 1
        minSalaryOnDepartment(employees, 3);                                                //Повышенная сложность 2a
        maxSalaryOnDepartment(employees, 4);                                                //Повышенная сложность 2b
        allSalaryPerMonthOnDepartment(employees, 2);                                        //Повышенная сложность 2с
        averageSalaryPerMonthOnDepartment(employees, 1);                                    //Повышенная сложность 2d
        raiseSalaryOnDepartment(employees,5,10);                                     //Повышенная сложность 2e
        showResult(printAllListOfEmployeeOnDepartment(employees, 3));                       //Повышенная сложность 2f
        printAllEmployeeWithSalaryLessGiven(employees, 30_000);                             //Повышенная сложность 3a
        printAllEmployeeWithSalaryMoreGiven(employees, 50_000);                             //Повышенная сложность 3b

    }
}