package tec.psa.segmentacion.algoritmos;

import static org.junit.Assert.*;

import org.junit.Test;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

import tec.psa.segmentacion.imagenes.ImageHandler;

public class EtiquetadoUmbralTest {

	@Test
	public void test() {
		 ImageHandler ih = new ImageHandler();
		 Mat img = ih.leerImagenGrises("C:\\Users\\kimco\\Dropbox\\Archivos de proyecto\\input\\groundtruth\\ojo_original.png");
		 Umbralizacion umb = new Umbralizacion();
		 umb.aplicarUmbral(img, 150 - 1); // Empieza desde índice cero
		 Imgcodecs.imwrite("C:\\Users\\kimco\\Dropbox\\Archivos de proyecto\\input\\groundtruth\\hola.jpg", img);
		
		 Etiquetado et = new Etiquetado();
		 ih.guardarImagen("C:\\Users\\kimco\\Dropbox\\Archivos de proyecto\\input\\groundtruth\\hola.jpg","EtiquetdoTestHOY",
		 "bmp", et.etiquetarCelulas(img));
		 
		 Imgcodecs.imwrite("C:\\Users\\kimco\\Dropbox\\Archivos de proyecto\\input\\groundtruth\\result.jpg", img);
	}

}
