/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author guimat
 */
public class VetorControllerTest {
    
    public VetorControllerTest() {
    }

    @Test (expected = IllegalArgumentException.class)
    public void vetorNuloTest() {
    
        VetorController vc = new VetorController();
        
        double[] vetor = null;
        
        vc.validaVetor(vetor);
        
    }
}
