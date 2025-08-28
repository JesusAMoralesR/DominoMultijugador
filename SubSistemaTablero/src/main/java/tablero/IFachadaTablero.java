package tablero;

import ObjetosDeEventos.DireccionDeMovimiento;
import ObjetosDeEventos.Ficha;
import ObjetosDeEventos.OrientacionDeFichas;
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
