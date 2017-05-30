package tec.psa.segmentacion.algoritmos;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.opencv.core.Mat;

import tec.psa.segmentacion.algoritmos.Dice;
import tec.psa.segmentacion.conf.Const;
import tec.psa.segmentacion.imagenes.ImageHandler;

public class DiceTest {

  @Test
  public void test() {

    //Imagenes de prueba
    ImageHandler ih = new ImageHandler();
    Mat dice1 = ih.leerImagenGrises(Const.IMG_DIR + "C4_02_1_1_DAPI_200_mala.png");  
    Mat dice2 = ih.leerImagenGrises(Const.IMG_DIR + "C4_02_1_1_DAPI_200_overlay.png");
 

    
    //Indices de dice para 0%,25%,50% y 75% de similaridad
    final double diceIndex0 = Dice.calcularDice(dice1,dice2); 


    System.out.println(diceIndex0);
 
   assertTrue("Resultado incorrecto para la prueba de 0% de similaridad",
      diceIndex0 > 0);

  }

}
