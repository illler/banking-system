package User;

import java.util.Date;
import java.util.HashMap;

public abstract class User_class {


    // Начальные переменные(можно изменять)

    private int ID_employee;
    private int ID_client;
    private String full_name_client;
    private String full_name_employee;

    private Date date_of_birth_client;
    private Date date_of_birth_employee;

    private String post_employee;

    private String address_client;

    private String passport_data_of_client;

    protected static final HashMap<Integer, String> info_about_employee = new HashMap<>();
    protected static final HashMap<Integer, String> info_about_client = new HashMap<>();




    // Сеттеры и геттеры

    public void setID_client(int id){ ID_client = id;}

    public int getID_client(){return ID_client;}
    public void setID_employee(int id){ ID_employee = id;}

    public int getID_employee(){return ID_employee;}
    public void setFull_name_client(String full_name){
        full_name_client = full_name;
    }

    public String getFull_name_client(){
        return full_name_client;
    }

    public void setFull_name_employee(String full_name){
        full_name_employee = full_name;
    }

    public String getFull_name_employee(){
        return full_name_employee;
    }

    public void setDate_of_birth_client(Date date_of_birth_client_1){
        date_of_birth_client = date_of_birth_client_1;
    }

    public Date getDate_of_birth_client(){
        return date_of_birth_client;
    }

    public void setDate_of_birth_employee(Date date_of_birth_employee1){
        date_of_birth_employee = date_of_birth_employee1;
    }

    public void setPost_employee(String post){
        post_employee = post;
    }

    public String getPost_employee(){
        return post_employee;
    }
    public Date getDate_of_birth_employee(){
        return date_of_birth_employee;
    }

    public void setAddress_client(String address_client1){
        address_client = address_client1;
    }

    public String getAddress_client(){
        return address_client;
    }

    public void setPassport_data_of_client(String passport_data_of_client1){
        passport_data_of_client = passport_data_of_client1;
    }

    public String getPassport_data_of_client(){
        return passport_data_of_client;
    }

    // Возможные будущие методы

    public void show_data_about_client(){}

    public void registration(){}

//    public void getInfo_about_employee(){
//        for (Integer key: info_about_employee.keySet()){
//            System.out.println(key + ": " + info_about_employee.get(key));
//        }
//    }

    public void setInfo_about_employee(Integer key, String values){
        info_about_employee.put(key, values);
    }

}
