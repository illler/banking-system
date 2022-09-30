package User;

import java.util.Date;

public class Employee extends User_class{
    public Employee(int ID, String full_name, Date date_of_birth, String post){
        setID_employee(ID);
        setFull_name_employee(full_name);
        setDate_of_birth_employee(date_of_birth);
        setPost_employee(post);
        setInfo_about_employee(ID, full_name + ", " + date_of_birth + ", " + post);
    }

    private void show_work_space(int ID){
        for (int key: info_about_employee.keySet()){
            if (key==ID){
                System.out.println("Ваша рабочая платформа");
                // Тут будет вызываться метод, какой-то
            }
        }
        System.out.println("Такого пользователя нет!");
    }

    private void find_client(int ID){

    }

}
