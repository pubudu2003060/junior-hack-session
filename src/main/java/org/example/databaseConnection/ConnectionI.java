package org.example.databaseConnection;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionI {

    Connection getConnection() throws SQLException ;

}
