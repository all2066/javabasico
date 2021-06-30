public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;
        //bono de 200pesos
        salary = salary +200;
        System.out.println(salary);

        //pension de 50 de descuento
        salary = salary-50;
        System.out.println(salary);
        // 2 horas extra 30 c/u
        // comida 45 pesos
        salary = salary + (30*2) - 45;
        System.out.println(salary);

        //actualizando cadenas de texto
        String employeeName = "Anahi Salado";
        employeeName = employeeName + " Diaz de la Vega";
        System.out.println(employeeName);
        employeeName = "Irene " + employeeName;
        System.out.println("Tu nombre es: " + employeeName);



    }
}
