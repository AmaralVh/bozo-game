public class Dado {
    private int lados;
    private int ladoGerado;
    private String ladoString;
    private static Random rd = new Random();

    public Dado() {
        this.lados = 6;
    }

    public Dado(int n) {
        this.lados = n;
    }

    public int rolar() {
        this.ladoGerado = rd.getIntRand(this.lados) + 1;
        return this.ladoGerado;
    }

    public int getLado() {
        return this.ladoGerado;
    }

    @Override
    public java.lang.String toString() {
        if(this.lados == 6) {
            switch(this.ladoGerado) {
                case 1:
                    this.ladoString = "+-----+\n" + "|     |\n" + "|  *  |\n" + "|     |\n" + "+-----+\n";
                    break;
                case 2:
                    this.ladoString = "+-----+\n" + "|    *|\n" + "|     |\n" + "|*    |\n" + "+-----+\n";
                    break;
                case 3:
                    this.ladoString = "+-----+\n" + "|    *|\n" + "|  *  |\n" + "|*    |\n" + "+-----+\n";
                    break;
                case 4:
                    this.ladoString = "+-----+\n" + "|*   *|\n" + "|     |\n" + "|*   *|\n" + "+-----+\n";
                    break;
                case 5:
                    this.ladoString = "+-----+\n" + "|*   *|\n" + "|  *  |\n" + "|*   *|\n" + "+-----+\n";
                    break;
                case 6:
                    this.ladoString = "+-----+\n" + "|*   *|\n" + "|*   *|\n" + "|*   *|\n" + "+-----+\n";
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("O dado nao tem 6 lados, nao e possivel representa-lo em string\n");
        }
        
        return this.ladoString;
    }
}