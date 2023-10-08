package database;

import model.Persoon;

import java.sql.SQLException;

/**
 * @author Patrick Posilio
 * Purpose of the program
 */
public class PersoonDAO extends AbstractDAO {
    public PersoonDAO(DBaccess dBaccess){
        super(dBaccess);
    }
    public int slaPersoonOp(Persoon persoon){
        String sql = "INSERT INTO Persoon (naam, woonplaats, afdeling) VALUES (?, ?, ?)";
        int personeelsnummer = -1;

        try {
            setupPreparedStatementWithKey(sql);
            preparedStatement.setString(1, persoon.getNaam());
            preparedStatement.setString(2, persoon.getWoonplaats());
            preparedStatement.setString(3, persoon.getAfdeling().getAfdelingNaam());
            personeelsnummer = executeInsertStatementWithKey();

        } catch (SQLException sqlException) {
            throw new RuntimeException(sqlException);
        }
        return personeelsnummer;
    }
}
