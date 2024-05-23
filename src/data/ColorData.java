package data;

public enum ColorData {
    WHITE ("белый"),
    BLACK("черный"),
    ORANGE ("рыжий"),
    MULTICOLOR ("разноцветный"),
    FOGGY ("дымчатый");

    private String colorName;

    ColorData (String colorName) {
        this.colorName = colorName;
    }

    public String getColorName() {
        return colorName;
    }




}

