/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.leona.controller;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.leona.mockws.service.ConfigurarServicos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jean Negrão
 */
@Resource
public class IndexController { 
  
    private Result result;
    
    public IndexController(Result result){
        this.result = result;        
    }    
    
    @Path("/")
    @SuppressWarnings("empty-statement")
    public void index(){ 
        
        ConfigurarServicos servServicos = new ConfigurarServicos();
        List<br.leona.hardware.model.Servico> listHardwareServicos = servServicos.getListaServicos();
        
        List<br.leona.station.controller.Servico> listStationServicos = new ArrayList<br.leona.station.controller.Servico>();
        
        for(int i = 0; i < listHardwareServicos.size(); i++){
            
            br.leona.station.controller.Servico servico = new br.leona.station.controller.Servico();
            
            servico.setNome(listHardwareServicos.get(i).getNome());
            servico.setStatus(listHardwareServicos.get(i).getStatus());
            
            listStationServicos.add(servico);
            
        }        
        
        SetListaServicos(listStationServicos);
        
        result                 
                .include("listService", listStationServicos)
                .forwardTo("index.jsp");
        
    } 
        
    private static void SetListaServicos(List<br.leona.station.controller.Servico> listaServicos) {
        
        br.leona.station.controller.ControllerServicos_Service service = new br.leona.station.controller.ControllerServicos_Service();
        br.leona.station.controller.ControllerServicos port = service.getControllerServicosPort();
        port.setListaServicos(listaServicos);
            
    }
 
}

