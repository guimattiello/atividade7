/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guimat
 */
class VetorController {

    public boolean validaVetor(double[] vetor) {

        if (vetor == null) {
            throw new IllegalArgumentException("Vetor nulo");
        } else if (vetor.length == 0) {
            throw new IllegalArgumentException("Vetor vazio");
        }

        return true;
    }

    double getMediana(double[] vetor) {

        double temp;
        int j, i = 0;
        for (i = 0; i < vetor.length; i++) {
            for (j = i + 1; j < vetor.length; j++) {
                if (vetor[i] < vetor[j]) {
                    temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }
        if (vetor.length % 2 == 1) {
            return vetor[vetor.length / 2];
        } else {
            return (vetor[vetor.length / 2] + vetor[(vetor.length / 2) - 1]) / 2;
        }

    }

    double getMedia(double[] vetor) {
        
        double soma = 0;
        int j = 0;
        for (j = 0; j < vetor.length; j++) {
            soma += vetor[j];
        }
        return soma/vetor.length;
        
    }
    
    double getMenorValor(double[] vetor) {
        
        double menor = vetor[0];
        int j = 0;
        for (j = 0; j < vetor.length; j++) {
            if (vetor[j] < menor)
                menor = vetor[j];
        }
        return menor;
        
    }
    
    double getMaiorValor(double[] vetor) {
        
        double maior = vetor[0];
        int j = 0;
        for (j = 0; j < vetor.length; j++) {
            if (vetor[j] > maior)
                maior = vetor[j];
        }
        return maior;
        
    }
    
    int getQtdeAcimaMedia(double[] vetor) {
        
        double media = this.getMedia(vetor);
        int qtde = 0;
        int j = 0;
        for (j = 0; j < vetor.length; j++) {
            if (vetor[j] > media)
                qtde++;
        }
        return qtde;
        
    }
    
    int getQtdeAbaixoMedia(double[] vetor) {
        
        double media = this.getMedia(vetor);
        int qtde = 0;
        int j = 0;
        for (j = 0; j < vetor.length; j++) {
            if (vetor[j] < media)
                qtde++;
        }
        return qtde;
        
    }

}
