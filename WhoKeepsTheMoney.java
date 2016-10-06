package stuff;
public class WhoKeepsTheMoney {
	//Simulate the game 1000000 times to get percentage of wins
	public static void main(String[] args){
		int winCount=0;
		for(int i = 0; i < 1000000; i ++){
			int a =didWin();
			if(a==0){
				winCount++;
			}
		}
		System.out.println(winCount/1000000.0);
		
	}
	//Simulate game once: 33% chance of passing left, passing right, or ending game 
	public static int didWin(){
		Table table = new Table(5);
		while(true){
			double option=Math.random()*3;
			if(option > 2){
				table.passLeft();
			}
			else if(option > 1){
				table.passRight();
			}
			else{
				return table.gameOver();
			}
		}	
	}

}
