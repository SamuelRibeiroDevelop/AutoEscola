/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.testeIntegracao.DBUnit;

import DAO.LoginDAO;
import Models.Login;
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
public class LoginDAOTest {
    
    public LoginDAOTest() {
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
     * Test of save method, of class LoginDAO.
     */
    @Test
    public void testSave() {
        System.out.println("saveLogin");
        Login login = new Login(33,"samuel","987654");
        LoginDAO instance = new LoginDAO();
        instance.save(login);
    }

    /**
     * Test of BuscaPorLogin method, of class LoginDAO.
     */
    @Test
    public void testBuscaPorLogin() {
        System.out.println("BuscaPorLogin");
        String login = "anamaria";
        LoginDAO instance = new LoginDAO();
        Login expResult = new Login(10,"anamaria", "123456");
        Login result = instance.BuscaPorLogin(login);
        assertEquals(expResult, result);
    }

    /**
     * Test of validaLogin method, of class LoginDAO.
     */
    @Test
    public void testValidaLogin() {
        System.out.println("validaLogin");
        String login = "Admin";
        String senha = "Admin";
        LoginDAO instance = new LoginDAO();
        Login expResult = new Login(8,"Admin","Admin");
        Login result = instance.validaLogin(login, senha);
        assertEquals(expResult, result);
    }
    
}
