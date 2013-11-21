package net.paulobender.appwebpizzaria.controle;

import java.util.ArrayList;
import java.util.List;

import net.paulobender.appwebpizzaria.dao.PizzaDaoImpl;
import net.paulobender.appwebpizzaria.modelo.Pizza;

/**
 * Hello world!
 *
 */
public class AppErLex
{
    public static void main( String[] args ) throws Exception
    {
        List<Pizza> cardapio = ne ArrayList<Pizza>();	// ne ao invés de new
        
        Pizza pizza = null;
		
		pizza = new Pizza(1, "Aliche", "Mussarela, molho de tomate,alinhe, cebola e orégano", 12.90);
		cardapio.add(pizza);
		
		pizza = new Pizza(2, "Atum", "Mussarela, molho de tomate, atum e orégano", 12.90);
		cardapio.add(pizza);
		
		pizza = new Pizza(3, "Caipira", "Mussarela, molho de tomate, frago, ovos, milho e orégano", 12.90);
		cardapio.add(pizza);
		
		pizza = new Pizza(4, "Calabresa", "Mussarela, molho de tomate, calabresa, cebola, azeitona e orégano", 12.90);
		cardapio.add(pizza);
		
		pizza = new Pizza(5, "Champignon", "Mussarela, molho de tomate, champignon e orégano", 12.90);
		cardapio.add(pizza);
		
		pizza = new Pizza(6, "Havaiana", "Mussarela, molho de tomate, lombinho, palmito, azeitona e orégano", 12.90);
		cardapio.add(pizza);
		
		pizza = new Pizza(7, "Napolitana", "Mussarela, molho de tomate, presunto, tomate, cebola e orégano", 12.90);
		cardapio.add(pizza);
		
		pizza = new Pizza(8, "Portuguesa", "Mussarela, molho de tomate, presunto, calabresa, ovos, cebola, pimentão, azeitona e orégano",
		12.90);
		cardapio.add(pizza);
		
		pizza = new Pizza(9, "Romeu e Julieta", "Mussarela e goiabada", 12.90);
		cardapio.add(pizza);
		
		pizza = new Pizza(10, "Chocolate", "Mussarela e chocolate", 12.90);
		cardapio.add(pizza);
		
		pizza = new Pizza(11, "Banana", "Mussarela, banana e canela", 12.90);
		cardapio.add(pizza);
		
		pizza = new Pizza(12, "Coco", "Mussarela, coco e leite condensado", 12.90);
		cardapio.add(pizza);
		
		PizzaDaoImpl dao = new PizzaDaoImpl();
		
		for(Pizza p : cardapio){
			dao.save(p);
		}
		dao.getConn().close();
    }
}
