package com.aurionpro.OCP.content.test;

import com.aurionpro.OCP.content.model.ArticleContent;
import com.aurionpro.OCP.content.model.QuizContent;
import com.aurionpro.OCP.content.model.VideoContent;

public class ContentRenderTest {
	public static void main(String[] args) {
		ContentType type = new ContentType();
		type.Content(new VideoContent());
		type.Content(new ArticleContent());
		type.Content(new QuizContent());
	}
}
