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
    
    @Test
    public void maiorValorTest() {
    
        VetorController vc = new VetorController();
        
        double[] vetor = {2.00, 3.00, 1.00, 9.00, 7.00, 5.00, 10.00, 11.00};
        
        double maiorValor = vc.getMaiorValor(vetor);
        
        assertEquals(11.00, maiorValor, 0.01);
    }
    
    @Test
    public void qtdeAcimaMediaTest() {
    
        VetorController vc = new VetorController();
        
        double[] vetor = {2.00, 3.00, 1.00, 9.00, 7.00, 5.00, 10.00, 11.00};
        
        int qtdeAcimaMedia = vc.getQtdeAcimaMedia(vetor);
        
        assertEquals(4, qtdeAcimaMedia);
    }
    
    @Test
    public void qtdeAbaixoMediaTest() {
    
        VetorController vc = new VetorController();
        
        double[] vetor = {2.00, 3.00, 1.00, 9.00, 7.00, 5.00, 10.00, 11.00};
        
        int qtdeAbaixoMedia = vc.getQtdeAbaixoMedia(vetor);
        
        assertEquals(4, qtdeAbaixoMedia);
    }
    
    @Test
    public void desvioPadraoTest() {
    
        VetorController vc = new VetorController();
        
        double[] vetor = {2.00, 3.00, 1.00, 9.00, 7.00, 5.00, 10.00, 11.00};
        
        double desvioPadrao = vc.getDesvioPadrao(vetor);
        
        assertEquals(3.82, desvioPadrao, 0.01);
    }
    
    @Test
    public void nMaioresTest() {
    
        VetorController vc = new VetorController();
        
        double[] vetor = {2.00, 3.00, 1.00, 9.00, 7.00, 5.00, 10.00, 11.00};
        
        double[] nMaiores = vc.getNMaiores(vetor, 3);
        
        assertEquals(9.00, nMaiores[0], 0.01);
        assertEquals(10.00, nMaiores[1], 0.01);
        assertEquals(11.00, nMaiores[2], 0.01);
        
    }
}
