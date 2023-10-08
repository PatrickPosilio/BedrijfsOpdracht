package database;
import model.Afdeling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 * @author Patrick Posilio
 * Purpose of the program
 */

public class AfdelingDAO extends AbstractDAO{
    private DBaccess dBaccess;

    public AfdelingDAO(DBaccess dBaccess){
        super(dBaccess);
    }

    public void slaAfdelingOp(Afdeling afdeling) {
        String sql = "INSERT INTO Afdeling (afdelingsnaam, afdelingsplaats) VALUES (?, ?)";
        try {
            setupPreparedStatement(sql);// Maakt een preparedStatement voor de sql string. Een DAO gebruikt dit om de parameters te vullen.
            preparedStatement.setString(1, afdeling.getAfdelingNaam());
            preparedStatement.setString(2, afdeling.getAfdelingPlaats());
            executeManipulateStatement();//Voert de preparedStatement uit zonder een ResultSet. Wordt gebruikt voor insert, update en delete statements.

        } catch (SQLException sqlException) {
            throw new RuntimeException(sqlException);
        }
    }

    public ArrayList<Afdeling> geefAfdelingen(){
        ArrayList<Afdeling> afdelingen = new ArrayList<>();
            String sql = "SELECT afdelingsnaam, afdelingsplaats FROM Afdeling;";
            try {
                setupPreparedStatement(sql);
                ResultSet resultSet = executeSelectStatement(); // Voert de preparedStatement uit met een ResultSet. Wordt gebruikt voor select statements.
                while (resultSet.next()){
                    String afdelingsnaam = resultSet.getString("afdelingsnaam");
                    String afdelingsplaats = resultSet.getString("afdelingsplaats");
                    afdelingen.add(new Afdeling (afdelingsnaam, afdelingsplaats));
                }
            } catch (SQLException sqlException) {
                System.out.println("SQL fout: " + sqlException.getMessage());
            }
            return afdelingen;
    }
    public ArrayList<Afdeling> geefAfdelingenMetPlaats(String afdelingsPlaats) {
        ArrayList<Afdeling> afdelingenMetPlaats = new ArrayList<>();
        String sql = "SELECT * FROM afdeling WHERE afdelingsplaats = ?;";
        try {
            setupPreparedStatement(sql);
            preparedStatement.setString(1, afdelingsPlaats);
            ResultSet resultSet = executeSelectStatement();
            while (resultSet.next()) {
                afdelingenMetPlaats.add(new Afdeling(resultSet.getString("afdelingsnaam"),
                        resultSet.getString("afdelingsplaats")));
            }
        } catch (SQLException sqlFout) {
            System.out.println("SQL fout: " + sqlFout.getMessage());
        }
        return afdelingenMetPlaats;
    }
}
