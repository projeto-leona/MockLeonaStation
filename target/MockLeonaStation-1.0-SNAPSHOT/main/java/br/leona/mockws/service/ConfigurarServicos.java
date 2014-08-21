/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.leona.mockws.service;

import br.leona.hardware.model.Servico;
import br.leona.hardware.service.RecuperadorServico;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/**
 *
 * @author Jean Negrão
 */
public class ConfigurarServicos {
    
    private final List<Servico> listaServicos = new ArrayList<Servico>();
    
    public ConfigurarServicos(){
        
    }
    
    public void setLisatServicos(List<Servico> listaServicos) {      
        
        this.listaServicos.addAll(listaServicos);
        
    }

    public List<Servico> getListaServicos() {
        
        ServiceLoader<RecuperadorServico> servLoad = ServiceLoader.load(RecuperadorServico.class);
       
        Iterator<RecuperadorServico> iterSL = servLoad.iterator();   
                
        if(servLoad.iterator().hasNext()) {
                       
           while(iterSL.hasNext()) {
               RecuperadorServico rm = iterSL.next();
                listaServicos.add(rm.getServico());
            }
            
        }
        else System.out.println("ServiceLoader Empty -  ServerServicos.listaServicos()");
        
        return listaServicos;
        
    }
    
}
