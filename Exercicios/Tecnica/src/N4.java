public class N4 {
    public static void main(String[] args) {
        double[] faturamentos = {
            67836.43, // SP
            36678.66, // RJ
            29229.88, // MG
            27165.48, // ES
            19849.53 // Outros
        };
        String[] estados = {"SP", "RJ", "MG", "ES", "Outros"};

        double totalFaturamento = calcularTotalFaturamento(faturamentos);

        for (int i = 0; i < faturamentos.length; i++) {
            double percentual = calcularPercentual(faturamentos[i], totalFaturamento);
            System.out.println("Estado: " + estados[i] + " - Percentual: " + String.format("%.2f", percentual) + "%");
        }
    }

    public static double calcularTotalFaturamento(double[] faturamentos) {
        double total = 0;

        for (double faturamento : faturamentos) {
            total += faturamento;
        }

        return total;
    }

    public static double calcularPercentual(double faturamento, double totalFaturamento) {
        return (faturamento / totalFaturamento) * 100;
    }
}