package Entity07277;

public class PendudukEntity0727707277 extends UserEntityAbstract07277 {
    public String nik, dosis, jenis_vaksin;

    public PendudukEntity0727707277(String nik, String nama, String alamat, String noTelp, String dosis, String jenis_vaksin){
        super(nama, alamat, noTelp);
        this.nik = nik;
        this.dosis = dosis;
        this.jenis_vaksin = jenis_vaksin;
    }

    public PendudukEntity0727707277(int id, String nama, String alamat, String noTelp, String nik, String dosis, String jenis_vaksin) {
        super(nama, alamat, noTelp, id);
        this.nik = nik;
        this.dosis = dosis;
        this.jenis_vaksin = jenis_vaksin;
    }
    public PendudukEntity0727707277(){}

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getjenis_vaksin() {
        return jenis_vaksin;
    }

    public void setjenis_vaksin(String jenis_vaksin) {
        this.jenis_vaksin = jenis_vaksin;
    }
}
