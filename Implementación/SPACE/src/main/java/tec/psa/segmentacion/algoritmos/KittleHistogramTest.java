package tec.psa.segmentacion.algoritmos;

import static org.junit.Assert.*;

import org.junit.Test;
import org.opencv.core.Mat;

import tec.psa.segmentacion.Histograma;
import tec.psa.segmentacion.conf.Const;
import tec.psa.segmentacion.imagenes.ImageHandler;

public class KittleHistogramTest {

	@Test
	public void test() {
		ImageHandler ih = new ImageHandler();
		Mat img = ih.leerImagenGrises("C:\\Users\\kimco\\Dropbox\\Archivos de proyecto\\input\\groundTruth\\ojo_original.png");
		//calcula el histograma de la imagen leida
		Histograma hist = new Histograma(img, Const.LIMITE);		
		Kittler test = new Kittler(hist);		
		//calcula el umbral a partir de Kittler
		int umbral = test.calcularUmbral();
	
		System.out.println("Tao calculado: " + umbral);
	}

}
