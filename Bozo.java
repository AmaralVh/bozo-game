public class Bozo {
    public static void main(String args[]) {
        Dado dado = new Dado();
        RolaDados rolaDados = new RolaDados(5);
        EntradaTeclado in = new EntradaTeclado();
        // RolaDados rolaDados = new RolaDados(10);
        for (int i = 0; i < 10; i++) {
            System.out.println("Pressione ENTER para comecar a rodada.");

            // Recebe a entrada (ENTER):
            try {
                in.leString();
            } catch(java.io.IOException e) {
                System.out.println(e);
            }
            
            for(int j = 0; j < 3; j++) {
                // Rola os 5 dados:
                if(j == 0) {
                    rolaDados.rolar();
                } else { 
                    int opcao = 0;

                    System.out.println("Escolha como quer selecionar os dados que quer rolar de novo: ");
                    System.out.println("0 - Nao quero rolar nenhum dado novamente.");
                    System.out.println("1 - Vetor de 0 ou 1 (1 para os dados que quero rolar de novo).");
                    System.out.println("2 - String com os numeros dos dados que quero rolar de novo.");

                    try {
                        opcao = in.leInt();
                    } catch(java.io.IOException e) {
                        System.out.println(e);
                    }

                    if(opcao == 1) {
                        Boolean[] dados = {false, false, false, false, false};
                        int lido = 0;

                        System.out.println("Escreva os dados que deseja rolar de novo (em 0 e 1, separados por ENTER): ");
                        
                        for(int d = 0; d < 5; d++) {
                            try {
                                lido = in.leInt();
                            } catch(java.io.IOException e) {
                                System.out.println(e);
                            }

                            if(lido == 1) {
                                dados[d] = true;
                            } else {
                                dados[d] = false;
                            }
                        }

                        rolaDados.rolar(dados);

                    } else if(opcao == 2) {
                        String dados = new String();
        
                        System.out.println("Escreva os dados que deseja rolar de novo: ");
                        try {
                            dados = in.leString();
                        } catch(java.io.IOException e) {
                            System.out.println(e);
                        }

                        rolaDados.rolar(dados);
                    }
                    
                }

                // Printa os 5 dados rolados:
                System.out.println(rolaDados.toString());
            }  
        }
    }
}