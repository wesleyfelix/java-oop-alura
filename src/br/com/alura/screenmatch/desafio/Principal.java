package br.com.alura.screenmatch.desafio;

import br.com.alura.screenmatch.desafio.modelos.MinhasPreferidas;
import br.com.alura.screenmatch.desafio.modelos.Musica;
import br.com.alura.screenmatch.desafio.modelos.PodCast;

public class Principal {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setArtista("Kiss");

        for(int i=0; i < 1000 ; i++){
           minhaMusica.reproduz();
        }

        for(int i=0; i < 50 ; i++){
            minhaMusica.curte();
        }

        PodCast meuPodCast = new PodCast();
        meuPodCast.setTitulo("BolhaDev");
        meuPodCast.setHost("Wesley Felix");

        for(int i=0; i < 5000 ; i++){
            meuPodCast.reproduz();
        }

        for(int i=0; i < 1000 ; i++){
            meuPodCast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(minhaMusica);
        preferidas.inclui(meuPodCast);

    }
}
