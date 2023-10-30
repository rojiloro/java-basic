public class TipeDataArray {
    public static void main(String[] args) {

        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Oji";
        stringArray[1] = "thewel";
        stringArray[2] = "unyu";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        stringArray[0] = "Budi";
        System.out.println(stringArray[0]);

        String[] stringArray2 = new String[3];

        String[] namaNama = {
                "oji", "Keren", "banget"
        };

        namaNama[0] = null;

        System.out.println(namaNama[0]);

        int[] arrayInt = new int[]{
                1,2,4,5,6,3
        };

        long[] arrayLong = {
          10L,20L,30L
        };

        arrayLong[0] = 0;

        System.out.println(arrayLong.length);

        String[][] members = {
                {"Budi", "Arga"},
                {"Eko", "Nugraja"},
                {"joko"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
    }
}
