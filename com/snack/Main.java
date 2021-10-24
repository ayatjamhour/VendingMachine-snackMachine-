Package com.snack;
	
	import com.snack.interfacing.SnackMachine;
	import com.snack.component.Card;
	import com.snack.money.Coin;
	import com.snack.creator.SnackMachineCreating;
	
	public class Main {
	
	    public static void main(String[] args) {
	        SnackMachine SnackMachine = SnackMachinecreating.getSnackMachine();
	        SnackMachine.selectItem(2);
            SnackMachine.insertCard(new Card(10));
	        SnackMachine.insertMoney(Coin.TenC);
	    }
	}

