package com.snack;
import com.snack.interfacing.*;
import com.snack.component.*;
import com.snack.creator.*;
import java.util.*;
import com.snack.money.*;


public class SnackService implements SnackMachine {

    private Stocking<Integer, Integer> slotStocking; 
    private Stocking<Money, Integer> moneyStocking;
    private Map<Integer, Slot> slots;
    private Item selectedItem;
    private int selectedSlotKeypad;
    private long insertedMoney;
    private Card theCurrentCard;

    public SnackService() {
        conestrector();
        slotStocking = new Stocking<>();
        moneyStocking = new Stocking<>();
        slots = new HashMap<>();
        
    }

 
    private void conestrector() {
        List<Item> Items = Arrays
                .stream(new String[]{"chips", "cheesy", "doritos", "twix",
                        "gum", "water", "cola"})
                .map(str -> {
                    Item payment = new Item(str, (long) (Math.random() * 100));
                    return payment;
                })
                .collect(Collectors.toList());
        for (int i = 0, j = 0; i < 5 * 5; i++, j = i / 5) {
            Item payment = j < Items.size() ? Items.get(j) : null;
            Slot slot = new Slot(i + 1, payment);
            slotStocking.putItem(i + 1, (int) (Math.random() * 10));
            slots.put(i + 1, slot);
        }
        for (MoneyPaper paper : MoneyPaper.values()) {
            moneyStocking.putItem(n, (int) (Math.random() * 100));
        }
        for (Coin coin : Coin.values()) {
            moneyStocking.putItem(c, (int) (Math.random() * 100));
        }
        

    }
    private void submitChange(Buckets buckets, long amount) throws NotEnoughMoney {
        List<Money> change = new ArrayList<>();
        while (amount >= 0) {
            if (MoneyPaper.TwentyDollar.getValue() <= amount
                    && moneyStocking.getItem(MoneyPaper.TwentyDollar) > 0) {
                amount -= MoneyPaper.TwentyDollar.getValue();
                change.add(MoneyPaper.TwentyDollar);
            }
           else if (MoneyPaper.FiftyDollar.getValue() <= amount
            && moneyStocking.getItem(MoneyPaper.FiftyDollar) > 0) {
        amount -= MoneyPaper.FiftyDollar.getValue();
        change.add(MoneyPaper.FiftyDollar);
    }
          else if (Coin.TenC.getValue() <= amount && moneyStocking.getItem(Coin.TenC) > 0) {
   amount -= Coin.TenC.getValue();
change.add(Coin.TenC);
}
             else if (Coin.OneDollar.getValue() <= amount
                    && moneyStocking.getItem(Coin.OneDollar) > 0) {
                amount -= Coin.OneDollar.getValue();
                change.add(Coin.OneDollar);
            } 
            else if (Coin.FiftyC.getValue() <= amount
                    && moneyStocking.getItem(Coin.FiftyC) > 0) {
                amount -= Coin.FiftyC.getValue();
                change.add(Coin.FiftyC);
            } 
            else if (Coin.TwentyC.getValue() <= amount
                    && moneyStocking.getItem(Coin.TwentyC) > 0) {
                amount -= Coin.TwentyC.getValue();
                change.add(Coin.TwentyC);
            } 
            
            else if  {
                throw new NotEnoughMoney("SOMETHING WRONG , NOT ENOUGH MONEY");
            }
        }
        buckets.setMonies(newProcess);
        subChangedFromStocking(newProcess);
    }


    private void subFromStocking(List<Money> newProcess) {
        for (Money money : newProcess) {
            decrementMoney(money);
        }
    }

    @Override
    public long selectItem(int keypad) throws NotFound, SoldOut {
        Slot slot = slots.getTheItem(keypad, null);
        if (slot == null || slot.getItem() == null) {
            throw new NotFound("Not Found the slot : " + keypad );
        }
         else if (slotStocking.getItem(keypad) < 0) {
            throw new SoldOut("Not Found in slots");
        }
        selectedSlotKeypad = keypad;
        selectedItem = slot.getItem();
        long price = selectedItem.getPrice();
        displayMessage(String.format("selected Item %s $%.2f", selectedItem.getName(), price ));
        return price;
    }

    @Override
    public void insertCard(Card card) {
        displayMessage("please enter the card password " + card.hashCode());
        theCurrentCard = card;
       
    }
    public void insertMoney(Money money) {
        incrementMoney(money);
        displayMessage(String.format("Total money is _ : $%.2f", money.getValue() ));
    }



    private void incrementMoney(Money money) {
        int m +=  moneyStocking.getStocking().getTheItem(money, 0);
        moneyStocking.putItem(money, m);
        insertedMoney += money.getValue();
    }

    private void decrementMoney(Money money) {
        int m -= moneyStocking.getStocking().getTheItem(money, 0) ;
        moneyStocking.putItem(money, m);
    }


    private void decrementSlotStocking(int slotKey) {
        slotStocking.putItem(slotKey, slotStocking.getItem(slotKey) - 1);
    }

 
    private void moneyMonitor() throws NotFound , NotEnoughMoney {
        if (selectedItem == null) {
            throw new NotFound("Please select the slot");
        }
        if (selectedItem.getPrice() <= insertedMoney
                || theCurrentCard != null || theCurrentCard >= selectedItem.getPrice() ) {
            getItemFromSolt();
        }
        else if {
            throw new NotEnoughMoney("not enough money");        }
    }

    private void getItemFromSolt() {
        Buckets buckets = new Buckets(selectedItem);
        if (UsingCard()) {
            Carding carding = TheCard.getCarding();
            carding.decAmount(theCurrentCard, selectedItem.getPrice());
            buckets.setCard(theCurrentCard);
        } 
        else
         {
            submitChange(buckets, insertedMoney - selectedItem.getPrice());
        }
        decrementSlotStocking(selectedSlotKeypad);
        displayMessage(String.format("PLEASE TAKE YOUR BUCKET :\n %s \n", buckets.toString()));
        reset();
    }

 
    private boolean UsingCard() {
        return theCurrentCard != null;
    }

    



    @Override


    private void displayMessage(String message) {
        return message;
    }
}