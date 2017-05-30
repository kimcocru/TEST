package tec.psa.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class ImagenGaleriaTest {

	@Test
	public void test() {
		ImagenGaleria ig = new ImagenGaleria();
		ig.getId();
		ig.getNombreArchivo();
		ig.getNombreLote();
		ig.getNumeroCelulas();
		ig.getTiempoProcesamiento();
		ig.getUmbral();
	}

}
