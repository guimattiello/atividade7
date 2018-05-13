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
        
        boolean validacao = vc.validaVetor(vetor);
        
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void vetorVazioTest() {
    
        VetorController vc = new VetorController();
        
        double[] vetor = {};
        
        boolean validacao = vc.validaVetor(vetor);
        
    }
    
    @Test
    public void medianaTest() {
    
        VetorController vc = new VetorController();
        
        double[] vetor = {2.00, 3.00, 1.00, 9.00, 7.00, 5.00};
        
        double mediana = vc.getMediana(vetor);
        
        assertEquals(4.00, mediana, 0.01);
    }
    
    @Test
    public void mediaTest() {
    
        VetorController vc = new VetorController();
        
        double[] vetor = {2.00, 3.00, 1.00, 9.00, 7.00, 5.00, 10.00, 11.00};
        
        double media = vc.getMedia(vetor);
        
        assertEquals(6.00, media, 0.01);
    }
    
    @Test
    public void menorValorTest() {
    
        VetorController vc = new VetorController();
        
        double[] vetor = {2.00, 3.00, 1.00, 9.00, 7.00, 5.00, 10.00, 11.00};
        
        double menorValor = vc.getMenorValor(vetor);
        
        assertEquals(1.00, menorValor, 0.01);
    }
}
