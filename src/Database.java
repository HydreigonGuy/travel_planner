
import java.sql.*;

public class Database {
    private String url;
    private Connection conn;

    public Database() {
        String host = System.getenv("DB_HOST");
        String name = System.getenv("DB_NAME");
        String user = System.getenv("DB_USER");
        String password = System.getenv("DB_PASSWORD");

        if (host == null) {
            System.out.println("ERROR: Missing DB_HOST");
        }
        if (name == null) {
            System.out.println("ERROR: Missing DB_NAME");
        }
        if (user == null) {
            System.out.println("ERROR: Missing DB_USER");
        }
        if (password == null) {
            System.out.println("ERROR: Missing DB_PASSWORD");
        }
        this.url = String.format("postgres://%s:%s@%s:5432/%s", user, password, host, name);

        try {
            this.conn = DriverManager.getConnection(this.url);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void executeQuery(String query) {
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String getUrl() {
        return this.url;
    }
}
