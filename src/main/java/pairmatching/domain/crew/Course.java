package pairmatching.domain.crew;

public enum Course {
    BACKEND("백엔드", "backend"),
    FRONTEND("프론트엔드", "frontend");

    private final String koreanTag;
    private final String englishTag;


    Course(String koreanTag, String englishTag) {
        this.koreanTag = koreanTag;
        this.englishTag = englishTag;
    }

    public String getKoreanTag() {
        return koreanTag;
    }

    public String getEnglishTag() {
        return englishTag;
    }
}
