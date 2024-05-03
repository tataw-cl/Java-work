package Submit;
class JewelleryBox{
	String material;
	String color;
	public static int state=0;
	protected boolean IsEmpty() {
		if(state!=0) {
			System.out.println("The box is expty");
			return true;
		}
		else {
			System.out.println("The box is not expty");
			return false;
		}
	}
	protected boolean IsFull() {
		if(state!=0) {
			System.out.println("The box is full");
			return true;
		}
		else {
			System.out.println("The box is not full");
			return false;
		}
	}
	
	 class Diamond{
		Diamond(){
            JewelleryBox.state=1;
        }
		double weigth;
		double karats;
		protected void unboxDiamond() {
			state=0;
			System.out.println("Diamond has been removed");
		}
	}
}

public class TaskC {
 public static void main(String[] args) {
	 JewelleryBox Box1=new JewelleryBox();
	 JewelleryBox.Diamond Diamond1=Box1.new Diamond();
	 Diamond1.weigth=23.5;
	 Diamond1.karats=30.7;
	 Diamond1.unboxDiamond();
	 Box1.IsEmpty();
	 Box1.IsFull();
 }
}
