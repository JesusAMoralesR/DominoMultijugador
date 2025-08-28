package pozo;

import ObjetosDeEventos.Ficha;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author tacot
 */
public class Pozo {

    private static Pozo instance;
    private List<Ficha> fichasPozo;

    private Pozo() {
        fichasPozo = new ArrayList<>();
        llenarPozo();
    }

    public final void llenarPozo() {
        for (int i = 0; i < 7; i++) {
            for (int j = i; j < 7; j++) {
                fichasPozo.add(new Ficha(i, j));
                System.out.println(i+"-"+j);
            }
        }
        
        Collections.shuffle(fichasPozo);
    }

    public static Pozo getInstance() {
        if (instance == null) {
            instance = new Pozo();
        }

        return instance;
    }
    
    public Ficha getFichaAlAzar(){
        int indexFicha = (int) (Math.random()*fichasPozo.size());
        Ficha ficha = fichasPozo.get(indexFicha);
        fichasPozo.remove(indexFicha);
        System.out.println(ficha.toString());
        System.out.println(fichasPozo.size());
        return ficha;
    }

    public Map<String, List<Ficha>> getFichasRepartidas(int numFichasIniciales, int numJugadores) {
        Map<String, List<Ficha>> fichasJugadores = new HashMap<>();
        
        for (int i = 0; i < numJugadores; i++) {
            List<Ficha> fichasDeJugador = new ArrayList<>();
            
            for (int j = 0; j < numFichasIniciales; j++) {
                fichasDeJugador.add(getFichaAlAzar());
                
            }
            
            fichasJugadores.put("jugador"+i, fichasDeJugador);
        }
        
        System.out.println(fichasJugadores.toString());
        System.out.println(fichasPozo.size());
        return fichasJugadores;
    }
    
    public void setFichas(List<Ficha> fichas){
        fichasPozo.addAll(fichas);
        System.out.println(fichasPozo.size());
    }
    
    
    public void reiniciarPozo(){
        fichasPozo = new ArrayList<>();
        llenarPozo();
        System.out.println(fichasPozo.size());
    }
}
