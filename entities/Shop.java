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

    public void support(){
        System.out.println("Hi this is " + this.customerSupport + " from " + this.website  +
                " please type in the code you received to confirm if the product is still in your cart");
    }

    public void checkOutReport()
    {
        System.out.println("what did you get?");
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
