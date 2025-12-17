public class Student {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String course;
    private int semester;
    private String address;
    
    public Student() {}
    
    public Student(String name, String email, String phone, String course, int semester, String address) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.course = course;
        this.semester = semester;
        this.address = address;
    }
    
    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getCourse() { return course; }
    public int getSemester() { return semester; }
    public String getAddress() { return address; }
    
    // Setters
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setCourse(String course) { this.course = course; }
    public void setSemester(int semester) { this.semester = semester; }
    public void setAddress(String address) { this.address = address; }
    
    @Override
    public String toString() {
        return id + "\t" + name + "\t" + email + "\t" + phone + "\t" + course + "\t" + semester + "\t" + address;
    }
}