package µÚ10ÖÜ;

class Output implements Runnable {
	private Storage st;

	Output (Storage st ) {
		this.st =st ;
	}
	public void run () {
		while (true ) {
			st.logOut();
		}
	}
} 
