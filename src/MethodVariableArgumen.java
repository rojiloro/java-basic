public class MethodVariableArgumen {
    public static void main(String[] args) {

        int[] values = {80,20,70,90,70};
        sayCongrats("Oji", values);

        sayCongrats("Budi", 80,80,70,80);
    }

    static void sayCongrats(String name, int... values){
        var total = 0;
        for(var value : values){
            total += value;
        }

        var finalValue = total / values.length;

        if(finalValue >= 75){
            System.out.println("Selamat " + name + ", Anda Lulus dengan nilai rata-rata " + finalValue);
        }else {
            System.out.println("Maaf " + name + " Anda Tidak Lulus dengan nilai rata-rata " + finalValue);
        }
    }
}
