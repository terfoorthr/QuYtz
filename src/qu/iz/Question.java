package qu.iz;

class Question {
	private  String question="";
    private  String[] answers;
    private  String correctAnswer;
    String yourAnswer;
    User username;

	public Question(String question, String[] possibleAnswers, String correctAnswer){
        this.question = question;
        this.answers = possibleAnswers;
        this.correctAnswer = correctAnswer;
    }
	
	public User getUsername() {
		return username;
	}

    public String getQuestion() {
        return question;
    }

    public String[] getAnswers() {
        return answers;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
    
    
  
}