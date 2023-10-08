package database;

import model.Persoon;
import model.Werknemer;

import java.sql.SQLException;

/**
 * @author Patrick Posilio
 * Purpose of the program
 */
public class WerknemerDAO extends AbstractDAO{
    public WerknemerDAO(DBaccess dBaccess) {
        super(dBaccess);
    }

    public void slaWerknemerOp(Werknemer werknemer){
        PersoonDAO persoonDAO = new PersoonDAO(dBaccess);
        int personeelsnummer = persoonDAO.slaPersoonOp(werknemer);
        String sql = " INSERT INTO Werknemer (personeelsnummer, maandsalaris) VALUES (?, ?);";

        try {
            setupPreparedStatement(sql);
            preparedStatement.setInt(1, personeelsnummer);
            preparedStatement.setDouble(2, werknemer.getMaandsalaris());
            executeManipulateStatement();
        } catch (SQLException sqlException) {
            throw new RuntimeException(sqlException);
        }
    }
}
