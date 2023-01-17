/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.controlador;

import java.util.List;
import mvc.vista.Aerolinea;
import mvc.vista.AerolineaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author amirj
 */

@RestController
@RequestMapping("/MS-Aerolinea")
public class AerolineaControlador {
    @Autowired
    private AerolineaService aerolineaService;
    
    @GetMapping
    public List<Aerolinea> getAerolineas()
            {
               return aerolineaService.getAerolineas();
            }
    
    @PostMapping
    public Aerolinea createAerolinea(@RequestBody Aerolinea aerolineaTemp)
            {
               return aerolineaService.createAerolinea(aerolineaTemp);
            }
    
     @PutMapping
    public Aerolinea actualizarAerolinea(@RequestBody Aerolinea aerolineaTemp)
            {
               return aerolineaService.updateAerolinea(aerolineaTemp);
            }
    
     @DeleteMapping
    public void deleteAerolinea(@RequestBody Aerolinea aerolineaTemp)
            {
                aerolineaService.deleteAerolinea(aerolineaTemp);
            }
    
    
}
