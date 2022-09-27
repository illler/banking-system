package User;

import java.util.Date;

public abstract class User_class {


    // Начальные переменные(можно изменять)
    private String full_name_client;
    private String full_name_employee;

    private Date date_of_birth_client;
    private Date date_of_birth_employee;

    private String address_client;

    private String passport_data_of_client;





    // Сеттеры и геттеры
    private void setFull_name_client(String full_name){
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

    private void setDate_of_birth_client(Date date_of_birth_client_1){
        date_of_birth_client = date_of_birth_client_1;
    }

    public Date getDate_of_birth_client(){
        return date_of_birth_client;
    }

    private void setDate_of_birth_employee(Date date_of_birth_employee1){
        date_of_birth_employee = date_of_birth_employee1;
    }

    public Date getDate_of_birth_employee(){
        return date_of_birth_employee;
    }

    private void setAddress_client(String address_client1){
        address_client = address_client1;
    }

    public String getAddress_client(){
        return address_client;
    }

    private void setPassport_data_of_client(String passport_data_of_client1){
        passport_data_of_client = passport_data_of_client1;
    }

    public String getPassport_data_of_client(){
        return passport_data_of_client;
    }

    // Возможные будущие методы

    public void show_data_about_client(){}

    public void registration(){}

    private void info_about_employee(){}

}
