public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        int fileSended = 3;


        if (isBluetoothEnabled){
            //Send File
            fileSended++;
            System.out.println("ArchivoEnviado");
        }
        else{
            fileSended--;
            System.out.println("Por favor enciende tu bluetooth");
        }

        System.out.println(isBluetoothEnabled);
        System.out.println(fileSended);
    }
}
