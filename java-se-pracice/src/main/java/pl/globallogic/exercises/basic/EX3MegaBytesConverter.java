package pl.globallogic.exercises.basic;


public class EX3MegaBytesConverter {

    public static void main(String[] args) {
        printMegabytesAndKiloBytes(2000);
        printMegabytesAndKiloBytes(-1024);
        printMegabytesAndKiloBytes(5000);
    }

    public static void printMegabytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0){
            System.out.println("InvalidValue");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + "KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }
    }
}
