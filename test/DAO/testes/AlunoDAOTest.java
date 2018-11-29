/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.testes;

import DAO.AlunoDAO;
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
public class AlunoDAOTest {
    
    public AlunoDAOTest() {
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
        System.out.println("save Aluno");
        Aluno aluno = new Aluno(1,"Samuel","samuel@samuel","rua A","Vila A","777","casa","juiz de fora","minas gerais",0,null,"11344455588");
        AlunoDAO instance = new AlunoDAO();
        instance.save(aluno);
    }

    /**
     * Test of BuscarPorLogin method, of class AlunoDAO.
     */
    @Test
    public void testBuscarPorLogin() {
        System.out.println("BuscarPorLogin");
        Login idLogin = ;
        AlunoDAO instance = new AlunoDAO();
        Aluno expResult = null;
        Aluno result = instance.BuscarPorLogin(idLogin);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class AlunoDAO.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        Aluno aluno = null;
        AlunoDAO instance = new AlunoDAO();
        instance.edit(aluno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class AlunoDAO.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        AlunoDAO instance = new AlunoDAO();
        List<Aluno> expResult = null;
        List<Aluno> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getByID method, of class AlunoDAO.
     */
    @Test
    public void testGetByID() {
        System.out.println("getByID");
        String id = "";
        AlunoDAO instance = new AlunoDAO();
        Aluno expResult = null;
        Aluno result = instance.getByID(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllMatriculados method, of class AlunoDAO.
     */
    @Test
    public void testGetAllMatriculados() {
        System.out.println("getAllMatriculados");
        AlunoDAO instance = new AlunoDAO();
        List<Aluno> expResult = null;
        List<Aluno> result = instance.getAllMatriculados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
