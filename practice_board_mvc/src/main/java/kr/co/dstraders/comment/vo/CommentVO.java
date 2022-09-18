package kr.co.dstraders.comment.vo;

import java.sql.Date;

public class CommentVO {

	private int boardNo;
	private String boardWriter;
	private String commenter;
	private String content;
	private int commentNo;
	private Date regDate;
	
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getBoardWriter() {
		return boardWriter;
	}
	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}
	public String getCommenter() {
		return commenter;
	}
	public void setCommenter(String commenter) {
		this.commenter = commenter;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getCommentNo() {
		return commentNo;
	}
	public void setCommentNo(int commentNo) {
		this.commentNo = commentNo;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "CommentVO [boardNo=" + boardNo + ", boardWriter=" + boardWriter + ", commenter=" + commenter
				+ ", content=" + content + ", commentNo=" + commentNo + ", regDate=" + regDate + "]";
	}
	
	
	
	
}