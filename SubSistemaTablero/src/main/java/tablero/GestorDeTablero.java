/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablero;

import enums.DireccionDeMovimiento;
import static enums.DireccionDeMovimiento.Izquierda;
import objetosPartida.Ficha;
import enums.OrientacionDeFichas;
import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author tacot
 */
public class GestorDeTablero {

    private Ficha[][] tablero;
    private Point extremo1;
    private Point extremo2;
    private final int limiteIZQ = 0;
    private final int limiteDER = 19;
    private final int limiteARR = 0;
    private final int limiteABA = 8;

    public GestorDeTablero() {
        tablero = new Ficha[9][20];
    }

    public void colocarFichaEnArreglo(Point celda1, Point celda2, Ficha ficha) {

        if (tableroVacio()) {
            extremo1 = celda1;
            extremo2 = celda2;

        }

        tablero[celda1.y][celda1.x] = ficha;
        tablero[celda2.y][celda2.x] = ficha;
    }

    public void colocarFichaMulaEnArreglo(Point celda1, Point celda2, Point celda3, Ficha ficha) {

        if (tableroVacio()) {
            extremo1 = celda2;
            extremo2 = celda2;

        }

        tablero[celda1.y][celda1.x] = ficha;
        tablero[celda2.y][celda2.x] = ficha;
        tablero[celda3.y][celda3.x] = ficha;
    }

    public void limpiarTablero() {
        tablero = new Ficha[9][20];
    }

    public Map<DireccionDeMovimiento, List<Point>> movimientosPosibles(Ficha ficha, OrientacionDeFichas orientacion) {
        if (!fichaJugable(ficha)) {
            return null;
        }

        Map<DireccionDeMovimiento, List<Point>> movimientos = new HashMap<>();

        if (null == orientacion) {
            movimientos.put(DireccionDeMovimiento.Izquierda, movimientoPosible(DireccionDeMovimiento.Izquierda));
            movimientos.put(DireccionDeMovimiento.Derecha, movimientoPosible(DireccionDeMovimiento.Derecha));
            movimientos.put(DireccionDeMovimiento.Arriba, movimientoPosible(DireccionDeMovimiento.Arriba));
            movimientos.put(DireccionDeMovimiento.Abajo, movimientoPosible(DireccionDeMovimiento.Abajo));
            
        } else {
            switch (orientacion) {
                case Horizontal -> {
                    movimientos.put(DireccionDeMovimiento.Izquierda, movimientoPosible(DireccionDeMovimiento.Izquierda));
                    movimientos.put(DireccionDeMovimiento.Derecha, movimientoPosible(DireccionDeMovimiento.Derecha));
                }
                case Vertical -> {
                    movimientos.put(DireccionDeMovimiento.Arriba, movimientoPosible(DireccionDeMovimiento.Arriba));
                    movimientos.put(DireccionDeMovimiento.Abajo, movimientoPosible(DireccionDeMovimiento.Abajo));
                }
            }
        }

        return movimientos;
    }

    private List<Point> movimientoPosible(DireccionDeMovimiento direccion) {

        List<Point> posiblesMovimientos = new ArrayList<>();

        Point celdaSiguienteEX1 = calcularCeldaSiguiente(direccion, extremo1);
        Point celdaSiguienteEX2 = calcularCeldaSiguiente(direccion, extremo2);

        if (celdaSiguienteEX1.x >= limiteIZQ && celdaSiguienteEX1.x <= limiteDER && celdaSiguienteEX1.y >= limiteARR && celdaSiguienteEX1.y <= limiteABA) {
            if (tablero[celdaSiguienteEX1.y][celdaSiguienteEX1.x] == null) {
                posiblesMovimientos.add(new Point(celdaSiguienteEX1.x, celdaSiguienteEX1.y));
            }
        }

        if (celdaSiguienteEX2.x >= limiteIZQ && celdaSiguienteEX2.x <= limiteDER && celdaSiguienteEX2.y <= limiteARR && celdaSiguienteEX2.y >= limiteABA) {
            if (tablero[celdaSiguienteEX2.y][celdaSiguienteEX2.x] == null) {
                posiblesMovimientos.add(new Point(celdaSiguienteEX2.x, celdaSiguienteEX2.y));
            }
        }

        return posiblesMovimientos;
    }

    private Point calcularCeldaSiguiente(DireccionDeMovimiento direccion, Point extremo) {
        Point celdaSiguiente = new Point();
        switch (direccion) {
            case Izquierda -> {
                celdaSiguiente = new Point(extremo.x - 2, extremo.y);
            }
            case Derecha -> {
                celdaSiguiente = new Point(extremo.x + 2, extremo.y);
            }
            case Arriba -> {
                celdaSiguiente = new Point(extremo.x, extremo.y - 2);
            }
            case Abajo -> {
                celdaSiguiente = new Point(extremo.x, extremo.y + 2);
            }
        }
        return celdaSiguiente;
    }

    private boolean fichaJugable(Ficha ficha) {
        return (coinciden(tablero[extremo1.y][extremo1.x], ficha) || coinciden(tablero[extremo2.y][extremo2.x], ficha));
    }

    private boolean coinciden(Ficha f1, Ficha f2) {

        return (f1.getNumero1() == f2.getNumero1() || f1.getNumero1() == f2.getNumero2() || f1.getNumero2() == f2.getNumero1() || f1.getNumero2() == f2.getNumero2());
    }

    private boolean tableroVacio() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 20; j++) {
                if (tablero[i][j] != null) {
                    return false;
                }
            }
        }
        return true;
    }

}
