
package co.edu.uniandes.csw.pyme.persistence;

import co.edu.uniandes.csw.pyme.logic.dto.PymeDTO;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;

import co.edu.uniandes.csw.pyme.persistence.api.IPymePersistence;
import java.util.List;
import javax.ejb.LocalBean;

@Default
@Stateless 
@LocalBean
public class PymePersistence extends _PymePersistence  implements IPymePersistence {

    public List<PymeDTO> searchPyme(PymeDTO pyme) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}