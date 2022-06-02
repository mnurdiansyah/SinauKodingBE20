public class TugasPertama {
    public static void main(String[] args){
//        int i = 3 ;
//        while (i <= 50){
//            if (i % 5 == 0){
//                System.out.println("n habis dibagi 5");
//                i++;
//            }else if (i % 3 == 0){
//                System.out.println("n habis dibagi 3");
//            }else {
//                System.out.println(i);
//            }

        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                System.out.println("n habis dibagi 3");
            } else if (i % 5 == 0) {
                System.out.println("n habis dibagi 5");
            } else {
                System.out.println(i);
            }
        }
    }
}
