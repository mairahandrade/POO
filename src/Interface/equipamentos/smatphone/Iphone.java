package Interface.equipamentos.smatphone;

import Interface.equipamentos.aparelhoTelefonico.AparelhoTelefonico;
import Interface.equipamentos.navegadoInternet.NavegadorInternet;
import Interface.equipamentos.reprodutorMusical.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String musicaAtual;
    private boolean emChamada = false;
    private String paginaAtual;
    private  boolean emExecucao = false;

    @Override
    public void tocarMusica() {
        if (emExecucao) {
            System.out.println("A música já está tocando.");
        }else {
            emExecucao = true;
            System.out.println("Tocando música: " + musicaAtual);
        }
    }

    @Override
    public void pausar() {
        if (emExecucao){
            emExecucao = false;
            System.out.println("Pausando música: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música em execução para pausar.");
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        musicaAtual = musica;
        System.out.println("Selecionando música: " + musica);
    }

    @Override
    public void ligar(String numero) {
        if (!emChamada) {
            emChamada = true;
            System.out.println("Ligando para " + numero);
        } else {
            System.out.println("Já existe uma chamada em andamento.");
        }
    }

    @Override
    public void atender() {
        if (emChamada){
            System.out.println("Atendendo chamada telefônica.");
            emChamada = false;
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        if (emChamada) {
            System.out.println("Iniciando correio de voz.");
            emChamada = true;
        } else {
            System.out.println("Aguardando atendimento");
        }
    }

    @Override
    public void exibirPagina (String url) {
        paginaAtual = url;
        System.out.println("Exibindo página: " + url);
    }


            @Override
    public void adicionarNovaAba() {
                System.out.println("Adicionando nova aba no navegador.");
            }


    @Override
    public void atualizarPagina() {
                if (paginaAtual != null) {
                    System.out.println("Atualizando página: " + paginaAtual);
                } else {
                    System.out.println("Nenhuma página para atualizar.");
                }
            }

}

