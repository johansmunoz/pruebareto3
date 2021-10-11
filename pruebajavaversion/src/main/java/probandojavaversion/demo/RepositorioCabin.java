
package probandojavaversion.demo;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Johan Sebastian Muñoz Moyano
 */
@Repository
public class RepositorioCabin {
    @Autowired
    private Interface crud;
    
    public List<Cabin>getAll(){
        return(List<Cabin>) crud.findAll();
    }
    
    public Optional<Cabin>getCabin(int id){
        return crud.findById(id);
    }
    
    public Cabin save(Cabin cabin){
        return crud.save(cabin);
    }
}
