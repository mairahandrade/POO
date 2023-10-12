package Interface.equipamentos.smatphone;

public class TestIphone {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();


        // Testando o Reprodutor Musical
        iphone.selecionarMusica("Música 1");
        iphone.tocarMusica();
        iphone.pausar();

        // Testando o Aparelho Telefônico
        iphone.ligar("111-111");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Testando o Navegador na Internet
        iphone.exibirPagina("https://web.dio.me/home");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
    }
