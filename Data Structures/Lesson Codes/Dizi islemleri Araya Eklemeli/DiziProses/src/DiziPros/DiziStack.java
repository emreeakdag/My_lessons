package DiziPros;

public class DiziStack {
	private int[] stack;
	private int stackPointer;
	
	DiziStack(int boyut){
		stack=new int[boyut];
		stackPointer=0;
	}
	
	void stackYaz() {
		
		for(int i=0; i<stack.length;i++) {
			System.out.println(i +". eleman: " +stack[i]);
		}
		System.out.println("-----------");
	}
	int cek() {
		if(bosmu()) {
			System.out.println("stack bos");
			return -1;
		}
		stackPointer--;
		int a=stack[stackPointer];
		//stack[stackPointer]=0;
		return a;
	}
	void ekle(int yeni) {
		if(dolumu()) {
			System.out.println("stack dolu");
			return;
		}
		stack[stackPointer]=yeni;
		stackPointer++;
			
	}
	boolean dolumu() {
		if(stackPointer==stack.length)
			return true;
		return false;
	}
	boolean bosmu() {
		if(stackPointer==0)
			return true;
		return false;
	}
	

}
