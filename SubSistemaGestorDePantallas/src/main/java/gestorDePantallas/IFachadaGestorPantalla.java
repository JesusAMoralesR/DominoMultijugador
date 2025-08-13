/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gestorDePantallas;

import fachadaCrearSala.*;
import observers.IObserver;
import observers.IObserverCrearSala;
import observers.IObserverMensajeAlerta;
import observers.IObserverUnirseASala;

/**
 *
 * @author tacot
 */
public interface IFachadaGestorPantalla {
    public void agregarObservers(IObserver AccionEnInicioCrearSala, IObserver AccionEnIniciUnirseASala, 
            IObserverUnirseASala AccionUnirseASala, IObserver AccionCancelar, 
            IObserverCrearSala AccionCrearSala, IObserverMensajeAlerta AccionMostrarMensaje);
}
