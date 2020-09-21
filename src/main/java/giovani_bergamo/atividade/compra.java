package giovani_bergamo.atividade;

import java.util.ArrayList;

public class compra {
   ArrayList <Item> item;
    Comprador comprador = new Vendedor();
    public compra() {
    }

    public compra(ArrayList<Item> item, Comprador comprador){
    this.item = item;
    this.vendedor = vendedor;
    }

    @Override
    public String toString() {
        return "Item: \n" + item.toString() + "\n Comprador: " + comprador.toString();
    }

}