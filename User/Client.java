package User;

import java.util.Date;

public class Client extends User_class{

    public Client(int ID, String full_name, Date date_birth, String address, String passport_data_of_client){
        setID_client(ID);
        setFull_name_client(full_name);
        setDate_of_birth_client(date_birth);
        setAddress_client(address);
        setPassport_data_of_client(passport_data_of_client);
        info_about_client.put(ID, full_name + ", " + date_birth + ", " + address + ", " + passport_data_of_client);
    }

    protected void create_deb_card(){

    }


}
