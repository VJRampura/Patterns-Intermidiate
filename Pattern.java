class Pattern {
	public static void main(String args[]){
		int no, i, j ;
		no = (int)(Math.random() * 10);
		System.out.println("value are :"+ no);
		for (i = 1 ; i <= 10; i++){
			for(j = 1; j<= i ; j++)
				System.out.print(j+" ");
				System.out.println();
		}
	}
}