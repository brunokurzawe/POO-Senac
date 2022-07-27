public class ControleFluxoWhileDoWhile {

    public static void main(String[] args) {

        /*
            exemplo com while
        */
        int x = 0;
        while (x < 10) {
            System.out.println("item " + x);
            x++;
        }

        System.out.println("");
        System.out.println("");

        /*
            exemplo com do-while
        */
        int y = 0;
        do {
            System.out.println("item " + y);
            y++;
        } while (y < 10);
    }
}
