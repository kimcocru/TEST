package tec.psa.segmentacion.algoritmos;

import static org.junit.Assert.*;

import org.junit.Test;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

import tec.psa.segmentacion.conf.Const;
import tec.psa.segmentacion.imagenes.ImageHandler;

public class JaccardUmbralTest {

	@Test
	public void test() {
		 ImageHandler ih = new ImageHandler();
		 Mat dice1 = ih.leerImagenGrises(Const.IMG_DIR + "Dice.bmp");
		 Mat dice2 = ih.leerImagenGrises(Const.IMG_DIR + "Dice2.bmp");
		 Mat dice3 = ih.leerImagenGrises(Const.IMG_DIR + "Dice3.bmp");
		 Mat dice4 = ih.leerImagenGrises(Const.IMG_DIR + "Dice4.bmp");
		 //Mat img = ih.leerImagenGrises("C:\\Users\\kimco\\Dropbox\\Archivos de proyecto\\input\\groundtruth\\ojo_original.png");
		 Umbralizacion umb = new Umbralizacion();
		 umb.aplicarUmbral(dice1, 150 - 1);
		 umb.aplicarUmbral(dice2, 150 - 1); // Empieza desde índice cero
		 umb.aplicarUmbral(dice3, 150 - 1);
		 umb.aplicarUmbral(dice4, 150 - 1);
		 Imgcodecs.imwrite("C:\\Users\\kimco\\Dropbox\\Archivos de proyecto\\input\\groundtruth\\prueba1.jpg", dice1);
		 Imgcodecs.imwrite("C:\\Users\\kimco\\Dropbox\\Archivos de proyecto\\input\\groundtruth\\prueba2.jpg", dice2);
		 Imgcodecs.imwrite("C:\\Users\\kimco\\Dropbox\\Archivos de proyecto\\input\\groundtruth\\prueba3.jpg", dice3);
		 Imgcodecs.imwrite("C:\\Users\\kimco\\Dropbox\\Archivos de proyecto\\input\\groundtruth\\prueba4.jpg", dice4);
		 final double jaccardIndex0 = Jaccard.calcularJaccard(dice3,dice4); 
		 final double jaccardIndex25 = Jaccard.calcularJaccard(dice2,dice4); 
		 final double jaccardIndex50 = Jaccard.calcularJaccard(dice1,dice3); 
		 final double jaccardIndex75 = Jaccard.calcularJaccard(dice2,dice3); 
		   System.out.println(jaccardIndex0);
		    System.out.println(jaccardIndex25);
		    System.out.println(jaccardIndex50);
		    System.out.println(jaccardIndex75);
		    
	}

}
