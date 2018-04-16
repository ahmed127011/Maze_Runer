package Objects;

public class Ammo extends State implements Interactables {
	private String Direction = "";
	/*private int IR = 0;
	private int JD = 0;
	private int IL = 0;
	private int JL = 0;*/
	private int IndexY = 0;
	private int IndexX = 0;
	private int orderIndex;
	// take care here
	public Boolean Existance = true;
	 public Ammo(int order) {
		// TODO Auto-generated constructor stub
		 orderIndex = order;
	}


	@Override
	public int getIR() {
		return (IndexY + 9)/22;
	}

	@Override
	public int getJD() {
		return (IndexX + 9)/22;
	}

	@Override
	public int getIL() {
		return  IndexY /22;
	}

	@Override
	public int getJL() {
		return  IndexX /22;
	}

	@Override
	public int getindexX() {
		return IndexX;

	}

	@Override
	public int getindexY() {
		return IndexY;

	}

	@Override
	public String getOldDirection() {
		// TODO Auto-generated method stub
		super.getOldDirection();
		return Direction;
	}
	@Override
	public int getISmall(){
		return 0;		
	}
	@Override
	public int getJSmall(){
		return 0;		
	}
	@Override
	public int getOrderIndex(){
		return orderIndex;		
	}
	@Override
	public boolean isExisted() {
		return Existance;
		// TODO Auto-generated method stub
	}
	@Override
	public void setOldDirection(String x) {
		// TODO Auto-generated method stub
		super.setOldDirection(x);
		Direction = x;
	}

	@Override
	public void setindexX(int x) {
		// TODO Auto-generated method stub
		super.setindexX(x);
		IndexX = x;
	}

	@Override
	public void setindexY(int y) {
		// TODO Auto-generated method stub
		super.setindexY(y);
		IndexY = y;
	}

	@Override
	public void setExistance(boolean e) {
		// TODO Auto-generated method stub
		super.setExistance(e);
		Existance = e;
	}
	
	

}
