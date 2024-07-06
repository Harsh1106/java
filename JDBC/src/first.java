//7 Steps of JDBC
// after getting the JAR File we have to do these steps:
// 1. Import Packages(java.sql)
// 2. Load the driver(driver is actually coming from JAR File, Every implementation has their own driver)
// 3. Register the driver
// 4. Create Connection in JDBC
// 5. Create a statement
// 6. Exectue a statement
// 7. Close the Connection

//JAR- Java Archive

import java.sql.*; //importing the packages
public class first{
    public static void main(String[] args) throws Exception {
        int sid = 110;
        String sname = "Anuj";
        int marks = 99;
        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "br1n4956";
//        String sql = "select sname from student where sid = 1"; //read
//        String newQuery = "insert into student  values(5, 'Yuvraj', 69)"; //insert
//        String newQuery = "update student set sname='Max' where sid = 5"; //update
//        String newQuery = "delete from student where sid = 5";

//        now if the data is enterred by the user

//        String newQuery = "insert into student values (" + sid + " , '" + sname + "' , " + marks + ")";
//        more simpler way to get data from user
        String newQuery = "insert into student values(?,?,?)";
//        Class.forName("org.postgresql.Driver"); //load and register the drive (compulsory not to write it)

        Connection con = DriverManager.getConnection(url, uname, pass); //establising the connection
//        Statement st = con.createStatement(); //statement and connection both are interfaces

        PreparedStatement pst = con.prepareStatement(newQuery);
        pst.setInt(1, sid);
        pst.setString(2, sname);
        pst.setInt(3,marks);

        pst.execute();
//        executeQuery(String SQL): Returns a ResultSet object. Use this method when you expect to get a result set, as you would with a SELECT statement.
//        ResultSet rs = st.executeQuery(newQuery); //ResultSet is also an interface and as usual we can't create object of it
////        System.out.println(rs.next()); //returns true and false if the data is present in next row then it will print true and otherwise false
//
////        rs.next();
////        String name = rs.getString("sname");
////        System.out.println("Name of student is "+name); //we can go with col name as well as col number both will work here
//
//        while(rs.next()){
//            System.out.print(rs.getInt(1)+" - ");
//            System.out.print(rs.getString(2)+" - ");
//            System.out.println(rs.getInt(3));
//        }

//        execute(String SQL): Returns a boolean value of true if a ResultSet object can be retrieved; otherwise, it returns false. Use this method to execute SQL DDL statements or when you need to use truly dynamic SQL.
//            boolean status = st.execute();
//        System.out.println(status);
        con.close(); //we should close the connection after using it

        System.out.println("Connection Closed");
    }
}

