package tec.psa.segmentacion.algoritmos;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.atLeastOnce;

import org.junit.Test; 

import org.opencv.core.Mat;

import tec.psa.segmentacion.conf.Const;
import tec.psa.segmentacion.imagenes.ImageHandler;

public class JaccardTest {

  @Test
  public void test() {

    //Imagenes de prueba
    ImageHandler ih = new ImageHandler();
    
    Mat dice1 = ih.leerImagenGrises(Const.IMG_DIR + "Dice.bmp");
    Mat dice2 = ih.leerImagenGrises(Const.IMG_DIR + "Dice2.bmp");
    Mat dice3 = ih.leerImagenGrises(Const.IMG_DIR + "Dice3.bmp");
    Mat dice4 = ih.leerImagenGrises(Const.IMG_DIR + "Dice4.bmp");
    
 
 
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


