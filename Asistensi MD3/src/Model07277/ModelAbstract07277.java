package Model07277;

import Helper07277.KoneksiDb07277;

import java.sql.Connection;

public abstract class ModelAbstract07277 {
    public Connection conn = KoneksiDb07277.getconection();

    public abstract void updatenoTelp(String noTelp,int id);

    public abstract void updateNoTelp(String noTelp, int id);
}
