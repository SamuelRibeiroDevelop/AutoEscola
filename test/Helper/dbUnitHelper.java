/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.dbunit.DatabaseUnitException;
import org.dbunit.database.DatabaseConfig;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.DatabaseSequenceFilter;
import org.dbunit.dataset.DataSetException;
import org.dbunit.dataset.FilteredDataSet;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.filter.ITableFilter;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.ext.mysql.MySqlDataTypeFactory;
import org.dbunit.operation.DatabaseOperation;

/**
 *
 * @author samue
 */
public class dbUnitHelper {
    private Connection conexao;
    private DatabaseConnection conexaoDBUnit;
    private String xmlFolder;

    public dbUnitHelper() {
        this.xmlFolder = "test/dbUnitXML/";

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/auto_escola", "root", "123456");
            conexaoDBUnit = new DatabaseConnection(conexao);
            DatabaseConfig config = conexaoDBUnit.getConfig();
            config.setProperty(DatabaseConfig.PROPERTY_DATATYPE_FACTORY, new MySqlDataTypeFactory());
        } catch (Exception e) {
            throw new RuntimeException("Erro inicializando DBUnit", e);
        }
    }

    public void importar(String file) {
        try {
            deleteDataBase();

            FlatXmlDataSetBuilder builder = new FlatXmlDataSetBuilder();
            IDataSet dataSet = builder.build(new FileInputStream(xmlFolder + file));
            DatabaseOperation.INSERT.execute(conexaoDBUnit, dataSet);

        } catch (Exception e) {
            throw new RuntimeException("Erro Import DbUnit", e);
        }
    }

    public void backupDataBase() {
        String file = xmlFolder + "BkpTesteBancoAutoEscola.xml";
        try {
//            IDataSet dataSet = conexaoDBUnit.createDataSet();
            new FileOutputStream(file, false).close();
            
            ITableFilter filter = new DatabaseSequenceFilter(conexaoDBUnit);
            IDataSet dataSet = new FilteredDataSet(filter, conexaoDBUnit.createDataSet());
            FlatXmlDataSet.write(dataSet, new FileOutputStream(file));
        } catch (Exception e) {
            throw new RuntimeException("Erro executando DbUnit", e);
        }
    }

    public void RestoreDataBase() {
        String file = xmlFolder + "BkpTesteBancoAutoEscola.xml";
        try {
            deleteDataBase();

            FlatXmlDataSetBuilder builder = new FlatXmlDataSetBuilder();
            IDataSet dataSet = builder.build(new FileInputStream(file));
            DatabaseOperation.INSERT.execute(conexaoDBUnit,dataSet);
        } catch (Exception e) {
            throw new RuntimeException("Erro executando DbUnit", e);
        }
    }

    private void deleteDataBase() throws SQLException, DatabaseUnitException, DataSetException {
        String[] tables = {"aluno"};
        IDataSet ids = conexaoDBUnit.createDataSet(tables);
        DatabaseOperation.DELETE.execute(conexaoDBUnit, ids);
        String[] tables1 = {"pessoa"};
        ids = conexaoDBUnit.createDataSet(tables1);
        DatabaseOperation.DELETE.execute(conexaoDBUnit, ids);
        String[] tables2 = {"professor"};
        ids = conexaoDBUnit.createDataSet(tables2);
        DatabaseOperation.DELETE.execute(conexaoDBUnit, ids);
        String[] tables3 = {"aula_pratica"};
        ids = conexaoDBUnit.createDataSet(tables3);
        DatabaseOperation.DELETE.execute(conexaoDBUnit, ids);
        String[] tables4 = {"aula_teorica"};
        ids = conexaoDBUnit.createDataSet(tables4);
        DatabaseOperation.DELETE.execute(conexaoDBUnit, ids);
        String[] tables5 = {"login"};
        ids = conexaoDBUnit.createDataSet(tables5);
        DatabaseOperation.DELETE.execute(conexaoDBUnit, ids);
        String[] tables6 = {"pagamento"};
        ids = conexaoDBUnit.createDataSet(tables6);
        DatabaseOperation.DELETE.execute(conexaoDBUnit, ids);

    }

    public void close() {
        try {
            conexaoDBUnit.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
