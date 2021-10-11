
package probandojavaversion.demo;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cabin")
public class CabinWeb {
    @GetMapping("/save")
    public String saludar(){
        return "Prueba";
    }
    
    @Autowired
    private ServiciosCabin servicios;
    @GetMapping("/all")
    public List<Cabin>getCabin(){
    return servicios.getAll();
            }
    
    @GetMapping("/{id}")
    public Optional<Cabin> getCabin(@PathVariable("id") int idCabin){
        return servicios.getCabin(idCabin);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED) //CREATED LE APARECE AL PROFESOR EN VERDE
    public Cabin save(@RequestBody Cabin cabin){
        return servicios.save(cabin);
    }
}
