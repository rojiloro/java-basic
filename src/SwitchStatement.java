public class SwitchStatement {
    public static void main(String[] args) {

        var nilai = "A";

        switch (nilai){
            case "A":
                System.out.println("Wow Anda Lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda Cukup Baik");
                break;
            case "D":
                System.out.println("Anda Tidak Lulus");
                break;
            default:
                System.out.println("Mungkin Anda salah Jurusan");
        }

        switch (nilai){
            case "A" -> System.out.println("Wow Anda Lulus dengan baik");
            case "B", "C" -> System.out.println("Nilai anda cukup baik");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default -> {
                System.out.println("Mungkin Anda salah jurusan");
            }
        }

        String ucapan;
        switch (nilai){
            case "A" -> ucapan =  "Wow Anda Lulus dengan baik";
            case "B", "C" -> ucapan = "Nilai anda cukup baik";
            case "D" -> ucapan =  "Anda Tidak Lulus";
            default -> {
                ucapan = "Mungkin Anda salah jurusan";
            }
        }

        System.out.println(ucapan);

        ucapan = switch (nilai){
            case "A" :
                yield  "Wow Anda Lulus dengan baik";
            case "B", "C":
               yield  "Nilai anda cukup baik";
            case "D":
               yield  "Anda Tidak Lulus";
            default :
               yield  "Mungkin Anda salah jurusan";
        };

        System.out.println(ucapan);

    }
}
