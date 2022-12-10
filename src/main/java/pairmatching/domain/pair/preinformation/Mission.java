package pairmatching.domain.pair.preinformation;

public enum Mission {
    RACING("자동차경주"),
    LOTTO("로또"),
    BASEBALL("숫자야구게임"),
    SHOPPING_BASKET("장바구니"),
    PAYMENT("결제"),
    SUBWAY("지하철노선도"),
    REFACTORING("성능개선"),
    DISTRIBUTION("배포");

    private final String missionName;

    Mission(String missionName) {
        this.missionName = missionName;
    }

    public String getMissionName() {
        return missionName;
    }
}
