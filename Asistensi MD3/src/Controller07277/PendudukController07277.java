package Controller07277;

import Entity07277.PendudukEntity0727707277;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class PendudukController07277 {

    public void insertData(String nik,String nama, String alamat, String noTelp, String dosis, String jenis_vaksin){
        AllObjectModel07277.pendudukModel.insertData(new PendudukEntity0727707277(nik, nama, alamat, noTelp, dosis, jenis_vaksin));
    }
    public void updateDosis(String dosis, int id){
        AllObjectModel07277.pendudukModel.updateDosis(dosis,id);
    }
    public void updateNoTelp(String noTelp, int id){
        AllObjectModel07277.pendudukModel.updateNoTelp(noTelp,id);
    }
    public ArrayList<PendudukEntity0727707277> getDataPenduduk(String nik) {
        return AllObjectModel07277.pendudukModel.getPenduduk(nik);
    }
    public ArrayList<PendudukEntity0727707277> getDataPenduduk() {
        return AllObjectModel07277.pendudukModel.getPenduduk();
    }
    public int CekData(String nik){
        int cek = AllObjectModel07277.pendudukModel.cekData(nik);
        return cek;
    }
    public DefaultTableModel daftarPenduduk(){
        DefaultTableModel dataDaftarPenduduk = new DefaultTableModel();
        Object[] kolom = {"ID", "NIK", "NAMA", "ALAMAT", "NOTELP", "DOSIS", "JENIS VAKSIN"};
        dataDaftarPenduduk.setColumnIdentifiers(kolom);
        int size = getDataPenduduk().size();
        for(int i = 0; i < size; i++ ){
            Object[] data = new Object[7];
            data[0] = AllObjectModel07277.pendudukModel.getPenduduk().get(i).getId();
            data[1] = AllObjectModel07277.pendudukModel.getPenduduk().get(i).getNik();
            data[2] = AllObjectModel07277.pendudukModel.getPenduduk().get(i).getNama();
            data[3] = AllObjectModel07277.pendudukModel.getPenduduk().get(i).getAlamat();
            data[4] = AllObjectModel07277.pendudukModel.getPenduduk().get(i).getNoTelp();
            data[5] = AllObjectModel07277.pendudukModel.getPenduduk().get(i).getDosis();
            data[6] = AllObjectModel07277.pendudukModel.getPenduduk().get(i).getjenis_vaksin();
            dataDaftarPenduduk.addRow(data);
        }
        return dataDaftarPenduduk;
    }

}
