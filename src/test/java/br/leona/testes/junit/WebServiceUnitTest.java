/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.leona.testes.junit;

import br.leona.station.controller.Servico;
import br.leona.controller.IndexController;
import br.leona.mockws.service.ConfigurarServicos;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jean Negrão
 */
public class WebServiceUnitTest {
    
    private List<br.leona.hardware.model.Servico> listaFake;
    private static List<Servico> listaWS;
    private static  ConfigurarServicos servFakes;
          
    @BeforeClass
    public static void setUpClass() {
        
        System.out.println("@BeforeClass - setUpClass");
        
        servFakes = new ConfigurarServicos();
    }
    
    public WebServiceUnitTest() {
        
        System.out.println("WebServiceUnitTest"); 
        
        listaWS = IndexController.GetListaServicos();
        listaFake = servFakes.getListaServicos();
    }
    
    @Before
    public void setUp() {         
        
        System.out.println("@Before - setUp");      
         
        List<br.leona.station.controller.Servico> listStationServicos = new ArrayList<br.leona.station.controller.Servico>();
        
        for(int i = 0; i < listaFake.size(); i++){
            
            br.leona.station.controller.Servico servico = new br.leona.station.controller.Servico();
            
            servico.setNome(listaFake.get(i).getNome());
            servico.setStatus(listaFake.get(i).getStatus());
            
            listStationServicos.add(servico);
            
        }        
        
        IndexController.SetListaServicos(listStationServicos);
         
        listaWS = IndexController.GetListaServicos();
        
        br.leona.hardware.model.Servico servico = new br.leona.hardware.model.Servico();
        
        servico.setNome(listaWS.get(listaWS.size()-1).getNome());
        servico.setStatus(listaWS.get(listaWS.size()-1).getStatus());
        
        listaFake.add(servico);
         
    }   
    
    // TODO add test methods here.
    @Test
    public void testWebService() {
        
        System.out.println("@Test - testWebService");       
        
        for(int index = 0; index < listaWS.size(); index++){
            
            System.out.println("listaWS["+index+"]="+listaWS.get(index).getNome());
            System.out.println("listaFake["+index+"]="+listaFake.get(index).getNome());
            
            assertEquals(listaWS.get(index).getNome(), listaFake.get(index).getNome()); 
            
        }
    }
    
    @After
    public void tearDown() {
        
        System.out.println("@After - tearDown");
        
    }
        
    @AfterClass
    public static void tearDownClass() {
        
        System.out.println("@AfterClass - tearDownClass");
        
    }    

}
