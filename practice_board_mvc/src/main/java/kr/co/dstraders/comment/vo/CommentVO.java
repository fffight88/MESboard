package kr.co.dstraders.comment.vo;

import java.sql.Date;

public class CommentVO {

	private int boardNo;
	private String boardWriter;
	private String commenter;
	private String comm;
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
	public String getComm() {
		return comm;
	}
	public void setComm(String comm) {
		this.comm = comm;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	@Override
	public String toString() {
		return "CommentVO [boardNo=" + boardNo + ", boardWriter=" + boardWriter + ", commenter=" + commenter + ", comm="
				+ comm + ", regDate=" + regDate + "]";
	}
		
	
}
