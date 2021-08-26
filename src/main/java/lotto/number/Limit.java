package lotto.number;

public enum Limit {
    MAX(45),
    MIN(1);
    private final int limit;

    Limit(int number) {
        this.limit = number;
    }

    public int getValue() {
        return limit;
    }

    public boolean isUnder(int lottoNumber) {
        return limit < lottoNumber;
    }

    public boolean isAbove(int lottoNumber) {
        return limit > lottoNumber;
    }
}