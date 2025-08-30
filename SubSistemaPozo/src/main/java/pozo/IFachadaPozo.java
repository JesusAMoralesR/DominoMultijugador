package pozo;

import objetosPartida.Ficha;
import java.util.List;
import java.util.Map;

/**
 *
 * @author tacot
 */
public interface IFachadaPozo {
    
    public Ficha getFichaAlAzar();
    
    public Map<String, List<Ficha>> getFichasRepartidas(int numFichasIniciales, int numJugadores);
    
    public void setFichas(List<Ficha> fichas);
    
    public void reiniciarPozo();
}
