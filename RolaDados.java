public class RolaDados {
    private int n;
    private Dado[] dados;
    private int[] ladosGerados;
    private String ladosStrings;

    public RolaDados(int n) {
        this.n = n;
        this.dados = new Dado[n];
        this.ladosGerados = new int[n];

        for(int i = 0; i < n; i++) {
            this.dados[i] = new Dado();
        }
    }

    public int[] rolar() {
        for(int i = 0; i < this.n; i++) {
            this.ladosGerados[i] = this.dados[i].rolar();
        }
        
        return this.ladosGerados;
    }

    public int[] rolar(Boolean[] selecionados) {
        for(int i = 0; i < this.n; i++) {
            if(selecionados[i]) {
                this.ladosGerados[i] = this.dados[i].rolar();
            }
        }

        return this.ladosGerados;
    }

    public int[] rolar(String string) {
        int index;

        for(int i = 0; i < this.n; i++) {
            // Guarda o caractere correspondente a i+1:
            int caracter = i + 49;

            // Verifica se o char correspondente ao dado encontra-se na string
            // (se nao se encontra, index = -1):
            index = string.indexOf((char)caracter);

            // Rola o respectivo dado (i) se ele se encontra na string:
            if(index != -1) {
                System.out.println("Entrou no if(index != -1)");
                this.ladosGerados[i] = this.dados[i].rolar();
            }
        }

        return this.ladosGerados;
    }

    @Override
    public java.lang.String toString() {
        this.ladosStrings = new String();

        for(int i = 0; i < this.n; i++) {
            this.ladosStrings = this.ladosStrings + " " + (i+1) + "         ";
        }

        this.ladosStrings = ladosStrings + "\n";

        for(int j = 0; j < this.n; j++) {
            this.ladosStrings = this.ladosStrings + "+-----+    ";
        }

        this.ladosStrings = ladosStrings + "\n";

        for(int i = 0; i < 3; i++) {
            for(int k = 0; k < this.n; k++) {
                switch(this.ladosGerados[k]) {
                    case 1:
                        if(i == 0) {
                            this.ladosStrings = this.ladosStrings + "|     |    ";
                        } else if(i == 1) {
                            this.ladosStrings = this.ladosStrings + "|  *  |    ";
                        } else {
                            this.ladosStrings = this.ladosStrings + "|     |    ";
                        }
                        break;
                    case 2:
                        if(i == 0) {
                            this.ladosStrings = this.ladosStrings + "|*    |    ";
                        } else if(i == 1) {
                            this.ladosStrings = this.ladosStrings + "|     |    ";
                        } else {
                            this.ladosStrings = this.ladosStrings + "|    *|    ";
                        }
                        break;
                    case 3:
                        if(i == 0) {
                            this.ladosStrings = this.ladosStrings + "|*    |    ";
                        } else if(i == 1) {
                            this.ladosStrings = this.ladosStrings + "|  *  |    ";
                        } else {
                            this.ladosStrings = this.ladosStrings + "|    *|    ";
                        }
                        break;
                    case 4:
                        if(i == 0) {
                            this.ladosStrings = this.ladosStrings + "|*   *|    ";
                        } else if(i == 1) {
                            this.ladosStrings = this.ladosStrings + "|     |    ";
                        } else {
                            this.ladosStrings = this.ladosStrings + "|*   *|    ";
                        }
                        break;
                    case 5:
                        if(i == 0) {
                            this.ladosStrings = this.ladosStrings + "|*   *|    ";
                        } else if(i == 1) {
                            this.ladosStrings = this.ladosStrings + "|  *  |    ";
                        } else {
                            this.ladosStrings = this.ladosStrings + "|*   *|    ";
                        }
                        break;
                    case 6:
                        if(i == 0) {
                            this.ladosStrings = this.ladosStrings + "|*   *|    ";
                        } else if(i == 1) {
                            this.ladosStrings = this.ladosStrings + "|*   *|    ";
                        } else {
                            this.ladosStrings = this.ladosStrings + "|*   *|    ";
                        }
                        break;
                }
            }

            this.ladosStrings = this.ladosStrings + "\n";
        }

        for(int j = 0; j < this.n; j++) {
            this.ladosStrings = this.ladosStrings + "+-----+    ";
        }

        return ladosStrings;
    }
}