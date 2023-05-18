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
            
            // Rola os 5 dados:
            rolaDados.rolar();
            // Printa os 5 dados rolados:
            System.out.println(rolaDados.toString());
        }
    }
}