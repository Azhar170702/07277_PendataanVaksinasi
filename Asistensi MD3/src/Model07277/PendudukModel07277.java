package Model07277;

import Entity07277.PendudukEntity0727707277;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PendudukModel07277 extends ModelAbstract07277 {
    private String sql;

    public void insertData(PendudukEntity0727707277 pendudukEntity07277){
        try{
            sql = "INSERT INTO penduduk(nik, nama, alamat, noTelp, dosis, jenis_vaksinasi)" +
                    "VALUE(?,?,?,?,?,?)";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, pendudukEntity07277.getNik());
            stat.setString(2, pendudukEntity07277.getNama());
            stat.setString(3, pendudukEntity07277.getAlamat());
            stat.setString(4, pendudukEntity07277.getNoTelp());
            stat.setString(5, pendudukEntity07277.getDosis());
            stat.setString(6, pendudukEntity07277.getjenis_vaksin());
            stat.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
 }
    public void updateDosis(String dosis, int id){
        try{
            sql = "UPDATE penduduk SET dosis = ? WHERE id = ? ";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, dosis);
            stat.setInt(2, id);
            int rows = stat.executeUpdate();
            System.out.println(rows+" row(s) updated ");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public ArrayList<PendudukEntity0727707277> getPenduduk(String nik){
        ArrayList<PendudukEntity0727707277> arrPenduduk = new ArrayList<>();

        try{
            sql = "SELECT * FROM penduduk where nik = ?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1,nik);
            ResultSet rs = stat.executeQuery();
            while(rs.next()){
                PendudukEntity0727707277 pendudukEntity0727707277 = new PendudukEntity0727707277();
                pendudukEntity0727707277.setId(rs.getInt("id"));
                pendudukEntity0727707277.setNama(rs.getString("nama"));
                pendudukEntity0727707277.setAlamat(rs.getString("alamat"));
                pendudukEntity0727707277.setNoTelp(rs.getString("noTelp"));
                pendudukEntity0727707277.setNik(rs.getString("nik"));
                pendudukEntity0727707277.setDosis(rs.getString("dosis"));
                pendudukEntity0727707277.setjenis_vaksin(rs.getString("jenis_vaksinasi"));
                arrPenduduk.add(pendudukEntity0727707277);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return arrPenduduk;
    }

    public ArrayList<PendudukEntity0727707277> getPenduduk(){
        ArrayList<PendudukEntity0727707277> arrPenduduk = new ArrayList<>();

        try{
            sql = "SELECT * FROM penduduk";
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()){
                PendudukEntity0727707277 pendudukEntity0727707277 = new PendudukEntity0727707277();
                pendudukEntity0727707277.setId(rs.getInt("id"));
                pendudukEntity0727707277.setNama(rs.getString("nama"));
                pendudukEntity0727707277.setAlamat(rs.getString("alamat"));
                pendudukEntity0727707277.setNoTelp(rs.getString("noTelp"));
                pendudukEntity0727707277.setNik(rs.getString("nik"));
                pendudukEntity0727707277.setDosis(rs.getString("dosis"));
                pendudukEntity0727707277.setjenis_vaksin(rs.getString("jenis_vaksinasi"));
                arrPenduduk.add(pendudukEntity0727707277);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return arrPenduduk;
    }

    @Override
    public void updatenoTelp(String noTelp, int id) {
        try{
            sql = "UPDATE penduduk SET noTelp = ? WHERE id = ? ";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, noTelp);
            stat.setInt(2, id);
            int rows = stat.executeUpdate();
            System.out.println(rows+" row(s) updated ");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateNoTelp(String noTelp, int id){
        try{
            sql = "UPDATE penduduk SET noTelp = ? WHERE id = ? ";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, noTelp);
            stat.setInt(2, id);
            int rows = stat.executeUpdate();
            System.out.println(rows+" row(s) updated ");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public int cekData(String nik){
        int cek = 0;
        try{
            sql = "SELECT * FROM penduduk WHERE nik = ?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1,nik);
            ResultSet rs = stat.executeQuery();

            if(rs.next()){
                cek = rs.getInt("id");
            }else {
                cek = 0;
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return cek;
    }
}
