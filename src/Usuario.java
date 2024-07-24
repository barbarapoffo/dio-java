public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();
        //isso é uma instancia de classe (no caso, a classe SmartTv), significa que preciso coloca-la na memória do programa (execução) dentro do main. Dessa forma, posso receber o que tem dentro da classe, se eu não criar a instancia, eu nao uso a classe.//
        //a sintaxe da instancia é: NomeDaClasse nomeDaVariavel = new NomeDaClasse() //    

        System.out.println("Tv Ligada? " + smartTv.ligada);
        //usa-se o ponto '.' para buscar um atributo/metodo da instancia, nesse caso, o estado da variavel 'ligada' (que sera true ou false). Usa o nome da variavel que foi instanciada com a classe . atributo (ex - nomeVariavel.atributo) // 

        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        //aqui também estou usando a variável que foi instanciada e recebendo o método dela, por ser um metodo, usa o parenteses. Ou seja, a variável smartTv recebe o método ligar, que executará uma função//

        System.out.println("Novo estado: " + smartTv.ligada);

        smartTv.desligar();
        //instancia de smartTv com metodo desligar //

        System.out.println("Novo estado: " + smartTv.ligada);

        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.mudarCanal(99);
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);
    }
}
