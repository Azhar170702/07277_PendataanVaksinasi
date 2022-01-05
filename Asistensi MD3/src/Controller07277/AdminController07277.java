package Controller07277;

import Entity07277.AdminEntity0727707277;

public class AdminController07277 {
    public void insertData(String nip,String nama, String alamat, String password, String noTelp){
        AllObjectModel07277.adminModel07277.insertData(new AdminEntity0727707277(nip,nama,alamat,password,noTelp));
    }
    public void updatePassword(String password, int id){
        AllObjectModel07277.adminModel07277.updatePassword(password,id);
    }
    public void updateNoTelp(String noTelp, int id){
        AllObjectModel07277.adminModel07277.updateNoTelp(noTelp,id);
    }
    public int cekLogin(String nip, String password){
       int login = AllObjectModel07277.adminModel07277.cekLogin(nip,password);
       return login;
    }
    public void deleteData(int id){
        AllObjectModel07277.adminModel07277.deleteData(id);
    }


}
