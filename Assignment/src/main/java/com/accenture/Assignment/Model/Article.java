package com.accenture.Assignment.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public
class Article { 
	@Id
    private Long articleId; 

    private String contents; 

    public Article(Long articleId, String contents, int likes) {
		super();
		this.articleId = articleId;
		this.contents = contents;
		this.likes = likes;
	}

	public Long getArticleId() {
		return articleId;
	}

	public void setArticleId(Long articleId) {
		this.articleId = articleId;
	}

	public Article() {
		super();
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	private int likes; 

} 