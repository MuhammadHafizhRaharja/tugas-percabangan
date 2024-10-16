import java.util.Scanner;

public class TugasPercabangan{
    public static void main(String[] args){
        int lamaKerja, jumlahJamKerja;
        double totalGaji;
        double tarifLemburPerJam = 50000;
        int jamRegulerPerMinggu = 40;
        int jamLembur = 0;
        
        Scanner scanner = new Scanner(System.in);
        lamaKerja       = scanner.nextInt();
        jumlahJamKerja  = scanner.nextInt();

        if(lamaKerja < 5 && lamaKerja >= 0) {
            totalGaji = 5000000;
        } else if (lamaKerja <= 10 && lamaKerja >= 5) {
            totalGaji = 5000000 + (5000000 * 5.0/100);
        } else if (lamaKerja > 10) {
            totalGaji = 5000000 + (5000000 * 10.0/100);
        } else {
            System.out.println("Input lama kerja dengan benar!");
            return;
        }

        if (jumlahJamKerja > jamRegulerPerMinggu) {
            jamLembur = jumlahJamKerja - jamRegulerPerMinggu;
        } else if (jumlahJamKerja < 40) {
            System.out.println("Kerja lebih keras!");
            return;
        }
        
        // Menghitung uang lembur
        double uangLembur = jamLembur * tarifLemburPerJam;
        
        // Menghitung total gaji
        totalGaji = totalGaji + uangLembur;

        
        System.out.println(totalGaji);
    }
}
