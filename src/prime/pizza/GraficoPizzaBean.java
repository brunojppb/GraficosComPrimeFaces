package prime.pizza;

import java.util.HashMap;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import modelo.pais.Pais;

import org.primefaces.model.chart.PieChartModel;

@ManagedBean(name="pizzaBean")
@RequestScoped
public class GraficoPizzaBean {
	
	private PieChartModel pizza;
	
	public GraficoPizzaBean(){
		
		Pais brasil = new Pais("Brasil", new HashMap<String, Integer>());
		brasil.putVenda("2011", 100);
		
		Pais estadosUnidos = new Pais("Estados Unidos", new HashMap<String, Integer>());
		estadosUnidos.putVenda("2011", 160);
		
		Pais alemanha = new Pais("Alemanha", new HashMap<String, Integer>());
		alemanha.putVenda("2011", 30);
		
		pizza = new PieChartModel();
		
		pizza.set(brasil.getNome(), brasil.getVenda("2011"));
		pizza.set(estadosUnidos.getNome(), estadosUnidos.getVenda("2011"));
		pizza.set(alemanha.getNome(), alemanha.getVenda("2011"));
		
	}
	//GETTERS E SETTERS

	public PieChartModel getPizza() {
		return pizza;
	}

	public void setPizza(PieChartModel pizza) {
		this.pizza = pizza;
	}
	
	
	
}
