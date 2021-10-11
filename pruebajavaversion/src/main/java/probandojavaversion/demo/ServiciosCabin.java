package probandojavaversion.demo;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiciosCabin {
    
    @Autowired
    private RepositorioCabin metodosCrud;
    
    public List<Cabin> getAll(){
        return metodosCrud.getAll();
    }
    
    public Optional<Cabin> getCabin(int idCabin){
        return metodosCrud.getCabin(idCabin);
    }
    
    public Cabin save(Cabin cabin){
        if(cabin.getIdCabin()==null){
            return metodosCrud.save(cabin);
        }else{
            Optional<Cabin> evt=metodosCrud.getCabin(cabin.getIdCabin());
            if(evt.isEmpty()){
                return metodosCrud.save(cabin);
            }
            else{
                return cabin;
            }
        }
    }
}
