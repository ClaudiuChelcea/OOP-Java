package Inheritance.task1;

public abstract class CandyBox {
    private String flavor = "";
    private String origin = "";

    public CandyBox() {
        this.flavor = "";
        this.origin = "";
    }

    public CandyBox(String flavor, String origin) {
        this.flavor = flavor;
        this.origin = origin;
    }

    public float getVolume() {
        return 0.0F;
    }

    public String toString() {
        return "The candies from " + this.origin + " have " + this.flavor + " flavor.";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof CandyBox)) {
            return false;
        } else {
            CandyBox candyBox = (CandyBox)o;
            return this.getFlavor().equals(candyBox.getFlavor()) && this.getOrigin().equals(candyBox.getOrigin());
        }
    }

    public String getFlavor() {
        return this.flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getOrigin() {
        return this.origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
