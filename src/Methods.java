//public class Methods {

//    public static void makeListOfEmployees(Employee[] arr) {
//        for (Object s : arr) {
//            System.out.println(s);
//        }
//    }

//    public static void showResult(String s) {
//        System.out.println(s);
//    }


//    public static String allSalaryPerMonth(Employee[] arr) {
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum = sum + arr[i].getSalary();
//        }
//        return "Общая сумма затрат на зарплаты в месяц: " + sum + " рублей.";
//    }

//    public static String minSalary(Employee[] arr) {
//        int min = arr[0].getSalary();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i].getSalary() < min) {
//                min = arr[i].getSalary();
//            }
//        }
//        String employeeWithMinSalary = null;
//        for (int j = 0; j < arr.length; j++) {
//            if (arr[j].getSalary() == min) {
//                employeeWithMinSalary = arr[j].getFullName();
//            }
//        }
//        return "Сотрудник с минимальной зарплатой: " + employeeWithMinSalary + ", " + min + " рублей.";
//    }

//    public static String maxSalary(Employee[] arr) {
//        int max = arr[0].getSalary();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i].getSalary() > max) {
//                max = arr[i].getSalary();
//            }
//        }
//        String employeeWithMaxSalary = null;
//        for (int j = 0; j < arr.length; j++) {
//            if (arr[j].getSalary() == max) {
//                employeeWithMaxSalary = arr[j].getFullName();
//            }
//        }
//        return "Сотрудник с максимальной зарплатой: " + employeeWithMaxSalary + ", " + max + " рублей.";
//    }

//    public static String averageSalary(Employee[] arr) {
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum = (sum + arr[i].getSalary());
//        }
//        int avarageSum = sum / arr.length;
//        return "Средняя зарплата сотрудников в месяц: " + avarageSum + " рублей.";
//    }

//    public static String printAllListOfEmployee(Employee[] arr) {
//        StringBuilder employee = new StringBuilder();
//        for (int i = 0; i < arr.length; i++) {
//            employee.append(arr[i].getFullName()).append("\n");
//        }
//        String stringEmployee = employee.toString();
//        return "Список сотрудников:\n" + stringEmployee;
//    }

//    public static void raiseSalary(Employee[] arr, int percent) {
//        float index = 1 + (float) percent / 100;
//        int newSalary = 0;
//        for (int i = 0; i < arr.length; i++) {
//            newSalary = (int) ((float) arr[i].getSalary() * index);
//            System.out.println("У сотрудника " + arr[i].getFullName() + ", зарплата стала: " + newSalary);
//        }
//    }

//    public static Employee[] peopleFromDepartment(Employee[] arr, int department) {
//        int index = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i].getDepartment() == department) {
//                index++;
//            }
//        }
//
//        Employee[] arr2 = new Employee[index];
//        int counter = 0;
//        for (int j = 0; j < arr.length; j++) {
//            if (arr[j].getDepartment() == department) {
//                arr2[counter] = arr[j];
//                counter++;
//            }
//        }
//        return arr2;
//    }


//    public static void minSalaryOnDepartment(Employee[] arr, int department) {
//        System.out.println(minSalary(peopleFromDepartment(arr, department)));
//    }

//    public static void maxSalaryOnDepartment(Employee[] arr, int department) {
//        System.out.println(maxSalary(peopleFromDepartment(arr, department)));
//    }

//    public static void allSalaryPerMonthOnDepartment(Employee[] arr, int department) {
//        System.out.println(allSalaryPerMonth(peopleFromDepartment(arr, department)));
//    }

//    public static void averageSalaryPerMonthOnDepartment(Employee[] arr, int department) {
//        System.out.println(averageSalary(peopleFromDepartment(arr, department)));
//    }


//    public static void raiseSalaryOnDepartment(Employee[] arr, int department, int percent) {
//        raiseSalary((peopleFromDepartment(arr, department)), percent);
//    }

//    public static String allListOfEmployeeOnDepartment(Employee[] arr) {
//        StringBuilder employee = new StringBuilder();
//        for (int i = 0; i < arr.length; i++) {
//            employee.append(arr[i].getId()).append(". ").append(arr[i].getFullName()).append(". Зарплата: ").append(arr[i].getSalary()).append("\n");
//        }
//        String stringEmployee = employee.toString();
//        return "Список сотрудников:\n" + stringEmployee;
//    }

//    public static String printAllListOfEmployeeOnDepartment(Employee[] arr, int department) {
//        return allListOfEmployeeOnDepartment(peopleFromDepartment(arr, department));
//    }

//    public static void printAllEmployeeWithSalaryLessGiven(Employee[] arr, int givenSalary) {
//        System.out.println("Список людей, у которых заплата меньше " + givenSalary + " рублей");
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i].getSalary() < givenSalary) {
//                System.out.println(arr[i].getId() + ". " + arr[i].getFullName() + ", зарплата: " + arr[i].getSalary() + " рублей.");
//            }
//        }
//    }

//    public static void printAllEmployeeWithSalaryMoreGiven(Employee[] arr, int givenSalary) {
//        System.out.println("Список людей, у которых заплата больше " + givenSalary + " рублей");
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i].getSalary() > givenSalary) {
//                System.out.println(arr[i].getId() + ". " + arr[i].getFullName() + ", зарплата: " + arr[i].getSalary() + " рублей.");
//            }
//        }
//    }
//}










