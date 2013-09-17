package prime.coluna;

import java.util.HashMap;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import modelo.pais.Pais;

import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;

@ManagedBean(name="colunaBean")
@RequestScoped
public class GraficoColunaBean {
	private CartesianChartModel colunas;
	
	public GraficoColunaBean(){
		
		colunas = new CartesianChartModel();
		
		//CRIANDO OS PAISES E SUAS VENDAS
		//BRASIL
		Pais brasil = new Pais("Brasil", new HashMap<String, Integer>());
		brasil.putVenda("2011", 100);
		brasil.putVenda("2012", 120);
		brasil.putVenda("2013", 50);
		
		//ESTADOS UNIDOS
		Pais estadosUnidos = new Pais("Estados Unidos", new HashMap<String, Integer>());
		estadosUnidos.putVenda("2011", 160);
		estadosUnidos.putVenda("2012", 130);
		estadosUnidos.putVenda("2013", 78);
		
		//ALEMANHA
		Pais alemanha = new Pais("Alemanha", new HashMap<String, Integer>());
		alemanha.putVenda("2011", 30);
		alemanha.putVenda("2012", 80);
		alemanha.putVenda("2013", 23);
		
		ChartSeries brasilSerie = new ChartSeries();
		ChartSeries estadosUnidosSerie = new ChartSeries();
		ChartSeries alemanhaSerie = new ChartSeries();
		
		brasilSerie.setLabel(brasil.getNome());
		estadosUnidosSerie.setLabel(estadosUnidos.getNome());
		alemanhaSerie.setLabel(alemanha.getNome());
		
		brasilSerie.set("2011", brasil.getVenda("2011"));
		brasilSerie.set("2012", brasil.getVenda("2012"));
		brasilSerie.set("2013", brasil.getVenda("2013"));
		
		estadosUnidosSerie.set("2011", estadosUnidos.getVenda("2011"));
		estadosUnidosSerie.set("2012", estadosUnidos.getVenda("2012"));
		estadosUnidosSerie.set("2013", estadosUnidos.getVenda("2013"));
		
		alemanhaSerie.set("2011", alemanha.getVenda("2011"));
		alemanhaSerie.set("2012", alemanha.getVenda("2012"));
		alemanhaSerie.set("2012", alemanha.getVenda("2013"));
		
		//adicionando ao grafico de colunas
		colunas.addSeries(brasilSerie);
		colunas.addSeries(estadosUnidosSerie);
		colunas.addSeries(alemanhaSerie);
	}

	public CartesianChartModel getColunas() {
		return colunas;
	}

	public void setColunas(CartesianChartModel colunas) {
		this.colunas = colunas;
	}
	
	
}
