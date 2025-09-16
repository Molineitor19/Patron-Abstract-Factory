/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author usuario
 */
public class FabricaEnanos implements FabricaAbstracta {

    @Override
    public Cuerpo crearCuerpo() {
        return new CuerpoEnano();
    }

    @Override
    public Montura crearMontura() {
        return new MonturaEnano();
    }

    @Override
    public Armadura crearArmadura() {
        return new ArmaduraEnano();
    }

    @Override
    public Arma crearArma() {
        return new ArmaEnano();
    }
    
}
