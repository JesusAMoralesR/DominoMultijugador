/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
public class FachadaTablero implements IFachadaTablero{

    private final GestorDeTablero gestorDeTablero;
    
    public FachadaTablero() {
        gestorDeTablero = new GestorDeTablero();
    }

    @Override
    public void colocarFichaEnArreglo(Point celda1, Point celda2, Ficha ficha) {
        gestorDeTablero.colocarFichaEnArreglo(celda1, celda2, ficha);
    }

    @Override
    public void colocarFichaMulaEnArreglo(Point celda1, Point celda2, Point celda3, Ficha ficha) {
        gestorDeTablero.colocarFichaMulaEnArreglo(celda1, celda2, celda3, ficha);
    }

    @Override
    public void limpiarTablero() {
        gestorDeTablero.limpiarTablero();
    }

    @Override
    public Map<DireccionDeMovimiento, List<Point>> movimientosPosibles(Ficha ficha, OrientacionDeFichas orientacion) {
        return gestorDeTablero.movimientosPosibles(ficha, orientacion);
    }
    
}
