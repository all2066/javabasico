public class DataTypes {
    public static void main(String[] args) {
        int n = 1234567890;
        long nL = 12345678900452L;

        double nD = 123.546465454;
        float nF = 12.545644F;

        var salary = 1000; //int
        //pension del 3%
        var pension = salary *.03; //double
        var totalSalary = salary - pension;
        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Anahi Salado";
        System.out.println("Employee: " + employeeName + "  Salary: "+ totalSalary);







    }
}
