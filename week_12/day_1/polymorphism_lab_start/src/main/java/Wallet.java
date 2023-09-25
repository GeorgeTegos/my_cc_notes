import java.util.ArrayList;

public class Wallet {
    private String name;
    private ArrayList<CreditCard> creditCards;
    private ArrayList<DebitCard> debitCards;
    private ArrayList<LoyaltyCard> loyaltyCards;
    private ArrayList<Ticket> tickets;

    private ArrayList<IScan> cards;

    public Wallet(String name) {
        this.name = name;
        this.creditCards = new ArrayList<CreditCard>();
        this.debitCards = new ArrayList<DebitCard>();
        this.loyaltyCards = new ArrayList<LoyaltyCard>();
        this.tickets = new ArrayList<Ticket>();
        this.cards = new ArrayList<IScan>();
    }

    public String getName() {
        return name;
    }

    public int getNumberOfItems() {
        return this.cards.size();
    }

    public void addItem(IScan item){
        this.cards.add(item);
    }
//    public void addItem(CreditCard item) {
//        this.creditCards.add(item);
//    }
//
//    public void addItem(DebitCard item) {
//        this.debitCards.add(item);
//    }
//
//    public void addItem(LoyaltyCard item) {
//        this.loyaltyCards.add(item);
//    }
//
//    public void addItem(Ticket item) {
//        this.tickets.add(item);
//    }
}
