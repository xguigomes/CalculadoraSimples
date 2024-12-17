public class Calculate {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Uso: java Calculate <operacao> <numero1> <numero2>");
            System.out.println("Operações disponíveis: somar, subtrair, multiplicar, dividir");
            return;
        }

        try {
            int x = Integer.parseInt(args[1]);
            int y = Integer.parseInt(args[2]);

            switch (args[0].toLowerCase()) {
                case "somar":
                    sum(x, y);
                    break;
                case "subtrair":
                    minus(x, y);
                    break;
                case "multiplicar":
                    multiply(x, y);
                    break;
                case "dividir":
                    divide(x, y);
                    break;
                default:
                    System.out.println("Operação inválida. Use: somar, subtrair, multiplicar ou dividir.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Por favor, forneça números válidos para <numero1> e <numero2>.");
        }
    }

    static void sum(int x, int y) {
        System.out.println("Resultado da soma: " + (x + y));
    }

    static void minus(int x, int y) {
        System.out.println("Resultado da subtração: " + (x - y));
    }

    static void multiply(int x, int y) {
        System.out.println("Resultado da multiplicação: " + (x * y));
    }

    static void divide(int x, int y) {
        if (y == 0) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        } else {
            System.out.println("Resultado da divisão: " + (x / y));
        }
    }
}