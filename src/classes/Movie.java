package classes;

public class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private final String title;
    private final int priceCode;

    public Movie(String newtitle, int newpriceCode) {
        title = newtitle;
        priceCode = newpriceCode;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public String getTitle (){
        return title;
    }

    double getCharge(int days) {
        double result = 0;
        switch (this.getPriceCode()) {
            case Movie.REGULAR -> {
                result += 2;
                if (days > 2)
                    result += (days - 2) * 1.5;
            }
            case Movie.NEW_RELEASE -> result += days * 3;
            case Movie.CHILDRENS -> {
                result += 1.5;
                if (days > 3)
                    result += (days - 3) * 1.5;
            }
        }
        return result;
    }
}