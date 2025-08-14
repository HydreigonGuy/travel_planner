public class Main {
    public static void main(String[] args) {
        // Place test = new Place(String.format("%s/%s", System.getenv("DB_HOST"), System.getenv("DB_NAME")));
        // System.out.println(test.getName());

        Database test = new Database();
        test.executeQuery("test");
    }
}