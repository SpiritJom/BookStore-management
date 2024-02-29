package category;

public class bookType {
    
    private static int MG = 0;  //
    private static int NV = 0;  //
    private static int LNV = 0; // Number of each book type in data (For array index)
    private static int CM = 0;  //
    private static int TL = 0;  //

    public static int getMG() {
        return MG;
    }

    public static int getNV() {
        return NV;
    }

    public static int getLNV() {
        return LNV;
    }

    public static int getCM() {
        return CM;
    }

    public static int getTL() {
        return TL;
    }

    public static void plusMG() {
        MG++;
    }

    public static void plusNV() {
        NV++;
    }

    public static void plusLNV() {
        LNV++;
    }

    public static void plusCM() {
        CM++;
    }

    public static void plusTL() {
        TL++;
    }
}
