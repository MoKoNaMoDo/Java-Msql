import java.sql.*;
import java.util.Scanner;

public class Java2 {
    public void insertData(String food_Id , String food_Name, String food_CT , String food_Price ) {

        // String str="2015-03-31";
        
        try {
            // create a mysql database connection
            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/food";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "12345678");

            String sql = " insert into food (food_Id, food_Name, food_CT, food_Price)"
                    + " values (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, food_Id );
            ps.setString(2, food_Name);
            ps.setString(3, food_CT);
            ps.setString(4, food_Price);
            // ps.setDate(4, new java.sql.Date(birthdate));
            
            ps.execute();
            System.out.println("Insert finished.");
            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.out.println(e);
        }
    }

    public void showData() {
        try {
            // create a mysql database connection
            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/food";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "12345678");

            String sql = "SELECT * FROM food";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println("food_id       : " + rs.getString("food_id"));
                System.out.println("food_Name    : " + rs.getString("food_Name"));
                System.out.println("food_CT     : " + rs.getString("food_CT"));
                System.out.println("food_Price: " + rs.getString("food_Price "));
                
            }
            System.out.println("End of data.");
            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.out.println(e);
        }
    }

    public void updateName(String food_id, String newName) {

        try {
            // create a mysql database connection
            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/food";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "12345678");

            String sql = "UPDATE food SET food_Name=?  WHERE food_id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, newName);
            ps.setString(2, food_id);
            ps.execute();
            System.out.println("1 record updated.");
            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.out.println(e);
        }
    }

    public void deleteData(String food_id) {

        try {
            // create a mysql database connection
            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/food";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "12345678");

            String sql = "DELETE FROM food WHERE food_id =?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, food_id);
            ps.execute();
            System.out.println("1 record deleted.");
            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception!");
            System.out.println(e);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please Choose number:");
        System.out.println("1. Insert data");
        System.out.println("2. Show data");
        System.out.println("3. Update name");
        System.out.println("4. Delete data");
        System.out.println("Other to exit...");
        System.out.println("");
        Scanner getData = new Scanner(System.in);
        int ch = Integer.parseInt(getData.nextLine());

        Java2 app = new Java2();
        switch (ch) {
            case 1:
                String food_id = "10004";
                String food_Name = "กุ้ง";
                String food_CT = "Jackiya";
                String food_Price  = "50";
                
                app.insertData(food_id,food_Name,food_CT, food_Price);
                break;
            case 2:
                app.showData();
                break;
            case 3:
                food_id= "123";
                String newname = "ขนม";
                app.updateName(food_id, newname);
                break;
            case 4:
                food_id = "10004";
                app.deleteData(food_id);
            default: {
            }
        }
    }
}