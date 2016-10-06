package stuff;

public class Table {
	int position;
	int Size;
	//An object representing a table with the position of the $100 bill
	
	public Table(int size)
		{
		Size=size;
		position=0;
		}
	//pass the bill to the right
	public void passRight(){
		this.position++;
		if(this.position==Size){
			position=0;
		}
		
	}
	// pass to the left
	public void passLeft(){
		this.position--;
		if(this.position==-1)
		{
			this.position=Size-1;
			}
		}
	//end game 
	public int gameOver(){
		return this.position;
	}
}
