package qu.iz;

 class User {
	 String passwort;
	 String username;
	 int userID;
	 int score;
	
	int getScore() {
		return score;
	}
	public final void setScore(int score) {
		this.score = 0;
	}
	public final String getPasswort() {
		return passwort;
	}
	public final String getUsername() {
		return username;
	}
	public final void setPasswort(String passwort) {
		this.passwort = passwort;
	}
	public final void setUsername(String username) {
		this.username = username;
	}
	public final int getUserID() {
		return userID;
	}
	public final void setUserID(int userID) {
		this.userID = userID;
	}


}