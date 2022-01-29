package main;

import java.util.ArrayList;

public class AppRubik {

	public static void main(String[] args) {
		RubiksCube();
	}
	static boolean val = true;
	public static void RubiksCube() {
	    
	    ArrayList<Object>cubo = creaCubo();
	    
	    cubo.forEach(re->{
	    	String cc [][] = (String[][])re;
	    	boolean flag = true;
	    	for (int i = 0; i < cc.length; i++) {
	    		if(flag) {
	    			String color = cc[0][0];
	    			for (int j = 0; j < cc[0].length; j++){
						if(flag) {
							if(j==1) {
								if(cc[i][j-1].equals(color)) {
									flag = true;
								}else {
									flag = false;
								}
								if(cc[i][j+1].equals(color)) {
									flag = true;
								}else {
									flag = false;
								}
							}
						}else {
							break;
						}
		    			System.out.println(cc[i][j]);
					}
	    		}else{
	    			break;
	    		}
	    	}	
	    	val = flag;
	    });
	    if(val) {
    		System.out.println("ARMADO CORRECTO");
    	}else{
    		System.out.println("ARMADO INCORRECTO");
    	}
    }
	
	//Modificar oreden para ver si funciona la logica
	public static ArrayList<Object> creaCubo() {
		String matrizVerde[][] = new String[3][3];
	    matrizVerde[0][0] = "Verde";
	    matrizVerde[0][1] = "Verde";
	    matrizVerde[0][2] = "Verde";
	    matrizVerde[1][0] = "Verde";
	    matrizVerde[1][1] = "Verde";
	    matrizVerde[1][2] = "Verde";
	    matrizVerde[2][0] = "Verde";
	    matrizVerde[2][1] = "Verde";
	    matrizVerde[2][2] = "Verde";
	    
	    String matrizRojo[][] = new String[3][3];
	    
	    matrizRojo[0][0] = "Rojo";
	    matrizRojo[0][1] = "Rojo";
	    matrizRojo[0][2] = "Rojo";
	    matrizRojo[1][0] = "Rojo";
	    matrizRojo[1][1] = "Rojo";
	    matrizRojo[1][2] = "Rojo";
	    matrizRojo[2][0] = "Rojo";
	    matrizRojo[2][1] = "Rojo";
	    matrizRojo[2][2] = "Rojo";
	    
	    String matrizAzul[][] = new String[3][3];
	    
	    matrizAzul[0][0] = "Azul";
	    matrizAzul[0][1] = "Azul";
	    matrizAzul[0][2] = "Azul";
	    matrizAzul[1][0] = "Azul";
	    matrizAzul[1][1] = "Azul";
	    matrizAzul[1][2] = "Azul";
	    matrizAzul[2][0] = "Azul";
	    matrizAzul[2][1] = "Azul";
	    matrizAzul[2][2] = "Azul";
	    
	    String matrizBlanco[][] = new String[3][3];
	    
	    matrizBlanco[0][0] = "Blanco";
	    matrizBlanco[0][1] = "Blanco";
	    matrizBlanco[0][2] = "Blanco";
	    matrizBlanco[1][0] = "Blanco";
	    matrizBlanco[1][1] = "Blanco";
	    matrizBlanco[1][2] = "Blanco";
	    matrizBlanco[2][0] = "Blanco";
	    matrizBlanco[2][1] = "Blanco";
	    matrizBlanco[2][2] = "Blanco";
	    
	    String matrizAmarillo[][] = new String[3][3];
	    
	    matrizAmarillo[0][0] = "Amarillo";
	    matrizAmarillo[0][1] = "Amarillo";
	    matrizAmarillo[0][2] = "Amarillo";
	    matrizAmarillo[1][0] = "Amarillo";
	    matrizAmarillo[1][1] = "Amarillo";
	    matrizAmarillo[1][2] = "Amarillo";
	    matrizAmarillo[2][0] = "Amarillo";
	    matrizAmarillo[2][1] = "Amarillo";
	    matrizAmarillo[2][2] = "Amarillo";
	    
	    String matrizNaranja[][] = new String[3][3];
	    
	    matrizNaranja[0][0] = "Naranja";
	    matrizNaranja[0][1] = "Naranja";
	    matrizNaranja[0][2] = "Naranja";
	    matrizNaranja[1][0] = "Naranja";
	    matrizNaranja[1][1] = "Naranja";
	    matrizNaranja[1][2] = "Naranja";
	    matrizNaranja[2][0] = "Naranja";
	    matrizNaranja[2][1] = "Naranja";
	    matrizNaranja[2][2] = "Naranja";
	    ArrayList<Object>cubo = new ArrayList<Object>();
	    cubo.add(matrizVerde);
	    cubo.add(matrizRojo);
	    cubo.add(matrizAzul);
	    cubo.add(matrizBlanco);
	    cubo.add(matrizAmarillo);
	    cubo.add(matrizNaranja);
	    return cubo;
	}
}
