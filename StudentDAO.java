import java.sql.*;
import java.util.*;
public class StudentDAO {
    public boolean addStudent(Student s) {
        try (Connection con = DBConnection.getConnection()) {
            String sql = "INSERT INTO students(name,email,phone,course,semester,address) VALUES(?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setString(3, s.getPhone());
            ps.setString(4, s.getCourse());
            ps.setInt(5, s.getSemester());
            ps.setString(6, s.getAddress());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<>();
        try (Connection con = DBConnection.getConnection()) {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM students");
            while (rs.next()) {
                Student s = new Student();
                s.setId(rs.getInt("id"));
                s.setName(rs.getString("name"));
                s.setEmail(rs.getString("email"));
                s.setPhone(rs.getString("phone"));
                s.setCourse(rs.getString("course"));
                s.setSemester(rs.getInt("semester"));
                s.setAddress(rs.getString("address"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}