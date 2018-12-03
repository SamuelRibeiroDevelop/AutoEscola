/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.Mock;

import DAO.AlunoDAO;
import Models.Aluno;
import Models.Login;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.mockito.Mockito;



/**
 *
 * @author samue
 */
public class AlunoDAOMockTest {
    
    @Test
    public void buscarTodosAlunos(){
        AlunoDAO adao = Mockito.mock(AlunoDAO.class);
        
        List<Aluno> listaAlunos = new ArrayList<>();
        
        Mockito.when(adao.getAll()).thenReturn(listaAlunos);
        
        int expResult = 3;
        List<Aluno> result = adao.getAll();

        assertEquals(expResult, result.size());
    
    }
    
    @Test
    public void buscarPorLogin(){
        Login idLogin = new Login(25, "adrianowerpel", "123456789012");
        
        AlunoDAO adao = Mockito.mock(AlunoDAO.class);
        
        
    
    }
}
