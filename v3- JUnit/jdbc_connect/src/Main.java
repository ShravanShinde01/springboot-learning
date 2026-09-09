import java.sql.*;

public class Main {

    static final String URL = "jdbc:mysql://localhost:3306/springboot";
    static final String USER = "root";
    static final String PASSWORD = "Shravan@3045";

    public static void main(String[] args) {

        // CREATE
        createUser("Shravan", "shravan@gmail.com");
        createUser("Rahul", "rahul@gmail.com");

        // READ
        readUsers();

        // UPDATE
        updateUser(1, "Shravan Shinde");

        // READ again
        readUsers();

        // DELETE
        deleteUser(2);

        // READ again
        readUsers();
    }

    // CREATE
    static void createUser(String name, String email) {

        String sql = "INSERT INTO users (name, email) VALUES (?, ?)";

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setString(2, email);

            int rows = ps.executeUpdate();

            System.out.println(rows + " user inserted");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ
    static void readUsers() {

        String sql = "SELECT * FROM users";

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            System.out.println("\nUsers:");

            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");

                System.out.println(
                        id + " | " + name + " | " + email
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    static void updateUser(int id, String newName) {

        String sql = "UPDATE users SET name = ? WHERE id = ?";

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, newName);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            System.out.println(rows + " user updated");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    static void deleteUser(int id) {

        String sql = "DELETE FROM users WHERE id = ?";

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            System.out.println(rows + " user deleted");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}