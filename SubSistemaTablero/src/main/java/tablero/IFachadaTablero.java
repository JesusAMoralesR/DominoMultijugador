package tablero;

import enums.DireccionDeMovimiento;
import objetosPartida.Ficha;
import enums.OrientacionDeFichas;
import java.awt.Point;
import java.util.List;
import java.util.Map;

/**
 *
 * @author tacot
 */
public interface IFachadaTablero {
    public void colocarFichaEnArreglo(Point celda1, Point celda2, Ficha ficha);
    
    public void colocarFichaMulaEnArreglo(Point celda1, Point celda2, Point celda3, Ficha ficha);
    
    public void limpiarTablero();
    
    public Map<DireccionDeMovimiento, List<Point>> movimientosPosibles(Ficha ficha, OrientacionDeFichas orientacion);
}
