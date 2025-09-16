/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import modelo.FabricaAbstracta;

/**
 *
 * @author usuario
 */
public class FabricaElfos implements FabricaAbstracta {

    @Override
    public Cuerpo crearCuerpo() {
        return new CuerpoElfo();
    }

    @Override
    public Montura crearMontura() {
        return new MonturaElfo();
    }

    @Override
    public Armadura crearArmadura() {
        return new ArmaduraElfo();
    }

    @Override
    public Arma crearArma() {
        return new ArmaElfo();
    }
    
}
