package oopClass.sec16;

public class Earth {
    //클래스별 상수
    static final double EARTH_RADIUS = 6400.0; // 지구의 반지름 (단위: km)
    static final double EARTH_SURFACE_AREA;

    static {
        EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS; // 지구의 표면적 계산
    }
}
