import java.util.Scanner;

public class DepositCalculator {

    double calculateComplexPercent(double a, double y, int d) { /* I would change here letters to names*/
        double pay = a * Math.pow((1 + y / 12), 12 * d);
        return generateRandomNumber(pay, 2);
    }

    double calculateSimplePercent(double amount, double yearRate, int depositPeriod) {
        return generateRandomNumber(amount + amount * yearRate * depositPeriod, 2);
    }

    double generateRandomNumber(double value, int places) {
        double ScaLe = Math.pow(10, places);             /*variable can't start from capital letter and can't have cap letter in the middle*/
        return Math.round(value * ScaLe) / ScaLe;
    }

    void printMenu() {
        int period, action;   /*period, actions look weird to me IMHO*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада в рублях:");
        int amount = scanner.nextInt();
        System.out.println("Введите срок вклада в годах:");
        period = scanner.nextInt();
        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        action = scanner.nextInt();
        double out = 0;                                  /*add enter here*/
        if (action == 1) out = calculateSimplePercent(amount, 0.06, period);
        else if (action == 2) {
            out = calculateComplexPercent(amount, 0.06, period);
        }                                               /*add enter here*/
        System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + out);
    }
}
