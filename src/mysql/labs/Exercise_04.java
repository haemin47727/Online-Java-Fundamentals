package mysql.labs;


/*
*  MySQL Exercise 4:
*
*   Now that you have mastered your air travel database, it's time to connect this DB to a Java application
*   using JDBC. You can start simple here and build your way up. Within a Java application, using JDBC, please
*   demonstrate how to:
*
*   Note: CRUD means (Create, Read, Update, Delete)
*
*       1.) CRUD new flights
*       2.) CRUD new passengers
*       3.) Bonus: flex those JDBC muscles! How nice, clean, useful can you make this? Show us what you've got!
*
*
*   Caution: Before you push this code to GitHub, be sure to REMOVE or REPLACE your DATABASE PASSWORD. You do not 
*   want to push your database password to GitHub. If you do push your password to GitHub you'll need to delete
*   the commit from your Git history. See, for instance: https://medium.com/multinetinventiv/removing-commits-from-git-history-4e2340288484 
*
 */
import java.sql.*;
import java.time.LocalDateTime;
public class Exercise_04 {

    public static void main(String[] args) {
        /*
        Just as a casual example - each of these operations should be in it's own method. Feel free to
        create all required classes/methods to accomplish this.

        createFlight(...);
        queryFlight(...);
        updateFlight(...);
        deleteFlight(...);

        createPassenger(...);
        queryPassenger(...);
        updatePassenger(...);
        deletePassenger(...);

        ...


         */



                String url = "jdbc:mysql://localhost:3306/db";
                String user = "username";
                String pass = "password";

                try (Connection conn = DriverManager.getConnection(url, user, pass)) {


                    String insertFlight = "INSERT INTO flights (origin, destination, departure_time) VALUES (?, ?, ?)";
                    int flightId;
                    try (PreparedStatement ps = conn.prepareStatement(insertFlight, Statement.RETURN_GENERATED_KEYS)) {
                        ps.setString(1, "NYC");
                        ps.setString(2, "LAX");
                        ps.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now().plusDays(2)));
                        ps.executeUpdate();
                        try (ResultSet rs = ps.getGeneratedKeys()) {
                            flightId = rs.next() ? rs.getInt(1) : -1;
                            System.out.println("Created Flight ID: " + flightId);
                        }
                    }


                    String selectFlight = "SELECT * FROM flights WHERE flight_id = ?";
                    try (PreparedStatement ps = conn.prepareStatement(selectFlight)) {
                        ps.setInt(1, flightId);
                        try (ResultSet rs = ps.executeQuery()) {
                            if (rs.next()) {
                                System.out.println("Flight: " + rs.getString("origin") + " -> " + rs.getString("destination"));
                            }
                        }
                    }


                    String updateFlight = "UPDATE flights SET destination = ? WHERE flight_id = ?";
                    try (PreparedStatement ps = conn.prepareStatement(updateFlight)) {
                        ps.setString(1, "SFO");
                        ps.setInt(2, flightId);
                        ps.executeUpdate();
                        System.out.println("Flight updated.");
                    }


                    String deleteFlight = "DELETE FROM flights WHERE flight_id = ?";
                    try (PreparedStatement ps = conn.prepareStatement(deleteFlight)) {
                        ps.setInt(1, flightId);
                        ps.executeUpdate();
                        System.out.println("Flight deleted.");
                    }


                    String insertPassenger = "INSERT INTO passengers (name, email) VALUES (?, ?)";
                    int passengerId;
                    try (PreparedStatement ps = conn.prepareStatement(insertPassenger, Statement.RETURN_GENERATED_KEYS)) {
                        ps.setString(1, "Alice");
                        ps.setString(2, "alice@example.com");
                        ps.executeUpdate();
                        try (ResultSet rs = ps.getGeneratedKeys()) {
                            passengerId = rs.next() ? rs.getInt(1) : -1;
                            System.out.println("Created Passenger ID: " + passengerId);
                        }
                    }


                    String selectPassenger = "SELECT * FROM passengers WHERE passenger_id = ?";
                    try (PreparedStatement ps = conn.prepareStatement(selectPassenger)) {
                        ps.setInt(1, passengerId);
                        try (ResultSet rs = ps.executeQuery()) {
                            if (rs.next()) {
                                System.out.println("Passenger: " + rs.getString("name") + " (" + rs.getString("email") + ")");
                            }
                        }
                    }


                    String updatePassenger = "UPDATE passengers SET email = ? WHERE passenger_id = ?";
                    try (PreparedStatement ps = conn.prepareStatement(updatePassenger)) {
                        ps.setString(1, "alice_new@example.com");
                        ps.setInt(2, passengerId);
                        ps.executeUpdate();
                        System.out.println("Passenger updated.");
                    }

                    // Delete passenger
                    String deletePassenger = "DELETE FROM passengers WHERE passenger_id = ?";
                    try (PreparedStatement ps = conn.prepareStatement(deletePassenger)) {
                        ps.setInt(1, passengerId);
                        ps.executeUpdate();
                        System.out.println("Passenger deleted.");
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }




