public class iPhone implements NavegadorInternet, ReprodutorMusica, Telefone{

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página");
        
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a página");
        
    }

    @Override
    public void pausar() {
        System.out.println("Pausar música!");
        
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada!");
        
    }

    @Override
    public void tocar() {
        System.out.println("Música tocando!");
        
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
        
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
        
    }

    @Override
    public void ligar() {
        System.out.println("Fazendo ligação");
        
    }

public static void main(String[] args) {
    iPhone iphone = new iPhone();

    iphone.ligar();
    iphone.atender();
    iphone.iniciarCorreioVoz();
    iphone.exibirPagina();
    iphone.adicionarNovaAba();
    iphone.atualizarPagina();
    iphone.tocar();
    iphone.pausar();
    iphone.selecionarMusica();
}
}

   
