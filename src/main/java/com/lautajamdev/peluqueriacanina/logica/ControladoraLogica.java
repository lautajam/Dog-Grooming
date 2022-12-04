
package com.lautajamdev.peluqueriacanina.logica;

import com.lautajamdev.peluqueriacanina.persistencia.ControladoraPersistencia;

public class ControladoraLogica {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String raza, String color, String observaciones, String alergico, String ateEsp, String nombDuenio, String celDuenio) {
        
        //  Creamos el duenio y le asignamos valores
        Duenio duenio = new Duenio();
        duenio.setNombre_duenio(nombDuenio);
        duenio.setCelular(celDuenio);
        
        //  Creamos la mascota y le asignamos valores
        Mascota masco = new Mascota();
        masco.setNombre_perro(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAten_esp(ateEsp);
        masco.setObs(observaciones);
        masco.setDuenio(duenio);
        
        controlPersis.guardar(duenio,masco);
    }

}   
