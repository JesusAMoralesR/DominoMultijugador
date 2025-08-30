package pozo;

import objetosPartida.Ficha;
import java.util.List;
import java.util.Map;

/**
 *
 * @author tacot
 */
public class FachadaPozo implements IFachadaPozo{

    private final Pozo pozo;

    public FachadaPozo() {
        this.pozo = Pozo.getInstance();
    }
    
    @Override
    public Ficha getFichaAlAzar() {
        return pozo.getFichaAlAzar();
    }

    @Override
    public Map<String, List<Ficha>> getFichasRepartidas(int numFichasIniciales, int numJugadores) {
        return pozo.getFichasRepartidas(numFichasIniciales, numJugadores);
    }

    @Override
    public void setFichas(List<Ficha> fichas) {
        pozo.setFichas(fichas);
    }

    @Override
    public void reiniciarPozo() {
        pozo.reiniciarPozo();
    }
    
}
