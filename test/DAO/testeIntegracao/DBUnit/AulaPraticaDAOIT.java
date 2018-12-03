/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.testeIntegracao.DBUnit;

import DAO.AulaPraticaDAO;
import Models.Aluno;
import Models.AulaPratica;
import Models.Professor;
import java.text.SimpleDateFormat;
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
public class AulaPraticaDAOIT {
    
    public AulaPraticaDAOIT() {
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
     * Test of save method, of class AulaPraticaDAO.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        AulaPratica pratica = new AulaPratica(28, pratica.setDataAula(sdf.parse(2018-12-05 08:00:00)),"Regras de Circulação", "Up 2014");
        AulaPraticaDAO instance = new AulaPraticaDAO();
        instance.save(pratica);
    }

    /**
     * Test of getAll method, of class AulaPraticaDAO.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        AulaPraticaDAO instance = new AulaPraticaDAO();
        int expResult = 15;
        List<AulaPratica> result = instance.getAll();
        assertEquals(expResult, result.size());
    }

    /**
     * Test of getById method, of class AulaPraticaDAO.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        int id = 1;
        AulaPraticaDAO instance = new AulaPraticaDAO();
        AulaPratica expResult = new AulaPratica(1, pratica.setDataAula(sdf.parse(2018-10-06 20:57:14)),"Baliza", "Corsa 2013");
        AulaPratica result = instance.getById(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of edit method, of class AulaPraticaDAO.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        AulaPratica aula = null;
        AulaPraticaDAO instance = new AulaPraticaDAO();
        instance.edit(aula);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPorAluno method, of class AulaPraticaDAO.
     */
    @Test
    public void testGetPorAluno() {
        System.out.println("getPorAluno");
        Aluno aluno = null;
        AulaPraticaDAO instance = new AulaPraticaDAO();
        List<AulaPratica> expResult = null;
        List<AulaPratica> result = instance.getPorAluno(aluno);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSemAluno method, of class AulaPraticaDAO.
     */
    @Test
    public void testGetSemAluno() {
        System.out.println("getSemAluno");
        AulaPraticaDAO instance = new AulaPraticaDAO();
        List<AulaPratica> expResult = null;
        List<AulaPratica> result = instance.getSemAluno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPorProfessor method, of class AulaPraticaDAO.
     */
    @Test
    public void testGetPorProfessor() {
        System.out.println("getPorProfessor");
        Professor professor = null;
        AulaPraticaDAO instance = new AulaPraticaDAO();
        List<AulaPratica> expResult = null;
        List<AulaPratica> result = instance.getPorProfessor(professor);
        assertEquals(expResult, result);
    }
    
}
