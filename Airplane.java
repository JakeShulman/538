package stuff;

public class Airplane {
	//Simulates every person either going to their assigned seats, or if unable, finding an open seat randomly
	//If last person's seat is open, returns True, if not, returns false
	public static boolean isEmpty() {
		int[] assignedSeats = new int[100];
		int[] emptyPlane = new int[100];
		int temp=0;
		for (int i = 0; i < 100; i++) {
			assignedSeats[i] = i;
			emptyPlane[i]=0;
		}
		shuffle(assignedSeats);
		emptyPlane[(int)(Math.random()*100)]=1;
		for(int j = 1; j < 99; j++){
			
			if(emptyPlane[assignedSeats[j]]==1){
				temp=findNew(emptyPlane);
				
			}
			else{
				temp=assignedSeats[j];
			}
			
				emptyPlane[temp]=1;
		}
		if(emptyPlane[assignedSeats[99]]==0){
			return true;
		}
		return false;
	}
	//Shuffles list to assign seats randomly
	public static void shuffle(int[] a){
		int temp=0;
		int rand=0;
		for(int i = 0; i< a.length;i++){
			temp=a[i];
			rand=(int)(Math.random()*100);
			a[i]=a[rand];
			a[rand]=temp;
		}
	}
	//finds an open seat randomly
	public static int findNew(int[] a){
		int ran = (int)(Math.random()*100);
		while(a[ran]==1){
			ran=(int)(Math.random()*100);
		}
		return ran;
	}
	//formats output string
	public static String toDeci(double a){
		a=a*100;
		String f = a+"";
		f=f.substring(0,5);
		f=f+"%";
		return f;
	}
	//runs simulation 100000 times to find % of time that last seat is open
	public static void main (String[] args){
		int count=0;
		for(int i =0; i<100000;i++){
			if (isEmpty()){
				count++;
			}
		}
		System.out.println(toDeci(count/100000.0));
	}
}
