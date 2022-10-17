package lotto.view;

import java.util.Scanner;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    public int receiveInputNumber() {
        System.out.println("구입 금액을 구입해주세요.");
        return scanner.nextInt();
    }

    public String receiveInputString() {
        scanner.nextLine();
        System.out.println("지난주 당첨 번호를 입력해주세요.");
        return scanner.nextLine();
    }

    public int receiveExtraInput() {
        System.out.println("보너스 볼을 입력해 주세요.");
        return scanner.nextInt();
    }
}
