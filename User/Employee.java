package User;

import java.util.Date;

public class Employee extends User_class{

    public Employee(String full_name, Date date_of_birth, String post){
        setFull_name_employee(full_name);
        setDate_of_birth_employee(date_of_birth);
        setPost_employee(post);
        setInfo_about_employee(full_name, date_of_birth + ", " + post);
    }

    private void show_work_space(){}

    private void find_client(){}

}
