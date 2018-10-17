
package university;


public class Student 
{
    int Id;
    String Name;
    double GPA;
    String Address;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    @Override
    public String toString() {
        return "Student{" + "Id=" + Id + ", Name=" + Name + ", GPA=" + GPA + ", Address=" + Address + '}';
    }

    public Student(int Id, String Name, double GPA, String Address) {
        this.Id = Id;
        this.Name = Name;
        this.GPA = GPA;
        this.Address = Address;
    }
    
    
}
