/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.vista;

import mvc.vista.Aerolinea;
import mvc.vista.AerolineaInterface;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author amirj
 */
@Service
public class AerolineaService {
    
    @Autowired
    
    private AerolineaInterface aerolinea;

    public Aerolinea createAerolinea (Aerolinea aerolineaTemp)
            {
                
                return aerolinea.save(aerolineaTemp);
            }
    
     public List<Aerolinea> getAerolineas ()
            {
                
                return aerolinea.findAll();
            }
     
     public void deleteAerolinea(Aerolinea aerolineaTemp)
            {
                
                aerolinea.delete(aerolineaTemp);
            }
      public Aerolinea updateAerolinea (Aerolinea aerolineaTemp)
            {
                
                return aerolinea.save(aerolineaTemp);
            }
}

