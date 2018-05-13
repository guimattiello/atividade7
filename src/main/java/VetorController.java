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
        if (vetor.length % 2 == 1){
            return vetor[vetor.length/2];
        } else {
            return (vetor[vetor.length/2] + vetor[(vetor.length/2)-1])/2;
        }

    }

}
