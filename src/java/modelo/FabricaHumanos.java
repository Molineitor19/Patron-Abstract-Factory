/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author usuario
 */
public class FabricaHumanos implements FabricaAbstracta {

        @Override
    public Cuerpo crearCuerpo() {
        return new CuerpoHumano();
    }

    @Override
    public Montura crearMontura() {
        return new MonturaHumano();
    }

    @Override
    public Armadura crearArmadura() {
        return new ArmaduraHumano();
    }

    @Override
    public Arma crearArma() {
        return new ArmaHumano();
    }
    
}
