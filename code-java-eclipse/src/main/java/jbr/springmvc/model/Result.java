package jbr.springmvc.model;

public class Result {
  private String question;
  private String answer;
  private String userAnswer;
  
  public Result(String question, String answer, String userAnswer) {
	  this.setQuestion(question);
	  this.answer = answer;
	  this.setUserAnswer(userAnswer);
  }
  
  public void setAnswer(String answer) {
	  this.answer = answer;
  }
  
  public String getAnswer() {
	  return answer;
  }

public String getQuestion() {
	return question;
}

public void setQuestion(String question) {
	this.question = question;
}

public String getUserAnswer() {
	return userAnswer;
}

public void setUserAnswer(String userAnswer) {
	this.userAnswer = userAnswer;
}

public boolean isCorrect() {
    return this.answer.equals(this.userAnswer);
}
  
}