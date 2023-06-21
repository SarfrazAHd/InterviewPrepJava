package Interview;

public class HelathKart {
    public static void main(String[] args) {
        tryCatch();
    }

    static void tryCatch() {

        int number = 0;
        try {
            number /= 0;
        } catch (RuntimeException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("Always");
        }

    }
}
