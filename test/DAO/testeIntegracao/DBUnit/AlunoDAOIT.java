/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.testeIntegracao.DBUnit;

import DAO.AlunoDAO;
import Helper.dbUnitHelper;
import Models.Aluno;
import Models.Login;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author samue
 */
public class AlunoDAOIT {

    
    public AlunoDAOIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {  
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of save method, of class AlunoDAO.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        AlunoDAO instance = new AlunoDAO();
        Aluno a = new Aluno(null, "Pedrin", "pedro@", "rua V", "bairro A", "100", "juiz de fora", "MG", false, null, "77799944411");
        try{
            instance.save(a);
            fail("Inseriu um aluno sem data de nascimento. (Campo obrigatório)");
        }catch(Exception e){
            assertTrue(true);
        }
    }

    /**
     * Test of BuscarPorLogin method, of class AlunoDAO.
     */
    @Test
    public void testBuscarPorLogin() {
        System.out.println("BuscarPorLogin");
        Login idLogin = new Login(25, "adrianowerpel", "123456789012");
        AlunoDAO instance = new AlunoDAO();
        Aluno expResult = new Aluno(6, "Adriano Werpel Silva", "adriano.silva@viannasempre.com.br", "Rua Barão do Rio Branco", "Centro", "1023", "Apartamento 1001", "Juiz de Fora", "MG", true, "1985-07-13", "504.434.190-86");
        Aluno result = instance.BuscarPorLogin(idLogin);
        assertEquals(expResult, result);
    }

    /**
     * Test of edit method, of class AlunoDAO.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        Aluno aluno = new Aluno(6, "Samuel Ribeiro Braz", "adriano.silva@viannasempre.com.br", "Rua Barão do Rio Branco", "Centro", "1023", "Apartamento 1001", "Juiz de Fora", "MG", true, "1985-07-13", "504.434.190-86");
        AlunoDAO instance = new AlunoDAO();
        instance.edit(aluno);
    }

    /**
     * Test of getAll method, of class AlunoDAO.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        AlunoDAO instance = new AlunoDAO();
        int expResult = 3;
        List<Aluno> result = instance.getAll();
        assertEquals(expResult, result.size());
    }

    /**
     * Test of getByID method, of class AlunoDAO.
     */
    @Test
    public void testGetByID() {
        System.out.println("getByID");
        String id = "6";
        AlunoDAO instance = new AlunoDAO();
        Aluno expResult = new Aluno(6, "Adriano Werpel Silva", "adriano.silva@viannasempre.com.br", "Rua Barão do Rio Branco", "Centro", "1023", "Apartamento 1001", "Juiz de Fora", "MG", true, "1985-07-13", "504.434.190-86");
        Aluno result = instance.getByID(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of getAllMatriculados method, of class AlunoDAO.
     */
    @Test
    public void testGetAllMatriculados() {
        System.out.println("getAllMatriculados");
        AlunoDAO instance = new AlunoDAO();
        int expResult = 3;
        List<Aluno> result = instance.getAllMatriculados();
        assertEquals(expResult, result.size());
    }
    
}
