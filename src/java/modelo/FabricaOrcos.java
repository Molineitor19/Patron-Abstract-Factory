/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author usuario
 */
public class FabricaOrcos implements FabricaAbstracta {

    @Override
    public Cuerpo crearCuerpo() {
        return new CuerpoOrco();
    }

    @Override
    public Montura crearMontura() {
        return new MonturaOrco();
    }

    @Override
    public Armadura crearArmadura() {
        return new ArmaduraOrco();
    }

    @Override
    public Arma crearArma() {
        return new ArmaOrco();
    }
    
}
