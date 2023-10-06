package entities;

public class Shop {
    private String website;
    private String customerSupport;
    private int income;

    public Shop(String website, String customerSupport, int income) {
        this.website = website;
        this.customerSupport = customerSupport;
        this.income = income;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "website='" + website + '\'' +
                ", customerSupport='" + customerSupport + '\'' +
                ", income=" + income +
                '}';
    }


    public void setWebsite(String website) {
        this.website = website;
    }


    public void setCustomerSupport(String customerSupport) {
        this.customerSupport = customerSupport;
    }

    public void setIncome(int income) {
        this.income = income;
    }
}
