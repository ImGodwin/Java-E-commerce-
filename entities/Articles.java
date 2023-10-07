package entities;

import java.util.Arrays;

public class Articles extends Shop {

    private Client client;
    private String[] selectedArticles;
    private int totalCost;

    public Articles(String website, String customerSupport, int income, Client client, String[] selectedArticles, int totalCost) {
        super(website, customerSupport, income);
        this.client = client;
        this.selectedArticles = selectedArticles;
        this.totalCost = totalCost;
    }

    public void list(String list)
    {
         /*list = new String[10];*/
        for(int i = 0; i<=this.selectedArticles.length; i++)
        {
            System.out.println(this.selectedArticles[i] + this.totalCost);
        }
    }

    @Override
    public String toString() {
        return "Articles{" +
                "client=" + client +
                ", selectedArticles=" + Arrays.toString(selectedArticles) +
                ", totalCost=" + totalCost +
                '}';
    }


}
