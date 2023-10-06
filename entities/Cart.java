package entities;

public class Cart extends Shop {

    private int articlenum;
    private String articleadescription;
    private int price;

    public Cart(String website, String customerSupport, int income, int articlenum, String articleadescription, int price) {
        super(website, customerSupport, income);
        this.articlenum = articlenum;
        this.articleadescription = articleadescription;
        this.price = price;
    }


    public void setArticlenum(int articlenum) {
        if (this.articlenum == 74893){
            System.out.println("out of stock");
        }
    }

    public String getArticleadescription() {
        return articleadescription;
    }

    public void setArticleadescription(String articleadescription) {
        this.articleadescription = articleadescription;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
