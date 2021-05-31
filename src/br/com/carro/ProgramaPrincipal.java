package br.com.carro;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		Carro carro4 = new Carro();
		Carro carro5 = new Carro();
		
		carro1.setMarca("BMW");
		carro1.setModelo("M4");
		carro1.setAno(2021);
		carro1.setQtdportas(4);
		
		carro2.setMarca("Hyundai");
		carro2.setModelo("Veloster");
		carro2.setAno(2018);
		carro2.setQtdportas(3);
		
		carro3.setMarca("Volkswagen");
		carro3.setModelo("Golf TSI");
		carro3.setAno(2021);
		carro3.setQtdportas(4);
		
		carro4.setMarca("Honda");
		carro4.setModelo("Civic");
		carro4.setAno(2020);
		carro4.setQtdportas(4);
		
		carro5.setMarca("Ford");
		carro5.setModelo("Fusion");
		carro5.setAno(2015);
		carro5.setQtdportas(4);
		
		System.out.println("---- Carro 1 ----");
		System.out.println(carro1.getMarca());
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getAno());
		System.out.println(carro1.getQtdportas());
		System.out.println("\n");
		
		System.out.println("---- Carro 2 ----");
		System.out.println(carro2.getMarca());
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getAno());
		System.out.println(carro2.getQtdportas());
		System.out.println("\n");
		
		System.out.println("---- Carro 3 ----");
		System.out.println(carro3.getMarca());
		System.out.println(carro3.getModelo());
		System.out.println(carro3.getAno());
		System.out.println(carro3.getQtdportas());
		System.out.println("\n");
		
		System.out.println("---- Carro 4 ----");
		System.out.println(carro4.getMarca());
		System.out.println(carro4.getModelo());
		System.out.println(carro4.getAno());
		System.out.println(carro4.getQtdportas());
		System.out.println("\n");
		
		System.out.println("---- Carro 5 ----");
		System.out.println(carro5.getMarca());
		System.out.println(carro5.getModelo());
		System.out.println(carro5.getAno());
		System.out.println(carro5.getQtdportas());
		System.out.println("\n");
	}
}