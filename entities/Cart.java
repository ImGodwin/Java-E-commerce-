package entities;

public class Cart extends Shop {

    private int articlenum;
    private String articleDescription;
    private int price;

    public Cart(String website, String customerSupport, int income, int articlenum, String articleadescription, int price) {
        super(website, customerSupport, income);
        this.articlenum = articlenum;
        this.articleDescription = articleadescription;
        this.price = price;
    }

    public void price(int num)
    { num = this.price;
        if (num <= 200)
        {
            System.out.println("You get a discount if you spend 200euro or more");

        }else{
            System.out.println("this purchase of: " + this.price + " means you are eligible for discount");
        }
    }


    public void setArticlenum(int articlenum) {
        articlenum = this.articlenum;
        if ( articlenum == 74893){
            System.out.println("out of stock");

        }
    }

    @Override
    public String toString() {
        return "Cart{" +
                "articlenum=" + articlenum +
                ", articleDescription='" + articleDescription + '\'' +
                ", price=" + price +
                '}';
    }

    public String getArticleadescription() {
        return articleDescription;
    }

    public void setArticleadescription(String articleDescription) {
        this.articleDescription = articleDescription;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
