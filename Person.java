// Below is a code sample to store person's first name, last name and age using no argument constructor. 

public class Person {
        String first_name = NULL;
        String last_name = NULL;
        int age = -1;

    public Person() {   //Costructor with arguments
            // we use getter setter to set the values in this case
    }

    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }
    
    public String getFirstName() {
        return first_name;
    }
    
    public void setFirstName(String last_name) {
        this.last_name = last_name;
    }
     
    public String getLastName() {
        return last_name;
    }   
    
    public void setAge(int age) {
        this.age = age;
    }
        
    public int age() {
        return age;

    }
}
