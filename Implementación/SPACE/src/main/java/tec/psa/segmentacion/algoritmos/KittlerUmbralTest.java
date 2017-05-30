package tec.psa.segmentacion.algoritmos;

import static org.junit.Assert.*;

import org.junit.Test;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

import tec.psa.segmentacion.Histograma;
import tec.psa.segmentacion.conf.Const;
import tec.psa.segmentacion.imagenes.ImageHandler;

public class KittlerUmbralTest {

	@Test
	public void test() {
		 ImageHandler ih = new ImageHandler();
		 Mat img = ih.leerImagenGrises("C:\\Users\\kimco\\Dropbox\\Archivos de proyecto\\input\\groundtruth\\cuadro1_005.bmp");
		 Umbralizacion umb = new Umbralizacion();
		 umb.aplicarUmbral(img, 150 - 1); // Empieza desde índice cero
	     Imgcodecs.imwrite("C:\\Users\\kimco\\Dropbox\\Archivos de proyecto\\input\\groundtruth\\hola.jpg", img);
		 
		 Mat imagen = ih.leerImagenGrises("C:\\Users\\kimco\\Dropbox\\Archivos de proyecto\\input\\groundtruth\\hola.jpg");
		 Histograma hist = new Histograma(imagen, Const.LIMITE);	
		 Kittler test = new Kittler(hist);		
		//calcula el umbral a partir de Kittler
		int umbral = test.calcularUmbral();
		System.out.println("Tao calculado: " + umbral);
	}

}
