package idcard;

import framework.Product;

public class IDCard extends Product {
    private String owner;

    IDCard(String owner) {
        System.out.println("Create the card of " + owner + ".");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("Use the " + this + ".");
    }
}